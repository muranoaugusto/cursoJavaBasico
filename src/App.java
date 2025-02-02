import java.util.Arrays;
import java.util.Scanner;
import projects.curso_alternativo.CursoAlternativo;
import projects.e100.E100;
import projects.e104.E104_1;
import projects.e104.E104_2;
import projects.e123.E123;
import projects.e125.E125;
import projects.e139.E139;
import projects.e29.E29;
import projects.e36.E36;
import projects.e89.E89;
import projects.projetoParalelo.dataNascimento.operation.Verificador;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);
        System.out.println("teste");
        
        String[] exercicios = {"[1]-29", 
                               "[2]-36", 
                               "[3]exe-89", 
                               "[4]exe-100", 
                               "[5]exe-104", 
                               "[6]exe-123", 
                               "[7]exe-125", 
                               "[8]exe-139", 
                               "[P]-Projeto_Paralelo", 
                               "[C]-Curso_Alternativo"
                              };
        String x = "";
        boolean result = false;
        
        // Main menu loop
        while (!result) {
            System.out.println(Arrays.toString(exercicios));
            x = sc.nextLine();  // Get user input
            switch (x) {
                
                case "1":
                    // Exercicios 29
                    result = executeExercicio29(sc);
                    break;

                case "2":
                    // Exercicios 36
                    result = executeExercicio36(sc);
                    break;

                case "3":
                    // Exercicios 89
                    result = executeExercicio89(sc);
                    break;

                case "4":
                    // Exercicios 100
                    result = executeExercicio100(sc);
                    break;

                case "5":
                    // Exercicios 104
                    result = executeExercicio104(sc);
                    break;
                    
                case "6":
                    // Exercicios 123
                    result = executeExercicio123(sc);
                    break;

                case "7":
                    // Exercicios 125
                    result = executeExercicio125(sc);
                    break;

                case "8":
                    // Exercicios 139
                    result = executeExercicio139(sc);
                    break;

                case "P":
                    // Projeto Paralelo
                    result = executeProjetoParalelo(sc);
                    break;

                case "C":
                    // Projeto Paralelo
                    result = executeCurso_Alternativo(sc);
                break;

                default:
                    System.out.println("Selecione uma opcao valida");
                    break;
            }
        }
        sc.close();
    }

    private static boolean executeExercicio29(Scanner sc) {
        String[] exercicios29 = {"[1]exe2901", 
                                 "[2]exe2902", 
                                 "[3]Voltar"
                                };
        boolean result1 = false;
        
        while (!result1) {
            System.out.println(Arrays.toString(exercicios29));
            String x1 = sc.nextLine();
            switch (x1) {
                case "1":
                    System.out.println("Execucao Exercicio 29 - 01");
                    E29 novaExecucaoE2901 = new E29();
                    System.out.println(novaExecucaoE2901.exe1());
                    result1 = true;
                    break;
                case "2":
                    System.out.println("Execucao Exercicio 29 - 02");
                    E29 novaExecucaoE2902 = new E29();
                    System.out.printf("%.4f%n", novaExecucaoE2902.exe2());
                    result1 = true;
                    break;
                case "3":
                    return false; // Go back to the main menu
                default:
                    System.out.println("Selecione uma opcao valida");
                    break;
            }
        }
        return true;
    }

    private static boolean executeExercicio36(Scanner sc) {
        String[] exercicios36 = {"[1]exe36", 
                                 "[2]Voltar"
                                };
        boolean result2 = false;
        
        while (!result2) {
            System.out.println(Arrays.toString(exercicios36));
            String x2 = sc.nextLine();
            switch (x2) {
                case "1":
                    System.out.println("Execucao Exercicio 36");
                    E36 novaExecucaoE36 = new E36();
                    System.out.println(novaExecucaoE36.exe1());
                    result2 = true;
                    break;
                case "2":
                    return false; // Go back to the main menu
                default:
                    System.out.println("Selecione uma opcao valida");
                    break;
            }
        }
        return true;
    }

    private static boolean executeExercicio89(Scanner sc) {
        String[] exercicios89 = {"[0]exe89-Exemplo", 
                                 "[1]Exe-01", 
                                 "[2]Exe-02", 
                                 "[3]Exe-03", 
                                 "[4]Exe-04", 
                                 "[5]Exe-05", 
                                 "[6]Voltar"
                                };
        boolean result3 = false;
        
        while (!result3) {
            System.out.println(Arrays.toString(exercicios89));
            String x3 = sc.nextLine();
            switch (x3) {
                case "0":
                    System.out.println("Execucao Exercicio 89 - EXEMPLO");
                    E89 novaExecucaoE89Exe = new E89();
                    novaExecucaoE89Exe.example();
                    result3 = true;
                    break;
                case "1":
                    System.out.println("Execucao Exercicio 89 - 01");
                    E89 novaExecucaoE8901 = new E89();
                    novaExecucaoE8901.exe1();
                    result3 = true;
                    break;
                case "2":
                    System.out.println("Execucao Exercicio 89 - 02");
                    E89 novaExecucaoE8902 = new E89();
                    novaExecucaoE8902.exe2();
                    result3 = true;
                    break;
                case "3":
                    System.out.println("Execucao Exercicio 89 - 03");
                    E89 novaExecucaoE8903 = new E89();
                    novaExecucaoE8903.exe3();
                    result3 = true;
                    break;
                case "4":
                    System.out.println("Execucao Exercicio 89 - 04");
                    E89 novaExecucaoE8904 = new E89();
                    novaExecucaoE8904.exe4();
                    result3 = true;
                    break;
                case "5":
                    System.out.println("Execucao Exercicio 89 - 05");
                    E89 novaExecucaoE8905 = new E89();
                    novaExecucaoE8905.exe5();
                    result3 = true;
                    break;
                case "6":
                    return false; // Go back to the main menu
                default:
                    System.out.println("Selecione uma opcao valida");
                    break;
            }
        }
        return true;
    }

    private static boolean executeExercicio100(Scanner sc) {
        String[] exercicios100 = {"[1]exe100", 
                                  "[2]Voltar"
                                 };
        boolean result4 = false;
        
        while (!result4) {
            System.out.println(Arrays.toString(exercicios100));
            String x4 = sc.nextLine();
            switch (x4) {
                case "1":
                    System.out.println("Execucao Exercicio 100");
                    E100 novaExecucaoE100 = new E100();
                    novaExecucaoE100.exe1();
                    result4 = true;
                    break;
                case "2":
                    return false; // Go back to the main menu
                default:
                    System.out.println("Selecione uma opcao valida");
                    break;
            }
        }
        return true;
    }
    
    private static boolean executeExercicio104(Scanner sc) {
        String[] exercicios104 = {"[1]exe104", 
                                  "[2]exe104_2", 
                                  "[3]Voltar"
                                };
        boolean result5 = false;
            
        while (!result5) {
            System.out.println(Arrays.toString(exercicios104));
            String x5 = sc.nextLine();
            switch (x5) {
                case "1":
                    System.out.println("Execucao Exercicio 104");
                    E104_1 novaExecucaoE104 = new E104_1();
                    novaExecucaoE104.e104_1();
                    result5 = true;
                    break;
                case "2":
                    System.out.println("Execucao Exercicio 104_2");
                    E104_2 novaExecucaoE104_2 = new E104_2();
                    novaExecucaoE104_2.e104_2();
                    result5 = true;
                    break;
                case "3":
                    return false; // Go back to the main menu
                default:
                    System.out.println("Selecione uma opcao valida");
                    break;
            }
        }
        return true;
    }

    private static boolean executeExercicio123(Scanner sc) {
        String[] exercicios123 = {"[1]exe123", 
                                  "[2]Voltar"
                                };
        boolean result6 = false;
        
        while (!result6) {
            System.out.println(Arrays.toString(exercicios123));
            String x6 = sc.nextLine();
            switch (x6) {
                case "1":
                    System.out.println("Execucao Exercicio 123");
                    E123 novaExecucaoE123 = new E123();
                    novaExecucaoE123.exe123();
                    result6 = true;
                    break;
                case "2":
                    return false; // Go back to the main menu
                default:
                    System.out.println("Selecione uma opcao valida");
                    break;
            }
        }
        return true;
    }

    private static boolean executeExercicio125(Scanner sc) {
        String[] exercicios125 = {"[1]exe125", 
                                  "[2]Voltar"
                                 };
        boolean result7 = false;
        
        while (!result7) {
            System.out.println(Arrays.toString(exercicios125));
            String x7 = sc.nextLine();
            switch (x7) {
                case "1":
                    System.out.println("Execucao Exercicio 125");
                    E125 novaExecucaoE125 = new E125();
                    novaExecucaoE125.exe125();
                    result7 = true;
                    break;
                case "2":
                    return false; // Go back to the main menu
                default:
                    System.out.println("Selecione uma opcao valida");
                    break;
            }
        }
        return true;
    }

    private static boolean executeExercicio139(Scanner sc) {
        String[] exercicios139 = {"[1]exe125", 
                                  "[2]Voltar"
                                 };
        boolean result8 = false;
    
        while (!result8) {
            System.out.println(Arrays.toString(exercicios139));
            String x8 = sc.nextLine();
            switch (x8) {
                case "1":
                    System.out.println("Execucao Exercicio 139");
                    E139 novaExecucaoE139 = new E139();
                    novaExecucaoE139.exe139();
                    result8 = true;
                    break;
                case "2":
                    return false; // Go back to the main menu
                default:
                    System.out.println("Selecione uma opcao valida");
                    break;
            }
        }
        return true;
    }

    private static boolean executeProjetoParalelo(Scanner sc) {
        System.out.println("Verificador de Idade");
        Verificador novaVerificacao = new Verificador();
        novaVerificacao.idade();
        return true;
    }

    private static boolean executeCurso_Alternativo(Scanner sc) {
       CursoAlternativo ca = new CursoAlternativo();
        ca.testandoStream();
        return true;
    }

}