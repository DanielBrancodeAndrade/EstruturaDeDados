//Crie um programa em Java que copie os elementos de um array para outro Imprimaos para mostrar que estão iguais
import java.util.Scanner;
public class Questao13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[] temp = new double[12];
        String[] meses = {"Janeiro","Fevereiro","Março","Abril","Maio","Junho",
                          "Julho","Agosto","Setembro","Outubro","Novembro","Dezembro"};
        double soma = 0;

        for (int i = 0; i < 12; i++) {
            System.out.print("Temperatura média de " + meses[i] + ": ");
            temp[i] = sc.nextDouble();
            soma += temp[i];
        }

        double mediaAnual = soma / 12;

        System.out.println("Temperatura média anual: " + mediaAnual);
        System.out.println("Meses com temperatura acima da média:");

        for (int i = 0; i < 12; i++) {
            if (temp[i] > mediaAnual) {
                System.out.println(meses[i] + " -> " + temp[i]);
            }
        }

        sc.close();
    }
}
