/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package samostatneulohy;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author jan
 */
public class PrumernaDenniTeplota {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);
        
        float dopoledne = sc.nextFloat();
        float poledne = sc.nextFloat();
        float odpoledne = sc.nextFloat();
        float prumernaTeplota; 
        // zde doplnit potrebny kod - nacteni a vypocet
        prumernaTeplota = (dopoledne + poledne + (2*odpoledne))/4;
        
        System.out.format(Locale.US, "%1.2f", prumernaTeplota);
    }
}
