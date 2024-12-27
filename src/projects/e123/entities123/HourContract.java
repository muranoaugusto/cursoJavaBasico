package projects.e123.entities123;

import java.util.Date;

public class HourContract {

    private Date dataW;
    private Double valuePerHour;
    private Integer hours;


	public HourContract() {
    }

    public HourContract(Date dataW, Double valuePerHour, Integer hours) {
        this.dataW = dataW;
        this.valuePerHour = valuePerHour;
        this.hours = hours;
    }


    public Date getDataW() {
        return this.dataW;
    }

    public void setDataW(Date dataW) {
        this.dataW = dataW;
    }

    public Double getValuePerHour() {
        return this.valuePerHour;
    }

    public void setValuePerHour(Double valuePerHour) {
        this.valuePerHour = valuePerHour;
    }

    public Integer getHours() {
        return this.hours;
    }

    public void setHours(Integer hours) {
        this.hours = hours;
    }




}

 