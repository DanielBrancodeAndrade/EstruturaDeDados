    public class QU7 {
    public static void main(String[] args) {
        int[] numeros = {5, 10, 15, 20, 25, 30};

        int soma = 0;
        for (int i = 0; i < numeros.length; i++) {
            if (i % 2 == 0) { 
                soma += numeros[i];
            }
        }

        System.out.println("Soma dos elementos em posições pares: " + soma);
    }
}
