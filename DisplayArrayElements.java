public class DisplayArrayElements {
    public static void main(String[] args) {
        int Array[] = {10,20,30,40,50};
        // For Each Loop
//        for (int ValuesOfArray : Array){
//            System.out.println(ValuesOfArray);
//        }
        // For Loop
        for (int i = 0; i < Array.length; i++){
            System.out.println(Array[i]);
        }
    }
}
