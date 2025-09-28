    public class QU10 {
    public static void main(String[] args) {
        int[] numeros = {5, -3, 7, -1, 9, -6};

        System.out.println("Antes:");
        for (int num : numeros) {
            System.out.print(num + " ");
        }

        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] < 0) {
                numeros[i] = 0;
            }
        }

        System.out.println("\nDepois (negativos substituídos por 0):");
        for (int num : numeros) {
            System.out.print(num + " ");
        }
    }
}

