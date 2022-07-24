
public class SumOfArray {

    public static void main(String[] args) {
        // You can try the method here
        int[] array = {5, 1, 3, 4, 2};
        System.out.println(sumOfNumbersInArray(array));
    }

    public static int sumOfNumbersInArray(int[] array) {
        // Write some code here
        int index = 0;
        int sum = 0;
        while (index < array.length) {
            sum += array[index];
            index++;
        }
        return sum;
    }
}
