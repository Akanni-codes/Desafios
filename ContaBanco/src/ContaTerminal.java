import java.util.Scanner;
// importar a classe Scanner
public class ContaTerminal {
       public static void main(String[] args) throws Exception {
        int numeroConta;
        int agencia;
        String nomeCliente;
        double saldo;
        
        System.out.print("Bem vindo ao Banco AkCode, por favor digite o seu nome !");
        // exibir mensagem para o usuário
        nomeCliente = new Scanner(System.in).nextLine();
        // obter pelo scanner os dados digitados no terminal
        System.out.println("Por favor, digite o número da Agência !");
        agencia = new Scanner(System.in).nextInt();
        System.out.println("Número da Conta (sem dígito verificador)");
        numeroConta = new Scanner(System.in).nextInt();
        System.out.println("Saldo da conta");
        saldo = new Scanner(System.in).nextDouble();
        
        
        System.out.println("Olá " + nomeCliente + " ,obrigado por criar uma conta em nosso banco, sua agência é " + agencia + " , conta " + numeroConta + " e seu saldo " + saldo +" já está disponível para saque");
        // exibir mensagem de conta criada com sucesso
    }
}
