
package tsetproject;

public class ArraysOperations {
    private int[] array ;
    public ArraysOperations(int []arr){
        this.array = arr;
    }
       private void mergeSort(int []arr,int lb, int ub){
        if(lb < ub){
           int mid = (lb + ub)/2;
            mergeSort(arr, lb, mid);
            mergeSort(arr, mid+1, ub);
            merge(arr, lb, mid,ub);
           
      
        }}  

         private void merge(int []arr, int lb, int mid, int ub){
             
         }
    
    public int[] insertionSort(int[]array){
        int i =1;
        int key;
        int j;
        while(i<array.length){
            key=array[i];
            j=i-1;
        while(j>=0&&array[j]<key){
            array[j+1]=array[j];
            j=j-1;
        }
        array[j+1]=key;
        i=i+1;
        }
        return array;
    }
    
    
}
