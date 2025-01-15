package projects.e139.entities139;

public class TaxPayerPF extends TaxPayer {

    Double TaxPayerPFMedicalBills;
    
    public TaxPayerPF(){
        super();
    }  

    public TaxPayerPF(String TaxPayerName, Double TaxPayerAnualIncome,Double TaxPayerPFMedicalBills){
        this.TaxPayerName = TaxPayerName;
        this.TaxPayerAnualIncome = TaxPayerAnualIncome;
        this.TaxPayerPFMedicalBills = TaxPayerPFMedicalBills;

    }
   
    public Double getTaxPayerPFMedicalBills() {
        return this.TaxPayerPFMedicalBills;
    }

    public void setTaxPayerPFMedicalBills(Double TaxPayerPFMedicalBills) {
        this.TaxPayerPFMedicalBills = TaxPayerPFMedicalBills;
    }

    @Override
    public double taxPayed() {
        
        Double TaxPayerPFMedicalBills 


        * 0.15

        * 0.15
    }
    
}
