import java.util.*

fun main(){
    val scanner = Scanner(System.`in`)

    var nameArray = Array<String>(5){""}

    for (i in 0 until nameArray.count()){
         print("${i + 1}) Name: ")
         val name = scanner.nextLine()
         nameArray[i] = name
    }

    for ((i,name) in nameArray.withIndex()){
         println("$i) Name: $name")
    }

}