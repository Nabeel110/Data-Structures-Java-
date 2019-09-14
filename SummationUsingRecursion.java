/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package homeassignment2;

//import java.util.Scanner;

/**
 *
 * @author Dell
 */
public class SummationUsingRecursion 
{
    public static void main(String[] args)
    {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter number of which you wanna find summation of : ");
//        int N = sc.nextInt();
//       int result = sum(N);
//        System.out.println(result);
       
    }
 public  int sum(int n)
 {
      if (n==1)
        return 1;
    else
       return sum(n-1)+n;
 }
 
}