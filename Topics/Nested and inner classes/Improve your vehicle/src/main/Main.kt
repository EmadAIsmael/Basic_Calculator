data class Vehicle(val name: String) {

    inner class Engine {
        // add horsePower
        var horsePower: Int

        // create constructor
        constructor(horsePower: Int) {
            this.horsePower = horsePower
        }

        fun start() {
            println("RRRrrrrrrr....")
        }

        // create function printHorsePower()
        fun printHorsePower() = println("The $name vehicle has $horsePower horsepower.")
    }
}