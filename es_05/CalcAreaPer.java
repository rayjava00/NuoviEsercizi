import java.util.Scanner;

public class CalcAreaPer {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Inserisci il lato:");
        int lato = input.nextInt();//chiediamo all'utente il lato
        input.close();
        int area = lato * lato;//calcoliamo l'area
        int per = lato * 4;//calcoliamo perimetro
        if (lato > 40) {

            System.out.println("Il numero è troppo grande");

        } else if (lato <= 1) {
            System.out.println("Il numero è troppo piccolo");
        } else {

            System.out.println("L'area è :" + area);//stampiamo il risultato
            System.out.println("Il perimetro è :" + per);
        }
    }
}
