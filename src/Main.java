import Contas.ContaBancaria;
import Contas.ContaEspecial;
import Contas.ContaPoupanca;

public class Main {
    public static void main(String[] args) {

        ContaPoupanca cb = new ContaPoupanca();
        ContaBancaria esp = new ContaEspecial();
        cb.setNomeCliente("Kevin Araujo");
        cb.depositar(100);
        cb.tranferencia(100, esp );


        System.out.println(esp);
        System.out.println(cb);






        //  System.out.println( " Nome Cliente " + Es.getNomeCliente() + " Numero Conta  " + Es.getNumConta() + "  saldo " + Es.getSaldo() + " limite "+ Es.getLimite() + " saque " + Es.getSacar());


    }
}