package programas;

public class User {
	
	// Atributos
	private String firstName;
	private String lastName;
	
	// Construtor
	public User(String firstName, String lastName) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
	}
	
	// Getters & Setters
	public String getFirstName() {
		return firstName;
	}
	private void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	private void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	
}
