class Employee(name: String, age: Int, email: String, role: String) extends Person(name, age, email) {
  def showEmployeeInfos(): Unit = {
    showInfos();
    println(s"Cargo: $role");
  }
}
