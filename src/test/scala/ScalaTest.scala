import org.scalatest.{FlatSpec, Matchers}

class ScalaTest extends FlatSpec with Matchers {

  "this test" should "pass" in {
    1 shouldBe 1
  }
}
