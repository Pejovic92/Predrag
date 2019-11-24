
// Napisati program koji ce prebrojati koliko je brojeva od 9 do 250 (ukljucujuci i njih) deljivih brojem 3.

public class Zadatak1_11152019 {
    public static void main (String [] args){

        int zbir=0;
        for (int i=9; i>=9 && i<=250; i++){
            if (i%3==0){
                zbir=zbir+1;
            }
        }
        System.out.println("Ukupno brojeva deljivo sa 3 iznosi:"+ zbir);
    }
}
