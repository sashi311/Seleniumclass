package SeleniumBasics;

public class Learnwhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//stopping point based on condition 
		//explicit stop point in not available in while 
		//Ex-sum=134
		int number=134;
		int sum=0;
		//number=134
		//remainder=4
		//quotient=13
		//sum=0+4
		//number=13
		
		//number=13-
		//remainder-3
		//quotient-1
		//sum=4+3=7
		//number=1
			
		//number=1-
		//number%1-anything by module will be the same numerator
		//remainder=1
		//quotient=0.1
		//sum=7+1=8
		
		//number=0
		//if the number comes as zero that executes the program 
		
		
		while (number>0) {
			int remainder = number%10;
			int quotient=number/10;
			sum=sum+remainder;
			number=quotient;
			System.out.println(sum);
		}
	}

}
