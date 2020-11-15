fun main() {
    val Words=arrayOf("Tangle","Undo","Testing")
    val Meaning= arrayOf("twist together into a confused mass.","cancel or reverse the effects or results of (a previous action or measure)","revealing a person's capabilities by putting them under strain; challenging.")

    val wordMeaning= mapOf("Tangle" to "twist together into a confused mass.","Undo" to "cancel or reverse the effects or results of (a previous action or measure)","Testing" to "revealing a person's capabilities by putting them under strain; challenging.")

    println("Please enter the word to search meaning")
    val word=readLine()!!
    println("The meaning of $word is:${wordMeaning[word]}")


}