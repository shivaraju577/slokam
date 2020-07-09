
public class Students {

	public static void main(String[] args) {
		int s1 = 36;
		int s2 = 34;
		int s3 = 33;
		System.out.println("sub1 marks is " + s1);
		System.out.println("sub2 marks is " + s2);
		System.out.println("sub3 marks is " + s3);
		
		int tot = s1 + s2 + s3;
		System.out.println("Total Marks are " + tot);
		
		double perc = tot / 3;
		System.out.println("Percentage of Marks is " + perc);
		
		if (perc >=35 & perc < 50) {
		
			if(s1 < 35) {
				System.out.println("Failed S1 Subject");
				}
			if(s2 < 35) {
				System.out.println("Failed S2 Subject");
				}
			if(s3 < 35) {
				System.out.println("Failed S3 Subject");
				}
			
			System.out.println("Just Pass");
		}
		else if(perc >= 50 & perc < 60) {
			if(s1 < 35) {
				System.out.println("Failed S1 Subject");
				}
			if(s2 < 35) {
				System.out.println("Failed S2 Subject");
				}
			if(s3 < 35) {
				System.out.println("Failed S3 Subject");
				}
			System.out.println("Passed with Second Class");	
		}
		else if(perc >= 60 & perc < 75) {
			if(s1 < 35) {
				System.out.println("Failed S1 Subject");
				}
			if(s2 < 35) {
				System.out.println("Failed S2 Subject");
				}
			if(s3 < 35) {
				System.out.println("Failed S3 Subject");
				}
			System.out.println(" Passed with First Class");
		}
		else if(perc >= 75 & perc <= 100) {
			if(s1 < 35) {
				System.out.println("Failed S1 Subject");
				}
			if(s2 < 35) {
				System.out.println("Failed S2 Subject");
				}
			if(s3 < 35) {
				System.out.println("Failed S3 Subject");
				}
			System.out.println("Passed with Distinction");
		}
		else if (perc > 100) {
			if(s1 < 35) {
				System.out.println("Failed S1 Subject");
				}
			if(s2 < 35) {
				System.out.println("Failed S2 Subject");
				}
			if(s3 < 35) {
				System.out.println("Failed S3 Subject");
				}
			System.out.println("Not A Valid Percentage");
		}
		else {
			if(s1 < 35) {
				System.out.println("Failed S1 Subject");
				}
			if(s2 < 35) {
				System.out.println("Failed S2 Subject");
				}
			if(s3 < 35) {
				System.out.println("Failed S3 Subject");
				}
			System.out.println("Congrats ... Failure is the first step to get success");
		}
		
	}
}
