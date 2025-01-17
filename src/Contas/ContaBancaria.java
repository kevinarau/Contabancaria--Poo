package Contas;


public abstract class ContaBancaria implements SistemaContas {

private static int   SENQUECIA = 0;
    protected String nomeCliente;
    protected int numConta;
    protected double saldo;

    public ContaBancaria() {
        this.numConta =  SENQUECIA++;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public double getNumConta() {
        return numConta;
    }

    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }


    public void depositar(double depositar) {
        this.saldo = saldo + depositar;

    }

    @Override
    public  void sacar(double sacar) {
        this.saldo =  saldo - sacar;
    }

    @Override
    public void tranferencia(double valor, SistemaContas destino) {
        this.sacar(valor);
        destino.depositar(valor);

    }


    public abstract void sacar(double saldos, double limites);
}




