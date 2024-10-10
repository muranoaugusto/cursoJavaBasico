import java.util.Arrays;
import java.util.Scanner;
import projects.e29.E29;
import projects.e89.E89;
import projects.projetoParalelo.operation.Verificador;

public class App {
   
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);       

        String[] menu1 = {"[1]-29", "[2]-36", "[3]exe-89", "[4]-Projeto_Paralelo", "[5]Exit"};
        String[] menu2 = {	"[1]exe2901", "[2]exe2902", "[3]Voltar" };
        String[] menu3 = {	"[1]36", "[2]Voltar" };		
        String[] menu4 = {	"[1]exe89EXE", "[2]exe8901", "[3]exe8902", "[4]exe8903", "[5]exe8904", "[6]exe8905", "[7]Voltar"};
        String[] menu5 = {	"[1]VerificadorDeIdade", "[2]Voltar" };

        String m1, m2, m3, m4, m5;

        boolean exit = false;
        
        while (!exit) {
            System.out.println("Menu Principal");
            System.out.println(Arrays.toString(menu1));
            m1 = sc.nextLine();
            
            switch (m1) {
                case "1":
                    boolean backToMain1 = false;
                    while (backToMain1 == false) {
                        System.out.println("Menu 29");
                        System.out.println(Arrays.toString(menu2));
                        m2 = sc.nextLine();

                        switch (m2) {
                            case "1":
                                System.out.println("Execucao Exercicio 29 - 01");
                                E29 exec1 = new E29();
                                System.out.println(exec1.exe1());
                                break;

                            case "2":
                                System.out.println("Execucao Exercicio 29 - 02");
                                E29 exec2 = new E29();
                                System.out.printf("%.4f%n", exec2.exe2());
                                break;

                            case "3":
                                System.out.println("Voltar");
                                backToMain1 = true;
                                break;

                            default:
                                System.out.println("Selecione uma opcao valida");
                                break;
                        }
                    }
                    break;

                case "2":
                    boolean backToMain2 = false;
                    while (backToMain2 == false) {
                        System.out.println("Menu 36");
                        System.out.println(Arrays.toString(menu3));
                        m3 = sc.nextLine();

                        switch (m3) {
                            case "1":
                                // Placeholder for menu 36 logic
                                System.out.println("Execucao Exercicio 36");
                                // Your logic for Exercicio 36 goes here
                                break;

                            case "2":
                                System.out.println("Voltar");
                                backToMain2 = true;
                                break;

                            default:
                                System.out.println("Selecione uma opcao valida");
                                break;
                        }
                    }
                    break;

                case "3":
                    boolean backToMain3 = false;
                    while (backToMain3 == false) {
                        System.out.println("Menu 89");
                        System.out.println(Arrays.toString(menu4));
                        m4 = sc.nextLine();

                        switch (m4) {
                            case "1":
                                System.out.println("Execucao Exercicio 89 - EXEMPLO");
                                E89 exec89Example = new E89();
                                exec89Example.example();
                                break;

                            case "2":
                                System.out.println("Execucao Exercicio 89 - 01");
                                E89 exec8901 = new E89();
                                exec8901.exe1();
                                break;

                            case "3":
                                System.out.println("Execucao Exercicio 89 - 02");
                                E89 exec8902 = new E89();
                                exec8902.exe2();
                                break;

                            case "4":
                                System.out.println("Execucao Exercicio 89 - 03");
                                E89 exec8903 = new E89();
                                exec8903.exe3();
                                break;

                            case "5":
                                System.out.println("Execucao Exercicio 89 - 04");
                                E89 exec8904 = new E89();
                                exec8904.exe4();
                                break;

                            case "6":
                                System.out.println("Execucao Exercicio 89 - 05");
                                E89 exec8905 = new E89();
                                exec8905.exe5();
                                break;

                            case "7":
                                System.out.println("Voltar");
                                backToMain3 = true;
                                break;

                            default:
                                System.out.println("Selecione uma opcao valida");
                                break;
                        }
                    }
                    break;

                case "4":
                    boolean backToMain4 = false;
                    while (!backToMain4) {
                        System.out.println("Projeto Paralelo");
                        System.out.println(Arrays.toString(menu5));
                        m5 = sc.nextLine();

                        switch (m5) {
                            case "1":
                                System.out.println("Verificador de Idade");
                                Verificador verificador = new Verificador();
                                verificador.idade();
                                break;

                            case "2":
                                System.out.println("Voltar");
                                backToMain4 = true;
                                break;

                            default:
                                System.out.println("Selecione uma opcao valida");
                                break;
                        }
                    }
                    break;

                case "5":
                    System.out.println("Saindo...");
                    exit = true;
                    break;

                default:
                    System.out.println("Selecione uma opcao valida");
                    break;
            }
        }
        
        sc.close();
    }
}
