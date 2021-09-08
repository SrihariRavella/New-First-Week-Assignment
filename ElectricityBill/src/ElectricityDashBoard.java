
public class ElectricityDashBoard {
	
	public static void main(String[] args) {
		
		ElectricityUser e = new ElectricityUser("TonyStark","1324567890","9-5/3","Washington");
		
		ElectricityBillSystemModel electricityBillSystemModel = new ElectricityBillSystemModel("1","10000",e);
		
		electricityBillSystemModel.display();
		
		
	}

}
