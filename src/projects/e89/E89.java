package projects.e89;

import projects.e89.application89.Example89;
import projects.e89.application89.Execution89;

public class E89{

    public void example(){

    Example89 exe89 = new Example89();
    exe89.resultado();
    double result = exe89.getAvg();
    System.out.println();
    System.out.printf("%.2f%n", result);
    }

    public void exe1(){
        Execution89 exe89 = new Execution89();
        exe89.resultadoExe1();

    }

    public void exe2(){
    Execution89 exe89 = new Execution89();
    exe89.resultadoExe2();

    }

    public void exe3(){
    Execution89 exe89 = new Execution89();
    exe89.resultadoExe3();

    }
    
    public void exe4(){
    Execution89 exe89 = new Execution89();
    exe89.resultadoExe3();

    }

}