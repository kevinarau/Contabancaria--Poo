package Contas;

public class ContaEspecial extends ContaBancaria {
    int limite;



    @Override
    public String toString() {
        return "ContaEspecial{" +
                "nomeCliente='" + nomeCliente + '\'' +
                ", numConta=" + numConta +
                ", saldo=" + saldo +
                '}';
    }
}
