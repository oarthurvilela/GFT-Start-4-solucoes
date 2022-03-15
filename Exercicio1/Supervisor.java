package Exercicio1;

public class Supervisor extends Colaborador{

    public double bonificacao(){
        return (this.getSalario() + 500) * (this.getGrauInstrucao() * 3);
    }
}
