fun Int.sum(x:Int):Int{
    return this + x
}

fun main(){
    println(10.sum(4))
    println(10.district(5))
}

infix fun Int.district(x:Int):Int{
      return this - x
}