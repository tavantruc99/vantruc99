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
public class Bai3 {
     public static void main(String[] args) {
        double a,tienDien;
        Scanner vantruc= new Scanner(System.in);
        System.out.println("Nhap so dien su dung trong thang :");
        a=vantruc.nextDouble();
        
        if (a<50) {
            tienDien=a*1000;
            System.out.println("Tien Dien Phai Dong la :"+tienDien +"dong");
        }
        else {
            tienDien=50*1000+(a-50)*1200;
            System.out.println("Tien Dien Phai Dong la :"+tienDien +"dong");
        }
     }
     
}
