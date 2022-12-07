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
public class ChenAsalı {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Bir sayi giriniz: ");
        int sayi = input.nextInt();
        int sayac = 0;
        int sayac2  = 0;
        
        for(int i = 2; i < sayi; i++)
        {
            if(sayi % i == 0) {
                sayac++;
            }
        }
        if(sayac == 0) {
            System.out.println(sayi + " Asal bir sayidir.");
        }
        
    for(int i = 2; i < (sayi+2); i++)
        {
            if(sayi % i == 0) {
                sayac2++;
            }
        }
        if (sayac==0 && sayac2==0) {
            System.out.println("chen asalı");
        }else{
            System.out.println("değil");
        
        }
    }
    
}
