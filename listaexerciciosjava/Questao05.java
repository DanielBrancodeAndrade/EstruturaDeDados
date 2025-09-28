//Faça um programa em Java que leia 20 números inteiros e armazene-os num vetor Armazene os números pares no vetor PAR e os números IMPARES no vetor impar Imprima os três vetores
import java.util.Scanner;
import java.util.ArrayList;

public class Questao05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numeros = new int[20];
        ArrayList<Integer> pares = new ArrayList<>();
        ArrayList<Integer> impares = new ArrayList<>();

        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Digite o número " + (i+1) + ": ");
            numeros[i] = sc.nextInt();
            if (numeros[i] % 2 == 0) pares.add(numeros[i]);
            else impares.add(numeros[i]);
        }

        System.out.println("Vetor original: " + java.util.Arrays.toString(numeros));
        System.out.println("Pares: " + pares);
        System.out.println("Ímpares: " + impares);

        sc.close();
    }
}

