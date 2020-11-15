fun main() {
    println("Please enter your age")
    val age = readLine()!!.toInt()
    if (age <16)
    {
        println("child")
    }
    else if(age>16&&age<30){
        println("Adult")
    }
    else if(age>30&&age<50)
    {
        println("Young")
    }
    else if(age>50&&age<=110)
    {
        println("old age")
    }
    else
    {
        println("invalid input")
    }
}