package entities;

public class Rectangle {
	
	public double width;
	public double height;
	
	public double area() {
		
		return height * width;
	}
	
	public double perimeter() {
		
		return (height * 2) + (width * 2);
	}
	
	public double diagonal(){
		
		double d = Math.pow(width, 2) + Math.pow(height, 2);		
		return Math.sqrt(d);
		
	}
	

}
