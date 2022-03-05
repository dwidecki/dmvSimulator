package dmvSimulator;

public class dmvSimulator {
	public static void main(String[] args) {
		
		System.out.println("Welcome to the DMV");
		int number = 1 + (int) (Math.random() * 200);
		System.out.println("Your number is " + number);
			
		int count = number +1;
		
			while (count != number) {
	
				if(count <= 200) {
					
					System.out.println("The current number called is " + count);
					count++;
				}
				
				else {
					
					count = 1;
					System.out.println("The current number called is " + count);
					count++;
				}
			}
			System.out.println("Your number has been called! But you do not have the required paperwork.");
	}
}
	
