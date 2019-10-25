
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
           
        }
            
            
        }
     private void merge(int []arr, int lb, int mid, int ub){
         int i ,j,k;
         i=j=k=0;
         int []result = new int [arr.length];
         while(i <= mid && j <= ub){ 
             if(arr[i] <= arr [j])
                 result[k++] = arr[i++];
             else
                 result[k++] = arr[j++];
             
         }
         if(i> mid){
             while(j <= ub){
             result[k++] = arr[j];}}
    else{
             while(i <= mid ){
                 result[k++] = arr[i];
             }
         }
         for (k= lb ; k < ub; k++) {
             arr[k] = result[k];
             
         }
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
