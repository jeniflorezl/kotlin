class Dna(val dnSequence: String) {
    val nucleotides = setOf('A', 'C', 'G', 'T')
   init {
       if (dnSequence.isNotEmpty()) {
           if (dnSequence.any { it !in nucleotides }) {
               throw IllegalArgumentException("This nucleotides are not valid")
           }
       }
   }

    val nucleotideCounts: Map<Char, Int>
        get() {
            val counts = dnSequence.groupingBy { it }.eachCount()
            return nucleotides.associateWith { counts[it] ?: 0 }

            //First version
            /*return nucleotides.associate { nucleotide ->
                nucleotide to dnSequence.count { it == nucleotide } }*/
        }
}
