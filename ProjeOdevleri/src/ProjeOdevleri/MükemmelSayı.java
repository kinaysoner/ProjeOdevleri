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
public class MükemmelSayı {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        System.out.println("bir tam sayı giriniz.");
        int s = input.nextInt();
        int t = 0;
        for (int i = 1; i <= s-1; i++) {
            if (s%i==0) {
                t+=i;
            }
        }
        if (s==t) {
            System.out.println("mükemmel sayıdır.");
        }else{
            System.out.println("mükemmel sayı değildir.");
        }
    }
    
}
