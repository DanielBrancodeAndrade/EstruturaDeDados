import java.util.Arrays;

    public class QU14 {
    public static void main(String[] args) {
        int[] numeros = {50, 10, 40, 20, 30};

        Arrays.sort(numeros);

        System.out.println("Array em ordem crescente:");
        for (int n : numeros) System.out.print(n + " ");
    }
}
