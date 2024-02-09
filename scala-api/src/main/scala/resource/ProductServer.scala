package resource

import akka.actor.ActorSystem
import akka.http.scaladsl.Http
import akka.http.scaladsl.model.StatusCodes
import akka.http.scaladsl.server.Directives._
import service.ProductService
import model.Product
import spray.json.DefaultJsonProtocol._

class ProductServer extends App {
  implicit val system = ActorSystem("ProductServer")

  val productService = new ProductService()

  implicit val productFormat = jsonFormat3(Product)

  val route = path("products" / "heartbeat") {
    get{
      complete("Success!")
    }
  } ~ path("products" / "test") {
    complete("Verified!")
  } ~ path("products") {
    get {
      onComplete(productService.getAllProducts()) {
        case util.Success(res) =>  complete(res)
        case util.Failure(exception) => complete(StatusCodes.InternalServerError)
      }
    } ~ post {
      entity(as[Product]) {product =>
        onComplete(productService.saveProduct(product)) {
          case util.Success(res) =>  complete(res)
          case util.Failure(exception) => complete(StatusCodes.InternalServerError)
        }
      }
    }
  }

  val server = Http().newServerAt("localhost", 9090).bind(route)
  server.map { _ =>
    println("Successfully started on localhost:9090")
  } recover {case ex =>
    println("Failed to start the server due to: " + ex.getMessage)
  }
}