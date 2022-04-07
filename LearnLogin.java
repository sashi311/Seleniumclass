package Week2.Day1;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ById;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnLogin {
//selenium internal architecture
	//Selenium java code------>rest API(application program interface)--->driver(Local system)
	//---->Reflects in browser(chrome)
	//to work in chrome-need chrome driver
	//to work in firefox-need firefox driver
	//Driver speaks to browser
	//driver version =browser version 
	//Browser version=Version 100.0.4896.60 (Official Build) (64-bit)
	//Driver version=Chromedriver.exe_-->If you are using Chrome version 100, please download ChromeDriver 100.0.4896.60	
	
	//Rest api-->selenium java code--->api---->browser
	
	
	public static void main(String[] args) {
		//System.setproperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		//ChromeDriver driver=new ChromeDriver();
		/*manually checked the browser version
		 * downloaded the driver from chrome.exe
		 * created a folder and pasted the exe in the folder
		 * if is matches the version with driver and browser version
		 //if it matches it runs successfully
		  */
        //Difficulties-if browser version gets updated after twoday we should again download the browser version
		//and run the program smooth
		//Step-1-Setup the chrome driver
		
		WebDriverManager.chromedriver().setup();
		//Step 2-instantiate the chromedriver
		//launch the browser
		ChromeDriver driver = new ChromeDriver();
		//Launch the URL i the current browser
		driver.get("http:leaftaps.com/opentaps/control/main");
			//Structure of html 
		//tag(pink)
		//attributes(Orange)
		//text(Black)
		//Locater-
		//id,name.linkText-<a>+text()
		//class name-should not have spaces "class=small submit"
		//id-should not have any numbers incase we use name,class name."id="ext-gen591""
		
		
	//Locate the Username
		WebElement webUserName = driver.findElement(By.id("username"));
		webUserName.sendKeys("demosalesmanager");
		WebElement webPassword = driver.findElement(By.id("password"));
		webPassword.sendKeys("crmsfa");	
		WebElement webdecorativeSubmit = driver.findElement(By.className("decorativeSubmit"));
		webdecorativeSubmit.click();
		//verification part
		String orgTitle="Leaftaps - TestLeaf Automation Platform";
		String title=driver.getTitle();
		if (orgTitle.equals(title)) {
			System.out.println("page landed up correctly");
			
		}
		else {
			System.out.println("page not landed up corrcetly");
			
		}
		//<a>,text(Black color)
		driver.findElement(By.linkText("CRM/SFA")).click();
		//company name,first name,lastname,click create lead
	}
}