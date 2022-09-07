package composition

fun main(){
    val adres = Adress("Azerbaijan","Baku")

    val persons = Persons("Vaqif",19,adres)

    println("Name: ${persons.name}")
    println("Age:${persons.age}")
    println("Country:${persons.adress.country}")
    println("City:${persons.adress.city}")


}