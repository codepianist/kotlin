

fun main(args: Array<String>){

    var e= "Walah"
    val s= "Hello cruel World"
    for(e in s)
        print("$e,")

    val all= """
        val s= "Hello cruel World"
        for(e in s)
            print("$e,")
    """
    println(all)

    val t = """
    |Tell me and I forget.
    |Teach me and I remember.
    |Involve me and I learn.
    |(Benjamin Franklin)
    """
    println(t)
    println(t.trimMargin())

}
