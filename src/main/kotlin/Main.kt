fun main() {
    val sHotdogs = arrayOf("Buns","Hot-dogs","Ketchup-Packets","Mustard-Packets","Onions","Relish-Packets")
    val qty = arrayOf("100","90","300","250","60","300")
    for (i in 0..sHotdogs.size-1){
        println(" The ${sHotdogs[i]} has ${qty[i]} items ")
    }

    var combArray = arrayOf<Array<String>>()

    combArray+= sHotdogs
    combArray+= qty

    val rowcount = combArray[0].size -1

    for (i in 0 .. rowcount){
        val a_sHotdogs = combArray[0][i]
        val a_qty = combArray[1][i]
        println("In combine array: $a_sHotdogs has $a_qty items.")
    }
}
