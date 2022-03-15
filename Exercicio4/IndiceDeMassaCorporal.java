package Exercicio4;

import java.util.Scanner;

public class IndiceDeMassaCorporal {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o nome:");
        String nome = scan.next();

        System.out.println("Digite a altura em metros separada por vírgula:");
        double altura = scan.nextDouble();

        System.out.println("Digite o peso corporal separado por vírgula:");
        double peso = scan.nextDouble();

        double imc = peso / (altura * altura);
        String categoria = "";

        if(imc < 18.5){
            categoria = "Abaixo do peso";
        } else if(imc >= 18.5 && imc < 24.9){
            categoria = "Peso normal";
        } else if(imc >= 25 && imc <= 29.9){
            categoria = "Sobrepeso";
        } else if(imc >= 30 && imc <= 34.9){
            categoria = "Obesidade Grau I";
        } else if (imc >= 35 && imc <= 39.9){
            categoria = "Obesidade Grau II";
        } else if(imc >= 40) {
            categoria = "Obesidade Grau III";
        }

        System.out.println("Nome: " + nome);
        System.out.println("Peso: " + peso + " Kg");
        System.out.println("Altura: " + altura + " m");
        System.out.println("IMC: " + String.format("%.2f",imc));
        System.out.println("A pessoa esta: " + categoria);

    }
}
