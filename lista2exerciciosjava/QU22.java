public class QU22 {
    public static void main(String[] args) {
        char[] letras = {'a', 'b', 'e', 'x', 'i'};
        int cont = 0;

        for (char c : letras) {
            if ("aeiouAEIOU".indexOf(c) != -1) cont++;
        }

        System.out.println("Número de vogais: " + cont);
    }
}

