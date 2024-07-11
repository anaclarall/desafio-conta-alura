import java.util.Scanner;

public class desafio {
    public static void main(String[] args) {

        Scanner desafio = new Scanner(System.in);
        System.out.println("******************************");
        System.out.println("Dados iniciais do cliente:");
        String nome = "Ana Clara";
        String tipoDeConta = "Corrente";
        double saldoDaConta = 800;

        System.out.println("nome:" + nome);
        System.out.println("tipo de conta:" + tipoDeConta);
        System.out.println("saldo" + saldoDaConta);

        System.out.println("******************************");

        int opcao = 0;
        double valor = 0;

        String menu = """
                Operações
                1. ver o saldo
                2. realizar transfeencia
                3. receber valor
                4. sair
                """;

        System.out.println("Digite a opção dsejada");
        while (opcao != 4) {
            System.out.println(menu);
            opcao = desafio.nextInt();

            if (opcao == 1) {
                System.out.println("o saldo do momento é " + saldoDaConta);
            } else if (opcao == 2) {
                System.out.println("Qual o valor que deseja transferir?");
                valor = desafio.nextDouble();
                if (valor > saldoDaConta) {
                    System.out.println("Não é possivel transferir esse valor");
                } else {
                    saldoDaConta  -= valor;
                    System.out.println("O novo saldo é " + saldoDaConta);
                }
            } if (opcao == 3) {
                System.out.println("Quanto deseja receber ?");
                valor= desafio.nextDouble();
                saldoDaConta += valor;
                System.out.println("O novo saldo é " + saldoDaConta);
            }

        }
    }
}









