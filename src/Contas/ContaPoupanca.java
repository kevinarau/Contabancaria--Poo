package Contas;

public class ContaPoupanca extends ContaBancaria {

    double diaRendimento;


    public void calcularNovoSaldo(double diaRendimento) {
        this.diaRendimento = diaRendimento * saldo;


    }

    @Override
    public String toString() {
        return "== ContaPoupanca == " +
                "' Saldo= " + saldo +
                ", nomeCliente= " + nomeCliente + '\'' +
                ", numConta= " + numConta +
                ", Rendimento = " + diaRendimento +
                '}';
    }


    @Override
    public void sacar(double saldos, double limites) {

    }
}
