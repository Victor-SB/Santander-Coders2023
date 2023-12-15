import java.util.Scanner;

public class ConversorTemperatura {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe a temperatura:");
        String temperaturaInput = scanner.next();
        double temperatura = Double.parseDouble(temperaturaInput.replace(',', '.'));

        System.out.println("Qual a unidade de origem dessa temperatura? [C, K, F]");
        String unidadeOrigem = scanner.next();

        System.out.println("Qual a unidade de destino dessa temperatura? [C, K, F]");
        String unidadeDestino = scanner.next();

        double temperaturaConvertida = converterTemperatura(temperatura, unidadeOrigem, unidadeDestino);

        System.out.printf("%.2f %s = %.2f %s%n", temperatura, unidadeOrigem, temperaturaConvertida, unidadeDestino);
    }

    public static double converterTemperatura(double temperatura, String unidadeOrigem, String unidadeDestino) {
        if (unidadeOrigem.equals(unidadeDestino)) {
            return temperatura;
        }

        switch (unidadeOrigem) {
            case "C":
                return converterDeCelsius(temperatura, unidadeDestino);
            case "K":
                return converterDeKelvin(temperatura, unidadeDestino);
            case "F":
                return converterDeFahrenheit(temperatura, unidadeDestino);
            default:
                System.out.println("Unidade de origem inválida.");
                return -1.0;
        }
    }

    public static double converterDeCelsius(double temperatura, String unidadeDestino) {
        switch (unidadeDestino) {
            case "K":
                return temperatura + 273.15;
            case "F":
                return (temperatura * 9 / 5) + 32;
            default:
                System.out.println("Unidade de destino inválida.");
                return -1.0;
        }
    }

    public static double converterDeKelvin(double temperatura, String unidadeDestino) {
        switch (unidadeDestino) {
            case "C":
                return temperatura - 273.15;
            case "F":
                return (temperatura - 273.15) * 9 / 5 + 32;
            default:
                System.out.println("Unidade de destino inválida.");
                return -1.0;
        }
    }

    public static double converterDeFahrenheit(double temperatura, String unidadeDestino) {
        switch (unidadeDestino) {
            case "C":
                return (temperatura - 32) * 5 / 9;
            case "K":
                return (temperatura - 32) * 5 / 9 + 273.15;
            default:
                System.out.println("Unidade de destino inválida.");
                return -1.0;
        }
        scanner.close();
    }
}