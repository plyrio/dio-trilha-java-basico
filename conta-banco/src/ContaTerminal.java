
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        //Declarar e instanciar a classe Scanner
        Scanner scanner = new Scanner(System.in);

        //Solicitar e inserir informações 

        System.out.println("Por favor, digite o número da Agência !");
        String agencia = scanner.next();

        System.out.println("Agora digite o número da sua Conta !");
        int numero = scanner.nextInt();
        scanner.nextLine(); // Usado para consumir a quebra de linha 

        System.out.println("Digite o seu nome: ");
        String nome = scanner.nextLine(); // Usado para ler a linha inteira 

        System.out.println("Informe o seu saldo: ");
        double saldo = scanner.nextDouble();

        //Imprimir mensagem final
        System.out.printf("Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %s e seu saldo R$ %s já está disponível para saque", nome, agencia, numero, saldo);
    }
}
