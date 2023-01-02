package partone.fastsorting

//to sort elements that doesn't implement comparable, the api needs to be slightly changed,
//so it takes a transformation function from T to C implements Comparable<C> and compare using it
fun <T : Comparable<T>> List<T>.mergeSort(): List<T> {

  if (size == 1) return this

  val m: Int = size / 2

  val a: List<T> = subList(0, m).mergeSort()
  val b = subList(m, size).mergeSort()

  return mergeSorted(a, b)
}

private fun <T : Comparable<T>> mergeSorted(
    a: List<T>,
    b: List<T>,
): List<T> {
  val result = mutableListOf<T>()

  val aItr = a.iterator()
  val bItr = b.iterator()
  //index element of a and b
  var aI: T? = null
  var bI: T? = null

  while (aItr.hasNext() || bItr.hasNext() || aI != null || bI != null) {

    if (aItr.hasNext() && bItr.hasNext()) {
      // only move the iterator when the element is added
      aI = aI ?: aItr.next()
      bI = bI ?: bItr.next()

      if (aI < bI) {
        result.add(aI)
        aI = null
      } else {
        result.add(bI)
        bI = null
      }
    } else if (aItr.hasNext()) {
      //take all from A considering the last element of B if exists
      aI = aI ?: aItr.next()
      if (bI != null && bI < aI) {
        result.add(bI)
        bI = null
      } else {
        result.add(aI)
        aI = null
      }
    } else if (bItr.hasNext()) {
      //take all from B considering the last element from A if exists
      bI = bI ?: bItr.next()
      if (aI != null && aI < bI) {
        result.add(aI)
        aI = null
      } else {
        result.add(bI)
        bI = null
      }
    } else {
      //The edge case when each iterable has only 1 element
      if (aI != null) {
        result.add(aI)
        aI = null
      } else if (bI != null) {
        result.add(bI)
        bI = null
      }
    }
  }
  return result
}
