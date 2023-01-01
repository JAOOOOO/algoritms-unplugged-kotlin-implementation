package partone

import kotlin.test.Test
import kotlin.test.assertEquals
import partone.insertionsort.insertionSort


class InsertionSort {
  @Test
  fun `can sort a list of integers`() {
    val nonSorted = listOf(9, 1, 4, 6, 8, 10, 12, 5, 7)
    val sorted = nonSorted.insertionSort()
    val kSorted = nonSorted.sorted()

    assertEquals(kSorted, sorted)
  }
  @Test
  fun `can sort strings`() {
    val nonSorted = listOf("zebra", "scala", "deer", "java", "kotlin", "clojure")
    val sorted = nonSorted.insertionSort()
    val kSorted = nonSorted.sorted()

    assertEquals(kSorted, sorted)
  }

}
