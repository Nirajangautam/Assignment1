fun main() {
    println("Please enter a whole Number")
    val n = readLine()!!.toInt()
    if (n > 100)
    {
        println("The number is greater than 100")
    }
    else if(n==100)
    {
        println("The Number is equal to 100")
    }
    else{
        println("The Number is less than 100")
    }
}