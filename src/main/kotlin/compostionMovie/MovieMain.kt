package compostionMovie

fun main(){
    val categories = Categories(1,"Philosophy")
    val directors = Directors(1,"Nolan")

    val movies = Movies(1,"Fight Club",1999,directors, categories)

    println(movies.directors.directorName)


}