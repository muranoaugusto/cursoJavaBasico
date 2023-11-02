package projects.e29.entities29;

public class Operation29 {

    private int resultadoDaOperacao;
    
    public Operation29(){
    }
      
    public void soma (int n1, int n2){
        this.resultadoDaOperacao = n1 + n2;
    }

    public int getResultadoDaOperacao (){
        return this.resultadoDaOperacao;
    }
}
