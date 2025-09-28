//Faça um programa em Java que peça a idade e a altura de 5 pessoas armazene cada informação no seu respectivo vetor Imprima a idade e a altura na ordem inversa a ordem lida
import java.util.Scanner;
public class Questao08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] idades = new int[5];
        double[] alturas = new double[5];

        for (int i = 0; i < 5; i++) {
            System.out.print("Idade da pessoa " + (i+1) + ": ");
            idades[i] = sc.nextInt();
            System.out.print("Altura da pessoa " + (i+1) + ": ");
            alturas[i] = sc.nextDouble();
        }

        System.out.println("Idade e altura em ordem inversa:");
        for (int i = 4; i >= 0; i--) {
            System.out.println("Idade: " + idades[i] + ", Altura: " + alturas[i]);
        }

        sc.close();
    }
}
