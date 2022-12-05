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
public class Vycetka {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        while (true) {
            int nPlatidel = sc.nextInt();
            if (nPlatidel <= 0) {
                break;
            }
            int[] platidla = load(nPlatidel);
            while (true) {
                long castka = sc.nextLong();
                if (castka <= 0) {
                    break;
                }
                String output = "";
                for (int i = 0; i < platidla.length; i++) {
                    output = output + castka / platidla[i] + " ";
                    castka = castka % platidla[i];
                }
                System.out.println(output);
            }
        }
    }

    public static int[] load(int n) {
        int[] a = new int[n];
        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
        }
        return a;
    }
}
