

fun main(args: Array<String>){
    println(charToInt('5'))
    for(c in '0'..'9')
        print("${c.toInt()} ")
    println("\n${charToInt('a')}")
}

fun charToInt(c: Char): Int{
    if(c !in '0'..'9')
        throw IllegalArgumentException("Ops! $c is out of range for a number.")
    return c.toInt() - '0'.toInt() // position of character
}