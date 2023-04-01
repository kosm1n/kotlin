package dwelling

import kotlin.math.PI

class RoundTower(residents: Int, val floors: Int, radius: Double) : RoundHut(residents, radius) {

    override val buildingMaterial = "Stone"
    override val capacity = 4 * floors

    override fun floorArea(): Double {
        return PI * radius * radius * floors
    }

}