@main def hello(): Unit =
  val transformData = new TransformData();

  transformData.readAndTransform("input.csv");
