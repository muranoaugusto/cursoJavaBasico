import java.util.Arrays;
import java.util.Scanner;

import projects.e29.E29;
import projects.e89.E89;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);       
       
        String[] exercicios = {"exe2901", "exe2902", "exe89EXE"};
        
        String x = new String();

        boolean result = false;

        while (result == false) {
        
        switch (x) {
            
            case "exe2901":
                System.out.println("Execucao Exercicio 29 - 01");
                E29 NovaExecucaoE2901 = new E29();
                System.out.println(NovaExecucaoE2901.exe1());
                result = true;
            break;

            case "exe2902":
                System.out.println("Execucao Exercicio 29 - 02");
                E29 NovaExecucaoE2902 = new E29();
                System.out.printf("%.4f%n",NovaExecucaoE2902.exe2());
                result = true;
            break;

            case "exe89EXE":
                System.out.println("Execucao Exercicio 89 - EXEMPLO");
                E89 NovaExecucaoE89Exe = new E89();
                NovaExecucaoE89Exe.example();
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