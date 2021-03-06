package io.shiftleft

import io.shiftleft.queryprimitives.steps.Implicits._
import io.shiftleft.passes.dataflows.Implicits._
import io.shiftleft.codepropertygraph.generated.nodes
import io.shiftleft.passes.dataflows.steps._

object Main extends App {
  val cpg = CpgLoader.loadCodePropertyGraph(args(0))
  implicit val graph = cpg.graph

  println("------------------")

  // Print all method names
  println(cpg.method.name.p)

}

