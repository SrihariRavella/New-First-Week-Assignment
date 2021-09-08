
public class ElectricityUser {
	private String name;
	private String mobile;
	private String houseNo;
	private String city;
	
	
	public ElectricityUser(String name, String mobile, String houseNo, String city) {
		super();
		this.name = name;
		this.mobile = mobile;
		this.houseNo = houseNo;
		this.city = city;
	}

	public String getName() {
		return name;
	}

	public String getMobile() {
		return mobile;
	}

	public String getHouseNo() {
		return houseNo;
	}

	public String getCity() {
		return city;
	}
	
	@Override
	public String toString() {
		return "ElectricityUser [name=" + name + ", mobile=" + mobile + ", houseNo=" + houseNo + ", city=" + city + "]";
	}
	
}
