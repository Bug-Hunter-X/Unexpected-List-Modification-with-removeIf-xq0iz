fun main() {
    val list = mutableListOf(1, 2, 3, 4, 5)
    val evenNumbers = list.filter { it % 2 == 0 }
    list.removeAll(evenNumbers)
    println(list) 

    //Alternative approach using list iteration
    val list2 = mutableListOf(1, 2, 3, 4, 5)
    val iterator = list2.iterator()
    while (iterator.hasNext()){
        if (iterator.next() % 2 == 0){
            iterator.remove()
        }
    }
    println(list2)
}