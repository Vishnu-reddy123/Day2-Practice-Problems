import java.util.Scanner;
public class SpringSeason {
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        System.out.println ("Enter Day and Month");
        int  day = scan.nextInt();
        int month = scan.nextInt();
        if((month == 3 && day >= 20 && day <= 31))
            System.out.println("True");
        else if((month == 4 && day >=1 && day <= 30))
            System.out.println("True");
        else if((month == 5 && day >= 1 && day <=31))
            System.out.println("True");
        else if((month == 6 && day >= 1 && day <=20))
            System.out.println("True");
        else
            System.out.println("False");
    }
}
