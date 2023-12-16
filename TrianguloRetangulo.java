import java.util.Scanner;

public class TrianguloRetangulo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe um número inteiro:");
        int numero = scanner.nextInt();

        desenharTriangulo(numero);

        System.out.println("Deseja desenhar uma segunda pirâmide? (Sim/Não)");
        String resposta = scanner.next();

        if (resposta.equalsIgnoreCase("Sim")) {
            desenharPiramideInvertida(numero);
        }

        scanner.close();
    }

    public static void desenharTriangulo(int numero) {
        for (int i = 1; i <= numero; i++) {
            // Espaços à esquerda
            for (int j = 0; j < numero - i; j++) {
                System.out.print(" ");
            }

            // Asteriscos
            for (int k = 0; k < 2 * i - 1; k++) {
                System.out.print("*");
            }

            System.out.println(); // Nova linha após cada linha do triângulo
        }
    }

    public static void desenharPiramideInvertida(int numero) {
        for (int i = numero - 1; i >= 1; i--) {
            // Espaços à esquerda
            for (int j = 0; j < numero - i; j++) {
                System.out.print(" ");
            }

            // Asteriscos
            for (int k = 0; k < 2 * i - 1; k++) {
                System.out.print("*");
            }

            System.out.println(); // Nova linha após cada linha da pirâmide invertida
        }
    }
}