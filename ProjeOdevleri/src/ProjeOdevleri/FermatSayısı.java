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
public class FermatSayısı {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("terim sayısnı giriniz.");
        int n = input.nextInt();
        for (int i = 1; i <= n; i++) {
            System.out.print((int)(Math.pow(2,Math.pow(2, i))+1)+",");  
        }
    }
    
}
