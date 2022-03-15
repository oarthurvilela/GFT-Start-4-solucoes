package Exercicio1;

public class Vendedor extends Colaborador{
    public double bonificacao(){
        return (this.getSalario() + 300) * (this.getGrauInstrucao() * 4);
    }
}
