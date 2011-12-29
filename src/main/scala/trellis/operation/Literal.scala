package trellis.operation

import trellis.process.Server

// TODO: create some nice implicits?

/**
 * Return the literal value specified.
 */
case class Literal[A](value:A) extends SimpleOperation[A] {
  def childOperations = List.empty[Operation[_]]
  def _value(server:Server) = this.value
}

object Literal {
  implicit def implicitLiteral[A](a:A):Operation[A] = Literal(a)
}