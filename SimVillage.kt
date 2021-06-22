/*c5-8 使用簡略語法傳入lambda引數
*/
fun main(){
    runSimulation("wl"){
        playerName, numBuildings ->
        val currentYear = 2021
        println("新建 $numBuildings 棟房屋")
        "歡迎蒞臨 SimVillage，$playerName！ (copyright $currentYear)"
    }
}
fun runSimulation(playerName: String, greetingFunction: (String, Int) -> String) {
    val numBuildings = (1..3).shuffled().last()  //亂數選擇1.2或3
    println(greetingFunction(playerName, numBuildings))
}