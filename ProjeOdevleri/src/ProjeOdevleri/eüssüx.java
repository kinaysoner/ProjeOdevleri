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
public class eüssüx {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("x değerini giriniz");
        int x = input.nextInt();
        System.out.println("n değerini giriniz");
        int n = input.nextInt();
        double t = 1, f = 1;
        for (int i = 1; i < n - 1; i++) {
            f *= i;
            t = (int) (t + Math.pow(x, i) / f);

        }
        System.out.println("Sonuç:\t"+t);
    }
    
}
