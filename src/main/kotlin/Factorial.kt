fun Factorial(x:Int):Int{
    var vurma = 1

    for(i in x downTo 1){
        vurma *= i
    }
    return vurma
}
fun main(){
    print(Factorial(5))
}