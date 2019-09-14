/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package homeassignment2;

/**
 *
 * @author Dell
 */
public class Fibonacci 
{
   int result;
   int[] arr;
   public Fibonacci(int n)
   {
       arr = new int[n+1];
   }
 public  int FibSum(int n)
 {
     if(arr[n] != 0)
     {
         return arr[n];
     }
     
     if( n == 0 ){
           result = 0;
     }
     if ( n== 1 || n == 2)
     {
         arr[n] = 1;
         result = 1;
     }
    
      else
     {
         result = FibSum(n-1) + FibSum(n-2);
         arr[n] = result;
     }
   return result;
 }
 public String toString()
 {  
     String str = "";
     for (int i = 0; i < arr.length; i++) 
     {
         str += arr[i] +" ";
     }
     return str;
 }
 
}
