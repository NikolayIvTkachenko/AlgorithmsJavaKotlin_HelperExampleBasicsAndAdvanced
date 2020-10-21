package Base_Algorithms.A_SortsAlgorithm;

public class AppRadixSort {

    public static void main(String[] args) {

        int[] radixArray = {4626, 4689, 1340, 8893, 1591, 5728};
        printArray(radixArray);

        radixSort(radixArray, 10, 4);

        printArray(radixArray);
    }

    public static void radixSort(int[] input, int radix, int width){
        for(int i = 0; i < width; i++){
            radixSingleSort(input, i, radix);
        }
    }

    public static void radixSingleSort(int[] input, int position, int radix){

        int numItems = input.length;
        int[] countArray = new int[radix];

        for(int value: input){
            countArray[getDigit(position, value, radix)]++;
        }

        for(int j = 1; j < radix; j++){
            countArray[j] += countArray[j - 1];
        }

        int[] temp = new int[numItems];
        for(int tempIndex = numItems - 1; tempIndex >= 0; tempIndex--){
            temp[--countArray[getDigit(position, input[tempIndex], radix)]] = input[tempIndex];
        }

        for(int tempIndex = 0; tempIndex < numItems; tempIndex++){
            input[tempIndex] = temp[tempIndex];
        }

    }

    public static int getDigit(int position, int value, int radix){
        return value / (int) Math.pow(radix, position) % radix;
    }

    public static void printArray(int[] array){
        System.out.println("================");
        for(int i = 0; i < array.length; i++){
            System.out.println(array[i]);
        }
    }
}
