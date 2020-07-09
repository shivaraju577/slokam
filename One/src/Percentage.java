
public class Percentage {

	public static void main(String[] args) {
		int marks = 0;
		if (marks > 0 & marks < 35) {
			System.out.println("Fail");
		}
		else if( marks >= 35 & marks <45 ) {
			System.out.println("Pass");
		}
		else if( marks >= 45 & marks <60 ) {
			System.out.println("Second Class");
		}
		else if( marks >= 60 & marks <75 ) {
			System.out.println("First Class");
		}
		else if( marks >= 75 & marks <=100 ) {
			System.out.println("Distinction");
		}
		else {
			System.out.println("Not Valid Marks");
		}

	}

}
