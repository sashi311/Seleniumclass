package SeleniumBasicsday2;

public class learnswitch {
public static void main(String[] args) {
	//switch-it matches the int value to the followed value
	//any datatype, expersion and string can be passed in int value 
	//break -gives the absoulte output
	//without giving break the output gets followd after the matching value
	int number=200;
	switch (number) {
	case 100: 
		System.out.println(100);
		break;
	case 200:
		System.out.println(200);
		break;
	case 300:
		System.out.println(300);
	break;		
	default:
		System.out.println("amount is invalid");;
	}
	//Based on experion 
	int a=2;
	int b=4;
	switch (b/2) {
	case 1: 
		System.out.println(1);
		break;
	case 2:
		System.out.println(2);
	case 3:
		System.out.println(3);
		
	default:
		System.out.println("value is invalid");
	}
		//based on string
	String str ="hi";
	switch (str) {
	case "hello": 
		System.out.println("hello");
		break;
		case"hi":
			System.out.println("hi");
			break;
	default:
		System.out.println("value is invalid");
	}
			
}
}
