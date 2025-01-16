package projects.e139.entities139;

public class TaxPayerPJ extends TaxPayer {

    Integer taxPayerPJNumberWorkers;

    public TaxPayerPJ(){
        super();
    }  

    public TaxPayerPJ(String TaxPayerName, Double TaxPayerAnualIncome,Integer taxPayerPJNumberWorkers){
        this.TaxPayerName = TaxPayerName;
        this.TaxPayerAnualIncome = TaxPayerAnualIncome;
        this.taxPayerPJNumberWorkers = taxPayerPJNumberWorkers;

    }


    public Integer getTaxPayerPJNumberWorkers() {
        return this.taxPayerPJNumberWorkers;
    }

    public void setTaxPayerPJNumberWorkers(Integer taxPayerPJNumberWorkers) {
        this.taxPayerPJNumberWorkers = taxPayerPJNumberWorkers;
    }


    @Override
    public double taxPayed() {

		if (taxPayerPJNumberWorkers > 10) {
			return getTaxPayerAnualIncome() * 0.14;
		}
		else {
			return getTaxPayerAnualIncome() * 0.16;
		}
    }
}


