public class PowerOf2 {
    public static void main(String[] args) {
        int number = Integer.parseInt(args [0]);
        int power;
        if(number >=0 && number <= 31){
            power = (int)Math.pow(2,number);
            System.out.println(power);

            for (int i =1; i<= number;i++){
                System.out.println("Power of 2 " +i +" is" +Math.pow(2,i));
            }
        }

    }
}
