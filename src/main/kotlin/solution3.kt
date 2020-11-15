fun main() {
    println("Please enter a number")
    val m=readLine()!!.toInt()
    if(m>0)
    {
        println("The number is positive")
    }
    else if(m<0)
    {
        println("The number is negative")
    }
    else
    {
        println("The number is 0")
    }
}