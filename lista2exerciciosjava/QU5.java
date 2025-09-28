    public class QU5 {
    public static void main(String[] args) {
        int[] numeros = {15, 8, 22, 3, 45, 12};

        int maior = Integer.MIN_VALUE;
        int segundoMaior = Integer.MIN_VALUE;

        for (int num : numeros) {
            if (num > maior) {
                segundoMaior = maior;
                maior = num;
            } else if (num > segundoMaior && num < maior) {
                segundoMaior = num;
            }
        }

        System.out.println("Segundo maior: " + segundoMaior);
    }
}

