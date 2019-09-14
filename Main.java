/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package homeassignment2;

import java.util.Scanner;



/**
 *
 * @author Dell
 */
public class Main 
{
    public static void main(String[] args)
    {
        while(true){
        System.out.println("\t\t\t\t\t Welcome To My Program of Recursive Problems \t\t\t\t\t\t"
                           + "\n> Press 1 to check summation of N numbers"+
                             "\n> Press 2 to see BinarySearch Implementation Using Recursion"+
                              "\n> Press 3 to see computation of fibonacci sequence of given input N through Recursion and memoization" +
                              "\n> Press 4 to see Recursive Implementation of NQueen Problem."+
                               "\n> Press 5 to exit");
        Scanner sc =  new Scanner(System.in);
        int userInput = sc.nextInt();
//        ========================================   Summation of N =======================================================
        if (userInput == 1)
        {
            SummationUsingRecursion sumN = new SummationUsingRecursion();
            System.out.println("Enter a number N of which you want to find summation of: ");
            int N = sc.nextInt();
            System.out.println("The summation of numbers upto "+ N+" is "+sumN.sum(N));
        }
//        ==================================================================================================================
        
//        ============================================ BinarySearch Using recursion ========================================
        if( userInput == 2)
        {
            BinarySearchUsingRecursion bin1 = new BinarySearchUsingRecursion();
            int[] arr1 = {2,45,234,567,876,900,976,999};
            bin1.display(arr1);
            int index = bin1.BinarySearch(arr1,45,0,arr1.length);
            System.out.println("Found 45 at "+index+" index");
            index = bin1.BinarySearch(arr1,999,0,arr1.length);
            System.out.println("Found 999 at "+index+" index");
            index = bin1.BinarySearch(arr1,876,0,arr1.length);
            System.out.println("Found 876 at "+index+" index");
        }
//        ====================================================================================================================

//       ========================================= Fibonacci Sequence using memoization and Recursion ========================
        if(userInput == 3)
        {
            System.out.println("Enter a number N till where u want to compute your fibonacci sequence: ");
            int N= sc.nextInt();
            Fibonacci f1 = new Fibonacci(N);
            System.out.println("The fibonacci sum upto " + N + " is "+f1.FibSum(N));
            System.out.println(f1.toString());
        }
//        =====================================================================================================================

//        ========================================N-Queen problem using Recursion (BONUS) ====================================
        if( userInput == 4 )
        {
            NQueenRecursion NQ = new NQueenRecursion();
            System.out.println("Enter number N of your board: ");
            int N = sc.nextInt();
            NQ.NQueen(NQ.createBoard(N), -1);
        }
//        ======================================================================================================================

        if( userInput == 5)
      {
          break;
      }
    }
    }
}