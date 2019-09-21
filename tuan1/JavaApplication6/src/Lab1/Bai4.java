/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab1;

import java.util.Scanner;

/**
 *
 * @author E5-575G
 */
public class Bai4 {
      public static void main(String[] args) {
        double a,b,c,Delta,x;
        Scanner vantruc= new Scanner(System.in);
        System.out.println("Nhap So a");
        a=vantruc.nextDouble();
        System.out.println("Nhap So b");
        b=vantruc.nextDouble();
        System.out.println("Nhap So c");
        c=vantruc.nextDouble();
        Delta=Math.pow(b, 2)-4*a*c;
        x=Math.sqrt(Delta);
        System.out.println("Delta"+Delta);
        System.out.println("Cang Delta"+x);
      }
}
