package Exercicio3;

public class ContaCorrente extends Conta{
    private String tipoConta = "Conta Corrente";
    private double manutencao = 0.75;

    @Override
    public String getTipoConta() {
        return tipoConta;
    }

    @Override
    public void setTipoConta(String tipoConta) {
        this.tipoConta = tipoConta;
    }

    public double getManutencao() {
        return manutencao;
    }

    public void setManutencao(double manutencao) {
        this.manutencao = manutencao;
    }

    public double rendimento(){
        return (this.getSaldo() * 0.05);
    }
}
