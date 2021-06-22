/*c5-4 使用it代替參數名
*/
fun main(){
    val greetingFunction: (String) -> String = {
        val currentYear = 2021
        "歡迎蒞臨 SimVillage，$it！ (copyright $currentYear)"
    }
    println(greetingFunction("wl"))
}