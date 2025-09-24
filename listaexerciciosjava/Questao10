//Faça um programa em Java que leia dois vetores com 10 elementos cada Gere um terceiro vetor de 20 elementos cujos valores deverão ser compostos pelos elementos intercalados dos dois outros vetores
import java.util.Scanner;
public class Questao10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] v1 = new int[10];
        int[] v2 = new int[10];
        int[] v3 = new int[20];

        System.out.println("Digite o vetor 1:");
        for (int i = 0; i < v1.length; i++) v1[i] = sc.nextInt();
        
        System.out.println("Digite o vetor 2:");
        for (int i = 0; i < v2.length; i++) v2[i] = sc.nextInt();

        for (int i = 0, j = 0; i < 10; i++) {
            v3[j++] = v1[i];
            v3[j++] = v2[i];
        }

        System.out.println("Vetor intercalado: " + java.util.Arrays.toString(v3));
        sc.close();
    }
}
