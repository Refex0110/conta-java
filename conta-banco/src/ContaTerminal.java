import java.util.Scanner;
import java.util.Locale;

public class ContaTerminal {
    public static void main(String[] args){
        //TODO: Conhecer e importar a classe Scanner
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        //Exiibr as mensagens para o nosso usuario
        //Obter pelo scanner os valores no terminal
        System.out.println("Digite o numero da agencia: ");
        int numeroAgencia = scanner.nextInt();
        
        System.out.println("Digite o nome da agencia: ");
        String nomeAgencia = scanner.next();

        System.out.println("Digite seu nome: ");
        String nomeCliente = scanner.next().concat(" ").concat(scanner.next());

        System.out.println("Digite quando deseja depositar: ");
        Double saldoCliente = scanner.nextDouble();
        //Exibir a mensagem da conta criada
        System.out.println("Olá "+ nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + nomeAgencia + " conta " + numeroAgencia + " e seu saldo "  + saldoCliente + " já está disponível para saque.");
    }
    
}
