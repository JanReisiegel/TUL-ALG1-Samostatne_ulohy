/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package samostatneulohy;

import java.util.Scanner;

/**
 *
 * @author jan
 */
public class Time {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sekundy = sc.nextInt();
        int h, m, s;
        


        h = sekundy / 3600;
        sekundy %= 3600;
        m = sekundy / 60;
        s = sekundy % 60;
        
        System.out.printf("%02d:%02d:%02d", h, m, s);
        
       
    }
}
