package projects.e89;

import projects.e89.application89.Example89;

public class E89{

    public void example(){

    Example89 exe89 = new Example89();
    exe89.resultado();
    double result = exe89.getAvg();
    System.out.println();
    System.out.printf("%.2f%n", result);
    }

}