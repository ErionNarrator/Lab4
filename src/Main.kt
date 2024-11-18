//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    var spicok1 = listOf(1,2,3,2,5,6,7,8,9,10,10,12,13,14,15,15)
    for (i in spicok1) {
        if (i %2 == 0)
            println(spicok1[i-1])
    }
    println(spicok1.groupingBy { it }.eachCount().filter { it.value == 1 })

    val textik =  listOf(" world Hello, this is the world world world")
    val strok = textik[0]
    //Разбор строки на слова (без пробелов)
    val text = strok.split("\\s".toRegex())
    println(text.groupingBy { it }.eachCount().filter { it.value > 1 })
}