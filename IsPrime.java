package week1.day1;

public class IsPrime {

 public static void main(String[] args) {
	
	int i = 100;
	int count = 1;
	
	if (i == 2)
		System.out.println("The given number is NOT a Prime number");
	
	else {
		for (int j = 2; j < i-1; j++) {
			
				if (i % j == 0)
							
					count++;
					
			}
//		
			if (count > 1)
				System.out.println("The given number is NOT a Prime number");
			
			else
				System.out.println("The given number is a Prime number");
	 }
		 
 }
	}


