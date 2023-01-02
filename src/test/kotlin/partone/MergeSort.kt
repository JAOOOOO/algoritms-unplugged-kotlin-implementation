package partone

import kotlin.test.Test
import kotlin.test.assertEquals
import partone.fastsorting.mergeSort

class MergeSort {

  @Test
  fun `should sort integers`() {
    val l = listOf(99, 3, 6, 5, 88, 77, 11, 65, 46, 23, 13, 17, 98, 55)
    val sorted = l.mergeSort()
    val kSorted = l.sorted()

    assertEquals(kSorted, sorted)
  }

    @Test
    fun `should sort strings`() {
        val l = listOf("very long string", "happy new year", "beethoven", "kotlin")
        val sorted = l.mergeSort()
        val kSorted = l.sorted()

        assertEquals(kSorted, sorted)
    }
}
