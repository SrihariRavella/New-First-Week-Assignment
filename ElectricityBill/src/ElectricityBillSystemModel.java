
public class ElectricityBillSystemModel {
	
	private String billId;
	private String bill;
	private ElectricityUser user;
	
	public ElectricityBillSystemModel(String billId, String bill, ElectricityUser user) {
		super();
		this.billId = billId;
		this.bill = bill;
		this.user = user;
		
		System.out.println("Electricity Bill System data Setting");
	}
	
	public void display(){
		System.out.println(this.billId+" "+this.bill+" "+this.user);
		
		ElectricityYearlyAverage object = new ElectricityYearlyAverage(this.bill);
		
		object.displayAverageElectricityConsuption();
	}
	
}
