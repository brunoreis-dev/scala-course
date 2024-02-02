class Person(name: String, age: Int, email: String) {
  def showInfos(): Unit = {
    println(s"Nome: $name")
    println(s"Idade: $age")
    println(s"Email: $email")
  }
}
