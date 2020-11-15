fun main() {
    println("Please enter your salary")
    val s = readLine()!!.toInt()
    var tax:Int
    if (s<200000)
    {
        tax=(s*1)/100;
        println("You have to pay tax of $tax")
    }
    else if(s>=200000&&s<350000){
        tax=(200000/100)+((s-200000))*(15/100)
        println("You have to pay tax of $tax")
    }
    else if(s>=350000)
    {
        tax=((200000)/100+(350000-200000)
                *15/100+(s-350000)*25/100)
        println("You have to pay tax of $tax")
    }
}