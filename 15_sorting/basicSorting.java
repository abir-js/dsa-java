public class basicSorting {

    public static void bubbleSort(int arr[]) {
        for (int turn = 0; turn < arr.length - 1; turn++) {
            for (int j = 0; j < arr.length - 1 - turn; j++) {
                if (arr[j] > arr[j + 1]) {
                    swap(arr, j, j + 1);
                }
            }
        }
        printArray(arr);
    }

    public static void bubbleSortReverse(int arr[]) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            for (int j = n - 1; j > i; j--) {
                if (arr[j] < arr[j - 1])
                    swap(arr, j, j - 1);
            }
        }
        printArray(arr);
    }

    public static void selectionSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            int minPosition = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[minPosition] > arr[j]) {
                    minPosition = j;
                }
            }
        }
        printArray(arr);
    }

    public static void selectionSortBackward(int arr[]) {
        for (int i = arr.length - 1; i >= 0; i--) {
            int biggest = i;
            for (int j = i - 1; j >= 0; j--) {
                if (arr[j] > arr[biggest])
                    biggest = j;
            }
            swap(arr, biggest, i);
        }
        printArray(arr);
    }

    public static void insertionSort(int arr[]) {
        for (int i = 1; i < arr.length; i++) {
            for (int j = i; j > 0; j--) {
                if (arr[j] < arr[j - 1])
                    swap(arr, j, j - 1);
            }
        }
        printArray(arr);
    }

    public static void insertionSortReverse(int arr[]) {
        int n = arr.length;
        for (int i = n - 2; i >= 0; i--)
            for (int j = i; j < n - 1; j++)
                if (arr[j] > arr[j + 1])
                    swap(arr, j, j + 1);
                else
                    break;

        printArray(arr);
    }

    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void printArray(int[] arr) {
        for (int i : arr) {
            System.out.println(i);
        }
    }

    public static void main(String[] args) {
        int[] arr = { 5, 4, 1, 3, 2 };
        // insertionSort(arr);
        insertionSortReverse(arr);

    }
}