import binarysearch.binaryFind
fun main(args: Array<String>) {
    println("Hello World!")

    val list = listOf(1,5,9,10,52,30,54,84,56,48,65,32,11)

    val res = list.binaryFind(key = 84) {
        it
    }

    println(res)
}