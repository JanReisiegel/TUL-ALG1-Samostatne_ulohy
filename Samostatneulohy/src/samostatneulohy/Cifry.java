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
public class Cifry {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        while(true){
            long cislo = sc.nextLong();
            if (cislo<=0){
                break;
            }
            String sCislo = Long.toString(cislo);
            char [] cifry = sCislo.toCharArray();
            int soucet = 0;
            long soucin = 1;
            for(int i =(cifry.length-1); i>=0;i--){
                soucet += Integer.parseInt(Character.toString(cifry[i]));
                soucin *= Integer.parseInt(Character.toString(cifry[i]));
            }
            System.out.printf("%d %d%n", soucet, soucin);
        }
    }
    
}
