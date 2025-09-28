public class QU21 {
    public static void main(String[] args) {
        char[] letras = {'a', 'b', 'e', 'x', 'i'};

        for (int i = 0; i < letras.length; i++) {
            if ("aeiouAEIOU".indexOf(letras[i]) != -1) {
                letras[i] = '*';
            }
        }

        System.out.println(letras);
    }
}
