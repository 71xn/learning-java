
public enum Animal {
	cat("Fergus"),dog("Pipa"),mouse("Jerry");
	
	private String name;
	
	// In an enum, only private methods are allowed
	private Animal(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public String toString() {
		return "This animal is called: " + name;
	}
	
}
