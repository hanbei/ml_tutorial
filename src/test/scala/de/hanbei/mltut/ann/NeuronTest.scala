package de.hanbei.mltut.ann

import org.scalatest.{BeforeAndAfter, FunSuite}
import org.scalatest.matchers.ShouldMatchers
import org.junit.runner.RunWith
import org.scalatest.junit.JUnitRunner

/**
  */
@RunWith(classOf[JUnitRunner])
class NeuronTest extends Neuron(identity, 20) with FunSuite with ShouldMatchers with BeforeAndAfter {

  before {
    weights = weights.map(x => 1.0)
  }

  test("linear neuron sums inputs correctly") {
    compute(Array.range(0, 20).map(x => x * 1.0)) should be(190.0)
  }

}
