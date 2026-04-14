//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    /** Именование классов должнг быть в CamelCase, хотя тут класс вообще не нужен */
        @Deprecated(
            "Use newFunction", /** нельзя так писать, потрать 10 секунд на нормальное сообщение  */
                    replaceWith = ReplaceWith("printEmployeeName()")
        )
        /** Ты проверил, хоть раз что-то распечаталось? */
        fun printName(name: String): String {
            return name
        }
        fun printEmployeeName(name: String): String {
            return name
        }
    println(printName("Natasha"))
    println(printEmployeeName("Olya"))
}




