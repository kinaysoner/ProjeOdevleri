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
public class sinxfonksiyonu {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        System.out.println("x değerini giriniz");
        int x = input.nextInt();
        System.out.println("n değerini giriniz");
        int n = input.nextInt();
        int t = 0;
        for (int i = 0; i < n; i++) {
            int f = 1;
            for (int j = 0; j < 2 * i - 1; j++) {
                f *= j;

            }
        t=  (int) (t+(Math.pow(-1, i-1)*Math.pow(x, 2*i-1))/f);
        }
        System.out.println("sin"+x+":\t"+t);
    }
    
}
