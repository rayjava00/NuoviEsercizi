import java.util.Scanner;

public class InputString {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Inserisci il tuo nome: "); //chiedere il nome all'utente

        String nome = input.next();
        System.out.print("Inserisci la tua età: "); //chiedere la sua età
        //stampare
        int eta = input.nextInt();
        if (eta < 18) {
            System.out.println("Non hai 18 anni");

        } else

        {
            System.out.println("il tuo nome è: " + nome);
            System.out.println("la tua eta è: " + eta);
            input.close();
        }
    }

}
