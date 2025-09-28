import java.util.Arrays;

public class QU33 {
    public static void main(String[] args) {
        int[] array = {10, 20, 30};
        int novo = 40;

        int[] novoArray = Arrays.copyOf(array, array.length + 1);
        novoArray[novoArray.length - 1] = novo;

        System.out.println(Arrays.toString(novoArray));
    }
}

