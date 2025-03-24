aimport java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        // Configurando o locale para usar ponto como separador decimal
        Locale.setDefault(Locale.US);
        
        // Criando o objeto Scanner para ler os dados do terminal
        Scanner scanner = new Scanner(System.in);
        
        // Solicitando e lendo os dados da conta
        System.out.println("Por favor, digite o número da Agência:");
        String agencia = scanner.nextLine();
        
        System.out.println("Por favor, digite o número da Conta:");
        int numero = scanner.nextInt();
        scanner.nextLine(); // Consumir a quebra de linha pendente
        
        System.out.println("Por favor, digite o nome do Cliente:");
        String nomeCliente = scanner.nextLine();
        
        System.out.println("Por favor, digite o saldo da Conta:");
        double saldo = scanner.nextDouble();
        
        // Fechando o scanner
        scanner.close();
        
        // Exibindo a mensagem final com os dados inseridos
        System.out.println("\nOlá " + nomeCliente + 
                         ", obrigado por criar uma conta em nosso banco, " +
                         "sua agência é " + agencia + 
                         ", conta " + numero + 
                         " e seu saldo " + String.format("%.2f", saldo) + 
                         " já está disponível para saque.");
    }
}