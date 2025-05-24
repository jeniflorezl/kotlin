class DndCharacter {

    val strength: Int = ability()
    val dexterity: Int = ability()
    val constitution: Int = ability()
    val intelligence: Int = ability()
    val wisdom: Int = ability()
    val charisma: Int = ability()
    val hitpoints: Int = 10 + modifier(constitution)

    companion object {

        fun ability(): Int {
            return List(4) { (1..6).random() }
                .sortedDescending()
                .take(3)
                .sum()
        }

        fun modifier(score: Int): Int = (score - 10).floorDiv(2)
    }
}
