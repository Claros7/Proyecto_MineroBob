class Banco {
    var botin : Int = 0

    fun botin(){
        botin = botin + minero.oro
        minero.oro = 0
        println("Minero Bob: Me voy de la mina de oro con mis bolsillos llenos.")
        println("Minero Bob: Voy para el banco, sí señor.")
        println("Minero Bob: Ha depositado el oro en el banco. El total de oro ahorrado en el botin es: $botin")
        println(minero)
    }

}