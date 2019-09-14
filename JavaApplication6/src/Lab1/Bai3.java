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
public class Bai3 {
    public static void main(String[] args) {
       double canh,thetichlapphuong;
        Scanner vantruc= new Scanner(System.in);
        System.out.println("Nhap canh");
        canh=vantruc.nextDouble();
        thetichlapphuong=(canh*canh*canh);
        System.out.println("The Tich Lap Phuong La : "+thetichlapphuong);
    }
}
