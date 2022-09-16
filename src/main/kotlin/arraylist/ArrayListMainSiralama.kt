package arraylist

fun main(){
    val kisi1 = KislilerArrayList(1,"Vaqif")
    val kisi2 = KislilerArrayList(5,"Asif")
    val kisi3 = KislilerArrayList(3,"Elmir")

    val kisiList = ArrayList<KislilerArrayList>()
    kisiList.add(kisi1)
    kisiList.add(kisi2)
    kisiList.add(kisi3)

    for(kisi in kisiList){
        println("${kisi.kisiId} -> ${kisi.kisiAd}")
    }

    val reverseForAlpha = kisiList.sortedWith(compareBy { it.kisiId })
    for (i in reverseForAlpha){
        println("${i.kisiId} - ${i.kisiAd}")
    }



}