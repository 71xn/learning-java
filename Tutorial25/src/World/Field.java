package World;
public class Field {
	private Plant plant = new Plant();
	
	public Field() {
		// Size is protected and field is in the same package as plant
		System.out.println(plant.size);
	}
	
}
