
fun main(args: Array<String>){

    // ? Indicates a nullable reference
    val a: Int?= 14000000
    val b: Int?= 14000000

    println("Value: ${b==a}")
    println("Reference: ${b===a}")

}