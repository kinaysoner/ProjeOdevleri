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
public class AltınOran {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("doğrunun uzunluığunu giriniz.");
        int ab = input.nextInt();
        int cb = (int) (2*ab/(1+Math.pow(5, 0.5)));
        int ac = ab-cb;
        System.out.println(ac+","+cb);
    }
    
}
