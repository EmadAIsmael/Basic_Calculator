data class Pumpkin(val type: String, val isForHalloween: Boolean) {

    fun addCandle() = when (isForHalloween) {
        true -> Candle().burning()
        false -> println("We don't need a candle.")
    }

    inner class Candle {
        fun burning() {
            println("The candle is burning inside this spooky $type pumpkin! Boooooo!")
        }
    }
}