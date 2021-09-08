
public class ElectricityYearlyAverage {
	
	private String average;

	public ElectricityYearlyAverage(String average) {
		this.average = (Integer.parseInt(average) * 12)+"";
	}
	
	public void displayAverageElectricityConsuption(){
		System.out.println("Average Electricity Consuption : "+this.average);
	}

}
