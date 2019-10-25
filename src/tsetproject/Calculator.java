
package tsetproject;

public class Calculator extends FloatOperation {
   
    public Calculator(int a, int b){
      
    }
  
    public Calculator(){
 
    }
    @Override
    public int add(int a, int b){
        return a + b ;
    }
    @Override
     public int sub(int a, int b){
        return a - b;
     }
    @Override
     public int mult(int a, int b){
         return a*b;
         
     }
    @Override
     public int divide(int a, int b){
         if(b!=0){
              return a/b;
         }
         else{
             return -1;
         }
     } 
        
    
}
