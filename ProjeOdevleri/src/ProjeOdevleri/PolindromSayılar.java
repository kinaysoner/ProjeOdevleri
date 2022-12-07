/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ProjeOdevleri;

/**
 *
 * @author ugur2
 */
public class PolindromSayılar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        for (int i = 1 ; i<=9 ; i++) {
            for (int j = 0; j <= 9; j++) {
                System.out.println((100*i+10*j+i));
            }
        }
        for (int i = 1; i <= 9; i++) {
            for (int j = 0; j <= 9; j++) {
                System.out.println((1000*i+100*j+10*j+i));
            }
        }
    }
    
}
