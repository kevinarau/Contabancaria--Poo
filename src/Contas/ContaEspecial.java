package Contas;

public class ContaEspecial extends  ContaBancaria {

    double limite;

    public double getLimite() {
        return limite = limite ;
    }

    public void setLimite(double limite) {
        this.limite = limite;
    }

    @Override
    public void sacar(double sacar ) {
        this.sacar(limite);
        sacar = limite;
        }



    @Override
    public String toString() {
        return "== ContaEspecial== " +
                ", nomeCliente='" +  nomeCliente + '\'' +
                ", numConta=" + numConta +
                " 'limite= " + limite +
                ", saldo=" + saldo +
                 "==";
    }
}
