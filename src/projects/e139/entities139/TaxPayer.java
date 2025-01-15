package projects.e139.entities139;

public class TaxPayer {
   
    String TaxPayerName;
    Double TaxPayerAnualIncome;
    
    public TaxPayer(){
    }  

//##################################################

    public TaxPayer(String TaxPayerName, Double TaxPayerAnualIncome) {
        this.TaxPayerName = TaxPayerName;
        this.TaxPayerAnualIncome = TaxPayerAnualIncome;
    }

 //##################################################

    public String getTaxPayerName() {
        return this.TaxPayerName;
    }

    public void setTaxPayerName(String TaxPayerName) {
        this.TaxPayerName = TaxPayerName;
    }

    public Double getTaxPayerAnualIncome() {
        return this.TaxPayerAnualIncome;
    }

    public void setTaxPayerAnualIncome(Double TaxPayerAnualIncome) {
        this.TaxPayerAnualIncome = TaxPayerAnualIncome;
    }
    
    public double taxPayed() {
            return 0;
    }
    
}
