package Exercicio2;

import java.util.Scanner;

public class ImparesNumeroDigitado {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        while (true){
            System.out.println("Digite um número:");
            int num = scanner.nextInt();

            String tamanhoNum = Integer.toString(num);

            if (tamanhoNum.length() >= 3 && num >= 350 && num <= 8750) {

                int numPares = 0;
                int numImpares = 0;

                for (int i = 0; i <= (tamanhoNum.length() - 1); i++){
                    String indexString = String.valueOf(tamanhoNum.charAt(i));
                    int transformaInteiro = Integer.parseInt(indexString);

                    if (transformaInteiro % 2 == 0){
                        numPares += 1;
                    } else {
                        numImpares += 1;
                    }
                }

                System.out.println("O número " + num + " possui:");
                System.out.println("Números ímpares: " + numImpares);
                System.out.println("Números pares: " + numPares);

            } else if (tamanhoNum.length() <= 2){
                System.out.println("A entrada deve possuir ao menos 3 dígitos");
            } else {
                System.out.println("A entrada digitada esta fora do range 350 - 8750");
            }
        }
    }
}
