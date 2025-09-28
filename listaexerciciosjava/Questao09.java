//Faça um programa em Java que leia um vetor A com 10 números inteiros calcule e mostre a soma dos quadrados dos elementos do vetor
import java.util.Scanner;
public class Questao09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] A = new int[10];
        int soma = 0;

        for (int i = 0; i < A.length; i++) {
            System.out.print("Digite o número " + (i+1) + ": ");
            A[i] = sc.nextInt();
            soma += A[i] * A[i];
        }

        System.out.println("Soma dos quadrados = " + soma);
        sc.close();
    }
}
