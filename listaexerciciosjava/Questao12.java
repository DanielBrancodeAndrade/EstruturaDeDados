//Foram anotadas as idades e alturas de 30 alunos Faça um programa em Java que determine quantos alunos com mais de 13 anos possuem altura inferior à média de altura desses alunos
import java.util.Scanner;
public class Questao12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] idades = new int[30];
        double[] alturas = new double[30];
        double somaAltura = 0;
        int contador = 0;

        for (int i = 0; i < 30; i++) {
            System.out.print("Idade do aluno " + (i+1) + ": ");
            idades[i] = sc.nextInt();
            System.out.print("Altura do aluno " + (i+1) + ": ");
            alturas[i] = sc.nextDouble();
            somaAltura += alturas[i];
        }

        double mediaAltura = somaAltura / 30;

        for (int i = 0; i < 30; i++) {
            if (idades[i] > 13 && alturas[i] < mediaAltura) {
                contador++;
            }
        }

        System.out.println("Alunos com mais de 13 anos e altura abaixo da média: " + contador);
        sc.close();
    }
}

