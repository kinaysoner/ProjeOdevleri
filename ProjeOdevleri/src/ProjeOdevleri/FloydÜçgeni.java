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
public class FloydÜçgeni {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("satır sayısını giriniz.");
        int x = input.nextInt();
        System.out.println("FLOYD ÜÇGENİ");
        int s = 1;
        for (int i = 1; i <=x ; i++) {
            for (int j = 1; j <=i; j++) {
                System.out.print(s+",");
                s++;
            }
            System.out.println(" ");
        }
    }
    
}
