package entities;

public class Company extends TaxPayer{
	private Integer employees;
	
	public Company() {
		super();
	}

	public Company(String name, Double income, Integer employees) {
		super(name, income);
		this.employees = employees;
	}
	
	public Integer getEmployees() {
		return this.employees;
	}
	
	public void setEmployees(Integer employees) {
		this.employees = employees;
	}
	
	@Override
	public Double tax() {
		double income = this.getIncome();
		int employees = this.getEmployees();
		double totalTaxes = 0.0;
		
		if(employees > 10) {
			totalTaxes = income * 0.14;
		}
		
		else {
			totalTaxes = income * 0.16;
		}
		
		return totalTaxes;
	}
}
