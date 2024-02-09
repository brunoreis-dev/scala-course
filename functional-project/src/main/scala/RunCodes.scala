object RunCodes {
  def runCodes(animal: String): Unit = {
    // Find and validate if the animal exist on the List
    val animal_list: List[String] = List("cat", "dog", "fish", "bird", "mouse");
    val animal_exist = animal_list.find(_ == animal);

    animal_exist match
      case Some(animal_found) =>
        println(s"Animal $animal_found was found")
      case None => 
        println(s"Animal $animal not found")

    // to Make a Map method on a number list and multiply the values for 2
    val numbers: List[Int] = List(1, 2, 3, 4, 5, 6, 7, 8, 9);
    val multiply_numbers = numbers.map(_ * 2);

    println(multiply_numbers);

    // to filter the lists animals 
    val allAnimals: List[String] = List("cat", "dog", "lion", "bird", "mouse", "tiger", "elephant", "alligator", "fish"); // all animals
    val petAnimals: List[String] = List("cat", "dog", "bird", "mouse", "fish"); // pet animals
    val filerPetAnimals = allAnimals.filter(petAnimals.contains).map(pet => s"$pet pode ser um pet");
    
    println(filerPetAnimals);
  }
}
