//        Operator Programs
//                1. Enter numbers and do the following arithmetic Operations find max and min.
//                i) a+b*c ii) c+a/b
//                iii) a%b+c iV) a*b+c

public class OperatorMinMax {
    public static void main(String[] args) {
        int a = 12, b = 14, c = 5;
        int Value1 = a + b * c;
        int Value2 = c + a / b;
        int Value3 = a % b + c;
        int Value4 = a * b + c;
        System.out.println("First value is : " + Value1);
        System.out.println("Second value is : " + Value2);
        System.out.println("Third value is : " + Value3);
        System.out.println("Fourth value is : " + Value4);
//  Comparing Max values
        if(Value2 > Value1 && Value2 > Value3 && Value2 > Value4){
            System.out.println("MAX VALUE IS " +Value2);
        }
        else if(Value3 > Value1 && Value3 > Value2 && Value3 > Value4){
            System.out.println("MAX VALUE IS " +Value3);
        }
        else if (Value1 > Value2 && Value1 > Value3 && Value1 > Value4){
            System.out.println("MAX VALUE IS " +Value1);
        }
        else if(Value4 > Value1 && Value4 > Value2 && Value4 > Value3){
            System.out.println("MAX VALUE IS " +Value4);
        }

 // Comparing Min Values

        if(Value2 < Value1 && Value2 < Value3 && Value2 < Value4){
            System.out.println("MIN VALUE IS " +Value2);
        }
        else if(Value3 < Value1 && Value3 < Value2 && Value3 < Value4){
            System.out.println("MIN VALUE IS " +Value3);
        }
        else if (Value1 < Value2 && Value1 < Value3 && Value1 < Value4){
            System.out.println("MIN VALUE IS " +Value1);
        }
        else if(Value4 < Value1 && Value4 < Value2 && Value4 < Value3){
            System.out.println("MIN VALUE IS " +Value4);
        }


    }
}
