fun main() {
    println("Please enter number 1 2 or 7")
    val s = readLine()!!.toInt()
    if (s==1)
    {
        println("Sunday")
    }
    else if(s==2){
        println("Monday")
    }
    else if(s==7)
    {
        println("Saturday")
    }
}