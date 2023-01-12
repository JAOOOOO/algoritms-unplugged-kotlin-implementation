package partone

import org.junit.jupiter.api.Test
import partone.fastsorting.quickSort
import kotlin.test.assertEquals

class QuickSort {

    @Test
    fun `should sort integers`() {
        val l = listOf(99, 3, 6, 5, 88, 77, 11, 65, 46, 23, 13, 17, 98, 55)
        val sorted = l.quickSort()
        val kSorted = l.sorted()

        assertEquals(kSorted, sorted)
    }

}