import java.util.Scanner;

public class Zadatak2_11202019 {
    public static void main (String [] args){

        Scanner sc = new Scanner(System.in);
        System.out.println("Unesite koliko elemenata zelite");
        int el = sc.nextInt();

        if (el<0){
            System.out.println("Neispravan unos");
        } else {
            int[] broj = new int[el];

            for (int i=0; i<el; i++){
                System.out.println("Unesite broj:");
                broj [i] = sc.nextInt();
            }
            int proizvod = 1;
            for(int j = 0; j < el ; j++) {
                if(broj[j] > j+1) {
                    proizvod = proizvod * broj[j];
                }
            }
            System.out.println("Proizvod je: "+proizvod);
        }
    }
}
