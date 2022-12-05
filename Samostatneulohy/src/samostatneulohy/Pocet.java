/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package samostatneulohy;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Pocet {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int ulohy = sc.nextInt();
        for (int i = 0; i < ulohy; i++) {
            int vysledek = 0;
            List<Integer> a = new ArrayList<Integer>();
            while (true) {
                int cislo = sc.nextInt();
                if(cislo<=0){
                    break;
                }
                a.add(cislo);
            }
            int deliteleA1 = pocetDelitelu(a.get(0));
            for (int j = 1; j < a.size(); j++) {
                int helpD = pocetDelitelu(a.get(j));
                if(deliteleA1 == helpD){
                    vysledek++;
                }
            }
            System.out.println(vysledek);
        }
    }

    public static int pocetDelitelu(int input) {
        int output = 0;
        for (int i = 2; i < input; i++) {
            if(input%i==0){
                output++;
            }
        }
        return output;
    }

}
