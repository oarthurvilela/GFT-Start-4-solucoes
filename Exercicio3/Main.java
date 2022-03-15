package Exercicio3;

public class Main {
    public static void main(String[] args) {

        ContaCorrente contaCorrente = new ContaCorrente();
        contaCorrente.setNumero(1505);
        contaCorrente.setTitular("Fulano");
        contaCorrente.setSaldo(15000);

        System.out.println("Número da conta: " + contaCorrente.getNumero());
        System.out.println("Titular da conta: " + contaCorrente.getTitular());
        System.out.println("Tipo da conta: " + contaCorrente.getTipoConta());
        System.out.println("Saldo da conta: " + contaCorrente.getSaldo());
        System.out.println("Rendimento da conta: " + contaCorrente.rendimento());
        System.out.println("Saldo + Rendimento da conta: " + (contaCorrente.getSaldo() + contaCorrente.rendimento()));
        System.out.println("Saldo + Rendimento - manutenção: " + ( contaCorrente.getSaldo() + contaCorrente.rendimento() - contaCorrente.getManutencao()));

        System.out.println("===============================================================");

        ContaPoupanca contaPoupanca = new ContaPoupanca();
        contaPoupanca.setNumero(1675);
        contaPoupanca.setTitular("Ciclano");
        contaPoupanca.setSaldo(10000);

        System.out.println("Número da conta: " + contaPoupanca.getNumero());
        System.out.println("Titular da conta: " + contaPoupanca.getTitular());
        System.out.println("Tipo da conta: " + contaPoupanca.getTipoConta());
        System.out.println("Saldo da conta: " + contaPoupanca.getSaldo());
        System.out.println("Rendimento da conta: " + String.format("%.2f",contaPoupanca.rendimento()));
        System.out.println("Rendimento + saldo: " + (contaPoupanca.rendimento() + contaPoupanca.getSaldo()));


    }
}
