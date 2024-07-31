import Contas.ContaBancaria;
import Contas.ContaEspecial;
import Contas.ContaPoupanca;

public class Main {
    public static void main(String[] args) {

        ContaPoupanca cb = new ContaPoupanca();
        cb.setNomeCliente("Kevin Araujo");
        cb.setSaldo(1000);
        cb.setNumConta(2934);
        cb.calcularNovoSaldo(10);



        ContaEspecial Es = new ContaEspecial();
        Es.setNomeCliente("Camila");
        Es.setNumConta(1928);
        Es.setSaldo(1000);




        System.out.println(Es);
        System.out.println(cb);



      //  System.out.println( " Nome Cliente " + Es.getNomeCliente() + " Numero Conta  " + Es.getNumConta() + "  saldo " + Es.getSaldo() + " limite "+ Es.getLimite() + " saque " + Es.getSacar());



    }
}