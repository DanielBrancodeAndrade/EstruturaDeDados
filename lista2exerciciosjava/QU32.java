import java.util.Arrays;

public class QU32 {
    public static void main(String[] args) {
        int[] array = {1, 3, 5, 7, 9};
        int chave = 7;

        int pos = Arrays.binarySearch(array, chave);
        System.out.println("Posição: " + pos);
    }
}

