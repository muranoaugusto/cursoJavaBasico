package projects.e104;

import java.util.Scanner;

public class E104_2 {

    public void e104_2() {
        Scanner sc = new Scanner(System.in);

        int linha, coluna;

        System.out.print("Quantas linhas: ");
        linha = sc.nextInt();

        System.out.print("Quantas colunas: ");
        coluna = sc.nextInt();

        int[][] exec = new int[linha][coluna];
        int[][] exec1 = new int[linha][coluna];

        // Entrada da primeira matriz
        System.out.println("Digite os elementos da matriz 1:");
        for (int i = 0; i < exec.length; i++) {
            for (int j = 0; j < exec[i].length; j++) {
                System.out.print("Elemento [" + i + "][" + j + "]: ");
                exec[i][j] = sc.nextInt();
            }
        }

        // Entrada da segunda matriz
        System.out.println("Digite os elementos da matriz 2:");
        for (int i = 0; i < exec1.length; i++) {
            for (int j = 0; j < exec1[i].length; j++) {
                System.out.print("Elemento [" + i + "][" + j + "]: ");
                exec1[i][j] = sc.nextInt();
            }
        }

        // Soma das matrizes
        int[][] soma = new int[linha][coluna];
        int maxLength = 0;

        for (int i = 0; i < soma.length; i++) {
            for (int j = 0; j < soma[i].length; j++) {
                soma[i][j] = exec[i][j] + exec1[i][j];
                maxLength = Math.max(maxLength, String.valueOf(soma[i][j]).length());
            }
        }

        // Impressão das matrizes
        System.out.println("\nSoma das matrizes (formatada):");
        for (int i = 0; i < soma.length; i++) {
            for (int j = 0; j < soma[i].length; j++) {
                String formatted = formatWithDashes(soma[i][j], maxLength);
                System.out.print(formatted + " ");
            }
            System.out.println();
        }

        // Funcionalidade para buscar posição e vizinhos
        System.out.print("\nDigite o número a ser buscado na matriz soma: ");
        int x = sc.nextInt();
        findPosition(soma, x);

        sc.close();
    }

    // Método para formatar o número com traços
    private static String formatWithDashes(int number, int maxLength) {
        String numStr = String.valueOf(number);
        int extraChars = maxLength - numStr.length();
        int leftDashes = extraChars / 2;
        int rightDashes = extraChars - leftDashes;

        StringBuilder formatted = new StringBuilder();
        for (int i = 0; i < leftDashes; i++) {
            formatted.append("-");
        }
        formatted.append(numStr);
        for (int i = 0; i < rightDashes; i++) {
            formatted.append("-");
        }
        return formatted.toString();
    }

    // Método para encontrar a posição de um número e seus vizinhos
    private void findPosition(int[][] matrix, int x) {
        boolean found = false;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] == x) {
                    found = true;
                    System.out.println("\nPosição encontrada: [" + i + "][" + j + "]");
                    if (j > 0) {
                        System.out.println("Esquerda: " + matrix[i][j - 1]);
                    }
                    if (i > 0) {
                        System.out.println("Acima: " + matrix[i - 1][j]);
                    }
                    if (j < matrix[i].length - 1) {
                        System.out.println("Direita: " + matrix[i][j + 1]);
                    }
                    if (i < matrix.length - 1) {
                        System.out.println("Abaixo: " + matrix[i + 1][j]);
                    }
                }
            }
        }
        if (!found) {
            System.out.println("\nNúmero " + x + " não encontrado na matriz.");
        }
    }

    public static void main(String[] args) {
        E104_2 program = new E104_2();
        program.e104_2();
    }
}
