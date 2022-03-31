package SeleniumBasicsday2;

public class LearnArray {
	public static void main(String[] args) {
		//Array is a collection of similar type of elements which has contiguous memory location
		//index starts from 0,1,2,3,4
		//Syntax
		//datatype[] arrayname=element
		//even can interchange the [] to arrayname
	
		int[] numberArr= {10,20,30,40};
		System.out.println(numberArr[2]);
		//how to find the length of the array
		int lengthArr =numberArr.length;
		System.out.println(lengthArr);
		for (int i = 0; i < lengthArr; i++) {
			System.out.println("element of Index"+i+"is:"+numberArr[i]);
		}
	}
	}
	
	
  
	
	

