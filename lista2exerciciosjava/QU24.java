import java.util.Arrays;
import java.util.Scanner;

public class QU24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] array = {10, 20, 30, 40, 50};

        System.out.print("Digite a posição: ");
        int pos = sc.nextInt();
        System.out.print("Digite o novo elemento: ");
        int elem = sc.nextInt();

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

