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
public class PellSayıları {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        System.out.println("terim sayısını giriniz.");
        int n = input.nextInt();

        int a = (int) (1 + Math.pow(2, 0.5));
        int b = (int) (1 - Math.pow(2, 0.5));

        for (int i = 0; i <= n - 1; i++) {

            System.out.print(((Math.pow(a, i) - Math.pow(b, i) )/ (2 * Math.pow(2, 0.5))) + ",");
        }
    }
    
}
