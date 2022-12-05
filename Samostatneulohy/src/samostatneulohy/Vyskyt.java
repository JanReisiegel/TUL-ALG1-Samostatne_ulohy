/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package samostatneulohy;

import java.util.Scanner;

/**
 *
 * @author jan
 */
public class Vyskyt {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int pocet = sc.nextInt();
        for (int i = 0; i < pocet; i++) {
            int sec1 = sc.nextInt();
            int sec2 = sc.nextInt();
            int n = sc.nextInt();
            int[] a = new int[n];
            boolean vyskyt = false;
            for (int j = 0; j < a.length; j++) {
                a[j] = sc.nextInt();
            }
            for (int j = 0; j < a.length-1; j++) {
                if(a[j] == sec1 && a[j+1] == sec2){
                    
                    vyskyt = true;
                    break;
                }
            }
            System.out.println(vyskyt);
        }
    }

}
