import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ContaTerminal conta = new ContaTerminal();

        System.out.println("Informe o nome do cliente: ");
        conta.setNome(in.nextLine());

        System.out.println("Por favor, digite o número da Agência!");
        conta.setAgencia(in.nextLine());

        System.out.println("Digite o número da Conta!");
        conta.setConta(in.nextInt());

        //Define o saldo da conta
        conta.setSaldo(gerarSaldo());

        System.out.printf("Olá %s, obrigado por criar uma conta em nosso banco, " +
                "sua agência é %s, conta %s e seu saldo %s já está disponível para saque.", conta.getNome(), conta.getAgencia(), conta.getConta(), conta.getSaldo());

    }

    private static double gerarSaldo() {
        //237 xD
        return ((237 % 2) + 237) - 1 ;
    }
}