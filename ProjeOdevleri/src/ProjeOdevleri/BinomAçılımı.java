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
public class BinomAçılımı {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("x değerini giriniz");
        int x = input.nextInt();
        System.out.println("n değerini giriniz");
        int n =  input.nextInt();
        int b, sonuc;
        b = 1+x/n;
        sonuc = (int) Math.pow(b, n);
        System.out.println("Sonuç:\t"+sonuc);
    }
    
}
