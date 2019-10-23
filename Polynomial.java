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
public class Polynomial 
{
 PolyNode head;
 
 public int scanCoeffF()
 {
     Scanner sc = new Scanner(System.in);
     int coeff = 0;
     System.out.println("Enter coefficient of F(x) : ");
     coeff = sc.nextInt();
     return coeff;
 }
 public int scanCoeffG()
 {
     Scanner sc = new Scanner(System.in);
     int coeff = 0;
     System.out.println("Enter coefficient of G(x) : ");
     coeff = sc.nextInt();
     return coeff;
 }
 public int scanPowerF()
 {
     Scanner sc = new Scanner(System.in);
     int power = 0;
     System.out.println("Enter power of F(x) : ");
     power = sc.nextInt();
     return power;
 }
 public int scanPowerG()
 {
     Scanner sc = new Scanner(System.in);
     int power = 0;
     System.out.println("Enter power of G(x) : ");
     power = sc.nextInt();
     return power;
 }
 public void insert(int c, int p)
 {
     PolyNode n = new PolyNode(c,p);
     if(head == null)
     {
         head = n;
     }
     else
     {
         PolyNode temp = head;
         PolyNode prev = null;
         if( n.getPower() > temp.getPower())
         {
             n.next = head;
             head = n;
         }
         else
         {
             while(temp != null && temp.getPower() > n.getPower())
             {
                 prev = temp;
                 temp = temp.next;
             }
             prev.next = n;
             n.next = temp;
         }
         }
     }
     public void displayEquation()
     {
         
    PolyNode current = head;
    System.out.print(current.getCoefficient() + "x^" + current.getPower());
    while (current.next != null) {
        current = current.next;
        if(current.coefficient < 0)
            System.out.print( " "+ current.coefficient + "x^" + current.power);
        else
        System.out.print(" + " + current.coefficient + "x^" + current.power);
    }
    System.out.println();
}     
     public void addition(Polynomial P1, Polynomial P2)
     {
         PolyNode p1Head = P1.head;
         PolyNode p2Head = P2.head;
         
         while(p1Head != null && p2Head != null)
         {
             if(p1Head.power > p2Head.power)
             {
                 insert(p1Head.coefficient, p1Head.power);
                 p1Head = p1Head.next;
             }
              else if(p1Head.power < p2Head.power)
             {
                 insert(p2Head.coefficient, p2Head.power);
                 p2Head = p2Head.next;
             }
             else
              {
                  insert(p1Head.coefficient + p2Head.coefficient , p1Head.power);
                  p1Head = p1Head.next;
                  p2Head = p2Head.next;
              }
         }
         if(p1Head == null && p2Head != null)
         {
             while(p2Head != null)
             {
                 insert(p2Head.coefficient, p2Head.power);
                 p2Head = p2Head.next;
             }
         }
         else if(p2Head == null && p1Head != null)
         {
             while(p1Head != null)
             {
                 insert(p1Head.coefficient, p1Head.power);
                 p1Head = p1Head.next;
             }
         }
    }
 }
 

