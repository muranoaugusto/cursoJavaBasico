package projects.projetoParalelo.dataNascimento.operation;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Verificador {

    public void idade() {
        Scanner scanner = new Scanner(System.in);
        
        // Definir o formato de data esperado
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        
        // Input para a data de nascimento
        System.out.println("Digite a data de nascimento (DD-MM-YYYY):");
        String dataNascimentoStr = scanner.nextLine();
        
        // Parse da data de nascimento usando o formato definido
        LocalDate dataNascimento = LocalDate.parse(dataNascimentoStr, formatter);
        
        // Data e hora atual
        LocalDateTime agora = LocalDateTime.now();
        
        // Calcular anos
        int anos = agora.getYear() - dataNascimento.getYear();
        if (agora.getMonthValue() < dataNascimento.getMonthValue() ||  
            (agora.getMonthValue() == dataNascimento.getMonthValue() && agora.getDayOfMonth() < dataNascimento.getDayOfMonth())) {
            anos--;
        }
        
        // Calcular a data do último aniversário
        LocalDate dataUltimoAniversario = dataNascimento.plusYears(anos);
        
        // Calcular meses
        int meses = agora.getMonthValue() - dataUltimoAniversario.getMonthValue();
        if (agora.getDayOfMonth() < dataUltimoAniversario.getDayOfMonth()) {
            meses--;
        }
        meses += (agora.getMonthValue() - dataUltimoAniversario.getMonthValue() + 12) % 12;
        
        // Calcular a data do último aniversário e mês
        LocalDate dataUltimoAniversarioEMes = dataUltimoAniversario.plusMonths(meses);
        
        // Calcular dias
        int dias = agora.getDayOfMonth() - dataUltimoAniversarioEMes.getDayOfMonth();
        if (dias < 0) {
            dias += dataUltimoAniversarioEMes.minusMonths(1).lengthOfMonth();
        }
        
        // Calcular horas, minutos e segundos
        Duration duracao = Duration.between(dataUltimoAniversarioEMes.atStartOfDay(), agora);
        long horas = duracao.toHours() % 24;
        long minutos = duracao.toMinutes() % 60;
        long segundos = duracao.getSeconds() % 60;
        
        // Exibir resultados
        System.out.printf("Idade: %d anos, %d meses, %d dias, %d horas, %d minutos, %d segundos\n",
                anos, meses, dias, horas, minutos, segundos);

        scanner.close();
    }
}
