package de.hanbei.mltut.ann.perceptron

import org.scalatest.{BeforeAndAfter, FunSuite}
import org.scalatest.matchers.ShouldMatchers


class PerceptronTest extends FunSuite with ShouldMatchers with BeforeAndAfter {

  test("train nand") {
    val perceptron : Perceptron = new Perceptron(2)

    perceptron.train(List(List(0, 0), List(0, 1), List(1, 0), List(1, 1)), List(1, 1, 1, 0))

    perceptron.compute(List(1, 1)) should be(0)
    perceptron.compute(List(1, 0)) should be(1)
    perceptron.compute(List(0, 0)) should be(1)
    perceptron.compute(List(0, 1)) should be(1)
  }

}
