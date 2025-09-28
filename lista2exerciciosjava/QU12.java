    public class QU12 {
    public static void main(String[] args) {
        int[] numeros = {3, 7, 10, 15, 20};
        int valorProcurado = 10;
        boolean encontrado = false;

        for (int num : numeros) {
            if (num == valorProcurado) {
                encontrado = true;
                break;
            }
        }

        if (encontrado)
            System.out.println("Valor " + valorProcurado + " encontrado no array.");
        else
            System.out.println("Valor " + valorProcurado + " não encontrado.");
    }
}

