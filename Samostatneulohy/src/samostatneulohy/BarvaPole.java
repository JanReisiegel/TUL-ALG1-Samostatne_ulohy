/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package samostatneulohy;

import java.util.Scanner;

/**
 *
 * @author jan
 */
public class BarvaPole {
    public static void main(String[] args) {
        final String BLACK = "CERNA";
        final String WHITE = "BILA";
        Scanner sc = new Scanner(System.in);
        boolean dalsiSouradnice = true;
        String output = "";
        while (dalsiSouradnice){
            int prvni = sc.nextInt();
            if(prvni < 0) {
                break;
            }
            int druha = sc.nextInt();
            prvni=prvni-(druha%2);
            output =output + (prvni%2==0?WHITE:BLACK)+" ";
        }
        System.out.println(output);
    }
}
