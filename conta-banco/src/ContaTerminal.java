//Conhecer e importar a classe Scanner do pacote java.util
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //Exibir as mensagens para o usuário
        //Obter pela classe Scanner os valores digitados pelo usuário
        System.out.println("Bem-vindo ao nosso banco!");
        System.out.println("Por favor, informe os dados da sua conta.");
        System.out.println("Digite o seu nome completo:");
        var nome = scanner.nextLine();
        System.out.println("Digite o número da agência:");
        var agencia = scanner.nextLine();
        System.out.println("Digite o número da conta:");
        var numeroConta = scanner.nextInt();
        System.out.println("Digite o saldo da conta:");
        var saldo = scanner.nextDouble();
        //Exibir a mensagem da conta criada
        System.out.printf("Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %d e seu saldo %.2f já está disponível para saque",nome,agencia,numeroConta,saldo);
        //Fechar o scanner
        scanner.close();
    }
    }
