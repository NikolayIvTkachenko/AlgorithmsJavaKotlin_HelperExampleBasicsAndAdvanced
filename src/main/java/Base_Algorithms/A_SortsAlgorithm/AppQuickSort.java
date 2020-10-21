package Base_Algorithms.A_SortsAlgorithm;

public class AppQuickSort {

    public static void main(String[] args) {

        int[] intArray = {20, 35, -15, 7, 55, 1, -22};
        printArray(intArray);

        quickSort(intArray, 0, intArray.length);

        printArray(intArray);
    }

    public static void quickSort(int[] input, int start, int end){
        if(end - start < 2){
            return;
        }

        int pivotIndex = partition(input, start, end);
        quickSort(input, start, pivotIndex);
        printArray(input);
        quickSort(input, pivotIndex + 1, end);
    }

    public static int partition(int[] input, int start, int end){
        int pivot = input[start];
        int i = start;
        int j = end;

        while(i < j){
            while(i < j && input[--j] >= pivot);
            if (i < j){
                input[i] = input[j];
            }

            while (i < j && input[++i] <= pivot);
            if(i < j){
                input[j] = input[i];
            }
        }
        input[j] = input[i];
        return j;
    }

    public static void printArray(int[] array){
        System.out.println("================");
        for(int i = 0; i < array.length; i++){
            System.out.println(array[i]);
        }
    }
}
