package agregation;

/**
 * This class can be exist without Employee.
 * @author 4lejandroRojas
 *
 */
public class Address {
	private String city;
	private String state;
	private String country;
	private String formattedAddress;
	
	public Address(String city, String state, String country, String formattedAddress) {
		super();
		this.city = city;
		this.state = state;
		this.country = country;
		this.formattedAddress = formattedAddress;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getFormattedAddress() {
		return formattedAddress;
	}

	public void setFormattedAddress(String formattedAddress) {
		this.formattedAddress = formattedAddress;
	}

	@Override
	public String toString() {
		return "Address [city=" + city + ", state=" + state + ", country=" + country + ", formattedAddress="
				+ formattedAddress + "]";
	}
}
