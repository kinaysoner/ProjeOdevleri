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
public class İkizAsallar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        System.out.println("üst sınırı giriniz");
        int n = input.nextInt();
        int s = 0, s2 = 0;
        for (int i = 2; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                if (i % j == 0) {
                    s++;
                }
            }
            if (s == 2) {
                for (int j = 1; j <= i + 2; j++) {
                    if ((i+2)% j == 0) {
                        s2++;
                    }
                }

                s -= 2;
            }
            if (s2 == 2) {
                System.out.println(i + "," + (i + 2));
                s2 -= 0;
            }
            if (s2 >= 2) {
                s2 = 0;
            }

            if (s >= 2) {
                s = 0;

            }
        }
    }
    
}
