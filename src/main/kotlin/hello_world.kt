fun hello(name : String) : String{
    return "Hello $name"
}

fun main(args : Array<String>) {
    val map = mutableMapOf<String, String>()
    map["a"] = "a"
    map["b"] = "b"
    println(map["c"])
}