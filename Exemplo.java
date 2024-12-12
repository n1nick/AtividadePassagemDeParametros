public class ExemploVarargs {
    public static void imprimirNumeros(int... numeros) {
        for (int numero : numeros) {
            System.out.println(numero);
        }
    }

    public static void main(String[] args) {
        imprimirNumeros(1, 2, 3);
        imprimirNumeros(4, 5);
        imprimirNumeros(); 
    }
}
