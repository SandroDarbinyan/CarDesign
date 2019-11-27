package CarID;

public abstract class Mercedes {
    int year;
	int price;
	String color;
	
	void price() {
		System.out.println("Price: " + price + " US dollars");
	}

  Mercedes(){
	System.out.println("Car : Mercedes");
}
}
