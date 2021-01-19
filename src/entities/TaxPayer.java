package entities;

public abstract class TaxPayer {
	private String name;
	private Double income;
	
	public TaxPayer() {
	}
	
	public TaxPayer(String name, Double income) {
		this.name = name;
		this.income = income;
	}
	
	public String getName() {
		return this.name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public Double getIncome() {
		return this.income;
	}
	
	public void setIncome(Double income) {
		this.income = income;
	}
	
	public abstract Double tax();
}
