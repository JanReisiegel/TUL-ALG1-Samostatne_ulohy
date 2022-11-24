/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package samostatneulohy;

import java.util.Scanner;
public class TabulkaPozice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        /*int sloupce, radky, poradi;
        radky = sc.nextInt();
        sloupce = sc.nextInt();
        poradi = sc.nextInt();
        int vyslednyRadek = (int)Math.ceil((double)poradi/sloupce);
        int vyslednySloupec = poradi%sloupce == 0 ? sloupce : poradi%sloupce;
        System.out.println(vyslednyRadek + " "+vyslednySloupec);*/
        
        //int radkyTabulky, sloupceTabulky, radkyPrvku, sloupcePrvku, vysledek;
        int radkyTabulky = sc.nextInt();
        int sloupceTabulky = sc.nextInt();
        int radkyPrvku = sc.nextInt();
        int sloupcePrvku = sc.nextInt();
        
        int vysledek = (radkyPrvku-1)*sloupceTabulky+sloupcePrvku; 
        
        System.out.println(vysledek);
    }
}
