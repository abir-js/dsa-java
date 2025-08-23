public class Test {
    public static void main(String[] args) {
        int a = 10; // static variable
        String data = new String("Hello World"); // heap variable ( in heap pool )
        String str1 = "Hello";

        System.out.println(a + data + str1);
    }
}
