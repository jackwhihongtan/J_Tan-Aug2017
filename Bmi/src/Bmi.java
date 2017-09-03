//Jack Tan
//This is a test

public class Bmi {
	public static void main(String[] args) {
		//declare variable
		double height;
		double weight;
		double bmi;
		
		//compute Bmi
		height = 70;
		weight = 195;
		bmi = weight / (height * height) * 703;
		
		//Print results
		System.out.println("Current Bmi:");
		System.out.println(bmi);
	}

}
