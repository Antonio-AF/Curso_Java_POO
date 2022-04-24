package entities;

public class Product {

	private String name;
	private double price;
	private int quantity;
	
	// Contrutor padrão usando sobrecarga
	public Product() {		
	}
	
	// Contrutor 
	public Product(String name, double price, int quantity) {
		
		this.name = name;
		this.price = price;
		this.quantity = quantity;		
		
	}
	
	// Contrutor usando sobrecarga e sem um dos atributos.
	public Product(String name, double price) {
		this.name = name;
		this.price = price;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getname() {
		return name;
	}
	
	public double getPrice() {
		return price;
	}
	
	public void setPrice(double price) {
		this.price = price;
	}
	
	public int getQuantity() {
		return quantity;
	}
	
	/* public void setQuantity(int) {this.quantity = quantity;} Só pode ser alterado a quantidade se
	 * houver um entrada ou uma saída para respeitar a regra de negócio. */
	
	public double totalValueInStock(){		
		return price * quantity;		
	}
	
	public void addProductsint (int quantity) {
		
		this.quantity += quantity;
	}
	
	public void removeProducts(int quantity) {
		this.quantity -= quantity;
	}
	
	public String toString() {		
		return name
			+ ", $ "
			+ String.format("%.2f", price)
			+ ", "
			+ quantity
			+ " units, Total: $ "
			+ String.format("%.2f", totalValueInStock());
		
		
	}

}
