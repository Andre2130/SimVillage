fun main(args: Array<String>) {
    //val greetingFunction:(String, Int) -> String = {playerName, numBuilding ->
    runSimulation()
    // println(greetingFunction("Andre", 2))
    //runSimulation("Andre", greetingFunction)
}


/*inline fun runSimulation(playerName: String,
                         greetingFunction: (String, Int) -> String) {*/
fun runSimulation(){
    val greetingFunction = configureGreetingFunction()
    println(greetingFunction("Andre"))
    }

fun configureGreetingFunction(): (String) -> String {
    val structureType = "hospitals"
    var numBuildings = 5
    return { playerName: String ->
        val currentYear = 2018
        println("Adding $numBuildings houses")
        "Welcome to SimVillage, $playerName! (copyright $currentYear)"
    }

}

fun printConstructionCost(numBuildings: Int){
    val cost = 500
    println("construction cost: ${cost * numBuildings}")
}
