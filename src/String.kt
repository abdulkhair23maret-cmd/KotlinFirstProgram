/*fun main(args: Array<String>) {
    val myName: String = "Abdul Khair"
    for(chr in myName){
        print(chr)
    }
    print('\n')
}*/
/*fun main(args: Array<String>) {
    val s = "abc" + 1
    println(s + "def")
}*/

/*=fun main(args: Array<String>) {
    var text = """
for (c in "foo")
print(c)
"""
    println(text)
    }*/
/*fun main(args: Array<String>) {
    var text = """
|Tell me and I forget.
|Teach me and I remember.
|Involve me and I learn.
|(Benjamin Franklin)
""".trimMargin()
    println(text)
}*/

fun main(args: Array<String>) {
    val a = 7
    val b = 8
    val c = a + b
    val s = "When we add $a and $b, we get $c"
    println(s)
    println("When we add $a and $b, we get ${a + b}")
    val price = """
${'$'}9.99
"""
    println(price)
}