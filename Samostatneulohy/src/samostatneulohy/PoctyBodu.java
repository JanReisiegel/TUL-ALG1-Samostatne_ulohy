/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package samostatneulohy;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author jan
 */
public class PoctyBodu {
    public static Scanner sc = new Scanner(System.in);
    
    public static void main(String[] args) {
        sc.useLocale(Locale.US);
        int pocetBodu = sc.nextInt();
        int kvadrant1 = 0;
        int kvadrant2 = 0;
        int kvadrant3 = 0;
        int kvadrant4 = 0;
        for (int i = 0; i<pocetBodu;i++){
            double x = sc.nextDouble();
            double y = sc.nextDouble();
            if(x>=0 && y>=0){
                kvadrant1++;
            }
            else if(x<0 && y>=0){
                kvadrant2++;
            }
            else if(y<=0 && x<=0){
                kvadrant3++;
            }
            else {
                kvadrant4++;
            }
        }
        System.out.printf("%d %d %d %d%n", kvadrant1, kvadrant2, kvadrant3, kvadrant4);
    }
    
}
