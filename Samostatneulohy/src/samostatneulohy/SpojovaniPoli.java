/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package samostatneulohy;

import java.util.Scanner;

public class SpojovaniPoli {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        while (true) {
            int pocetA = sc.nextInt();
            if (pocetA <= 0) {
                break;
            }
            int[] a = load(pocetA);
            int pocetB = sc.nextInt();
            int[] b = load(pocetB);
            int[] c = new int[a.length + b.length];
            int konec = 0;
            int ai = 0;
            int bi = 0;
            while (konec < c.length) {
                if (ai >= a.length && bi < b.length) {
                    c[konec] = b[bi];
                    bi++;
                    konec++;
                } else if (bi >= b.length && ai < a.length) {
                    c[konec] = a[ai];
                    ai++;
                    konec++;
                } else if (ai < a.length && bi < b.length) {
                    c[konec] = a[ai] > b[bi] ? b[bi] : a[ai];
                    c[konec + 1] = a[ai] < b[bi] ? b[bi] : a[ai];
                    ai++;
                    bi++;
                    konec += 2;
                }
            }
            int temp = 1;
            for (int j = 0; j < c.length; j++) {
                for (int i = 1; i < c.length; i++) {
                    if (c[i - 1] > c[i]) {
                        temp = c[i];
                        c[i] = c[i - 1];
                        c[i - 1] = temp;
                    }
                }
            }

            display(c);
        }
    }

    public static int[] load(int n) {
        int[] a = new int[n];
        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
        }
        return a;
    }

    public static void display(int[] a) {
        for (int i = 0; i < a.length - 1; i++) {
            System.out.print(a[i] + ", ");
        }
        System.out.print(a[a.length - 1]);
        System.out.println("");
    }
}
