
public class Person {
	private int ID;
	private String lastName, firstName, address, city;
	
	public Person() {
		ID=0;
		lastName="";
		firstName="";
		address="";
		city="";
	}

	public Person(int id, String lN, String fN, String ad, String ci) {
		ID=id;
		lastName=lN;
		firstName=fN;
		address=ad;
		city=ci;
	}
	
	public Person(Person other) {
		ID=other.ID;
		lastName=other.lastName;
		firstName=other.firstName;
		address=other.address;
		city=other.city;
	}
	
	public int getID() {
		return ID;
	}

	public void setID(int id) {
		ID = id;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lN) {
		this.lastName = lN;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String fN) {
		this.firstName = fN;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String ad) {
		this.address = ad;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String ci) {
		this.city = ci;
	}

	public String toString() {
		return "Person with ID=" + ID + ", with lastName=" + lastName + ", firstName=" + firstName + ", have address=" + address+ " in " + city + " city.";
	}
	
	


}
