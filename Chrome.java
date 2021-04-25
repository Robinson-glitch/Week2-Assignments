import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Chrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			WebDriverManager.chromedriver().setup();
			
			ChromeDriver driver=new ChromeDriver();
			driver.get("http://leaftaps.com/opentaps");
			
			driver.manage().window().maximize();
			
			driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
			driver.findElement(By.id("password")).sendKeys("crmsfa");
			driver.findElement(By.className("decorativeSubmit")).click();
			String text = driver.findElement(By.tagName("h2")).getText();
			System.out.println(text);
driver.findElement(By.linkText("CRM/SFA")).click();

driver.findElement(By.linkText("Create Lead")).click();

driver.findElement(By.id("createLeadForm_companyName")).sendKeys("KALATMSOFTWARE");

driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Robinson");

WebElement eleDropdown1=driver.findElement(By.id("createLeadForm_dataSourceId"));
Select dd1= new Select(eleDropdown1);
 dd1.selectByVisibleText("Partner");
 
 driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("Robin");
 driver.findElement(By.id("createLeadForm_personalTitle")).sendKeys("Mr");
 driver.findElement(By.id("createLeadForm_generalProfTitle")).sendKeys("Software tester");
 driver.findElement(By.id("createLeadForm_annualRevenue")).sendKeys("1000000");
 
 WebElement eleDropdown2=driver.findElement(By.id("createLeadForm_industryEnumId"));
 Select dd2= new Select(eleDropdown2);
  dd2.selectByIndex(5);
 
  WebElement eleDropdown3=driver.findElement(By.id("createLeadForm_ownershipEnumId"));
  Select dd3= new Select(eleDropdown3);
   dd3.selectByValue("OWN_PUBLIC_CORP");
   driver.findElement(By.id("createLeadForm_sicCode")).sendKeys("4444444");
   
   driver.findElement(By.id("createLeadForm_description")).sendKeys("The greatest glory in living lies not in never falling, but in rising every time we fall");
   driver.findElement(By.id("createLeadForm_importantNote")).sendKeys("Noted");
   driver.findElement(By.id("createLeadForm_importantNote")).sendKeys("Noted");
   driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Mariaselvam");
   
   WebElement eleDropdown4=driver.findElement(By.id("createLeadForm_marketingCampaignId"));
   Select dd4= new Select(eleDropdown4);
    dd4.selectByIndex(3);
    driver.findElement(By.id("createLeadForm_lastNameLocal")).sendKeys("Robster");
    
   
    driver.findElement(By.id("createLeadForm_birthDate")).sendKeys("04/24/2021");
    driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("Computer Science");

	
    WebElement eleDropdown5=driver.findElement(By.id("createLeadForm_currencyUomId"));
    Select dd5= new Select(eleDropdown5);
     dd5.selectByValue("CZK");
     driver.findElement(By.id("createLeadForm_numberEmployees")).sendKeys("10");
     driver.findElement(By.id("createLeadForm_tickerSymbol")).sendKeys("++++");
     driver.findElement(By.id("createLeadForm_primaryPhoneCountryCode")).clear();
     driver.findElement(By.id("createLeadForm_primaryPhoneCountryCode")).sendKeys("2"); 
     driver.findElement(By.id("createLeadForm_primaryPhoneAreaCode")).sendKeys("600057");
     driver.findElement(By.id("createLeadForm_primaryPhoneExtension")).sendKeys("004");
     driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("mariarobin895@gmail.com");
     driver.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys("7358504347");
     driver.findElement(By.id("createLeadForm_primaryPhoneAskForName")).sendKeys("Me");
     driver.findElement(By.id("createLeadForm_primaryWebUrl")).sendKeys("www.robinworks.com");
     driver.findElement(By.id("createLeadForm_generalToName")).sendKeys("Rex");
     
     driver.findElement(By.id("createLeadForm_generalAddress1")).sendKeys("Kattupakkam");
     driver.findElement(By.id("createLeadForm_generalToName")).sendKeys("Rex");
     driver.findElement(By.id("createLeadForm_generalCity")).sendKeys("Chennai");
     driver.findElement(By.id("createLeadForm_generalPostalCode")).sendKeys("007");
     driver.findElement(By.id("createLeadForm_generalPostalCodeExt")).sendKeys("008");
     driver.findElement(By.id("createLeadForm_generalAttnName")).sendKeys("Mary");
     driver.findElement(By.id("createLeadForm_generalAddress2")).sendKeys("Loordhupuram");
     
     WebElement eleDropdown6=driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
     Select dd6= new Select(eleDropdown6);
      dd6.selectByVisibleText("New York");
      
      WebElement eleDropdown7=driver.findElement(By.id("createLeadForm_generalCountryGeoId"));
      Select dd7= new Select(eleDropdown7);
       dd7.selectByValue("CZE");
       driver.findElement(By.className("smallSubmit")).click();
       driver.findElement(By.linkText("Duplicate Lead")).click();
       driver.findElement(By.id("createLeadForm_companyName")).clear();
       driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Korala Associates Limited");
       driver.findElement(By.className("smallSubmit")).click();
      String text2 = driver.findElement(By.id("viewLead_companyName_sp")).getText();
      String replace = text2.replaceAll("[0-9]","");
      if(replace.equals("Korala Associates Limited ()"))
      {
    	  System.out.println("Test Passed");
      }
      else
      {
    	  System.out.println("Test failed");
      }
    	  
      driver.close();
	}
}