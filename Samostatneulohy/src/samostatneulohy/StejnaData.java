/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package samostatneulohy;

import java.util.Scanner;

public class StejnaData {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int ulohy = sc.nextInt();
        for (int i = 0; i < ulohy; i++) {
            int na = sc.nextInt();
            int[] a = load(na);
            int nb = sc.nextInt();
            int[] b = load(nb);
            if (na != nb) {
                System.out.println("0");
                break;
            }
            boolean isTrue = true;
            for (int j = 0; j < b.length; j++) {
                int ac = 0;
                int bc = 0;
                for (int k = 0; k < a.length; k++) {
                    if (a[k] == b[j]) {
                        ac++;
                    }
                }
                for (int k = 0; k < b.length; k++) {
                    if (b[k] == b[j]) {
                        bc++;
                    }
                }
                if (ac != bc) {
                    isTrue = false;
                    break;
                }
            }
            System.out.println(isTrue?"1":"0");
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
