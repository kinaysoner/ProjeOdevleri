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
public class gümüşoran {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("doğru parçasının uzunluğunu giriniz.");
        int u = input.nextInt();
        int b = (int) (u/(2+Math.pow(2, .5)));
        int a = u-b;
        System.out.println(a+","+b);
    }
    
}
