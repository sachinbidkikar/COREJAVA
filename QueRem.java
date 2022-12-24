import java.util.Scanner;

public class QueRem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter No1 & Enter No2");
        double number1 = sc.nextDouble();
        double number2 = sc.nextDouble();
        double quotient = number1 / number2;
        double remainder = number1 % number2;
        System.out.println("Quotient Is " +quotient +" Remainder " +remainder);

    }
}
