import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Questao18 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int[] votos = new int[24]; 
        int totalVotos = 0;

        System.out.println("Enquete: Quem foi o melhor jogador?");
        while (true) {
            System.out.print("Número do jogador (0=fim): ");
            int num = sc.nextInt();

            if (num == 0) break;
            if (num < 1 || num > 23) {
                System.out.println("Informe um valor entre 1 e 23 ou 0 para sair!");
                continue;
            }

            votos[num]++;
            totalVotos++;
        }

        if (totalVotos == 0) {
            System.out.println("Nenhum voto computado.");
            return;
        }

        System.out.println("\nResultado da votação:\n");
        System.out.println("Foram computados " + totalVotos + " votos.");
        System.out.println("Jogador   Votos   %");

        int melhor = 1;
        for (int i = 1; i <= 23; i++) {
            if (votos[i] > 0) {
                double perc = percentual(votos[i], totalVotos);
                System.out.printf("%3d %10d %7.1f%%\n", i, votos[i], perc);
                if (votos[i] > votos[melhor]) melhor = i;
            }
        }

        double percMelhor = percentual(votos[melhor], totalVotos);
        System.out.printf("\nO melhor jogador foi o número %d, com %d votos, correspondendo a %.1f%% do total.\n",
                          melhor, votos[melhor], percMelhor);

        FileWriter fw = new FileWriter("resultado_enquete.txt");
        fw.write("Resultado da votação:\n\n");
        fw.write("Foram computados " + totalVotos + " votos.\n");
        fw.write("Jogador   Votos   %\n");
        for (int i = 1; i <= 23; i++) {
            if (votos[i] > 0) {
                double perc = percentual(votos[i], totalVotos);
                fw.write(String.format("%3d %10d %7.1f%%\n", i, votos[i], perc));
            }
        }
        fw.write("\nO melhor jogador foi o número " + melhor +
                 ", com " + votos[melhor] + " votos, correspondendo a " +
                 String.format("%.1f%% do total.\n", percMelhor));
        fw.close();

        sc.close();
    }

    public static double percentual(int votos, int total) {
        return (100.0 * votos) / total;
    }
}

