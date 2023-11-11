package projects.e29.entities29;

public class Operation29 {

    private int resultadoDaOperacaoInt;
    private double resultadoDaOperacaoDouble;
    double pi = 3.14159;
    
    public Operation29(){
    }
      
    public void soma (int n1, int n2){
        resultadoDaOperacaoInt = n1 + n2;
    }

    public void areaDoCirculo (double n1){
        resultadoDaOperacaoDouble = pi * (n1 * n1);

    }

    public int getResultadoDaOperacaoInt (){
        return resultadoDaOperacaoInt;
    }
    
    public double getResultadoDaOperacaoDouble (){
        return resultadoDaOperacaoDouble;
    }
}