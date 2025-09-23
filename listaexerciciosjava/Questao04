//Faça um programa em Java que leia um vetor de 10 caracteres e diga quantas consoantes foram lidas Imprima as consoantes
import java.util.Scanner;
public class Questao04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] letras = new char[10];
        int contConsoantes = 0;

        System.out.println("Digite 10 caracteres:");
        for (int i = 0; i < letras.length; i++) {
            letras[i] = sc.next().toLowerCase().charAt(0);
        }

        System.out.print("Consoantes lidas: ");
        for (char c : letras) {
            if ("aeiou".indexOf(c) == -1 && Character.isLetter(c)) {
                System.out.print(c + " ");
                contConsoantes++;
            }
        }

        System.out.println("\nTotal de consoantes: " + contConsoantes);
        sc.close();
    }
}
