class Employee(val clothesSize: Int) {
    class Uniform {
        val uniformType = "suit"
        val uniformColor = "blue"
    }

    fun printUniformInfo() {
        val uniform = Uniform()
        val uniformColor = uniform.uniformColor
        val uniformType = uniform.uniformType
        println(
            "The employee wears a $uniformColor $uniformType in " +
                    "size $clothesSize"
        )
    }
}