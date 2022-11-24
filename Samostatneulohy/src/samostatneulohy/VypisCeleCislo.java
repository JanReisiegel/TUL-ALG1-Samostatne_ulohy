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
public class VypisCeleCislo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //System.out.println("Zadej cele cislo:");
        int input = sc.nextInt();
        System.out.printf("%+04d", input);
    }
}
