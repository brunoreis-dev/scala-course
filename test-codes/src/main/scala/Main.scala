@main def hello(): Unit =
  println("Hello world!")
  println(msg)
  RunCodes.genericCodes();

  val pessoa1 = new Pessoa(name = "Bruno", age = 28, email = "bruno@gmail.com")

  val pessoa2 = new Pessoa(name = "Camila", age = 29, email = "camila@gmail.com")

  pessoa1.showInfos();
  pessoa2.showInfos();


def msg = "I was compiled by Scala 3. :)"
