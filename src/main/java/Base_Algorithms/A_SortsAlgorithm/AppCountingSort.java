package Base_Algorithms.A_SortsAlgorithm;

public class AppCountingSort {

    public static void main(String[] args) {

        int[] intArray = {20, 35, -15, 7, 55, 1, -22};
        printArray(intArray);

        countingSort(intArray, 1, 10);

        printArray(intArray);

    }

    public static void countingSort(int[] input, int min, int max){

        int[] countArray = new int[(max - min) + 1];

        for(int i = 0; i < input.length; i++){
            countArray[input[i] - min]++;
        }

        int j = 0;

        for (int i = min; i <= max; i++){
            while(countArray[i - min] > 0){
                input[j++] = i;
                countArray[i - min]--;
            }
        }
    }

    public static void printArray(int[] array){
        System.out.println("================");
        for(int i = 0; i < array.length; i++){
            System.out.println(array[i]);
        }
    }
}
