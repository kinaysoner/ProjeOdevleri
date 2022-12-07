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
public class JhonWallis {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        System.out.println("terim sayısını giriniz.");
        int n = input.nextInt();
        int c = 1;
        for (int k = 1; k <= n; k++) {
            int c1 = 4*k*k;
            c =c*c1/(c1-1);
        }
        System.out.println("sonuç:\t"+(2*c));
    }
    
}
