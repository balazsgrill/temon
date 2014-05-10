Temon
==============

TExtual MOdel Notation library for Eclipse Modeling Framework

This is a textual modeling framework for EMF sligthly similar to Xtext of EMFText with a few differences:

* No code generation is needed - Grammar model is used at runtime
* Structure of AST is not stictly connected to the domain model
* Very flexible, regular expression based tokenizing
* Uses a modified Earley algorithm instead of Antlr - supports full set of context-free grammars
  * Capable of recovering and partial parsing of erroneous input

Current features

* Convenient syntax for grammar definitions
* Basic grammar with commonly used elements (optional)
* Syntax-highlighting editor with outline view
  * Syntax error markup and annotation
  * Content assist support

