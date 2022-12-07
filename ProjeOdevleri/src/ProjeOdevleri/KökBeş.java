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
public class KökBeş {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        System.out.println("bölüm sayısını giriniz.");
        int n = input.nextInt();
        int t = 1;
        for (int i = 1; i <= n; i++) {
            t = 4+1/t;
        }
        System.out.println("sonuç:\t"+(2+1/t));
    }
    
}
