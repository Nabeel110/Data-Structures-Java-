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
public class PolyNode 
{
 int coefficient;
 int power;
 PolyNode next;
 public PolyNode(int c, int p)
 {
     coefficient = c;
     power = p;
 }

    public int getCoefficient() {
        return coefficient;
    }

    public int getPower() {
        return power;
    }
}
