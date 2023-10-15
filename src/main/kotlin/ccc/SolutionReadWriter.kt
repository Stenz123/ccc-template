package ccc

import java.io.File

class SolutionReadWriter (private val fileBaseName: String){
    private var fileInExtension = "in"
    private var fileOutExtension = "out"
    fun read(): List<String>{
        val content = this.javaClass.getResource("${fileBaseName}.${fileInExtension}")
            ?: throw IllegalStateException("Missing resource: ${fileBaseName}.${fileInExtension}")
        return content.readText().split("\n")
    }
    fun write(lines: List<String>){
        val file = File("src/main/resources/ccc/${fileBaseName}.${fileOutExtension}")
        file.writeText(lines.joinToString("\n"))
    }
    fun write(line: String) = write(listOf(line))
}