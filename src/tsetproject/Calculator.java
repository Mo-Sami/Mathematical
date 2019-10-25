
package tsetproject;

public class Calculator implements FloatOperation {
   
    public Calculator(int a, int b){
      
    }

    public Calculator() {
    }
    
   
    public int add(int a, int b){
        return a + b ;
    }
   
     public int sub(int a, int b){
        return a - b;
     }
    
     public int mult(int a, int b){
         return a*b;
         
     }
  
     public int divide(int a, int b){
         if(b!=0){
              return a/b;
         }
         else{
             return -1;
         }
     } 
  
}