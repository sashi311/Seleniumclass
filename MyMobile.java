package SeleniumBasicsday2;
//Based on state and behaviour


//state-variable
//byte screenSize=14;
//short price=26000;
//int regNum=25252;
//long mobileNum =9095978785l;
//float current=22.5f;
//double batterySize=12.53633;
//char brand='H';
//boolean isSmartphone =true;


//Decides thae behaviuor of the phone(action/methods)-naming comvention will be camelCase in methods
//makeCalls,payMoney,sendSMS,viewGallery()


//Syntax-methods
//public void makeCalls()
//public-access specifier
//void-return type
//makeCalls-methodname
//()-input arguments

//Access modifier-private,public,protected,package
public class MyMobile {
	byte screenSize=14;
	short price=26000;
	int regNum=25252;
	long mobileNum =9095978785l;
	float current=22.5f;
	double batterySize=12.53633;
	char brand='H';
	boolean isSmartphone =true;
	//Behaviours
	public void makeCalls() {
		// TODO Auto-generated method stub
System.out.println("makeCalls");
	}
	private void payMoney() {
		// TODO Auto-generated method stub
System.out.println("payMoney");
	}
	public void sendSms() {
	System.out.println("sendSms");	// TODO Auto-generated method stub

	}
	public void viewGallery() {
		// TODO Auto-generated method stub
System.out.println("viewGallery");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//Access all the components of the clss
		//create an object,instantiate-copy of it
		//Syntax
		//className object = new classname()-constructor
		//components of the class access by object
		MyMobile mobObj=new MyMobile();
		MyMobile mobObj1=new MyMobile();
		MyMobile mobObj2=new MyMobile();
		MyMobile mobObj3=new MyMobile();
		MyMobile mobObj4=new MyMobile();
		
		double batterySize2 = mobObj.batterySize;
		System.out.println(batterySize2);
		char brand2 = mobObj.brand;
		System.out.println(brand2);
		mobObj.makeCalls();
		mobObj.sendSms();
		mobObj.payMoney();
		mobObj.viewGallery();

	}

}
