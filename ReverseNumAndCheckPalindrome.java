import java.util.Scanner;

public class ReverseNumAndCheckPalindrome {
    public static void main(String[] args) {
        int reverse = 0;
        System.out.println("Enter the Number:");
        Scanner scan = new Scanner(System.in);
        Integer number = scan.nextInt();
        int temp = number;
        while (temp != 0) {
            int digit = temp % 10;
            reverse = reverse * 10 + digit;
            temp /= 10;
        }
        System.out.println("Reversed Number: " + reverse);
        if (number != reverse)
            System.out.println("Entered number is not palindrome");
        else
            System.out.println("Entered number is palindrome");
    }
}
