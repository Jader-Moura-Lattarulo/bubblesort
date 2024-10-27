public class Main {
    public static void main(String[] args) {

        int[] array = {64, 34, 25, 12, 22, 11, 90};
        System.out.println("Array original:");
        BubbleSort.printArray(array);

        BubbleSort.bubbleSort(array);

        System.out.println("\nArray ordenado:");
        BubbleSort.printArray(array);
    }
}