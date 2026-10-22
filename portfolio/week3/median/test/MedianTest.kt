import io.kotest.core.spec.style.FreeSpec
import io.kotest.assertions.throwables.shouldThrow
import io.kotest.matchers.shouldBe
import io.kotest.matchers.floats.plusOrMinus

const val tolerance = 0.000001f

@Suppress("Unused")
class MedianTest : FreeSpec({

    "Exception when size=0" {
        shouldThrow<IllegalArgumentException> {
            median(listOf())
        }
    }

    "Median of 1 element" {
        median(listOf(7.0f)) shouldBe (7.0f plusOrMinus tolerance)
    }

    "Median of 2 elements" {
        median(listOf(2.0f, 9.0f)) shouldBe (5.5f plusOrMinus tolerance)
    }

    "Median of 3 elements" {
        median(listOf(9.0f, 1.0f, 5.0f)) shouldBe (5.0f plusOrMinus tolerance)
    }

    "Median of 4 elements" {
        median(listOf(10.0f, 2.0f, 8.0f, 5.0f)) shouldBe (6.5f plusOrMinus tolerance)
    }

})