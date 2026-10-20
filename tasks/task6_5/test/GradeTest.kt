import io.kotest.core.spec.style.FreeSpec
import io.kotest.matchers.shouldBe
import io.kotest.assertions.assertSoftly
import io.kotest.assertions.withClue

class GradeTest : FreeSpec({

    "Negative marks are invalid" {
        assertSoftly {
            withClue("Mark=-10" ) { grade(-10) shouldBe "?" }
            withClue("Mark=-1") { grade(-1) shouldBe "?" }
        }
    }

    "Marks 0 to 39 give Fail" {
        assertSoftly {
            withClue("Mark=0") { grade(0) shouldBe "Fail" }
            withClue("Mark=20") { grade(20) shouldBe "Fail" }
            withClue("Mark=39") { grade(39) shouldBe "Fail" }
        }
    }

    "Marks 40 to 69 give Pass" {
        assertSoftly {
            withClue("Mark=40") { grade(40) shouldBe "Pass" }
            withClue("Mark=55") { grade(55) shouldBe "Pass" }
            withClue("Mark=69") { grade(69) shouldBe "Pass" }
        }
    }

    "Marks 70 to 100 give Distinction" {
        assertSoftly {
            withClue("Mark=70") { grade(70) shouldBe "Distinction" }
            withClue("Mark=85") { grade(85) shouldBe "Distinction" }
            withClue("Mark=100") { grade(100) shouldBe "Distinction" }
        }
    }

    "Marks above 100 are invalid" {
        assertSoftly {
            withClue("Mark=101") { grade(101) shouldBe "?" }
            withClue("Mark=105") { grade(105) shouldBe "?" }
        }
    }
})