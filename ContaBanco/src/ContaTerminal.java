import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {

        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        int numero;
        String agencia;
        String nomeCliente;
        double saldo;

        System.out.println("Por favor digite o número da agencia");
        agencia = scanner.nextLine();
        System.out.println("Por favor digite o número da conta");
        numero = scanner.nextInt();
        System.out.println("Por favor digite o nome do titular");
        scanner.nextLine();
        nomeCliente = scanner.nextLine();
        System.out.println("qual o saldo disponível?");
        saldo = scanner.nextDouble();

        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agencia é "
                + agencia + ", conta " + numero + " e seu saldo de " + saldo + " já esta disponível para saque.");

        scanner.close();

    }
}
