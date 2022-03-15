package Exercicio1;

public class Colaborador {
    private String nome;
    private int idade;
    private double salario;
    private int grauInstrucao;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public int getGrauInstrucao() {
        return grauInstrucao;
    }

    public void setGrauInstrucao(int grauInstrucao) {
        this.grauInstrucao = grauInstrucao;
    }

    public double bonificacao(){
        return this.getSalario();
    }
}
