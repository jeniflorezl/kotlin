object Luhn {

    fun isValid(candidate: String): Boolean {
        val withoutSpaces = candidate.replace(" ", "")
        if (withoutSpaces.length <= 1 || withoutSpaces.any { !it.isDigit() }) return false

        val total = withoutSpaces
            .reversed()
            .mapIndexed { index, char ->
                val digit = char.digitToInt()
                if (index % 2 == 1) {
                    val double = digit * 2
                    if (double > 9 ) double - 9 else double
                } else {
                    digit
                }
            }
            .sum()

        return total % 10 == 0
    }

    /*First version
    fun isValid(candidate: String): Boolean {
        val withoutSpaces = candidate.replace(" ", "")
        if (withoutSpaces.length <= 1 || withoutSpaces.any { !it.isDigit() }) return false

        val numbers: MutableList<Int> = withoutSpaces.toList().map { it.digitToInt() }.reversed().toMutableList()
        for ((index, element) in numbers.withIndex()) {
            if (index % 2 != 0) {
                val double = element * 2
                if (double > 9 ) {
                    numbers[index] = double - 9
                } else {
                    numbers[index] = double
                }
            }
        }

        val sum = numbers.sum()
        val isDivisibleby10 = sum  % 10
        return isDivisibleby10 == 0
    }*/
}
