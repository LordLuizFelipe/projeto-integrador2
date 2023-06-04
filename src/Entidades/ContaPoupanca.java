package Entidades;

public class ContaPoupanca extends ContaCorrente {
    public ContaPoupanca(double saldo) {
        super(saldo);
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

    public void rendimentoPoupanca() {
        double rendimento = saldo * 0.02;
        saldo += rendimento;
        System.out.println("Rendimento da Conta Poupança: R$" + rendimento);
    }
}

