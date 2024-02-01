object RunCodes {
  def genericCodes(): Unit = {
    val number = 5;
    val text = "This is a text";
    val numbers = List(1, 2, 3, 4, 5, 6, 7, 8, 9)

    val temperature: Double = 35.5;
    val count: Long = 100000000000L;
    val students: Map[String, Double] = Map(
      "Bruno" -> 78.0,
      "Camila" -> 90.0,
      "Maui" -> 20.0,
      "Moana" -> 18.0,
    )
    val testSet = Set("Camila", 35, 35.5, "Text")

    val filteredNumbers = filterNumbersAbove3(numbers)

    println(number);
    println(text);
    println(numbers);
    println(temperature);
    println(count);
    println(students);
    println(testSet);
    println(filteredNumbers);
  };

  def filterNumbersAbove3(numbers: List[Int]): List[Int] = 
    numbers.filter(_ > 3);
}
