package Base_Algorithms.A_SortsAlgorithm;

import java.util.Arrays;

public class A_AppSampleSortJDK {

    public static void main(String[] args) {

        int[] intArray = {20, 35, -15, 7, 55, 1, -22};
        printArray(intArray);

        Arrays.parallelSort(intArray);

        printArray(intArray);
    }

    public static void printArray(int[] array){
        System.out.println("================");
        for(int i = 0; i < array.length; i++){
            System.out.println(array[i]);
        }
    }
}
