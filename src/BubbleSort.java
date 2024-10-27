public class BubbleSort {
    private BubbleSort(){

    }

    public static void bubbleSort(int[] array) {
        int number = array.length;
        boolean swapped;

        for (int i = 0; i < number - 1; i++) {
            swapped = false;

            for (int j = 0; j < number - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j+1];
                    array[j + 1] = temp;
                    swapped = true;
                }
            }

            if(!swapped) break;
        }
    }

    public static void printArray(int[] array) {
        for (int value : array) {
            System.out.println(value + " ");
        }
        System.out.println();
    }
}
