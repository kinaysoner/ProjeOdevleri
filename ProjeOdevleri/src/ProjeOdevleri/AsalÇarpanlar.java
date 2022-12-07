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
public class AsalÇarpanlar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("1 den büyük bir sayı giriniz.");
        int x = input.nextInt();
        for (int i = 2; 1 < x; i++) {

            if (x % 2 == 0) {

                while (x % 2 == 0) {
                    x = x / 2;
                }
                System.out.print("2,");
            }

            if (x % i == 0 && i % 2 != 0) {
                System.out.print(i + ",");
                x /= i;
            }

        }

    }
    
}
