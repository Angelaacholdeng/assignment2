
fun main() {
    name()
    fact()
    var result = module(7,3)
    println(result)

}

fun name() {
    val myName = "Hello Achol"
    println(myName)

}

fun module(a:Int,b:Int):Int {
    var remain = a % b

    return remain
}

fun fact() {
    var me = ("Am an optimist")
    println(me)
}
