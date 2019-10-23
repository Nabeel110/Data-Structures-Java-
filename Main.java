/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment3;

/**
 *
 * @author Dell
 */
import java.util.Scanner;
import java.util.ArrayList;
public class Main {

    /**2
     * 
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
      Scanner sc = new Scanner(System.in);
      ArrayList<Polynomial> P = new  ArrayList<>();
      ArrayList<Polynomial> addResult = new ArrayList<>();

      int coeff,degF,i;
      Polynomial p1 = new Polynomial();
      Polynomial p2 = new Polynomial();
      Polynomial result = new Polynomial();
      System.out.println("Enter number of polynomial Equations of you wanted to perform addition on :");
        int nEqs = sc.nextInt();
        for ( i = 0; i < nEqs; i++) 
        {   
            int iter  = i + 1;
            System.out.println("Enter degree of polynomial " + iter +": ");
            degF = sc.nextInt();
            System.out.println("Enter the coefficients of your first Polynomial in descending order:");
            for (int j = degF; j > 0; j--) 
        {
           System.out.println("Enter coeff of x^"+ j + " : ");
           coeff = sc.nextInt();
           P.add(new Polynomial());
           P.get(i).insert(coeff, j);
        }
             System.out.print("Constant: ");
             coeff=sc.nextInt();
             P.get(i).insert(coeff, 0);
        }
                 
        if( nEqs == 1)
        {
            P.get(0).displayEquation();
        }
        else if( nEqs == 2 )
        {
            
                addResult.add(new Polynomial());
                addResult.get(0).addition(P.get(0), P.get(1));
                System.out.print("First Polynomial eq is : ");
                P.get(0).displayEquation();
                System.out.print("Second Polynomial eq is : ");
                P.get(1).displayEquation();
                System.out.print("Polynomial 1 + Polynomial 2 Equation is : ");
                addResult.get(0).displayEquation();
            
        }
//        else if (nEqs >=3)
//        {
//           
//                addResult.add(new Polynomial());
//                addResult.get(0).addition(P.get(0), P.get(1));
//                addResult.get(0).addition(addResult.get(0), P.get(2));  
//                for (int j = 0; j < i; j++) 
//                {
//                System.out.print(j + " Polynomial eq is : ");
//                P.get(j).displayEquation();
//                }
////                System.out.print("Second Polynomial eq is : ");
////                P.get(j+1).displayEquation();
////                System.out.print("Third Polynomial eq is : ");
////                P.get(j+1).displayEquation();
//                System.out.println("Result Eqaution is : ");
//                addResult.get(0).displayEquation();
//            
//        }
    }
}
    
