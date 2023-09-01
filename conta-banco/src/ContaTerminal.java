import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        //criando o objeto scanner
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Olá, veja bem-vindo! Vamos criar sua conta no banco.");

        System.out.println("Por favor, digite o número da Agência: ");
        int numeroAgencia = scanner.nextInt();
        
        System.out.println("Agora informe a Agência: ");
        String agencia = scanner.next();

        System.out.println("Por favor, informe seu nome: ");
        String nomeCliente = scanner.next();

        System.out.println("Por favor, informe seu sobrenome: ");
        String sobrenomeCliente = scanner.next();

        System.out.println("Agora informe o valor que deseja disponibilzar: ");
        double saldo = scanner.nextDouble();

        System.out.println("Olá " + nomeCliente + " " + sobrenomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia +" ,com a conta " + numeroAgencia + " e seu saldo de R$ " + saldo + " já está disponível para saque.");
    }
}
