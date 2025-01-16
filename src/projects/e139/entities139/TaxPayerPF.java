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
        
		if (getTaxPayerAnualIncome() < 20000.0) {
			return getTaxPayerAnualIncome() * 0.15 - TaxPayerPFMedicalBills * 0.5;
		}
		else {
			return getTaxPayerAnualIncome() * 0.25 - TaxPayerPFMedicalBills * 0.5;
		}
    }
    
}
