fun transcribeToRna(dna: String): String {
    if (dna.isEmpty()) return ""
    return dna.map {
        when(it) {
            'G' -> 'C'
            'C' -> 'G'
            'T' -> 'A'
            'A' -> 'U'
            else -> "Invalid dna"
        }
    }.joinToString("")
}