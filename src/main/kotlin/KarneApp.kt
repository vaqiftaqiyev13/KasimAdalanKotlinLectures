import java.util.*

fun main(){
    val scanner = Scanner(System.`in`)
    val subjectArray = Array<String>(5){""}
    val scoreArray = Array<Int>(5){0}

    for (i in 0 until subjectArray.count()){
        print("\n${i + 1}) Enter a subject: ")
        val sub = scanner.nextLine()
        subjectArray[i] = sub
        print("\n${i + 1}) Enter a score: ")
        val score = scanner.nextInt()
        scoreArray[i] = score
    }
    var container = 0
    for (i in 0 until scoreArray.count()){
        println("$i) ${subjectArray[i]} : ${scoreArray[i]}")
        container += scoreArray[i]
    }
    println("Final score: ${container / scoreArray.count()}")




}