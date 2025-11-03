package entities;

public class Conta {
    private int numeroDaConta;
    private String nomeTitular;
    private double saldo;

    public Conta(int numeroDaConta,String nomeTitular, double primeiroDeposito) {
        this.numeroDaConta = numeroDaConta;
        this.nomeTitular = nomeTitular;
        deposito(primeiroDeposito);
    }

    public Conta(int numeroDaConta, String nomeTitular ) {
        this.numeroDaConta = numeroDaConta;
        this.nomeTitular = nomeTitular;
    }

    public int getNumeroDaConta() {
        return numeroDaConta;
    }

    public String getNomeTitular() {
        return nomeTitular;
    }

    public void setNomeTitular(String nomeTitular) {
        this.nomeTitular = nomeTitular;
    }
    public double getSaldo(){
        return saldo;
    }

    public double deposito(double quantidade){
       return saldo += quantidade;
    }
    public double saque(double quantidade){
        return saldo -= quantidade + 5.00;
    }

    public String toString() {
        return "Dados da conta \n" +
                "Conta: " + numeroDaConta + ", " + "Titular: " + nomeTitular +
                ", " + "Saldo: $ " + getSaldo();
    }
}
