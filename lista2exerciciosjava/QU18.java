public class QU18 {
    public static void main(String[] args) {
        int[] array1 = {2, 4, 6, 8, 10};
        int[] array2 = {1, 3, 5, 7, 9};
        int[] resultado = new int[array1.length];
       
        for (int i = 0; i < array1.length; i++) {
            resultado[i] = array1[i] * array2[i];
        }
 
        System.out.println("Array 1:");
        for (int valor : array1) {
            System.out.print(valor + " ");
        }

        System.out.println("\nArray 2:");
        for (int valor : array2) {
            System.out.print(valor + " ");
        }

        System.out.println("\nResultado da multiplicação:");
        for (int valor : resultado) {
            System.out.print(valor + " ");
        }
    }
}
