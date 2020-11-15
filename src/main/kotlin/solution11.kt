fun main() {
    println("Please enter the number")
    val a=readLine()!!.toInt()
    println("Please enter the second number")
    val c=readLine()!!.toInt()
    if(a%2==0&&c%2==0)
    {
        println("The sum of even numbers is $a+&c")
    }
    else if(a%2==0&&c%2!=0)
    {
        println("The sum of even numbers is $a")
    }
    else if(c%2==0&&a%2!=0)
    {
        println("The sum of even numbers is $c")
    }
    else{
        println("No even numbers to sum")
    }
}