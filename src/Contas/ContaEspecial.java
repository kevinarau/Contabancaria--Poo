package Contas;

public class ContaEspecial extends ContaBancaria {
    private double limite = 1000;


    public double getLimite() {
        return limite;
    }

    public void setLimite(double limites) {
        this.limite = limites;
    }

    @Override
    public void sacar(  double saldos, double limites) {
        this.saldo = saldo - saldos;
        this.limite = limite - limites;

    }

    @Override
    public String toString() {
        return " === ContaEspecial === " +
                "limite= " + limite +
                ", nomeCliente= " + nomeCliente + '\'' +
                ", numConta= " + numConta +
                ", saldo= " + saldo +
                '}';
    }
}
