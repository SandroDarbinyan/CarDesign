package CarID;

public abstract class Cclass extends Mercedes  {
    
	
	int airbags;
	String collection;
	String gearType;
	
	Cclass() {
		System.out.println("C class");
		
	}
	
	
	void security () {
		System.out.println("Airbags: " + airbags);
	}
	
	void collection() {
		System.out.println("Collection: " + collection );
		System.out.println("Geartype: " + gearType);
	}
	
	public abstract void description();
	
	}
