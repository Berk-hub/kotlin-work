import kotlin.test.Test
import kotlin.test.assertEquals

class GradeTest {

    @Test
    fun testNegative10() {
        assertEquals("?", grade(-10))
    }

    @Test
    fun testNegative1() {
        assertEquals("?", grade(-1))
    }

    @Test
    fun testZero() {
        assertEquals("Fail", grade(0))
    }

    @Test
    fun test20() {
        assertEquals("Fail", grade(20))
    }

    @Test
    fun test39() {
        assertEquals("Fail", grade(39))
    }

    @Test
    fun test40() {
        assertEquals("Pass", grade(40))
    }

    @Test
    fun test55() {
        assertEquals("Pass", grade(55))
    }

    @Test
    fun test69() {
        assertEquals("Pass", grade(69))
    }

    @Test
    fun test70() {
        assertEquals("Distinction", grade(70))
    }

    @Test
    fun test85() {
        assertEquals("Distinction", grade(85))
    }

    @Test
    fun test100() {
        assertEquals("Distinction", grade(100))
    }

    @Test
    fun test101() {
        assertEquals("?", grade(101))
    }

    @Test
    fun test105() {
        assertEquals("?", grade(105))
    }
}