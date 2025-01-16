
package projects.e139.application139;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import projects.e139.entities139.TaxPayer;
import projects.e139.entities139.TaxPayerPF;
import projects.e139.entities139.TaxPayerPJ;

public class Execution139 {

	public void Execution139() throws ParseException {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<TaxPayer> list = new ArrayList<>();
		
		System.out.print("Enter the number of tax payers: ");
		int n = sc.nextInt();
		for (int a=1; a<=n; a++) {
            sc.nextLine();
			System.out.println("Tax payer #" + a + " data:");
			System.out.print("Tax payer type (pf/pj)? ");
			String type = sc.nextLine();
            System.out.print("Name: ");
			String setTaxPayerName = sc.nextLine();
			System.out.print("Anual income: ");
			double setTaxPayerAnualIncome = sc.nextDouble();
            if (type.equals("pf")) {
				System.out.print("Health expenditures: ");
				double setTaxPayerPFMedicalBills = sc.nextDouble();
				list.add(new TaxPayerPF(setTaxPayerName, setTaxPayerAnualIncome, setTaxPayerPFMedicalBills));
			}
			
            //else {
            else if (type.equals("pj")) {
				System.out.print("Number of employees: ");
				int setTaxPayerPJNumberWorkers = sc.nextInt();
				list.add(new TaxPayerPJ(setTaxPayerName, setTaxPayerAnualIncome, setTaxPayerPJNumberWorkers));
			}
		 	else {
			System.out.println("Error: Invalid type entered on TAX PAYERT TYPE. Program terminate.");
			return;
            }

		}

		double sum = 0.0;
		System.out.println();
		System.out.println("TAXES PAID:");
		for (TaxPayer tp : list) {
			double tax = tp.taxPayed();
			System.out.println(tp.getTaxPayerName() + ": $ " + String.format("%.2f", tax));
			sum += tax;
		}
		
		System.out.println();
		System.out.println("TOTAL TAXES: $ " + String.format("%.2f", sum));
		
		sc.close();
	}
}
