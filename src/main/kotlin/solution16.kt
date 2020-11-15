fun main() {
    val arr = arrayOf(1, 4, 6, 7, 8, 99, 12, 3, 23)
    var sum:Int=0

    for (i in evenAdd(arr)){
        if(i!=0) {
            sum = sum + i
        }
    }
    println("The sum of all the even numbers in the array is $sum")
}
fun evenAdd(arr:Array<Int>): IntArray {
    var arr2=IntArray(arr.size)
    var count = 0
    for(i in arr.indices)
    {
        if(arr[i]%2==0)
        {
            arr2[count]=arr[i]
            count+=1
        }

    }
    return arr2

}