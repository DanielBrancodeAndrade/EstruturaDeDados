import java.util.Arrays;

public class QU35 {
    public static void main(String[] args) {
        int[] array = {10, 20, 30, 40, 50};
        int pos = 2; 

        int[] novoArray = new int[array.length - 1];
        for (int i = 0, j = 0; i < array.length; i++) {
            if (i != pos) {
                novoArray[j++] = array[i];
            }
        }
        System.out.println(Arrays.toString(novoArray));
    }
}

