/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication6;

import java.util.Scanner;

/**
 *
 * @author E5-575G
 */
public class Bai1 {

    /**
     * @param args the command line arguments
     */
          public static void main(String[] args) {
        String hoTen;
        Scanner vantruc = new Scanner (System.in);
        System.out.println("Nhap Ho Va Ten :");
        hoTen=vantruc.nextLine();
        
        System.out.println("Nhap Diem TB :");
        double diemTB=vantruc.nextDouble();
        System.out.println("Ten Da Nhap La :"+hoTen+"Diem TB La : "+diemTB);
        
        
    }
} // TODO code application logic here
   
    

