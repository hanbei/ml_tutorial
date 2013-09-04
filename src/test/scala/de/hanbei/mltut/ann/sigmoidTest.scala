package de.hanbei.mltut.ann

import org.scalatest.FunSuite
import org.scalatest.matchers.ShouldMatchers
import org.junit.runner.RunWith
import org.scalatest.junit.JUnitRunner

/**
  */
@RunWith(classOf[JUnitRunner])
class sigmoidTest extends FunSuite with ShouldMatchers {

  test("sigmoid function at 0.0") {
    sigmoid(0.0) should be(0.5)
  }

}
