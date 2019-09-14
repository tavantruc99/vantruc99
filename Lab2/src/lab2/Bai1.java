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
public class Bai1 {
     public static void main(String[] args) {
        double a,b,x;
        Scanner vantruc= new Scanner(System.in);
        System.out.println("Nhap gia tri a cua phuong trinh bac nhat");
        a=vantruc.nextDouble();
        System.out.println("Nhap gia tri b cua phuong trinh bac hai");
        b=vantruc.nextDouble();
        
        if (a==0) {
            if (b==0) {
                System.out.println("Phuong trinh co vo so nghiem !");
                
            }
            else {
                System.out.println("Phuong trinh vo nghiem !");
            }
        }
        else{
            x=-b/a;
            System.out.println("Nghiem cua phuong trinh la :"+x);
        }
     }
     
}
