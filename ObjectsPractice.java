public class ObjectsPractice {
    int a = 5;
   static String name = "abc";

}
    class Class2 {
        public static void main(String[] args) {
           ObjectsPractice.name = "sachin";  // we have to use classname.variable = new value
            ObjectsPractice s1 = new ObjectsPractice();

            System.out.println(s1.a);
            System.out.println(s1.name);

        }
    }
