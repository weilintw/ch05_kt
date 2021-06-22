/*c5-13 增加configuraGreetingFunction函數
*/
fun main(){
    runSimulation()
}
inline fun runSimulation(){
    val greetingFunction = configureGreetingFunction()
    println(greetingFunction("wl"))
}
fun configureGreetingFunction(): (String) -> String {
    val structureType = "醫院"
    var numBuildings = 5
    return {
        playerName: String ->
        val currentYear = 2021
        numBuildings += 1
        println("新建 $numBuildings 間 $structureType")
        "歡迎蒞臨 SimVillage，$playerName！ (copyright $currentYear)"
    }
}