package agregation;

/**
 * An office has a boss and direction.
 * @author 4lejandroRojas
 *
 */
public class Office {
	private Employee boss;
	private Address address;
	
	public Office(Employee boss, Address address) {
		super();
		this.boss = boss;
		this.address = address;
	}

	Employee getBoss() {
		return boss;
	}

	void setBoss(Employee boss) {
		this.boss = boss;
	}

	Address getAddress() {
		return address;
	}

	void setAddress(Address address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Office [boss=" + boss + ", address=" + address + "]";
	}
}
