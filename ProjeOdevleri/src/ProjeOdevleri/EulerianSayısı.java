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
public class EulerianSayısı {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("m değerini giriniz.");
        int m = input.nextInt();
         System.out.println("n değerini giriniz.");
        int n = input.nextInt();
        int a = n+1;
        int t =(int) Math.pow(a, m);
        
        for (int i = 1; i <= n; i++) {
            int f1 =1,f2=1,f3=1;
            for (int k = 1; k <= m+1; k++) {
                f1*=k;
            }
            for (int k = 1; k <= i; k++) {
                f2*=k;
            }
            for (int k = 1; k < m+1-i; k++) {
                f3*=k;
            }
            int c =f1/(f2*f3);
            t =(int) (t+Math.pow(-1, i)*c*Math.pow(n+1-i, m));
        }
   
        System.out.println("sonuç:\t"+t);
    }
    
}
