import java.util.Scanner;

/**
 * Just like last time, the User class is responsible for retrieving
 * (i.e., getting), and updating (i.e., setting) user information.
 * This time, though, you'll need to add the ability to update user
 * information and display that information in a formatted manner.
 * 
 * Most of the functionality for this class should have already been
 * implemented last time. You can always reference my Github repository
 * for inspiration (https://github.com/rwilson-ucvts/java-sample-atm).
 */
public class User {
	public User(String first_name, String last_name, String dob, int pin, String address, String city, String state, int postcode) {
		this.first_name = first_name;
		this.last_name = last_name;
		this.dob = dob;
		this.pin = pin;
		this.address = address;
		this.city = city;
		this.state = state;
		this.postcode = postcode;
	}
	
	Scanner input = new Scanner(System.in);
	private String first_name;
	private String last_name;
	private int pin;
	private String dob;
	private String address;
	private String city;
	private int phonenum;
	private String state;
	private int postcode;
	
	public int getPin() {
		return pin;
	}
	public int getPhone() {
		return phonenum;
	}
	public String getFname() {
		return first_name;
	}
	public String getLname() {
		return last_name;
	}
	public String getDob() {
		return dob;
	}
	public String getAddress() {
		return address;
	}
	public String getCity() {
		return city;
	}
	public String getState() {
		return state;
	}
	public int getPostCode() {
		return postcode;
	}
	
	public void setPin(int pinext) {
		System.out.println("input current pin");
		int checker = input.nextInt();
		if(checker == pin) {
			this.pin = pinext;
		}
	}
	public void setPhone(int phone) {
		System.out.println("input current pin");
		int checker = input.nextInt();
		if(checker == pin) {
			this.phonenum= phone;
		}
	}
	public void setAddress(String address) {
		System.out.println("input current pin");
		int checker = input.nextInt();
		if(checker == pin) {
			this.address = address;
		}
		
	}

	public void setCity(String city) {
		System.out.println("input current pin");
		int checker = input.nextInt();
		if(checker == pin) {
			this.city = city;
		}
		
	}

	public void setState(String state) {
		System.out.println("input current pin");
		int checker = input.nextInt();
		if(checker == pin) {
			this.state = state;
		}
		
	}

	public void setPostCode(int postcode) {
		System.out.println("input current pin");
		int checker = input.nextInt();
		if(checker == pin) {
			this.postcode = postcode;
		}
		
	}



}