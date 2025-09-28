import java.util.Arrays;

public class QU34 {
    public static void main(String[] args) {
        int[] array = {10, 20, 30, 40};
        int pos = 2;
        int elem = 99;

        int[] novoArray = new int[array.length + 1];
        for (int i = 0, j = 0; i < novoArray.length; i++) {
            if (i == pos) {
                novoArray[i] = elem;
            } else {
                novoArray[i] = array[j++];
            }
        }
        System.out.println(Arrays.toString(novoArray));
    }
}

