//Faça um programa em Java que leia um vetor de 5 números inteiros, mostre a soma, a multiplicação e os números.
import java.util.Scanner;
public class Questao07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numeros = new int[5];
        int soma = 0;
        int mult = 1;

        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Digite o número " + (i+1) + ": ");
            numeros[i] = sc.nextInt();
            soma += numeros[i];
            mult *= numeros[i];
        }

        System.out.println("Números: " + java.util.Arrays.toString(numeros));
        System.out.println("Soma = " + soma);
        System.out.println("Multiplicação = " + mult);

        sc.close();
    }
}

