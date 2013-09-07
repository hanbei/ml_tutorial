package de.hanbei.mltut.regression

import org.scalatest.{BeforeAndAfterEach, FunSuite}
import org.junit.runner.RunWith
import org.scalatest.junit.JUnitRunner
import org.scalatest.matchers.ShouldMatchers

@RunWith(classOf[JUnitRunner])
class LinearRegressionTest extends FunSuite with ShouldMatchers with BeforeAndAfterEach {

    var regression : LinearRegression = null

    override def beforeEach {
        regression = new LinearRegression()
    }

    test("test training: slope should be 1") {
        regression.train(List(1, 2, 3, 4, 5), List(1, 2, 3, 4, 5))
        regression.slope should be(1.0)
        regression.intercept should be(0.0)
    }

    test("test training: slope should be 0.5") {
        regression.train(List(2, 4, 6, 8, 10), List(1, 2, 3, 4, 5))
        regression.slope should be(0.5)
        regression.intercept should be(0.0)
    }

    test("test training: slope should be 1 and beta 1") {
        regression.train(List(0, 1, 2, 3, 4, 5), List(0.0, 1.0, 2.0, 3.0, 4.0, 5.0).map(x => x + 1))
        regression.slope should be(1.0)
        regression.intercept should be(1.0)
    }

    test("test training: wiki example") {
        regression.train(List(20, 16, 15, 16, 13, 10), List(0, 3, 7, 4, 6, 10))
        regression.slope should be(-0.98 plusOrMinus 0.003)
        regression.intercept should be(19.73 plusOrMinus 0.003)
    }

}
