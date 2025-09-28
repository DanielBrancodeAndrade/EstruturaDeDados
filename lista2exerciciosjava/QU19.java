import java.util.Arrays;
import java.util.Collections;

public class QU19 {
    public static void main(String[] args) {
        String[] nomes = {"Ana", "Bruno", "Carlos"};
        System.out.println("Antes: " + Arrays.toString(nomes));

        Collections.reverse(Arrays.asList(nomes));
        System.out.println("Depois: " + Arrays.toString(nomes));
    }
}

