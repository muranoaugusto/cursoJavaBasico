package projects.projetoParalelo.operation;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import projects.projetoParalelo.entities.People;

public class Cadastro {
    
    int i;
    
    People novaPessoa = new People();

    public void cadastroBasico() throws ParseException{
    
        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
    
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Informe o nome da pessoa");
        novaPessoa.setNome(sc.nextLine());
    
        System.out.println("Informe sua idade");
        novaPessoa.setIdade(sc.nextInt());

        System.out.println("informe a sua data de nascimento (dd/MM/yyyy)");
        String dNascimentoString = sc.nextLine();
  
        Date dataFormatada = formato.parse(dNascimentoString); 

        novaPessoa.setDataDeNascimento(dataFormatada);
        
        sc.close();

    }

}

