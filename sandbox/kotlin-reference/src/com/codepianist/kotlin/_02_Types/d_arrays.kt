
fun main(args: Array<String>){

    // Arrays have get, set, iterator methods
    val a: Array<Int> = arrayOf(1,2,3) // Create an array
    val a2: IntArray= intArrayOf(5,6,7) // Without boxing overhead
    val n: Array<Int?> = arrayOfNulls(10)
    val b: Array<Int?> = Array(10, { i-> i*i })
    println(a.joinToString { e-> "$e" })
    println(a2.joinToString { e-> "$e" })
    println(a2[2])
    println(n.joinToString { e-> "$e" })
    println(b.joinToString { e-> "$e" })

    val s: Array<String> = arrayOf("a","b")
    println(s.joinToString { e-> "$e" })
    // Type Mismatch
    // val x: Array<Int> = s
    // val y: Array<Any> = s

}

