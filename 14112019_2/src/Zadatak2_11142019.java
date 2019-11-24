
/*Napisati program koji racuna sumu parnih brojeva i proizvod neparnih brojeva od 0 do n - za resavanje ovog
  zadatka koristiti samo jednu petlju (ne jednu vrstu petlje, vec samo jednu petlju).*/

import java.util.Scanner;
public class Zadatak2_11142019 {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.println("Unesite ceo pozitivan broj");
        int broj = sc.nextInt();

        int zbir=0;
        int proizvod =1;
        int i=1;

        while (i<=broj){

            if (i%2==0){
                zbir= zbir+i;
                i++;

            }
            else if(i%2!=0){
                proizvod = proizvod*i;
                i++;
            }

        }

        System.out.println("Zbir je "+zbir);
        System.out.println("Proizvod je "+proizvod);
    }
}
