/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab2;

import java.util.Scanner;

/**
 *
 * @author E5-575G
 */
public class Bai2 {
      public static void main(String[] args) {
        double a,b,c,Delta,x,x1,x2;
        Scanner vantruc= new Scanner(System.in);
        System.out.println("Nhap vao gia tri a cua phuong trinh :");
        a=vantruc.nextDouble();
        System.out.println("Nhap vao gia tri b cua phuong trinh :");
        b=vantruc.nextDouble();
        System.out.println("Nhap vao gia tri c cua phuong trinh :");
        c=vantruc.nextDouble();
        
        if (a==0) {
            if (b==0) {
                if (c==0) {
                    System.out.println("Phuong trinh co vo so nghiem !");
                    
                }
                else {
                    System.out.println("Phuong trinh vo nghiem !");
                }
                
            }
            else {
                x=-c/b;
                System.out.println("Nghiem cua phuong trinh la "+x);
                
            }
        }
        else {
            Delta=Math.pow(b, 2)-4*a*c;
            if (Delta < 0) {
                System.out.println("Phuong trinh vo nghiem !");
                
            }
            if (Delta == 0) {
                x=-b/(2*a);
                System.out.println("Phuong trinh co nghiem kep !");
            }
            if (Delta > 0) {
                double cangDelta=0;
                cangDelta=Math.sqrt(Delta);
                x1=(-b+cangDelta)/(2*a);
                x2=(-b-cangDelta)/(b*a);
                System.out.println("Phuong trinh co hai nghiem phan biet la :");
                System.out.println("x1 = "+x1);
                System.out.println("x2 = "+x2);
}
        }
      }
}
