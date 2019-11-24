import java.util.Arrays;
import java.util.Scanner;

public class Zadatk2_11222019 {

    public static void proizvod (int[] niz){
        int proizvod=1;
        for(int i=0; i<niz.length;i++){
            if(i%2!=0){
                proizvod = proizvod * niz[i];
            }
        }
        System.out.println("Proizvod neparnih elemenata iznosi:"+ proizvod);
    }


    public static void zbir (int[] niz){

        int zbir=0;
        for (int i=0;i<niz.length; i++){
            if(i%2==0){
                zbir = zbir+niz[i];
            }

        }
        System.out.println("Zbir parnih elemenata niza je: "+ zbir);
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Unesiti koliko zelite elemenata u nizu");
        int x = sc.nextInt();

        int praviNiz[]=new int[x];
        for (int i=0; i<x; i++){
            System.out.println("Unesite broj");
            praviNiz[i] = sc.nextInt();
        }
        System.out.println(Arrays.toString(praviNiz));
        proizvod(praviNiz);
        zbir(praviNiz);
    }
}
