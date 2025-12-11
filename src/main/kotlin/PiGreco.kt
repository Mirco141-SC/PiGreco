class PiGreco {
    fun calculatePI(n:Int): Double {
        require(n >= 1){"The input value must be higher than 1"}

        var c: Int = 0
        var sum: Double = 0.0

        for(i in 1 .. n*2 step 2) {
            if((c % 2) != 0) {
                sum = sum - 1.0/i
            } else {
                sum = sum + 1.0/i
            }

            c++
        }

        return sum * 4.0
    }
}