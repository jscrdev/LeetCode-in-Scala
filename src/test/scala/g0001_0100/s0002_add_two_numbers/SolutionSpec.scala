package g0001_0100.s0002_add_two_numbers

import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should.Matchers

class SolutionSpec extends AnyFlatSpec with Matchers {
    it should "decode" in {
        Solution.decode("") shouldEqual ""
    }
}
