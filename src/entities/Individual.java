package entities;

public class Individual extends TaxPayer{
	private Double healthExpenses;
	
	public Individual() {
		super();
	}

	public Individual(String name, Double income, Double healthExpenses) {
		super(name, income);
		this.healthExpenses = healthExpenses;
	}
	
	@Override
	public Double tax() {
		double income = this.getIncome();
		double totalTaxes = 0.0;
		
		
		if(income < 20000) {
			totalTaxes = (income * 0.15) - (healthExpenses * 0.5);
		}
		
		else if(income > 20000) {
			totalTaxes = (income * 0.25) - (healthExpenses * 0.5);
		}
		
		return totalTaxes;
	}
}
