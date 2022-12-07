/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ProjeOdevleri;

import java.util.Scanner;

/**
 *
 * @author ugur2
 */
public class fibonacci {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("terim sayı giriniz");
        int x =input.nextInt();
        int t1 =1,t2=1;
        System.out.print(t1+","+t2+",");
        for (int i = 1; i < x-2; i++) {
            int t3 = t1 + t2;
            System.out.print(t3+",");
            t1=t2;
            t2=t3;
        }
    }
    
}
