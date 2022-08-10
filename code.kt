fun main () {
     val myFirstDie = Die(6)
     val rollResult = myFirstDie.roll()
     val luckyNumber = 4
     
     when (rollResult) {
          luckyNumber -> println("You Win!!!")
          1 -> println("1")
          2 -> println("2")
          3 -> println("3")
          5 -> println("5")
          6 -> println("6")
          else -> println("Wow, you are not using a 6 sided die, get outta here!!!")
     }
}

class Die (val numSides: Int) {
     fun roll(): Int {
          return (1..numSides).random()
     }
}
