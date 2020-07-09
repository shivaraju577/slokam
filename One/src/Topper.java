
public class Topper {

	public static void main(String[] args) {
		String stu1 = "Yalagala";
		String stu2 = "Raju";
		String stu3 = "shiva";
		System.out.println("Students in the Class are " + stu1 +" " + stu2 + " "+ stu3);
		
		double stu1p = 86;
		double stu2p = 87;
		double stu3p = 85;
		System.out.println("Student " + stu1 + " Percentage is "+stu1p );
		System.out.println("Student " + stu2 + " Percentage is "+stu2p );
		System.out.println("Student " + stu3 + " Percentage is "+stu3p );
		
		if (stu1p > stu2p) {
			if(stu1p > stu3p) {
				System.out.println("Student " + stu1 + " is Topper");
			}
		}
		if (stu2p > stu1p) {
			if(stu2p > stu3p) {
				System.out.println("Student " + stu2 + " is Topper");
			}
		}
		if (stu3p > stu1p) {
			if(stu3p > stu2p) {
				System.out.println("Student " + stu3 + " is Topper");
			}
		}
	}
	
}
