public class QU16 {
    public static void main(String[] args) {
        int[] numeros = {3, 7, 5, 7, 9};
        int alvo = 7;
        int indice = -1;

        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] == alvo) {
                indice = i;
                break;
            }
        }

        System.out.println("Índice: " + indice);
    }
}

