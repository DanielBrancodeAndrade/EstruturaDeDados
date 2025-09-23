//Faça um programa em Java que peça as quatro notas de 10 alunos calcule e armazene num vetor a média de cada aluno imprima o número de alunos com média maior ou igual a 7.0
import java.util.Scanner;
public class Questao06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[] medias = new double[10];
        int aprovados = 0;

        for (int i = 0; i < 10; i++) {
            double soma = 0;
            System.out.println("Aluno " + (i+1) + ":");
            for (int j = 0; j < 4; j++) {
                System.out.print(" Nota " + (j+1) + ": ");
                soma += sc.nextDouble();
            }
            medias[i] = soma / 4;
            if (medias[i] >= 7.0) aprovados++;
        }

        System.out.println("Médias: " + java.util.Arrays.toString(medias));
        System.out.println("Alunos com média >= 7.0: " + aprovados);

        sc.close();
    }
}
