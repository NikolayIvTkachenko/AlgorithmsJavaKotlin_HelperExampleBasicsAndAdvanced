package Base_Algorithms.A_SortsAlgorithm;

public class AppRadixSortString {

    public static void main(String[] args) {

        String[] radixArray = {"bcdef", "dbaqc", "abcde", "omadd", "bbbbb", "aderf"};
        printArray(radixArray);

        radixSort(radixArray, 26, 4);

        printArray(radixArray);
    }

    public static void radixSort(String[] input, int radix, int width){
        for(int i = 0; i < width; i++){
            radixSingleSort(input, i, radix);
        }
    }

    public static void radixSingleSort(String[] input, int position, int radix){

        int numItems = input.length;
        int[] countArray = new int[radix];

        for(String value: input){
            countArray[getIndex(position, value)]++;
        }

        for(int j = 1; j < radix; j++){
            countArray[j] += countArray[j - 1];
        }

        String[] temp = new String[numItems];
        for(int tempIndex = numItems - 1; tempIndex >= 0; tempIndex--){
            temp[--countArray[getIndex(position, input[tempIndex])]] = input[tempIndex];
        }

        for(int tempIndex = 0; tempIndex < numItems; tempIndex++){
            input[tempIndex] = temp[tempIndex];
        }

    }

    public static int getIndex(int position, String value){
        return value.charAt(position) - 'a';
    }

    public static void printArray(String[] array){
        System.out.println("================");
        for(int i = 0; i < array.length; i++){
            System.out.println(array[i]);
        }
    }
}
