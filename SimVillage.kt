/*c5-2 把匿名函數設定給變數
*/
fun main(){
    val greetingFunction: () -> String = {
        val currentYear = 2021
        "歡迎蒞臨 SimVillage，鎮長！ (copyright $currentYear)"
    }
    println(greetingFunction())
}