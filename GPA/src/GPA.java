
public class GPA {
	public static void main(String[] args) {
		double grade1 = 3.6;
		double grade2 = 2.1;
		double grade3 = 5.0;
		double gpa = calcuateGPA(grade1, grade2, grade3);
	    finalGpa(gpa);
		
		
	}
	
	public static double calcuateGPA(double grade1, double grade2, double grade3 ) {
		double totalGrade = grade1 + grade2 + grade3;
		double gpa = totalGrade / 3;
		return gpa;
	}
	
	public static void finalGpa(double gpa) {
		System.out.println(gpa);
	}

}
