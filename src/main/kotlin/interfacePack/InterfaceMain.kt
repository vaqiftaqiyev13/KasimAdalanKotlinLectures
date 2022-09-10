package interfacePack

fun main(){
    val lion = Lion()
    val chicken:Eatable = Chicken()

    val kubaApple : Apple = KubaApple()
    val apple = Apple()

    val objects = arrayOf(lion,chicken,kubaApple,apple)

    for(obj in objects){
        if (obj is Squeezable){
            obj.howToSqueeze()
        }

        if (obj is Eatable){
            obj.howToEat()
        }

    }

}