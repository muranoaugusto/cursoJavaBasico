package projects.e170.application;

import java.time.format.DateTimeFormatter;
import java.util.Scanner;
import projects.e170.entities.Contract;

public class Execution {

    public void execution(){

        DateTimeFormatter dtfmt =  DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
        Scanner sc = new Scanner(System.in);
        
        Contract crt = new Contract();
        System.out.println("Entre os dados do contrato");
        crt.setNumero(sc.nextInt());


        




    }

}
