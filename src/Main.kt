val mina = Mina()
val minero = Personaje()
val banco = Banco()
val taberna = Taberna()
val hogar = Hogar()

fun main(args: Array<String>) {

    println(minero)

            while (minero.oro<=3){

            if(minero.oro<3) {
                println("Minero Bob: De regreso a la mina de oro")
                mina.extraerOro()
            Thread.sleep(1000)

            if(minero.oro==3){
                banco.botin()
                Thread.sleep(1000)
            }

            if(minero.sed>=5){
                taberna.taberna()
                Thread.sleep(1000)
                println(minero)
            }

            if(minero.fatiga>=8){
                hogar.hogar()
                Thread.sleep(1000)
                println(minero)
            }
        }
    }
}