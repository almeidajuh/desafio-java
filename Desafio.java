import java.util.Scanner;

public class Desafio {
    public static void main(String[] args) {

        String nome = "Julia Almeida";
        String tipoDeConta = "corrente";
        double saldoInicial = 2560;
        int opcao = 0;

        System.out.println(" ***********************************");
        System.out.println(" Nome: " + nome);
        System.out.println(" Tipo de Conta: " + tipoDeConta);
        System.out.printf(" Saldo inicial: %.2f\n ",  saldoInicial);
        System.out.println("***********************************");

        String menu = """
                
                Operações
                
                1 - Consultar Saldo
                2 - Transferir Valor
                3 - Receber Valor
                4 - Sair
                
                Digite a opção:
                """;

        Scanner leitura = new Scanner(System.in);

        while (opcao != 4) {
            System.out.println(menu);
            opcao = leitura.nextInt();

            if (opcao == 1) {
                System.out.printf("Seu saldo é: %.2f\n ",  saldoInicial);
            } else if (opcao == 2) {
                System.out.println("Qual valor deseja transferir: ");
                double valor = leitura.nextDouble();
                if (valor > saldoInicial) {
                    System.out.println("Saldo insuficiente!");
                } else {
                    saldoInicial -= valor;
                    System.out.printf("Novo saldo: %.2f\n", saldoInicial);
                }
            } else if (opcao == 3) {
                System.out.println("Valor recebido: ");
                double valor = leitura.nextDouble();
                saldoInicial += valor;
                System.out.printf("Novo saldo: %.2f\n", saldoInicial);
            } else if (opcao != 4) {
                System.out.println("Opção inválida! Tente novamente");
            }

        }

        System.out.println("Saindo... Até logo!");
        leitura.close();

    }

}



