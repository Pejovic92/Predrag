

/*Napisati program u kom korisnik unosi n za broj clanova Fibonacijevog niza, a ispisuje sve brojeve Fibonacijevog
  niza ciji je zbir cifara deljiv sa k (broj k se takodje ucitava preko tastature).*/

import java.util.Scanner;


public class Zadatak4_11152019 {
    public static void main (String [] args){

        Scanner sc = new Scanner(System.in);
        System.out.println("Unesite broj n:");
        int broj = sc.nextInt();

        Scanner sc1 = new Scanner(System.in);
        System.out.println("Unesite broj k:");
        int k = sc1.nextInt();

        int n = broj;
        int t1=0;
        int t2=1;
        System.out.println("Prvih " + n + " elemenata");
        for (int i =1; i<=n; i ++){
            int t = 0;
            int tc = t1;
            while (tc > 0) {
                t = t + tc % 10;
                tc = tc / 10;
            }
            if(t%k == 0){
                System.out.println(t1 + "+");
            }
            int sum= t1 +t2;
            t1=t2;
            t2=sum;
        }
    }
}
