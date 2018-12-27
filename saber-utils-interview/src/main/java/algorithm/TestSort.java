package algorithm;

/**
 * @author Aria
 * @time on 2018/12/17.
 */
public class TestSort {

    public static void main(String[] args) {
      int[] numbers = {10, 20, 15, 0, 6, 7, 2, 1, -5, 55};

        //int[] numbers = {1, 2, 3, 4, 10};
        System.out.print("排序前：");
        printArr(numbers);
        QuickSort.quick(numbers);
        System.out.print("快速排序后：");
        printArr(numbers);
    }

    public static void printArr(int[] numbers) {
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + ",");
        }
        System.out.println("");
    }
}