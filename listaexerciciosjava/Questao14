import java.util.Scanner;
    public class Questao14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] perguntas = {
            "Telefonou para a vítima?",
            "Esteve no local do crime?",
            "Mora perto da vítima?",
            "Devia para a vítima?",
            "Já trabalhou com a vítima?"
        };

        int respostasPositivas = 0;

        System.out.println("Responda com 's' para SIM ou 'n' para NÃO:");
        for (String pergunta : perguntas) {
            System.out.print(pergunta + " ");
            char resposta = sc.next().toLowerCase().charAt(0);
            if (resposta == 's') {
                respostasPositivas++;
            }
        }

        System.out.println("\nClassificação:");
        switch (respostasPositivas) {
            case 2:
                System.out.println("Suspeita");
                break;
            case 3: case 4:
                System.out.println("Cúmplice");
                break;
            case 5:
                System.out.println("Assassino");
                break;
            default:
                System.out.println("Inocente");
        }

        sc.close();
    }
}

