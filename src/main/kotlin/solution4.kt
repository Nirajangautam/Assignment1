fun main() {
    println("Please enter your salary")
    val s = readLine()!!.toInt()
    if (s > 200000)
    {
        println("You have to pay tax")
    }
    else{
        println("You don't have to pay tax")
    }
}