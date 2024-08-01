import Contas.ContaBancaria;
import Contas.ContaEspecial;
import Contas.ContaPoupanca;

public class Main {
    public static void main(String[] args) {

        ContaPoupanca cb = new ContaPoupanca();
        ContaBancaria esp = new ContaEspecial();
        cb.setNomeCliente("Kevin Araujo");
        cb.setSaldo(2000);
        cb.tranferencia(100, esp );
        cb.sacar(100);


        esp = new ContaEspecial();
        esp.setNomeCliente("Camila");
        esp.setSaldo(2000);
        esp.sacar(200);


        System.out.println(esp);
        System.out.println(cb);






        //  System.out.println( " Nome Cliente " + Es.getNomeCliente() + " Numero Conta  " + Es.getNumConta() + "  saldo " + Es.getSaldo() + " limite "+ Es.getLimite() + " saque " + Es.getSacar());


    }
}