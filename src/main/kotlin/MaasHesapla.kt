fun hesabla(gun:Int):Int{
    val calismaSaati = gun * 8
    var maas = 0
    if (calismaSaati > 160){

       val mesaifazlasi = calismaSaati - 160

       maas = 160 * 10 + mesaifazlasi * 20
    }else{

        maas = calismaSaati * 10
    }

    return maas
}

fun main(){

    println(hesabla(30))
}