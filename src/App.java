import java.util.Arrays;
import java.util.Scanner;

import projects.e29.E29;
import projects.e89.E89;
import projects.projetoParalelo.operation.Verificador;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);       
       
        String[] exercicios = {"[1]-29", "[2]-36", "[3]exe-89", "[4]-Projeto_Paralelo"};
        String x = new String();
        boolean result = false;
        while (result == false) {
        switch (x) {
            
            case "1":
                System.out.println("Execucao Exercicios 29");

                String[] exercicios29 = {"[1]exe2901", "[2]exe2902","[3]Voltar"};
                String x1 = new String();
                boolean result1 = false;
                while (result1 == false) {
                switch (x1) {
                    
                    case "1":
                        System.out.println("Execucao Exercicio 29 - 01");
                        E29 NovaExecucaoE2901 = new E29();
                        System.out.println(NovaExecucaoE2901.exe1());
                        result1 = true;
                    break;
        
                    case "2":
                        System.out.println("Execucao Exercicio 29 - 02");
                        E29 NovaExecucaoE2902 = new E29();
                        System.out.printf("%.4f%n",NovaExecucaoE2902.exe2());
                        result1 = true;
                    break;

                    case "3":
                    result = false;
                    result1 = false;
                    break;
        
                    default:
                        System.out.println("Selecione uma opcao valida");
                        System.out.println(Arrays.toString(exercicios));
                        x1 = sc.nextLine();
                        result1 = false;
                    break;
                    }
                }


            case "2":
            System.out.println("Execucao Exercicios 36");

            String[] exercicios36 = {"[1]Voltar"};
                String x2 = new String();
                boolean result2 = false;
                while (result2 == false) {
                switch (x2) {
                    
                    case "1":
                    result = false;
                    result2 = false;
                    break;
        
                    default:
                        System.out.println("Selecione uma opcao valida");
                        System.out.println(Arrays.toString(exercicios));
                        x2 = sc.nextLine();
                        result2 = false;
                    break;
                    }
                }
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
                System.out.println("Execucao Exercicio 89 - 05");
                E89 NovaExecucaoE8905 = new E89();
                NovaExecucaoE8905.exe5();
                result = true;
            break;

            case "9":
                System.out.println("Verificador de Idade");
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