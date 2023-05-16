public class For {
    public static void main(String[] args) {
        /*
        String[] word = { "ciao", "davide", "come", "stai", "oggi" };
        int dim = word.length;
        for (int i = 0; i <= dim; i = i + 2) {
            System.out.println(word[i]);
               }
        */

        String[] amici = { "davide", "ema", "cris", "ale" };
        for (String amico : amici) {
            System.out.println(amico);

        }
    }
}