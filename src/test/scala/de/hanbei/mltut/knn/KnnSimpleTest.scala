package de.hanbei.mltut.knn

import org.junit.runner.RunWith
import org.scalatest.junit.JUnitRunner
import org.scalatest.{BeforeAndAfterEach, FunSuite}
import org.scalatest.matchers.ShouldMatchers

@RunWith(classOf[JUnitRunner])
class KnnSimpleTest extends FunSuite with ShouldMatchers with BeforeAndAfterEach {

  var knn: KnnSimple = null

  override def beforeEach {
    knn = new KnnSimple()
    knn.train(List(Array(-10.0, -10.0), Array(0.0, 0.0), Array(10.0, 10.0), Array(20.0, 20.0), Array(30.0, 30.0)))
  }

  test("knn-simple") {
    val neighbours: List[Array[Double]] = knn.nearestNeighbour(2, Array(5.0, 5.0))

    neighbours.size should be(2)
    neighbours(0) should be(Array(0.0, 0.0))
    neighbours(1) should be(Array(10.0, 10.0))
  }

  test("knn-simple2") {
    val neighbours: List[Array[Double]] = knn.nearestNeighbour(2, Array(-3.0, -5.0))

    neighbours.size should be(2)
    neighbours(0) should be(Array(0.0, 0.0))
    neighbours(1) should be(Array(-10.0, -10.0))
  }
}
