import java.util.Scanner;
public class Main {
    // even or odd
    public static void main(String[] args) {
        int a;
        int x;
        Scanner scanner = new Scanner(System.in);
        a=scanner.nextInt();
        x = a % 2;
        if (x == 0) {
            System.out.println("even");
        } else {
            System.out.println("odd");
        }

    }
}