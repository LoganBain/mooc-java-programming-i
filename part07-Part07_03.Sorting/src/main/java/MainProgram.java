
import java.util.Arrays;


public class MainProgram {

    public static void main(String[] args) {
        // write your test code here
        int[] array = {8, 3, 7, 9, 1, 2, 4};
        System.out.println(Arrays.toString(array));
        MainProgram.sort(array);
    }
    
    public static int smallest(int[] array) {
        int smallest = 999;
        for (int num : array) {
            if (num < smallest) {
                smallest = num;
            }
        }
        return smallest;
    }
    
    public static int indexOfSmallest(int[] array) {
        return MainProgram.indexOfSmallestFrom(array, 0);
    }
    
    public static int indexOfSmallestFrom(int[] table, int startIndex) {
        int smallest = 9999;
        int index = 999;
        for (int i = startIndex; i < table.length; i++) {
            if (table[i] < smallest) {
                smallest = table[i];
                index = i;
            }
        }
        return index;
    }
    
    public static void swap(int[] array, int index1, int index2) {
        int helper = array[index1];
        array[index1] = array[index2];
        array[index2] = helper;
    }
    
    public static void sort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            int smIndex = MainProgram.indexOfSmallestFrom(array, i);
            MainProgram.swap(array, i, smIndex);
            System.out.println(Arrays.toString(array));
        }
    }
}
