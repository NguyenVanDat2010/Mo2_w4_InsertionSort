package insertion;

public class InsertionSort {
    public static void insertionSort(int[] list) {
        for (int i = 1; i < list.length; i++) {
            int currentMinValue = list[i];
            int currentMinIndex = i;
            while (currentMinIndex > 0 && list[currentMinIndex - 1] > currentMinValue) {
                list[currentMinIndex] = list[currentMinIndex - 1];
                currentMinIndex--;
            }
            list[currentMinIndex] = currentMinValue;
        }
    }

    public static void main(String[] args) {
        int[] list = {4, 2, 8, 5, -3, 7};
        insertionSort(list);

        for (int i = 0; i < list.length; i++) {
            System.out.println(list[i] + " ");
        }
    }
}
