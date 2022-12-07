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
public class HilbertSayısı {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        System.out.println("pozitif bir tamsayı giriniz.");
        int s = input.nextInt();
        if ((s-1)%4==0) {
            System.out.println("hilbert sayısıdır.");
        }
        else{
            System.out.println("hilbert sayısı değildir.");
        }
    }
    
}
