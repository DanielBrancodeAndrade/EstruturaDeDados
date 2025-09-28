import java.util.ArrayList;
import java.util.Arrays;

public class QU20 {
    public static void main(String[] args) {
        String[] palavras = {"java", "python", "java", "c++"};
        String remover = "java";

        ArrayList<String> lista = new ArrayList<>(Arrays.asList(palavras));
        lista.removeIf(p -> p.equals(remover));

        System.out.println(lista);
    }
}

