package Entidades;

public class ContaInvestimento extends ContaCorrente {
    public ContaInvestimento(double saldo) {
        super(saldo);
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

    public void rendimentoInvestimento() {
        double rendimento = saldo * 0.1;
        saldo += rendimento;
        System.out.println("Rendimento da Conta Investimento: R$" + rendimento);
    }
}
