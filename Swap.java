public class Swap {
    public static void main(String[] args) {
        int NUMBER1 = 10, NUMBER2 = 20, temp;
        System.out.println("NUMBER-1 is: " +NUMBER1 +" NUMBER-2 is " +NUMBER2 );
        temp = NUMBER1;
        NUMBER1 = NUMBER2;
        NUMBER2 = temp;
        System.out.println("OUTPUT AFTER NUMBER SWAPPING IS ");
        System.out.println("NUMBER-1 is: " +NUMBER1 +" NUMBER-2 is " +NUMBER2);
    }
}
