import com.example.helloandroid.model.Dice


fun main(args: Array<String>) {


    val myList:List<String> = emptyList()

    myList

    val age = 2*5;

    val name = "Cosmin"

    printBorderRepeat()
    printBorderRepeatWithLength(name.length)
    println("Hello Kotlin!")
    println("How old are you?")
    println("Hi! I'm ${age}.")
    printBorder()

    myFun()
}

fun printBorder() {
    println("==============")
}

fun printBorderRepeat() {
    repeat(50) {
        print("=")
    }
    println()
}

fun printBorderRepeatWithLength(length: Int) {
    repeat(length) {
        print("=")
    }
    println()
}

fun getAge():Int {
    return 1
}

fun myFun() {
    val myFirstDice = Dice(6)
    val rollResult = myFirstDice.roll()
    val luckyNumber = 4

    when (rollResult) {
        luckyNumber -> println("You won!")
        1 -> println("So sorry! You rolled a 1. Try again!")
        2 -> println("Sadly, you rolled a 2. Try again!")
        3 -> println("Unfortunately, you rolled a 3. Try again!")
        5 -> println("Don't cry! You rolled a 5. Try again!")
        6 -> println("Apologies! You rolled a 6. Try again!")
    }
}


