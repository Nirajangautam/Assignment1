fun main() {
    println("Please enter the number")
    val a=readLine()!!.toInt()
    println("Please enter the second number")
    val c=readLine()!!.toInt()
    if(a%2==0&&c%2==0)
    {
        println("Both Number are even")
    }
    else if(a%2==0&&c%2!=0)
    {
        println("$a is even")
    }
    else if(c%2==0&&a%2!=0)
    {
        println("$c is even")
    }
    else{
        println("both are odd numbers")
    }
}