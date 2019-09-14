/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab3;

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
        // TODO code application logic here
    
        int a;
        boolean kiemTra=true;
        Scanner vantruc= new Scanner(System.in);
        System.out.println("Nhap vao mot so nguyen :");
        a= vantruc.nextInt();
        for(int i=2; i<a-1;i++) {
            if (a % i == 0) {
                kiemTra=false; break;
            }
        }
        if (kiemTra==false) {
            System.out.println("So ban vua nhap khong la so nguyen to !");
        } else System.err.println("So ban vua nhap la so nguyen to !");
        
      }
}
