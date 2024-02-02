object RunCodes {
  def runCodes(animal: String): Unit = {
    val animalList: List[String] = List("cat", "dog", "fish", "bird", "mouse");
    val animalFound = animalList.find(_ == animal);

    if(animalFound != None ) {
      println(animalFound)
    } else {
      println("Animal not found")
    }
  }
}
