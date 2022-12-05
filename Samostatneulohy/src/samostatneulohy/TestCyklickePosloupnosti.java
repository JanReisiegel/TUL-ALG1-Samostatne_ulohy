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
public class TestCyklickePosloupnosti {

    static Scanner sc = new Scanner(System.in);

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int ulohy = sc.nextInt();
        for (int i = 0; i < ulohy; i++) {
            int n = sc.nextInt();
            int[] a = load(n);
            int k = 0;

            for (int j = 1; j < a.length; j++) {
                if ((a[j] == 0 && j != 0) && k == 0) {
                    k = a[j - 1] + 1;
                    
                } else if ((j == a.length - 1 && ((a[j] - 1) == a[j - 1])) && k == 0) {
                    k = a[j] + 1;
                    
                } else if (j != a.length - 1) {
                    if ( (a[j] - 1) != a[j - 1] && a[j] != 0) {
                        k = -1;
                        break;
                    }
                }
            }            
            if(k==0){
                k=-1;
            }
            if(a.length ==1){
                k = a[0+1];
            }
            System.out.println(k);
        }
    }

    public static int[] load(int n) {
        int[] a = new int[n];
        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
        }
        return a;
    }
}
