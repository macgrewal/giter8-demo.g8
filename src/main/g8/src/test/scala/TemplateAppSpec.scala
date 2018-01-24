package base

import org.scalatest.{WordSpec, Matchers}

class TemplateAppSpec extends WordSpec with Matchers {

  "Value of x" should {
    "be x" in {
      TemplateApp.x shouldBe "x"
    }
  }

}