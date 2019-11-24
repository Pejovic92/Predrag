

//Napisati program koji ce ispisati n brojeva Fibonacijevog niza.

import java.util.Scanner;
public class Zadatak3_11152019 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Unesite broj:");
        int n = sc.nextInt();

        int k1 = 0;
        int k2 = 1;
        System.out.println("Prvih " + n + " elemenata");
        for (int i = 1; i <= n; i++) {

            System.out.println(k1);
            int sum = k1 + k2;
            k1 = k2;
            k2 = sum;

        }
    }
}