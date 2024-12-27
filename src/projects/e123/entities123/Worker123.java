package projects.e123.entities123;

import java.util.ArrayList;
import java.util.List;

import projects.e123.enum123.WorkerLevel;

public class Worker123 {

    private String name;
    private double baseSalary;
    private WorkerLevel level;

    private Departament departament;
    private List<HourContract> contracts = new ArrayList<>();

    public Worker123() {
    }
    

    public Worker123(String name, double baseSalary, WorkerLevel level, Departament departament) {
        this.name = name;
        this.baseSalary = baseSalary;
        this.level = level;
        this.departament = departament;
    }

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

    public Departament getDepartament() {
        return this.departament;
    }

    public void setDepartament(Departament departament) {
        this.departament = departament;
    }

    public List<HourContract> getContracts() {
        return this.contracts;
    }

    public void setContracts(List<HourContract> contracts) {
        this.contracts = contracts;
    }











}
