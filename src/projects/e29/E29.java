package projects.e29;

import java.util.Scanner;
import projects.e29.application29.Execution29;
import projects.e29.entities29.Operation29;

public class E29 {

        Scanner sc = new Scanner(System.in);
        
            public String exe1(){
       
                Execution29 NovaExecucaoE2901 = new Execution29();
                Operation29 NovaOperationE2901 = new Operation29();
                NovaExecucaoE2901.setNumbersInt();
                int num1 = NovaExecucaoE2901.getNumbersIntN1();
                int num2 = NovaExecucaoE2901.getNumbersIntN1();
                NovaOperationE2901.soma(num1,num2);

            return "Resultado: " + NovaOperationE2901.getResultadoDaOperacaoInt();

            }
        
              public double exe2(){
       
                Execution29 NovaExecucaoE2902 = new Execution29();
                Operation29 NovaOperationE2902 = new Operation29();
                NovaExecucaoE2902.setNumbersDouble();
                double num1 = NovaExecucaoE2902.getNumbersDouble1();
                NovaOperationE2902.areaDoCirculo(num1);

                double resultExe2 = NovaOperationE2902.getResultadoDaOperacaoDouble();

            return resultExe2;         
        }

    }

