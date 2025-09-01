fun main() {
  // Write your code below 🏞
  var responsibilities = setOf("feed the chimps","play a random game","conduct a health check on Foxie")
  var responsibilitiesComplete = 0;
  var timeSpent = 0;
  val totalShiftTime = 4;

  var foxiesHealthCheck = mutableMapOf<String,Any?>()
  var chimpsHaveEaten = mutableMapOf("Bonnie" to false, "Jubilee" to false, "Frodo" to false, "Foxie" to false)

  println("First, ${responsibilities.elementAt(0)}")

  for (chimp in chimpsHaveEaten.keys)
  {
    println("Feeding $chimp....")
    chimpsHaveEaten[chimp] = true
  }
  timeSpent++;
  responsibilitiesComplete++;
  println("All chimps have now been fed! You've completed  $responsibilitiesComplete / ${responsibilities.size}")

  println("Next, ${responsibilities.elementAt(1)}")
  var games = setOf("tug-of-war with a blanket","catch and throw", "number game")
  var randomGame = games.random()
  println("$randomGame!")
  timeSpent++;
  responsibilitiesComplete++;
  println("Each chimp has now played a game of $randomGame! You've completed $responsibilitiesComplete / ${responsibilities.size} responsibilities.")


  println("Next, ${responsibilities.elementAt(2)}")
  foxiesHealthCheck.put("temperature", 32.7)
  foxiesHealthCheck.put("mood", "happy")
  println("Foxie has a temperature of ${foxiesHealthCheck["temperature"]} and is feeling ${foxiesHealthCheck["mood"]}.")
  timeSpent++;
  responsibilitiesComplete++;
  println("You've now completed $responsibilitiesComplete / ${responsibilities.size} responsibilities.")

  if (timeSpent <= totalShiftTime && responsibilitiesComplete == responsibilities.size) {
    println("Congratulations!")
  } else if (timeSpent >= totalShiftTime && responsibilitiesComplete == responsibilities.size) {
    println("Completed, but with overtime!")
  } else {
    println("Not completed and with extra time!")
  }

}
