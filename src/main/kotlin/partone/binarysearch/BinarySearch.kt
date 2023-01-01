package partone.binarysearch


fun <T, A : Comparable<A>> List<T>.binaryFind(key: T, transform: (T) -> A): T? {
  val sortedList = sortedBy { transform(it) }

  tailrec fun binaryFindRec(list: List<T>, transform: (T) -> A, left: Int, right: Int): T? {
    if (left >= right) return null

    val middle = (left+ right) / 2
    val target = transform(key)
    val suspect = transform(list[middle])
    if (target == suspect) return list[middle]

    return if (target > suspect) binaryFindRec(list, transform, middle + 1, right)
    else binaryFindRec(list, transform, left, middle - 1)
  }

  return binaryFindRec(
      list = sortedList,  transform = transform, left = 0, right = size)
}
