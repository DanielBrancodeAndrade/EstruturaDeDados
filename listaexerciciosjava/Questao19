import java.util.Scanner;

public class Questao19 {
public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] sistemas = {
            "Windows Server",
            "Unix",
            "Linux",
            "Netware",
            "Mac OS",
            "Outro"
        };

        int[] votos = new int[sistemas.length];
        int voto;
        
        System.out.println("Enquete: Qual o melhor Sistema Operacional para uso em servidores?");
        System.out.println("As opções são:");
        System.out.println("1- Windows Server");
        System.out.println("2- Unix");
        System.out.println("3- Linux");
        System.out.println("4- Netware");
        System.out.println("5- Mac OS");
        System.out.println("6- Outro");
        System.out.println("Digite 0 para encerrar.");

        while (true) {
            System.out.print("Voto: ");
            voto = sc.nextInt();

            if (voto == 0) {
                break; 
            } else if (voto >= 1 && voto <= 6) {
                votos[voto - 1]++;
            } else {
                System.out.println("Opção inválida! Digite um número entre 0 e 6.");
            }
        }
        
        int totalVotos = 0;
        for (int v : votos) {
            totalVotos += v;
        }

        System.out.println("\nResultado da enquete:\n");
        System.out.println("Sistema Operacional     Votos   %");
        System.out.println("-------------------     -----   ---");

        int maior = votos[0];
        int indiceMaior = 0;

        for (int i = 0; i < votos.length; i++) {
            double percentual = totalVotos == 0 ? 0 : (votos[i] * 100.0 / totalVotos);

            System.out.printf("%-20s %5d   %3.0f%%\n", sistemas[i], votos[i], percentual);

            if (votos[i] > maior) {
                maior = votos[i];
                indiceMaior = i;
            }
        }

        System.out.println("-------------------     -----");
        System.out.printf("Total                   %5d\n\n", totalVotos);

        if (totalVotos > 0) {
            double percentualVencedor = (votos[indiceMaior] * 100.0 / totalVotos);
            System.out.printf("O Sistema Operacional mais votado foi o %s, com %d votos, correspondendo a %.0f%%.\n",
                    sistemas[indiceMaior], votos[indiceMaior], percentualVencedor);
        } else {
            System.out.println("Nenhum voto foi registrado.");
        }

        sc.close();
    }
}

