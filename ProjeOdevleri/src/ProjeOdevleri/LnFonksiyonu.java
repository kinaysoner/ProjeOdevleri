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
public class LnFonksiyonu {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        System.out.println("bir sayı giriniz");
    int x = input.nextInt();
    int t =0;
        for (int i = 0; i < x-1; i++) {
            t = t +1/((2*i+1)*(2*i+2));
        }
        System.out.println("sonuç:\t"+t);
    }
    
}
