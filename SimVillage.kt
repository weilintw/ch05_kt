/*c5-5 再增加一個參數
*/
fun main(){
    val greetingFunction: (String,Int) -> String = {
        playerName,numBuildings ->
        val currentYear = 2021
        println("新建 $numBuildings 棟房屋")
        "歡迎蒞臨 SimVillage，$playerName！ (copyright $currentYear)"
    }
    println(greetingFunction("wl",2))
}