import io.kotest.core.spec.style.FunSpec
import io.kotest.matchers.shouldBe

class MainTest : FunSpec({

    test("test") {
        test() shouldBe "test"
    }
})
