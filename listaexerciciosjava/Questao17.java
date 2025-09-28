import java.util.Scanner;

    public class Questao17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.print("Nome do atleta (ENTER para encerrar): ");
            String nome = sc.nextLine();
            if (nome.isEmpty()) break;

            double[] saltos = new double[5];
            double soma = 0;

            for (int i = 0; i < 5; i++) {
                System.out.print("Digite o " + (i+1) + "º salto: ");
                saltos[i] = sc.nextDouble();
                soma += saltos[i];
            }
            sc.nextLine(); 

            double media = soma / 5;

            System.out.println("\nAtleta: " + nome);
            System.out.println("Saltos:");
            for (int i = 0; i < 5; i++) {
                System.out.println((i+1) + "º Salto: " + saltos[i] + " m");
            }

            System.out.print("\nResultado final:\nAtleta: " + nome + "\nSaltos: ");
            for (int i = 0; i < 5; i++) {
                System.out.print(saltos[i]);
                if (i < 4) System.out.print(" - ");
            }
            System.out.printf("\nMédia dos saltos: %.2f m\n\n", media);
        }

        sc.close();
    }
}

