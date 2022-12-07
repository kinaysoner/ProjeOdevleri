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
public class UcgenselSayılar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input= new Scanner(System.in);
        System.out.println("terim sayısını giriniz.");
        int n = input.nextInt();
        for (int i = 1; i <=n; i++) {
            int u =i*(i+1)/2;
            System.out.print(u+",");
        }
    }
    
}
