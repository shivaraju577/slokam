
public class PowerBill {

	public static void main(String[] args) {
		int preReading = 1000;
   		int cureReading =1040;
   		int units = cureReading- preReading;
		 
   		if ( units>0 & units <=100  ) { // IF block
   			System.out.println(units*1);
   			
   		}
   		else if(units >100 & units <=200) {
   		
   			System.out.println( units*2 );
   			
   		}
   		else if(units >200 & units<=400 ) {
   			
   			System.out.println( units*4);
   		}
   		else if(units>400){
   			System.out.println(units*6);
   		}
   		else {
   			System.out.println("Not valid ");
   		}
   		
   		 System.out.println("Program DONE.");

	}

}
