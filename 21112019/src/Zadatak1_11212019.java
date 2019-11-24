import java.lang.reflect.Array;
import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Scanner;

public class Zadatak1_11212019 {


    public static int[] ucitavanjeNiza(int n){
        int[] niz = new int[n];
            if(n<0){
                System.out.println("Neispravan unos, niz mora imati bar jedan element");
            }
            else{

                for(int i = 0; i<n; i++){
                    Scanner sc = new Scanner(System.in);
                    System.out.println("Unesite element niza");
                    niz[i] = sc.nextInt();
                }

            }
        return niz;
    }

    public static void deljivSa3(int[] niz){
        System.out.print("Deljivi sa 3 su: ");
        for(int i=0; i<niz.length; i++){
            if(niz[i]%3==0){
                System.out.print(niz[i]+" ");
            }
        }
        System.out.println();
    }

    public static void deljivSa5(int[] niz){
        System.out.print("Brojevi deljivi sa 5 su: ");
        for (int i=0; i<niz.length; i++){
            if(niz[i]%5==0){
                System.out.print( niz[i]+ " ");
            }

        }

    }

    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Unesite broj elemenata");
        int x = sc.nextInt();

       int[] niz = ucitavanjeNiza(x);

        deljivSa3(niz);
        deljivSa5(niz);
    }
}
