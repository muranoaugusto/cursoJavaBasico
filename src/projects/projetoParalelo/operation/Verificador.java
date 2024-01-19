package projects.projetoParalelo.operation;



import java.time.LocalDate;
import java.time.Period;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.concurrent.TimeUnit;

public class Verificador {

public void idade(){
    

 
    Cadastro novoCadastro = new Cadastro();
    
 //   LocalDate x = novoCadastro.getDataDeNascimento();
    LocalDate today = LocalDate.now();
    LocalDate y = today;
//    int z = novoCadastro.getIdade();
    


    Date now = new Date();
    Calendar cal = new GregorianCalendar(2015, Calendar.AUGUST, 1);
    Date august1st = cal.getTime();
        
    long difference = august1st.getTime() - now.getTime();
    long numberOfDays = TimeUnit.DAYS.convert(difference,
                                          TimeUnit.MILLISECONDS);
    long numberOfHours = TimeUnit.HOURS.convert(difference,
                                            TimeUnit.MILLISECONDS);
        
    System.out.println("Number of days between today and 1st August");


     //   Period diff = new Period(x, y);


 //   System.out.println("Data de Nascimento: "+x);
    System.out.println("Hoje: "+y);
 //   System.out.println("Idade Informada: "+z);
 //   System.out.println("Calculo da data: "+diff);


    }
 }

