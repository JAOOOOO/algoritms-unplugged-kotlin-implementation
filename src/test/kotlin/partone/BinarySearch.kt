package partone

import partone.binarysearch.binaryFind
import kotlin.test.Test
import kotlin.test.*
class BinarySearch {

    data class User(val name: String, val id: Int)

    @Test
    fun `Should return null when key doesn't exist`() {
        val list = listOf(5,9,45,2,44,98,12,33,66,99,44,1,35,48)
        val result = list.binaryFind(key = 1000) { it }

        assertEquals(null, result)
    }

    @Test
    fun `Should return 99 when it exists`() {
        val list = listOf(5,9,45,2,44,98,12,33,66,99,44,1,35,48)
        val result = list.binaryFind(key = 99) { it }

        assertEquals(99, result)

    }
    @Test
    fun `Should return 2 when it exists`() {
        val list = listOf(5,9,45,2,44,98,12,33,66,99,44,1,35,48)
        val result = list.binaryFind(key = 2) { it }

        assertEquals(2, result)
    }

    @Test
    fun `can find a generic item`() {
        val user = User(name = "JAO", id = 10)
        val list = listOf<User>(
            user,
            User(name = "Someone", id = 2),
            User(name = "John", id = 1),
            User(name = "users' names are hard", id = 5),
        )

        val result = list.binaryFind(key = user) { it.id }

        assertEquals(user, result)
    }
}