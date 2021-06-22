/*c5-7 新增runSimulation函數
*/
fun main(){
    val greetingFunction = {
        playerName: String,numBuildings: Int ->
        val currentYear = 2021
        println("新建 $numBuildings 棟房屋")
        "歡迎蒞臨 SimVillage，$playerName！ (copyright $currentYear)"
    }
    runSimulation("wl",greetingFunction )
}
fun runSimulation(playerName: String, greetingFunction: (String, Int) -> String) {
    val numBuildings = (1..3).shuffled().last()  //亂數選擇1.2或3
    println(greetingFunction(playerName, numBuildings))
}