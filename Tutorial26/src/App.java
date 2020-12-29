
// Tutorial 26
// Polymorphism

public class App {
	
	public static void main(String[] args) {
		Plant plant1 = new Plant();
		Tree tree = new Tree();
		
		
		// Polymorphism in Java means that if you have a subclass, you can use the subclass anywhere where the aprent class would be used. 
		
		Plant plant2 = tree;
		
		plant2.grow(); // The method in tree is called as plant2 is a pointer to the tree object and the tree object has a override of the grow method
		
		doGrow(tree); // This works because tree is a subclass of plant and thus a plant object
	}
	
	public static void doGrow(Plant plant) {
		plant.grow();
	}
	
}
