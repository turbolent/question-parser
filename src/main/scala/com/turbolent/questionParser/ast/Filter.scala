package com.turbolent.questionParser.ast

import com.turbolent.questionParser.Token


abstract class Filter

case class AndFilter(filters: Seq[Filter]) extends Filter
case class OrFilter(filters: Seq[Filter]) extends Filter
case class PlainFilter(value: Value) extends Filter
case class FilterWithModifier(modifier: Seq[Token], value: Value) extends Filter
case class FilterWithComparativeModifier(modifier: Seq[Token], value: Value) extends Filter
