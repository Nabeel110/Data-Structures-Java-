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
public class BinarySearchUsingRecursion 
{
 public  int BinarySearch(int[] A, int key, int left, int right)
 {
//  int first = left;
//  int last = right;
  int mid = (left + right)/2;
  if (left == right)
   return -1;
  
  else if(key == A[mid])
    {
      return mid;
    }
  else if(key < A[mid])
    {
    return  BinarySearch(A, key, left, mid-1);
    }
  else
    {
     return BinarySearch(A, key, mid+1, right);
    }
 }
 public void display(int[] arr)
 {
     for (int i = 0; i < arr.length; i++) 
     {
         System.out.print(arr[i] + " ");   
     }
     System.out.println();
 }
}
