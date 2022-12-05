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
public class test {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int myPoints = 0;
        while (true) {
            String input = sc.nextLine();
            if ("0".equals(input)) {
                break;
            }
            char inA = input.charAt(0);
            char inB = input.charAt(2);
            int a = 0;
            switch (inA) {
                case 'A' ->
                    a = 1;
                case 'B' ->
                    a = 2;
                case 'C' ->
                    a = 3;
            }
            int b = 0;
            switch (inB) {
                case 'X':
                    switch (inA) {
                        case 'A' ->
                            b = 3;
                        case 'B' ->
                            b = 1;
                        case 'C' ->
                            b = 2;
                    }   break;
                case 'Z':
                    switch (inA) {
                        case 'A' ->
                            b = 2;
                        case 'B' ->
                            b = 3;
                        case 'C' ->
                            b = 1;
                    }   break;
                default:
                    b = a;
                    break;
            }

            
            if (b == a) {
                myPoints += 3;
            }
            if ((b == 1 && a == 3) || (b == 2 && a == 1) || (b == 3 && a == 2)) {
                myPoints += 6;
            }
            switch (b) {
                case 1 ->
                    myPoints += 1;
                case 2 ->
                    myPoints += 2;
                case 3 ->
                    myPoints += 3;
            }
        }
        System.out.printf("%n %d %n", myPoints);
    }

}
