import java.util.ArrayList;
import java.util.Scanner;

    public class Questao15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Double> notas = new ArrayList<>();
        double soma = 0;

        System.out.println("Digite as notas (-1 para encerrar):");
        while (true) {
            double valor = sc.nextDouble();
            if (valor == -1) break;
            notas.add(valor);
            soma += valor;
        }

        int qtd = notas.size();
        System.out.println("\nQuantidade de valores lidos: " + qtd);

        System.out.println("Valores na ordem informada:");
        for (double n : notas) {
            System.out.print(n + " ");
        }

        System.out.println("\n\nValores em ordem inversa:");
        for (int i = qtd - 1; i >= 0; i--) {
            System.out.println(notas.get(i));
        }

        System.out.println("\nSoma = " + soma);
        double media = (qtd > 0) ? soma / qtd : 0;
        System.out.println("Média = " + media);

        int acimaMedia = 0, abaixoSete = 0;
        for (double n : notas) {
            if (n > media) acimaMedia++;
            if (n < 7) abaixoSete++;
        }

        System.out.println("Qtd de valores acima da média: " + acimaMedia);
        System.out.println("Qtd de valores abaixo de 7: " + abaixoSete);

        System.out.println("\nPrograma encerrado.");
        sc.close();
    }
}

