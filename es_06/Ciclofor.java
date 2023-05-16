
public class Ciclofor {
    public static void main(String[] args) {
        String[] word = { "ciao", "davide", "come", "stai", "oggi" };
        int dim = word.length;
        for (int i = 0; i <= dim - 1; i = i + 1) { //dim -1 altrimenti conta un numero in più
            System.out.println(word[i]); //word[1] serve a stampare l'elemento all'interno dell'array
        }
    }
}
