import java.util.Scanner;

public class CmdLineReadString {
public static void main(String[] args)
{
    String name;
    Scanner sc = new Scanner(System.in); // Scanner newvariablename = new Scanner(System.in);
    System.out.println("Enter Name");
    name = sc.nextLine(); // Declaredvaraible =  newvariablename.nextLine() for reading input from user
    System.out.println("name is " +name);
}
}
