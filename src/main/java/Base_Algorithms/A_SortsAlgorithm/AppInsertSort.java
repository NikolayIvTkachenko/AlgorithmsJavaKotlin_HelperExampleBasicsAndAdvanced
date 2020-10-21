package Base_Algorithms.A_SortsAlgorithm;

public class AppInsertSort {

    public static void main(String[] args) {

        int[] intArray = {20, 35, -15, 7, 55, 1, -22};

        printArray(intArray);

        for(int firstUnsortedIndex = 1; firstUnsortedIndex < intArray.length; firstUnsortedIndex++){

            int newElement = intArray[firstUnsortedIndex];
            int i;
            for(i = firstUnsortedIndex; i > 0 && intArray[i - 1] > newElement; i--){
                intArray[i] = intArray[i - 1];
            }
            intArray[i] = newElement;
        }

        printArray(intArray);
    }

    public static void printArray(int[] array){
        System.out.println("================");
        for(int i = 0; i < array.length; i++){
            System.out.println(array[i]);
        }
    }
}
