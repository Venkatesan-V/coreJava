package z28supplierEx;

public class SupplierEx_Student {

	private String name;
	private double percentage;
	
	public SupplierEx_Student(String name, Double percentage) {
		this.name=name;
		this.percentage=percentage;
	}

	public String getName() {
		return name;
	}

	public double getPercentage() {
		return percentage;
	}
	
	@Override
	public String toString() {
		return "Name : " +getName() + ", Percentage : " +getPercentage();
	}
	
	
}
