package partone.insertionsort

//to sort elements that doesn't implement comparable, the api needs to be slightly changed,
//so it takes a transformation function from T to C implements Comparable<C> and compare using it
fun<T : Comparable<T>> List<T>.insertionSort() : List<T>{
    val mutable = this.toMutableList()

    for(i in 1.. indices.last) {
        //item that needs to be placed in this iteration
        val hand = mutable[i]

        var k = i-1

        //shift right larger items
        while (k >= 0 && mutable[k] > hand) {
            mutable[k+1] = mutable[k]

            k--
        }

        //put hand in its proper place
        mutable[k+1] = hand
    }


    return mutable.toList()
}