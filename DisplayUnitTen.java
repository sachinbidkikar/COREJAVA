//Read a Number 1,10,100,1000 and display unit, ten hundred

import java.util.Scanner;
public class DisplayUnitTen
{
    static int a = 1;
    public static void main(String args[])
    {

        Scanner sc = new Scanner(System.in);
        System.out.println("enter the Number");
        int num = sc.nextInt();

        if(num == 1 ){
            System.out.println("Unit");
        }
        if(num == 10 ) {
            System.out.println("Ten");
        }
        if(num == 100 ) {
            System.out.println("Hundred");
        }
        else{
            System.out.println("Enter Numbers 1, 10, 100 to get UNIT TEN HUNDRED");
        }
    }
}
