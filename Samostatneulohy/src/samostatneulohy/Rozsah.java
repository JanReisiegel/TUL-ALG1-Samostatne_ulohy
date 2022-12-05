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
public class Rozsah {

    static Scanner sc = new Scanner(System.in);

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        while (true) {
            int dp = sc.nextInt();
            if (dp <= 0) {
                break;
            }
            int[] pole = new int[dp];
            for (int i = 0; i < pole.length; i++) {
                pole[i] = sc.nextInt();
            }
            int maxValue = maxValue(pole);
            for (int i = 0; i < pole.length; i++) {
                maxValue = (maxValue > pole[i]) ? maxValue : pole[i];
            }
            int minValue = pole[0];
            for (int i = 1; i < pole.length; i++) {
                if (minValue > pole[i]) {
                    minValue = pole[i];
                }
            }
            System.out.printf("%d %d%n", minValue, maxValue);
        }
    }

    public static int maxValue(int[] arr) {
        int maximum = 0;
        for (int i = 0; i < arr.length; i++) {
            maximum = (maximum > arr[i]) ? maximum : arr[i];
        }
        return maximum;

        //Úkol úloha 4 z ulohy05 Zellerův algorytmus
    }

    public static int minValue(int[] a) {
        int minimum = a[0];
        for (int i = 1; i < a.length; i++) {
            if (minimum > a[i]) {
                minimum = a[i];
            }
        }
        return minimum;
    }

    public static int[] load(int n) {
        int[] a = new int[n];
        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
        }
        return a;
    }
}
