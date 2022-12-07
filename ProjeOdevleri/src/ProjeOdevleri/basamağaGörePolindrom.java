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
public class basamağaGörePolindrom {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("basamak sayısını giriniz");
        int n = input.nextInt();
        System.out.println(n+"\tbasamaklı\t"+(Math.pow(9*10, (n-1)/2))+"\ttane polindrom sayısı bulunmaktadır");
    }
    
}
