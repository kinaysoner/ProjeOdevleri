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
public class HeterometrikSayı {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        System.out.println("adet sayısını giriniz.");
        int n = input.nextInt();
        for (int i = 1; i <=n; i++) {
            System.out.println((double) (i+i/10)+(1+(i*(i+1))/10));
        }
    }
    
}
