package Exercicio1;

public class Gerente extends Colaborador{

    public double bonificacao(){
        return (this.getSalario() + 1000) * (this.getGrauInstrucao() * 2);
    }
}
