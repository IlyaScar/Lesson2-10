//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {

    class test(val name: String) {

        @Deprecated(
            message = "sdfsdf"
                    replaceWith = ReplaceWith("printEmployeeName()")

        )
        fun printName(name: String): String {
            return name
            println(name)
        }

        fun printEmployeeName(name: String): String {
            return name
            println(name)
        }

    }

    val test1 = test("Test")
    test1.printName("Oleg")


}




