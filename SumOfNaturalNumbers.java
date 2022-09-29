import java.util.Scanner;

public class SumOfNaturalNumbers {
    public static void main(String args[]) {
        int x, i = 1;
        int sum = 0;
        System.out.println("Enter Number of items:");
        Scanner scan = new Scanner(System.in);
        x = scan.nextInt();
        while (i <= x) {
            sum = sum + i;
            i++;
        }
        System.out.println("Sum of " + x + " numbers is:" + sum);
    }
}
