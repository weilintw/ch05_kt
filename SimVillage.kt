/*c5-6 使用類型推斷
*/
fun main(){
    val greetingFunction = {
        playerName: String,numBuildings: Int ->
        val currentYear = 2021
        println("新建 $numBuildings 棟房屋")
        "歡迎蒞臨 SimVillage，$playerName！ (copyright $currentYear)"
    }
    println(greetingFunction("wl",2))
}