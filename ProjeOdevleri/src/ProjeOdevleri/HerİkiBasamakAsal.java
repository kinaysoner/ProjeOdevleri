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
public class HerİkiBasamakAsal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        for (int i = 2; i <= 7; i++) {
            for (int j = 2; j <= 7; j++) {
                if ((i==2 || i==3 || i==5 || i==7) && (j==2 || j==3 || j==5 || j==7)) {
                    System.out.print((10*i+j)+",");
                }
            }
        }
    }
    
}
