//Faça um programa em Java que leia 4 notas mostre as notas e a média na tela.
import java.util.Scanner;
public class Questao03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[] notas = new double[4];
        double soma = 0;

        for (int i = 0; i < notas.length; i++) {
            System.out.print("Digite a nota " + (i+1) + ": ");
            notas[i] = sc.nextDouble();
            soma += notas[i];
        }

        double media = soma / notas.length;

        System.out.print("Notas: ");
        for (double n : notas) {
            System.out.print(n + " ");
        }
        System.out.println("\nMédia = " + media);

        sc.close();
    }
}
