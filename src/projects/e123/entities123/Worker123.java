package projects.e123.entities123;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import projects.e123.enum123.WorkerLevel;

public class Worker123 {
//#########################Declaracao de Variaveis#########################
    private String name;
    private double baseSalary;
    private WorkerLevel level;

    private Department department;
    private List<HourContract> contracts = new ArrayList<>();

//#########################Contrutor Padrao#########################
    public Worker123() {
    }
    
//#########################Contrutor#########################
    public Worker123(String name, double baseSalary, WorkerLevel level, Department departament) {
        this.name = name;
        this.baseSalary = baseSalary;
        this.level = level;
        this.department = departament;
    }
//#########################Gets&Sets#########################
    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getBaseSalary() {
        return this.baseSalary;
    }

    public void setBaseSalary(double baseSalary) {
        this.baseSalary = baseSalary;
    }

    public WorkerLevel getLevel() {
        return this.level;
    }

    public void setLevel(WorkerLevel level) {
        this.level = level;
    }

    public Department getDepartment() {
        return this.department;
    }

    public void setDepartment(Department departament) {
        this.department = departament;
    }

    public List<HourContract> getContracts() {
        return this.contracts;
    }

//#########################Metodos Da Classe#########################
//#addContract(contract:HourContract):void
//#removeContract(contract:HourContract):void
//#income(year:Interger,month:Interger):Double

    public void addContract(HourContract contract) {
    contracts.add(contract);
    }

    public void rmvContract(HourContract contract) {
        contracts.remove(contract);
        }

    public Double income(Integer year, Integer month){
        Double sum = baseSalary;
        Calendar cal = Calendar.getInstance();
        for (HourContract cont : contracts) {
           cal.setTime(cont.getDataW());
            int c_year = cal.get(Calendar.YEAR);
            int c_month = 1 + cal.get(Calendar.MONTH);
            if (year == c_year && month == c_month) {
                sum += cont.totalValue();
            }

        }
    return sum;
    }

}
