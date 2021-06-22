/*c5-14 在 runSimulation 呼叫 greetingFunction 兩次
*/
fun main(){
    runSimulation()
}
fun runSimulation(){
    val greetingFunction = configureGreetingFunction()
    println(greetingFunction("wl"))  //看到的變數
    println(greetingFunction("wl"))  //記錄在做一次
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