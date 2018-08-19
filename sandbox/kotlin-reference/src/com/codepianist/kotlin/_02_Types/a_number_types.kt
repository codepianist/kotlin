
fun main(args: Array<String>){
    // Numbers
    val d: Double= 6.4
    val f: Float= 3.2f
    val l: Long= 64
    val i: Int= 32
    val s: Short= 16
    val b: Byte= 8
    println("Bit Size: d= $d, f= $f, l= $l, i= $i, s= $s, b= $b")

    // Number Literals
    val ll= 135L
    println(ll is Long)

    val ii= 135
    println(ii is Int)

    val h= 0x0F // Hexadecimal
    val bb= 0b01010101011 // Binary
    // Octal is not supported

    // Underscores in numeric literals
    val oneMillion= 1_000_000
    val creditCardNumber = 1234_5678_9012_3456L


}

