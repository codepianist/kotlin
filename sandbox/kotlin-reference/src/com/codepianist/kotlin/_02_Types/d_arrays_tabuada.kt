

fun main(args: Array<String>){

    println(Array(11, {i-> i*9})
            .filter { e-> e > 0 }
            .joinToString { e-> "$e" })

}
