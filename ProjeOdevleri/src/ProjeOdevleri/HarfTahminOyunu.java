/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ProjeOdevleri;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author ugur2
 */
public class HarfTahminOyunu {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scan = new Scanner(System.in);
        Random rastgele =new Random();
        int x = rastgele.nextInt(25)+65;
        char harf = (char)x;
       
        for (int i = 1; i <= 10; i++) {
            System.out.println("tahmininiz:\t");
            char tahmin = scan.next().charAt(0);
            if (tahmin==harf) {
                System.out.println(i+"tahminde doğru harfi buldunuz...");
            }
        }
        System.out.println("10 tahmin hakkınız doldu.");
    }
    
}
