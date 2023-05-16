import java.util.Scanner;

public class InputChar {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Inserisci un numero: "); //chiedo all'utente un numero 
        int num = input.nextInt();
        System.out.print("Inserisci una parola: ");//chiedo all'utente una parola
        String parola = input.next();
        System.out.println("Inserisci un carattere: ");//chiedo all'utente un carattere

        char carattere = input.next().charAt(0);
        input.close();

        //stampa tutte 3
        System.out.println("Il numero è:" + num);
        System.out.println("La tua parola è:" + parola);
        System.out.println("Il tuo carateere è: " + carattere);
    }
}
