fun wordCounter(word: String,symbol:Char):Int{
    var count = 0

    for (i in word){
        if (i == symbol){
            count+=1
        }
    }
    return count
}

fun main(){
    println(wordCounter("saybu_swag",'s'))
}