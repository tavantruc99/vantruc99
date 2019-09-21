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
public class Bai2 {
      public static void main(String[] args) {
        double chieudai,chieurong,chuvi,dientich;
        Scanner vantruc = new Scanner (System.in);
        System.out.println("Nhap Chieu Dai");
        chieudai=vantruc.nextDouble();
        System.out.println("Nhap Chieu Rong");
        chieurong=vantruc.nextDouble();
        chuvi=(chieudai+chieurong)*2;
        dientich=(chieudai*chieurong);
        System.out.println("chu vi la :"+ chuvi);
        System.out.println("dien tich la :"+dientich);
        
}
}