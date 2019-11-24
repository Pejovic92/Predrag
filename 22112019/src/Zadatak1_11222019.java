import java.util.Scanner;

public class Zadatak1_11222019 {

    public static void proizvod (int a,int b,int c){
            int result = a*b*c;
        System.out.println(result);
    }

    public static void min (int a, int b, int c){
        int min = a;
        if (min>b){
            min = b;
        }
        if (min>c){
            min = c;
        }
        System.out.println("Najmanji broj je:"+ min);


    }

    public static void main (String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.println("Unesite prvi broj:");
        int x = sc.nextInt();
        System.out.println("Unesite drugi broj:");
        int y = sc.nextInt();
        System.out.println("Unesite treci broj:");
        int z = sc.nextInt();

        proizvod(x,y,z);
        min(x,y,z);
    }
}
