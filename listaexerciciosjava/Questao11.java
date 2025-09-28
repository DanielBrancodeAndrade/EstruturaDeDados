//Altere o programa anterior intercalando 3 vetores de 10 elementos cada
import java.util.Scanner;
public class Questao11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] v1 = new int[10];
        int[] v2 = new int[10];
        int[] v3 = new int[10];
        int[] v4 = new int[30];

        System.out.println("Digite o vetor 1:");
        for (int i = 0; i < v1.length; i++) v1[i] = sc.nextInt();

        System.out.println("Digite o vetor 2:");
        for (int i = 0; i < v2.length; i++) v2[i] = sc.nextInt();

        System.out.println("Digite o vetor 3:");
        for (int i = 0; i < v3.length; i++) v3[i] = sc.nextInt();

        for (int i = 0, j = 0; i < 10; i++) {
            v4[j++] = v1[i];
            v4[j++] = v2[i];
            v4[j++] = v3[i];
        }

        System.out.println("Vetor intercalado: " + java.util.Arrays.toString(v4));
        sc.close();
    }
}


