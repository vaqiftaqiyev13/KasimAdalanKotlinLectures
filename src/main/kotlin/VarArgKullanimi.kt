fun varArg(vararg numbers: Int):Int{
    var final = 0
    for (num in numbers){final += num}
    return final
}


fun main(){
    println(varArg(10,10,10,10,10))
}