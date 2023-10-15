package src.main.kotlin.ccc

import ccc.SolutionReadWriter

fun main(){
    val LEVEL = 0

    val exampleSolutionReadWriter = SolutionReadWriter("level${LEVEL}_example")
    Solution(exampleSolutionReadWriter).solve()

    for (input in 1..5) {
        val solutionReadWriter = SolutionReadWriter("level${LEVEL}_${input}")
        Solution(solutionReadWriter).solve()
    }

}