object TemplateApp {
  def x(): String = "x"

  val name = "$name$"

  // upper    | uppercase       : all uppercase letters
  val upper = "upper = $name;format="upper"$"

  // lower    | lowercase       : all lowercase letters
  val lower = "lower = $name;format="lower"$"

  // cap      | capitalize      : uppercase first letter
  val cap = "cap = $name;format="cap"$"

  // decap    | decapitalize    : lowercase first letter
  val decap = "decap = $name;format="decap"$"

  // start    | start-case      : uppercase the first letter of each word
  val start = "start = $name;format="start"$"

  // word     | word-only       : remove all non-word letters (only a-zA-Z0-9_)
  val word = "word = $name;format="word"$"

  // Camel    | upper-camel     : upper camel case (start-case, word-only)
  val Camel = "Camel = $name;format="Camel"$"

  // camel    | lower-camel     : lower camel case (start-case, word-only, decapitalize)
  val camel = "camel = $name;format="camel"$"

  // hyphen   | hyphenate       : replace spaces with hyphens
  val hyphen = "hyphen = $name;format="hyphen"$"

  // norm     | normalize       : all lowercase with hyphens (lowercase, hyphenate)
  val norm = "norm = $name;format="norm"$"

  // snake    | snake-case      : replace spaces and dots with underscores
  val snake = "snake = $name;format="snake"$"

  // packaged | package-dir     : replace dots with slashes (net.databinder -> net/databinder)
  val packaged = "packaged = $name;format="packaged"$"

  // random   | generate-random : appends random characters to the given string
  val random = "random = $name;format="random"$"

  $if(output_blah.truthy)$
  val blah = "you responded to output_blah with '$output_blah$'"
  $else$
  // you responded to output_blah with '$output_blah$'
  $endif$
}
