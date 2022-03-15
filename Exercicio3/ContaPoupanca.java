package Exercicio3;

public class ContaPoupanca extends Conta{
    private String tipoConta = "Conta Poupança";

    @Override
    public String getTipoConta() {
        return tipoConta;
    }

    @Override
    public void setTipoConta(String tipoConta) {
        this.tipoConta = tipoConta;
    }

    public double rendimento(){
        return (this.getSaldo() * 0.07);
    }
}
