/*c5-3 為匿名函數增加玩家參數
*/
fun main(){
    val greetingFunction: (String) -> String = {
        playerName ->
        val currentYear = 2021
        "歡迎蒞臨 SimVillage，$playerName！ (copyright $currentYear)"
    }
    println(greetingFunction("wl"))
}