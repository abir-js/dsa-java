
public class findMaxElement {

    public static int getLargest(int numbers[]) {
        int largest = Integer.MIN_VALUE;
        for (int i : numbers) {
            if (i > largest) {
                largest = i;
            }
        }
        return largest;
    }

    public static int getSmallest(int numbers[]) {
        int smallest = Integer.MAX_VALUE;
        for (int i : numbers) {
            if (i < smallest) {
                smallest = i;
            }
        }
        return smallest;
    }

    public static void main(String[] args) {
        int numbers[] = { 100, 50, 200, 150, 300, 1000, 800 };

        System.out.println(getLargest(numbers));
        System.out.println(getSmallest(numbers));
    }
}
