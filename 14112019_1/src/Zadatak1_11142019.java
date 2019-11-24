


/*Napisati program koji na osnovu unete godine i meseca ispisuje koliko taj mesec ima dana.
 (Vodite racuna o prestupnoj godini!) - za resavanje ovog zadatka koristiti switch*/


import java.util.Scanner;
public class Zadatak1_11142019 {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.println("Unesite godinu" );
        int godina = sc.nextInt();
        System.out.println("Unesite mesec (Broj od 1 do 12)");
        int mesec = sc.nextInt();

        switch (mesec) {

            case 1:
                System.out.println("Mesec januar ima 31 dan");
                break;
            case 2:

                if(godina%400 == 0) {
                    System.out.println("Mesec februar ima 29 dana");
                }
                else if ((godina%100 !=0) &&(godina%4 == 0)) {
                    System.out.println("Mesec februar ima 29 dana");
                }
                else {
                    System.out.println("Mesec februar ima 28 dana");
                }
                break;
            case 3:
                System.out.println("Mesec mart ima 31 dan");
                break;
            case 4:
                System.out.println("Mesec april ima 30 dana");
                break;
            case 5:
                System.out.println("Mesec maj ima 31 dan");
                break;
            case 6:
                System.out.println("Mesec jun ima 30 dana");
                break;
            case 7:
                System.out.println("Mesec jul ima 31 dan");
                break;
            case 8:
                System.out.println("Mesec avgust ima 31 dan");
                break;
            case 9:
                System.out.println("Mesec septembar ima 30 dana");
                break;
            case 10:
                System.out.println("Mesec oktobar ima 31 dan");
                break;
            case 11:
                System.out.println("Mesec novembar ima 30 dana");
                break;
            case 12:
                System.out.println("Mesec decembar ima 31 dan");
                break;
        }
    }
}
