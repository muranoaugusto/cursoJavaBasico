package projects.e104;

import java.util.Scanner;

public class E104 {

    public static void main(String[] args){

    //public  void employeeRegister() {

    Scanner sc = new Scanner(System.in);
    
    int linha, coluna;
    
    System.out.print("Quantas linhas ");

    linha = sc.nextInt();

    System.out.print("Quantas colunas ");

    coluna = sc.nextInt();

    int [][] exec = new int[linha][coluna];

    System.out.println("Digite os elementos da matriz 1:");
    for (int cordenadaLinha=0; cordenadaLinha<exec.length; cordenadaLinha++){
        for (int cordenadaColuna=0; cordenadaColuna<exec[cordenadaLinha].length; cordenadaColuna++){ 
            System.out.print("Elemento [" + cordenadaLinha + "][" + cordenadaColuna + "]: ");
            exec[cordenadaLinha][cordenadaColuna] = sc.nextInt();

        }

    }

    System.out.println("\nMatriz inserida:");
    for (int cordenadaLinha=0; cordenadaLinha<exec.length; cordenadaLinha++){
        for (int cordenadaColuna=0; cordenadaColuna<exec[cordenadaLinha].length; cordenadaColuna++){ 
            System.out.print("-" + exec[cordenadaLinha][cordenadaColuna]+ "-");
        }
        System.out.println();
    }


    int [][] exec1 = new int[linha][coluna];

    System.out.println("Digite os elementos da matriz 2:");
    for (int cordenadaLinha=0; cordenadaLinha<exec1.length; cordenadaLinha++){
        for (int cordenadaColuna=0; cordenadaColuna<exec1[cordenadaLinha].length; cordenadaColuna++){ 
            System.out.print("Elemento [" + cordenadaLinha + "][" + cordenadaColuna + "]: ");
            exec1[cordenadaLinha][cordenadaColuna] = sc.nextInt();

        }

    }

    System.out.println("\nMatriz inserida:");
    for (int cordenadaLinha=0; cordenadaLinha<exec.length; cordenadaLinha++){
        for (int cordenadaColuna=0; cordenadaColuna<exec1[cordenadaLinha].length; cordenadaColuna++){ 
            System.out.print("-" + exec1[cordenadaLinha][cordenadaColuna]+ "-");
        }
        System.out.println();
    }


    
        // Somar as matrizes
        int[][] soma = new int[linha][coluna];
    
        for (int cordenadaLinha = 0; cordenadaLinha < soma.length; cordenadaLinha++) {
            for (int cordenadaColuna = 0; cordenadaColuna < soma[cordenadaLinha].length; cordenadaColuna++) { 
                soma[cordenadaLinha][cordenadaColuna] = exec[cordenadaLinha][cordenadaColuna] + exec1[cordenadaLinha][cordenadaColuna];
            }
        }
    
        System.out.println("\nSoma das matrizes:");
        for (int cordenadaLinha = 0; cordenadaLinha < soma.length; cordenadaLinha++) {
            for (int cordenadaColuna = 0; cordenadaColuna < soma[cordenadaLinha].length; cordenadaColuna++) { 
                System.out.print("-" + soma[cordenadaLinha][cordenadaColuna] + "-");
            }
            System.out.println();




}

    sc.close();

    }

}
