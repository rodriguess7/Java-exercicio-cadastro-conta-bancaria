import java.util.Locale;
import java.util.Scanner;
import entities.Conta;
public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        var ler = new Scanner(System.in);
        System.out.println("insira o número da conta: ");
        int numeroConta = ler.nextInt();
        ler.nextLine();
        System.out.println("insira o titular da conta: ");
        String nomeConta = ler.nextLine();

        Conta cliente1 = new Conta(numeroConta,nomeConta);
        System.out.println(cliente1);
        System.out.println("Insira o valor do depósito");
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
