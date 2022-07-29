import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Arrays
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int numbers[] = new int[size];

        // Input
        for (int i = 0; i < size; i++) {
            numbers[i] = sc.nextInt();
        }

        int x = sc.nextInt(); // search for x

        // Search
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == x) {
                System.out.println(x + " found at: " + i);
            }
        }
    }
}
