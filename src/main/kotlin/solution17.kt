fun main() {
    val arr = arrayOf(1, 4, 6, 7, 8, 9, 122, 3, 23)
    var g=great(arr)
  println("$g")
    val l = low(arr)
    println("$l")
}

fun great(arr: Array<Int>): String {
    var great: Int = 0
    for (i in arr.indices) {
        for (j in arr.indices) {
            if (arr[i] > arr[j]) {
                arr[i]=arr[i]
                great = arr[i]

            } else if (arr[j] > arr[i]) {
                great=arr[i]
                arr[i]=arr[j]
                arr[j]=great
                great=arr[i]


            }

        }


    }
    return ("The greatest value in the array is $great")
}

fun low(arr: Array<Int>): String {
    var low: Int = 0
    for (x in arr.indices) {
        for (y in arr.indices) {
            if (arr[x] > arr[y]) {
                arr[x]=arr[y]
                low = arr[x]

            } else if (arr[y] > arr[x]) {
                arr[x]=arr[x]
                low = arr[x]

            }

        }


    }
    return ("The lowest value in the array is $low")
}


