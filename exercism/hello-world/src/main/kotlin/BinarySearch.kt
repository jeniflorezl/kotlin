
object BinarySearch {
    fun search(list: List<Int>, item: Int): Int {
        var start = 0
        var end = list.lastIndex

        while (start <= end) {
            val middle = (start + end) / 2
            val element = list[middle]

            when {
                element == item -> return middle
                element < item -> start = middle + 1
                else -> end = middle - 1
            }
        }

        throw NoSuchElementException("The number doesn't exist")
    }
}
