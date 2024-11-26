import java.util.Scanner;

public class MetodosBanco {
    int numeroConta;
    String agencia;
    String nomeDestinatario, nomeCliente;
    Double deposito;

    Scanner scanner = new Scanner(System.in);

    public void inserirDadosBancarios () {
        System.out.println("Por favor, digite o nome do proprietário da conta: ");
        nomeDestinatario = scanner.nextLine();

        System.out.println("Agora digite o número da conta: ");
        numeroConta = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Digite agora a agência: ");
        agencia = scanner.nextLine();

        System.out.println("Digite o valor do seu depósito: R$");
        deposito = scanner.nextDouble();
        scanner.nextLine();
    }

    public void mostrarDadosBancarios () {
        System.out.println("Qual é o seu nome? ");
        nomeCliente = scanner.nextLine();
        inserirDadosBancarios();

        System.out.println("Olá " + nomeCliente + ", sua transferência para o destinatário: " + nomeDestinatario
        + " foi um sucesso! A agência é " + agencia + ", a conta é: " + numeroConta + " e o valor do depósito foi de: R$" + deposito);
    }
    
}
