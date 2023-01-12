package partone.fastsorting

fun<T : Comparable<T>> List<T>.quickSort() : List<T> {
    if (size <= 1) return this

    val pivot = first()
    val (left, right) = drop(1).partition { it < pivot }

    return left.quickSort() + pivot + right.quickSort()
}