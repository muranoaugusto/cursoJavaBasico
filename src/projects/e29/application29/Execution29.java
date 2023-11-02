package projects.e29.application29;
import java.util.Scanner;

import projects.e29.entities29.Operation29;

import java.util.Locale;

public class Execution29 {

    public int result;

    public void calc() {

        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);

        Operation29 NovaOperation01 = new Operation29();
        
        System.out.println("Insira o primeiro valor:");
        int n1 = sc.nextInt();
        System.out.println("Insira o segundo valor:");
        int n2 = sc.nextInt();

        sc.close();
    
        NovaOperation01.soma(n1,n2);
        
        result = NovaOperation01.getResultadoDaOperacao();
    }

        public String resultCalc() {
        
        return "Resultado: " + result;
  
    }
    


    
}
