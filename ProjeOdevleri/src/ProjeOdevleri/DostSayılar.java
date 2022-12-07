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
public class DostSayılar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("ilk sayıyı giriniz");
        int m = input.nextInt();
         System.out.println("ikinci sayıyı giriniz");
        int n = input.nextInt();
        int b = 0;
        int c = 0;
        for (int i = 1; i < m; i++) {
            if (m%i==0) {
                b+=i;
            }
        }
        for (int j = 1; j < n; j++) {
            if (n%j==0) {
                c+=j;
            }
        }
        if (b==n && c==m) {
            System.out.println("dost sayılar");
            
        }else{
            System.out.println("değil");
        }
    }
    
}
