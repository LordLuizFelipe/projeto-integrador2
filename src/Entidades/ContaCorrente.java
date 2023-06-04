package Entidades;

public class ContaCorrente {
    protected double saldo;

    public ContaCorrente(double saldo) {
        this.saldo = saldo;
    }

    public double getSaldo() {
        return saldo;
    }

    public void sacar(double valor) {
        if (valor > 0 && valor <= saldo) {
            saldo -= valor;
            System.out.println("Saque realizado: R$" + valor);
        } else {
            System.out.println("Saldo insuficiente para saque.");
        }
    }

    public void depositar(double valor) {
        if (valor > 0) {
            saldo += valor;
            System.out.println("Depósito realizado: R$" + valor);
        } else {
            System.out.println("Valor inválido para depósito.");
        }
    }

    public String getNumeroConta() {
        return null;
    }
}
