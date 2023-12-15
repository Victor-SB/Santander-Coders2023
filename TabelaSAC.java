public class TabelaSAC {

    public static void main(String[] args) {
        double valorEmprestimo = 30000.00;
        double taxaJuros = 0.015; // 1.5%
        int totalMeses = 12;

        double amortizacao = valorEmprestimo / totalMeses;
        double saldoDevedor = valorEmprestimo;

        System.out.println("Valor fixo da amortização: R$ " + amortizacao);
        System.out.println("Saldo devedor total: R$ " + saldoDevedor + " com uma taxa de juros de " + (taxaJuros * 100) + "% ao mês");

        double totalPago = 0;
        double totalAmortizado = 0;
        double totalJuros = 0;

        for (int i = 1; i <= totalMeses; i++) {
            double jurosMensal = saldoDevedor * taxaJuros;
            double prestacao = jurosMensal + amortizacao;

            totalPago += prestacao;
            totalAmortizado += amortizacao;
            totalJuros += jurosMensal;

            saldoDevedor -= amortizacao;

            System.out.println("Parcela " + i + " | Juros: R$ " + jurosMensal +
                    " | Prestação: R$ " + prestacao + " | Saldo devedor: R$ " + saldoDevedor);
        }

        System.out.println("Total: Prestação R$ " + totalPago + ", Juros R$ " + totalJuros + ", Amortização R$ " + totalAmortizado);
    }
}
