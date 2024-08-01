import Contas.ContaBancaria;
import Contas.ContaEspecial;
import Contas.ContaPoupanca;

public class Main {
    public static void main(String[] args) {

        ContaPoupanca cb = new ContaPoupanca();

        cb.setNomeCliente("Kevin Araujo");
        cb.setSaldo(2000);
        cb.calcularNovoSaldo(6);




       ContaEspecial esp = new ContaEspecial();
        esp.setNomeCliente("Camila");
        esp.setSaldo(2000);
        cb.tranferencia(500, esp);


        System.out.println(esp);
        System.out.println(cb);






        //  System.out.println( " Nome Cliente " + Es.getNomeCliente() + " Numero Conta  " + Es.getNumConta() + "  saldo " + Es.getSaldo() + " limite "+ Es.getLimite() + " saque " + Es.getSacar());


    }
}