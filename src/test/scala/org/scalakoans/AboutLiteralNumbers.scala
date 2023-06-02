package org.scalakoans

import support.KoanSuite
import support.BlankValues.__

class AboutLiteralNumbers extends KoanSuite {
  koan(
    "Integer Literals are 32-bit and can be created from decimal or hexadecimal"
  ) {
    val a = 2
    val b = 31
    val c = 0x30f
    val d = 0
    val e = -2
    val f = -31
    val g = -0x30f
    a should be(2)
    b should be(31)
    c should be(783) // Hint: 30F = 783
    d should be(0)
    e should be(-2)
    f should be(-31)
    g should be(-783) // Hint: 30F = 783
  }

  koan(
    """Long Literals are 64 bit, are specified by appending an L or l at the end;
         |   l is rarely used since it looks like a 1"""
  ) {
    val a = 2L
    val b = 31L
    val c = 0x30fL
    val d = 0L
    val g = -2L
    val h = -31L
    val i = -0x30fL

    a should be(2L)
    b should be(31L)
    c should be(783L) // Hint: 30F = 783
    d should be(0L)
    g should be(-2L)
    h should be(-31L)
    i should be(-783L) // Hint: 30F = 783
  }

  koan("""Float and Double Literals are IEEE 754 for specific,
         |   Float are 32-bit length, Doubles are 64-bit.
         |   Floats can be coerced using a f or F suffix, and
         |   Doubles can be coerced using a d or D suffix.
         |   Exponent are specified using e or E.""") {

    val a = 3.0
    val b = 3.00
    val c = 2.73
    val d = 3f
    val e = 3.22d
    val f = 93e-9
    val g = 93e-9
    val h = 0.0
    val i = 9.23e-9d

    a should be(3.0)
    b should be(3.00)
    c should be(2.73)
    d should be(3f)
    e should be(3.22d)
    f should be(93e-9)
    g should be(93e-9)
    h should be(0.0)
    i should be(9.23e-9d)
  }
}
