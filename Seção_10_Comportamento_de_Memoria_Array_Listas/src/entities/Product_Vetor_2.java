package entities;

public class Product_Vetor_2 {
	
	@SuppressWarnings("unused")
	private String name;
	private double price;
		
	
	public Product_Vetor_2(String name, double price) {
		this.name = name;
		this.price = price;
	}

	public void setName(String name) {
		this.name = name;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	
	

}
