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
public class Tribonacci {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        System.out.println("terim sayısını giriniz.");
        int x = input.nextInt();
        int t1 = 1,t2=1,t3=2;
        System.out.print(t1+","+t2+","+t3+",");
        for (int i = 1; i <= x-3; i++) {
            int t4=t1+t2+t3;
            System.out.print(t4+",");
            t1=t2;
            t2=t3;
            t3=t4;
        }
    }
    
}
