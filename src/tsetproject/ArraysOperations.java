
package tsetproject;

public class ArraysOperations {
    private int[] array ;
    public ArraysOperations(int []arr){
        this.array = arr;
    }
      
    
    public int[] insertionSort(int[]array){
        int i =1;
        int key;
        int j = 0;
        while(i < array.length){
            key = array[i];
            j=i-1;
        while(j >= 0 && array[j] > key){
            array[j+1]=array[j];
            j=j-1;
        }
        array[j+1]=key;
        i=i+1;
        }
        return array;
    }
    
    
}
