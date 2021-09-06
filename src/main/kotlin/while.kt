fun main() {
    var list = arrayListOf<String>("Buku", "Pensil", "Pen", "Penghapus")
    var index = 0
    while (index < list.size){
        list.forEach { println(it) }
        index++
    }
}