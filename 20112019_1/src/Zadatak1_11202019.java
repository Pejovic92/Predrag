import java.util.Scanner;

public class Zadatak1_11202019 {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        /*System.out.println("Unesite koliko elemenata zelite");
        int el = sc.nextInt();

        if (el<0){
            System.out.println("Neispravan unos");
        } else {
            int[] broj = new int[el];

            for (int i=0; i<el; i++){
                System.out.println("Unesite broj:");
                broj [i] = sc.nextInt();
            }
            boolean palindrom = true;
            for(int j = 0; j < el/2 ; j++) {
                if(broj[j] != broj[el-j-1]) {
                    palindrom = false;
                    break;
                }
            }
            if(palindrom){
                System.out.println("Niz je palindrom");
            } else {
                System.out.println("Niz nije palindrom");
            }
        }


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





        *////////////////////////////////////////////////////////////////////////////////////////////////


        System.out.println("Unesite koliko elemaenata zelite");
        int x = sc.nextInt();

        if (x <= 1) {
            System.out.println("Za poredjenje je neophodno bar 2 elementa");
        } else {

                int num;
            for (int i = 0; i < x; i++) {
                System.out.println("Unesite broj");
                int num = sc.nextInt();
                int min = num;
                if (num<min){
                    min=num;
                }
                System.out.println(num);
                }



                //System.out.println("Minimalna vrednost je" + num);

           // System.out.println("Minimalna vrednost je" + num);
        }
    }
}





/*
        int i = 1;

        while (i <= 5)
        {
            int smallest = Integer.MAX_VALUE;
            int largest = Integer.MIN_VALUE;

            System.out.println("Enter number: ");
            Scanner input = new Scanner(System.in);
            int number = input.nextInt();

            System.out.println("Amount of numbers entered: " + i);

            System.out.println("Number entered: " + number);

            if (number < smallest)
            {
                smallest = number;
            }
            System.out.println("Smallest # so far: " + smallest);

            //if (number > max)
           // {
             //   max = number;
          //  }
           // System.out.println("Largest # so far: " + max);


            i++;

        }






*/




