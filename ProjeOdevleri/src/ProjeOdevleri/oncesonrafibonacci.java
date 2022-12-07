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
public class oncesonrafibonacci {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        System.out.println("büyük değere sahip bir fibonaççi sayısı giriniz.");
        int f2 = input.nextInt();
        double ao = (1 + Math.pow(5, .5)) / 2;
        int f1 = (int) (f2 / ao);
        int f3 = (int) (f2 * ao);
        System.out.println(f1+","+f2+","+f3);
    }
    
}
