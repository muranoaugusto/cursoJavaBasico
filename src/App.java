import java.util.Arrays;
import java.util.Scanner;

import projects.e29.E29;
import projects.e89.E89;
import projects.projetoParalelo.operation.Verificador;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);       
       
        String[] exercicios = {"[1]exe2901", "[2]exe2902", "[3]exe89EXE", "[4]exe8901", "[5]exe8902", "[6]exe8903", "[7]exe8904", "[8]VerificadorDeIdade"};
        
        String x = new String();

        boolean result = false;

        while (result == false) {
        
        switch (x) {
            
            case "1":
                System.out.println("Execucao Exercicio 29 - 01");
                E29 NovaExecucaoE2901 = new E29();
                System.out.println(NovaExecucaoE2901.exe1());
                result = true;
            break;

            case "2":
                System.out.println("Execucao Exercicio 29 - 02");
                E29 NovaExecucaoE2902 = new E29();
                System.out.printf("%.4f%n",NovaExecucaoE2902.exe2());
                result = true;
            break;

            case "3":
                System.out.println("Execucao Exercicio 89 - EXEMPLO");
                E89 NovaExecucaoE89Exe = new E89();
                NovaExecucaoE89Exe.example();
                result = true;
            break;

            case "4":
                System.out.println("Execucao Exercicio 89 - 01");
                E89 NovaExecucaoE8901 = new E89();
                NovaExecucaoE8901.exe1();
                result = true;
            break;

            case "5":
                System.out.println("Execucao Exercicio 89 - 02");
                E89 NovaExecucaoE8902 = new E89();
                NovaExecucaoE8902.exe2();
                result = true;
            break;

            case "6":
                System.out.println("Execucao Exercicio 89 - 03");
                E89 NovaExecucaoE8903 = new E89();
                NovaExecucaoE8903.exe3();
                result = true;
            break;

            case "7":
                System.out.println("Execucao Exercicio 89 - 04");
                E89 NovaExecucaoE8904 = new E89();
                NovaExecucaoE8904.exe4();
                result = true;
            break;

            case "8":
                System.out.println("Verificado de Idade");
                Verificador NovaVerificacao = new Verificador();
                NovaVerificacao.idade();
                result = true;
            break;

            default:
                System.out.println("Selecione uma opcao valida");
                System.out.println(Arrays.toString(exercicios));
                x = sc.nextLine();
                result = false;
            break;
            }
        }
        sc.close();
    }
}