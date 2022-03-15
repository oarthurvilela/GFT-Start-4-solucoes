package Exercicio1;

public class Main {
    public static void main(String[] args) {

        Gerente gerente = new Gerente();
        gerente.setNome("Gerente");
        gerente.setIdade(30);
        gerente.setSalario(3000);
        gerente.setGrauInstrucao(3);

        System.out.println("Nome: " + gerente.getNome());
        System.out.println("Idade: " + gerente.getIdade());
        System.out.println("Salario: " + gerente.getSalario());
        System.out.println("Grau Instrução: " + gerente.getGrauInstrucao());
        System.out.println("Bonificação: " + gerente.bonificacao());

        System.out.println("============================================");

        Supervisor supervisor = new Supervisor();
        supervisor.setNome("Supervisor");
        supervisor.setIdade(25);
        supervisor.setSalario(2000);
        supervisor.setGrauInstrucao(2);

        System.out.println("Nome: " + supervisor.getNome());
        System.out.println("Idade: " + supervisor.getIdade());
        System.out.println("Salario: " + supervisor.getSalario());
        System.out.println("Grau Instrução: " + supervisor.getGrauInstrucao());
        System.out.println("Bonificação: " + supervisor.bonificacao());

        System.out.println("============================================");

        Vendedor vendedor = new Vendedor();
        vendedor.setNome("Vendedor");
        vendedor.setIdade(20);
        vendedor.setSalario(1000);
        vendedor.setGrauInstrucao(1);

        System.out.println("Nome: " + vendedor.getNome());
        System.out.println("Idade: " + vendedor.getIdade());
        System.out.println("Salario: " + vendedor.getSalario());
        System.out.println("Grau Instrução: " + vendedor.getGrauInstrucao());
        System.out.println("Bonificação: " + vendedor.bonificacao());
    }
}
