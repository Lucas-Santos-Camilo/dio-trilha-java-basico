import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args){

        // Criando o objeto Scanner
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Por favor, digite o número da Conta!");
        int numeroConta = scanner.nextInt();
        
        scanner.nextLine();

        System.out.println("Por favor, digite o número da Agência!");
        String numeroAgencia = scanner.nextLine();

        System.out.println("Por favor, digite o nome do Cliente da Conta!");
        String nomeCliente = scanner.nextLine();

        System.out.println("Por favor, digite o seu Saldo da Conta!");
        double saldoCliente = scanner.nextDouble();
        
        // Imprime os dados inseridos pelo usuário
        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + numeroAgencia + ", conta " + numeroConta + " e seu saldo " + saldoCliente + " já está disponível para saque.");

        // Fecha o Scanner
        scanner.close();
    }
}
