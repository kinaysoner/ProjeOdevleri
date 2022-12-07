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
public class AltınÜçgen {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("altın üçgenin kısa kenar uzunluğunu giriniz.");
        int a = input.nextInt();
        int b = (int) ((int) a*(1+Math.pow(5, 1/2))/2);
        System.out.println("altın üçgenin kenar uzunlukları:\t"+a+","+b+","+b);
    }
    
}
