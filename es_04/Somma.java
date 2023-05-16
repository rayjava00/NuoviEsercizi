import java.util.Scanner;

public class Somma {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Inserisci primo numero: ");
        int num1 = input.nextInt();
        System.out.println("Inserire secondo numero: ");
        int num2 = input.nextInt();
        input.close();
        int somma = (num1 + num2);
        System.out.println("la somma dei due numeri è: " + somma);

    }
}
