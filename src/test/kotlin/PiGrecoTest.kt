import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.assertThrows
import kotlin.math.PI

class PiGrecoTest {
    @Test
    fun calculatePI_inputIsLessThan1_IllegalArgumentException() {
        val obj = PiGreco()

        assertThrows<IllegalArgumentException>{obj.calculatePI(0)}
    }

    @Test
    fun calculatePI_inputIsLessThan100_resultReturned() {
        val obj = PiGreco()

        val result = obj.calculatePI(5)

        assertEquals(PI, result, 0.5)
    }

    @Test
    fun calculatePI_inputIsLessThan1000_resultReturned() {
        val obj = PiGreco()

        val result = obj.calculatePI(100)

        assertEquals(PI, result, 0.3)
    }

    @Test
    fun calculatePI_inputIsLessThan10000_resultReturned() {
        val obj = PiGreco()

        val result = obj.calculatePI(10000)

        assertEquals(PI, result, 0.15)
    }
}