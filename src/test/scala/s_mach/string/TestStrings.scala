package s_mach.string

import scala.util.matching.Regex.Match

/**
 * Set of test strings used in the test classes. do not change.
 */
trait TestStrings {
  val sentence = "The rain in spain."
  val singleWord = "hello!"
  val statements = "a[i] = a[1];\nprintln(a)"
  val doubleString = "1.0"
  val intString = "1"
  val hello = "Hello!"
  val long = "100000000000"
  val complicated = "Hello! 1.0"
  val complicated2 = "1.0 Hello! 1.0"
  val complicated3 = "1 Hello! 1.0"
  val emptyString = ""
  val someUnderscores = "test_variable_with_underscores"
  val moreUnderscores = "test_variable_with_underscores\nanother variable_for testing"
  val simpleCamelCase = "simpleCamelCase"
  val harderCamelCase = "simpleCamelCaseWithWORDSINCAPSNnotCaught"
  val pascalCase = "PascalCase"

  def matchFunction(m : Match) : String = {
    m match {
      case Match("rain") => "heavy rain"
      case Match("spain") => "Spain"
      //case Match(" ") => "_"
      case _ => ""
    }
  }
}
