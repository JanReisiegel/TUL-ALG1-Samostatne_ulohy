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
public class DelitelNasobek {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean isTrue = true;
        while (isTrue) {
            int c1 = sc.nextInt();
            if (c1 < 1) {
                break;
            }
            int c2 = sc.nextInt();

            int maxDelitel = 0;
            long minNasobek = 1;

            int minIterator = (c1 <= c2) ? c1 : c2;
            for (int i = minIterator; i > 0; i--) {
                if (c1 % i == 0 && c2 % i == 0) {
                    maxDelitel = i;
                    break;
                }
            }
            String c1r = RozkladCisla(c1);
            String c2r = RozkladCisla(c2);
            String[] c1rpole = c1r.split(" ");
            String[] c2rpole = c2r.split(" ");
            long[] pole1 = new long[c1rpole.length];
            long[] pole2 = new long[c2rpole.length];
            for (int i = 0; i < pole1.length; i++) {
                pole1[i] = Long.parseLong(c1rpole[i]);
            }
            for (int i = 0; i < pole2.length; i++) {
                pole2[i] = Long.parseLong(c2rpole[i]);
            }
            long[] b;
            long[] a;
            if (pole1.length > pole2.length) {
                b = pole1.clone();
                a = pole2.clone();
            } else {
                a = pole1.clone();
                b = pole2.clone();
            }
            String help = "";
            for (int i = 0; i < a.length; i++) {
                long p = a[i];
                int pa = 0;
                int pb = 0;
                for (int ai = 0; ai < a.length; ai++) {
                    if (a[ai] == p) {
                        pa++;
                    }
                }
                for (int bi = 0; bi < b.length; bi++) {
                    if (b[bi] == p) {
                        pb++;
                    }
                }
                if (pa > pb) {
                    if (!help.contains(Long.toString(p)+" ")) {
                        for (int j = 0; j < pa; j++) {
                            help = help + p + " ";
                        }
                    }

                } else {
                    if (!help.contains(Long.toString(p)+" ")) {
                        for (int j = 0; j < pb; j++) {
                            help = help + p + " ";
                        }
                    }
                }
            }
            for (int i = 0; i < b.length; i++) {
                long p = b[i];
                int pa = 0;
                int pb = 0;
                for (int ai = 0; ai < a.length; ai++) {
                    if (a[ai] == p) {
                        pa++;
                    }
                }
                for (int bi = 0; bi < b.length; bi++) {
                    if (b[bi] == p) {
                        pb++;
                    }
                }
                if (pa > pb) {
                    if (!help.contains(Long.toString(p)+ " ")) {
                        for (int j = 0; j < pa; j++) {
                            help = help + p + " ";
                        }
                    }

                } else {
                    if (!help.contains(Long.toString(p)+ " ")) {
                        for (int j = 0; j < pb; j++) {
                            help = help + p + " ";
                        }
                    }
                }
            }
            String[] deliteleS = help.split(" ");
            long[] delitele = new long[deliteleS.length]; 
            for (int i = 0; i < deliteleS.length; i++) {
                delitele[i] = Long.parseLong(deliteleS[i]);
            }
            for (int i = 0; i < delitele.length; i++) {
                minNasobek = minNasobek * delitele[i];                
            }
            System.out.printf("%d %d %n", maxDelitel, minNasobek);
        }
    }

    public static String RozkladCisla(int input) {
        String output = "";
        int temp = input;
        for (int i = 2; i <= input; i++) {
            while (temp % i == 0) {
                output = output + i + " ";
                temp /= i;
            }
            if (temp == 1) {
                break;
            }
        }
        System.out.println(output + "%n");
        return output;
    }

}
