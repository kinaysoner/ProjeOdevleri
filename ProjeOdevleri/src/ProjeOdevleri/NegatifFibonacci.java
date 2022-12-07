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
public class NegatifFibonacci {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        System.out.println("terim sayısını giriniz.");
        int n = input.nextInt();
        int f1 = 1, f2 = -1;

        System.out.print(f1 + "," + f2+",");
        for (int i = 1; i <= n - 2; i++) {
            int f3 = f1 - f2;
            System.out.print(f3 + ",");
            f1 = f2;
            f2 = f3;
        }
    }
    
}
