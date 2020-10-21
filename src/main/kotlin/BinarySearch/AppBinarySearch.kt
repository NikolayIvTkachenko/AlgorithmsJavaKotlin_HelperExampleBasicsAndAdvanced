package BinarySearch

class AppBinarySearch {

    fun getSearchArray(searchNumber: Int, numbers: Array<Int>): Int? {
        print("Start getSearchArray")

        var lowerBound: Int = 0
        var higherBound: Int = numbers.size - 1

        var result: Int? = null
        while (higherBound > lowerBound) {
            print("searchNumbe = $searchNumber")
            print("\n")
            val index: Int = (higherBound + lowerBound) / 2

            print("searchNumbe = $searchNumber")
            print("\n")
            print("numbers[index] = ${numbers[index]}")
            print("\n")

            if (numbers[index] > searchNumber) {
                higherBound = index
            } else if (numbers[index] == searchNumber) {
                result = index
                break
            } else {
                lowerBound = index + 1
            }


            print("index = $index")
            print("\n")
            print("lowerBounds = $lowerBound")
            print("\n")
            print("lowerBounds[] = ${numbers[lowerBound]}")
            print("\n")
            print("higherBound = $higherBound")
            print("\n")
            print("higherBound[] = ${numbers[higherBound]}")
            print("\n")
        }
        return result
    }
}


fun main() {

    var appBinarySearch = AppBinarySearch()

    val inputArray = arrayOf(1,2,3,4,6,7,8,9,10,11)

    val inputArray2 = arrayOf(1,2,3,4,5,6,7,8,9,10,11)

    for (i in  0..inputArray2.size-1){
        print("index = $i \n")
        print("result from function = ${appBinarySearch.getSearchArray(inputArray2[i], inputArray)}")
        print("\n")

    }
}