package interfacePack

open class Apple : Eatable, Squeezable{
    override fun howToEat() {
        println("Soy,bicaqla bol ve agzina at")
    }

    override fun howToSqueeze() {
       println("Sokunu hazirla")
    }
}