package tsetproject;

public class TsetProject {

    public static void main(String[] args) {
       Multiplicand m1=new Multiplicand();
       int value=  m1.multiplicand(5);
       System.out.println(value);
       
       //sorting arrray
       int []arr = {5,1,74,5,89,31,4,1,899,65};
       ArraysOperations ar = new ArraysOperations(arr);
       ar.insertionSort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+ "  ");
        }
               System.out.println("");
    }
    
}
