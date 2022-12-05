/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package samostatneulohy;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author jan
 */
public class Maxima {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int pocetPoli = sc.nextInt();
        for (int i = 0; i < pocetPoli; i++) {
            List<Integer> list = new ArrayList<Integer>();
            while (true) {
                int newInt = sc.nextInt();
                if (newInt <= 0) {
                    break;
                }
                list.add(newInt);
            }
            int max1 = list.get(0);
            int max2 = 0;
            int max3 = 0;
            int max4 = 0;
            int max1C = 1;
            int max2C = 0;
            int max3C = 0;
            int max4C = 0;
            for (int j = 1; j < list.size(); j++) {
                int cislo = list.get(j);
                if (cislo == max1) {
                    max1C++;
                } else if (cislo == max2) {
                    max2C++;
                } else if (cislo == max3) {
                    max3C++;
                } else if (cislo == max4) {
                    max4C++;
                } else if (cislo > max1) {
                    max4 = max3;
                    max3 = max2;
                    max2 = max1;
                    max1 = cislo;
                    max4C = max3C;
                    max3C = max2C;
                    max2C = max1C;
                    max1C = 1;
                } else if (cislo > max2) {
                    max4 = max3;
                    max3 = max2;
                    max2 = cislo;
                    max4C = max3C;
                    max3C = max2C;
                    max2C = 1;
                } else if (cislo > max3) {
                    max4 = max3;
                    max3 = cislo;
                    max4C = max3C;
                    max3C = 1;
                } else if (cislo > max4) {
                    max4 = cislo;
                    max4C = 1;
                }
            }
            System.out.printf("%d %d%n%d %d%n%d %d%n%d %d%n", max1, max1C, max2, max2C, max3, max3C, max4, max4C);
        }
    }

}
