import java.util.Locale;
import java.util.Scanner;
import entities.Conta;
public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner ler = new Scanner(System.in);
        Conta cliente1;
        System.out.print("insira o número da conta: ");
        int numeroConta = ler.nextInt();
        System.out.print("insira o titular da conta: ");
        ler.nextLine();
        String nomeConta = ler.nextLine();

        System.out.print("existe um deposito inicial(y/n)? ");
        char respostaDepositoInicial = ler.next().charAt(0);
        if (respostaDepositoInicial == 'y'){
            System.out.print("Insira o valor do depósito inicial: ");
            double depositoInicial = ler.nextDouble();
            cliente1 = new Conta(numeroConta, nomeConta, depositoInicial);
        }
        else {
            cliente1 = new Conta(numeroConta,nomeConta);
        }

        System.out.println(cliente1);
        System.out.print("Insira o valor do depósito: ");
        double deposito = ler.nextDouble();
        cliente1.deposito(deposito);
        System.out.println("Dados atualizados! \n" + cliente1);
        System.out.println("Insira o valor do saque");
        double saque = ler.nextDouble();
        cliente1.saque(saque);
        System.out.println("Dados atualizados! \n" + cliente1);

        ler.close();
    }

}
