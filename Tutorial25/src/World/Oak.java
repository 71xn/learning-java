package World;
public class Oak extends Plant {

	public Oak() {
		// TODO Auto-generated constructor stub
		
		//type = "Tree"; 
		// Won't work either, even though Oak is a child of Plant
		
		//this.size = "Large";
		// This works because size is protected and oak is a subclass of plant
	}
	
}
