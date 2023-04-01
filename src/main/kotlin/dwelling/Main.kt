package dwelling

fun main(args: Array<String>) {

    val squareCabin = SquareCabin(4, 5.0)
    val roundHut = RoundHut(3, 2.0)
    val roundTower = RoundTower(4 , 2, 2.0)

    with(squareCabin) {
        println("\nSquare Cabin\n============")
        println("Capacity: ${capacity}")
        println("Material: ${buildingMaterial}")
        println("Area: ${floorArea()}")
        println("Has room? ${hasRoom()}")
    }

    with(roundHut) {
        println("\nRound Hut\n=========")
        println("Material: ${buildingMaterial}")
        println("Capacity: ${capacity}")
        println("Area: ${floorArea()}")
        println("Has room? ${hasRoom()}")
    }

    with(roundTower) {
        println("\nRound Tower\n==========")
        println("Material: ${buildingMaterial}")
        println("Capacity: ${capacity}")
        println("Area: ${floorArea()}")
        println("Has room? ${hasRoom()}")
    }

}