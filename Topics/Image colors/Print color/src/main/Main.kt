fun printColor(myImage: BufferedImage) {
    val (x, y) = readLine()!!.split(" ").map { it.toInt() }

    val c = Color(myImage.getRGB(x, y), true)
    println("${c.red} ${c.green} ${c.blue} ${c.alpha}")
}
