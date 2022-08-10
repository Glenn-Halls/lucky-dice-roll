fun main () {
     val myFirstDie = Die(6)
     val rollResult = myFirstDie.roll()
     val luckyNumber = 4
     
     if (rollResult == luckyNumber) {
          println("You Win!!!")
     } else if (rollResult == 1) {
          println("You rolled a 1, try again!")
     } else if (rollResult == 2) {
          println("Argh, you rolled a 2, try again!")
     } else if (rollResult == 3) {
          println("You rolled a 3, have another crack!")
     } else if (rollResult == 5) {
          println("So close, you rolled a 5, try again!")
     } else {
          println("You didn't win, you rolled a 6, please try again!")
     }
}

class Die (val numSides: Int) {
     
     fun roll(): Int {
          return (1..numSides).random()
     }
}
