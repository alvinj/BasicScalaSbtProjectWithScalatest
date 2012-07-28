package com.alvinalexander.testproject

import org.scalatest.FunSuite
 
class HelloSuite extends FunSuite {
 
  test("the name is set correctly in constructor") {
    val p = Person("Barney Rubble") 
    assert(p.name == "Barney Rubble")
  }
 
  test("a Person's name can be changed") {
    val p = Person("Chad Johnson") 
    p.name = "Ochocinco"
    assert(p.name == "Ochocinco")
  }
}

