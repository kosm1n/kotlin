package lists



fun main(){
    val numbers: List<Int> = listOf(1,2,3,4,5,6)

    println("List: $numbers")
    println("List: ${numbers.size}")
    println("List: ${numbers[0]}")

    val accounts: List<Account> = listOf(Account("cos@mail.com"), Account("di@mail.com"))
    println("List: ${accounts.reversed()}")

    val entrees: MutableList<Account> = mutableListOf()
    entrees.add(Account("new@mail.com"))
    entrees.add(Account("newnew@mail.com"))

    println("List: ${entrees.reversed()}")

    for (entree in entrees) {
        println("Entree: $entree")
    }

}


