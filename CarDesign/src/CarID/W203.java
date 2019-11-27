package CarID;

public class W203 extends Cclass {
	
	W203(String color) {
		this.color = color;
		System.out.println("Color: " + this.color);
	}
	
	@Override
	public void description() {
		System.out.println("Description: The C-Class W203 was refreshed in early 2004.\t\n" 
	+ "             In North America, the refresh took effect for the 2005 model year.");
	}
	
	public static void main(String[] args) {
		W203 car01 = new W203("Red");
		car01.airbags = 4;
		car01.collection = "Sport";
		car01.year = 2010;
		car01.price = 7000;
		car01.gearType = "Automatic";
		car01.collection();
		car01.security();
		car01.description();
		car01.price();
		
		
	}
}
