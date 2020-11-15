fun main() {
    println("please enter an integer value:")
    val t=readLine()!!.toInt()
    for(i in 1..10)
    {
        var m=t*i
        println("$t X $i=$m")
    }

    }