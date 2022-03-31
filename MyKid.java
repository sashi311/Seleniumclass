package SeleniumBasicsday2;

public class MyKid {
public static void main(String[] args) {
	MyMobile mobObj=new MyMobile();
	short price = mobObj.price;
	System.out.println(price);
	boolean isSmartphone = mobObj.isSmartphone;
	System.out.println(isSmartphone);
	char brand = mobObj.brand;
	System.out.println(brand);
	int regNum = mobObj.regNum;
	System.out.println(regNum);
	mobObj.viewGallery();
	mobObj.makeCalls();
}
}