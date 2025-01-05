package projects.projetoParalelo.numberToList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class NumToList {

    public static void main(String[] args) {
        // Criando o scanner para ler o número do terminal
        Scanner scanner = new Scanner(System.in);

        // Solicita que o usuário insira um número
        System.out.print("Digite um número inteiro: ");
        int numero = scanner.nextInt();

        // Converte o número em uma lista ordenada de dígitos
        List<Integer> listaOrdenada = converterParaListaOrdenada(numero);

        // Exibe a lista ordenada
        System.out.println("Lista ordenada de dígitos: " + listaOrdenada);

        // Fecha o scanner
        scanner.close();
    }

    // Método que converte um número inteiro em uma lista de dígitos ordenados
    public static List<Integer> converterParaListaOrdenada(int numero) {
        List<Integer> lista = new ArrayList<>();
        String numeroStr = String.valueOf(Math.abs(numero)); // Converte o número para string (ignora negativos)

        // Adiciona cada dígito à lista
        for (char digito : numeroStr.toCharArray()) {
            lista.add(Character.getNumericValue(digito));
        }

        // Ordena a lista em ordem crescente
        Collections.sort(lista);
        return lista;
    }
}
