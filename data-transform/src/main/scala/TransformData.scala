import scala.io.Source
import java.io.PrintWriter

class TransformData {
  def readAndTransform(fileName: String): Unit = {
    val outputFile = "output.csv"

    val lines = Source.fromFile(fileName).getLines.toList;

    val outputHeader = "Nome, País"

    val transformedData = lines.tail
      .map(_.split(","))
      .filter(fields => fields.length >= 4 && fields(1).toInt >= 18)
      .map(fields => s"${fields(0)},${fields(1)}")


    new PrintWriter(outputFile) {
      write(outputHeader + "\n")
      transformedData.foreach(line => write(s"$line\n"))
      close()
    }

    println("Data transformed successfully")
  }
}
