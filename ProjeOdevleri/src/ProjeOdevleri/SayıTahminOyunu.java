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
public class SayıTahminOyunu {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        int bs = (int) (Math.random()*98)+1;
        int s = 0,tahmin;
        do{
            System.out.println("tahmininiz:\t");
            tahmin = input.nextInt();
            s++;
            if (tahmin>bs) {
                System.out.println("daha küçük bir sayı giriniz...");
                }
            if (tahmin<bs) {
                System.out.println("daha büyük bir sayı giriniz...");
            }
            System.out.println(" ");
        }while(tahmin!=bs);
        System.out.println(s+"\ttahminde doğru sayıyı buldunuz.");
    }
    
}
