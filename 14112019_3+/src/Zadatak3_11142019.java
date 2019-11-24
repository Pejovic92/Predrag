
/*Napisati program koji unosi i sabira brojeve dokle god nije unesen negativan broj, i ispisuje njihov zbir
(zbir pozitivnih brojeva). primer: ako korisnik unese 1 2 5 3 -1,  program treba da ispise 11
 */
import java.util.Scanner;
public class Zadatak3_11142019 {
    public static void main(String[] args){

        Scanner scaner = new Scanner(System.in);
        System.out.println("Unesite broj 1 za pocetak");
        int broj1 = scaner.nextInt();

        int zbir =0;
        int i =1;
        while(broj1>0) {
            Scanner scn = new Scanner(System.in);
            System.out.println("Unesite  broj");
            int broj = scn.nextInt();
            if (broj > 0) {


                zbir = zbir + broj;
                System.out.println("Zbir je:");
                System.out.println(zbir);
            } else if (broj < 0) {
                System.out.println("Broj je manji od nule");
                break;
            }

        }

    }
}
