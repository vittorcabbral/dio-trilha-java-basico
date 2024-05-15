import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.println("--- Cadastro de conta ---");
        System.out.println("Por favor, insira os dados abaixo:\n");

        System.out.print("Número da conta: ");
        int numeroConta = scanner.nextInt();
        scanner.nextLine(); //para consumir a quebra de linha
        System.out.print("Número da agência: ");
        String agencia = scanner.nextLine();
        System.out.print("Nome do cliente: ");
        String nomeCliente = scanner.nextLine();
        System.out.print("Saldo do cliente: ");
        double saldo = scanner.nextDouble();

        ContaTerminal novaConta = new ContaTerminal(numeroConta, agencia, nomeCliente, saldo);
        System.out.println(novaConta.imprimirConta());

        scanner.close();
    }
}
