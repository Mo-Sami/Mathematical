/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tsetproject;

/**
 *
 * @author muhamed
 */
public class Multiplicand {
    
    public int multiplicand(int number){
        int fact=1;
        if(number ==1)return 1;
            
        fact = fact *multiplicand(number-1);    
        return fact;    
    }
    public int fibonacciSeries(int number){
        int first =0;
        int second =1;
        int next=0;
        for(int i=0 ; i<number;i++){
           if(i<=1){
               next =i;
               
           }else{
            
            next=first+second;
            first=second;
            second=next;
           }
        }
        return next;
    }
}