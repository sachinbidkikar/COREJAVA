public class AscendingOrderArray {

    public static void main(String[] args) {
        int[] array = {20,10,15,6,5,1,3,2,4};
        int temporary;
        System.out.println("entered numbers are: ");
        for (int i=0;i<array.length;i++) {
            System.out.println(array[i]);
        }
        for (int i=0;i<array.length;i++)
        {
            for (int j=i+1;j< array.length;j++)
            {
                if (array[i] > array[j])
                {
                    temporary = array[i];
                    array[i] = array[j];
                    array[j] = temporary;
                }
            }
        }
        System.out.println("Ascending orders of given number is: ");
        for (int i=0;i<array.length;i++)
        {
            System.out.println(array[i]);
        }
    }
}