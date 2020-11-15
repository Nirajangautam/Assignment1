fun main() {
    println("Please enter the number")
    val a=readLine()!!.toInt()
    println("Please enter the second number")
    val c=readLine()!!.toInt()
    if(a%2!=0&&c%2!=0)
    {
        println("Both Number are odd")
    }
    else if(a%2!=0&&c%2==0)
    {
        println("$a is odd")
    }
    else if(c%2!=0&&a%2==0)
    {
        println("$c is odd")
    }
    else{
        println("both are even numbers")
    }
}