package Contas;

public class ContaEspecial extends ContaBancaria {
    double limite = 1000;


    public double getLimite() {
        return limite;
    }

    public void setLimite(double limite) {
        this.limite = limite;
    }

    @Override
    public void sacar(double sacar, double saldo ) {
        this. limite = limite - sacar;

    }

    @Override
    public String toString() {
        return "ContaEspecial{" +
                "limite=" + limite +
                ", nomeCliente='" + nomeCliente + '\'' +
                ", numConta=" + numConta +
                ", saldo=" + saldo +
                '}';
    }
}
