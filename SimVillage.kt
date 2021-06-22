/*c5-12 傳遞 printConstructionCost 函數參照
*/
fun main(){
    runSimulation("wl",::printConstructionCost){
        playerName, numBuildings ->
        val currentYear = 2021
        println("新建 $numBuildings 棟房屋")
        "歡迎蒞臨 SimVillage，$playerName！ (copyright $currentYear)"
    }
}
inline fun runSimulation(playerName: String,
                         costPrinter: (Int) -> Unit, greetingFunction: (String, Int) -> String) {
    val numBuildings = (1..3).shuffled().last()  //亂數選擇1,2或3
    costPrinter(numBuildings)
    println(greetingFunction(playerName, numBuildings))
}
fun printConstructionCost(numBuildings: Int){
    val cost = 500
    println("建造成本：${cost * numBuildings}")
}