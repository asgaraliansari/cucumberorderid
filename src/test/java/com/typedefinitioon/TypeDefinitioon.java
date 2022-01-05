package com.typedefinitioon;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class TypeDefinitioon {
	WebDriver driver;
	@Given("user should login adactin")
	public void user_should_login_adactin() {
		WebDriverManager.chromedriver().setup();
		driver= new ChromeDriver();
		driver.get("https://adactinhotelapp.com/");
		driver.manage().window().maximize();
	   
	}
	@When("user should enter {string} and {string}")
	public void user_should_enter_and(String usr, String pas) {
	    WebElement a = driver.findElement(By.id("username"));
	    a.sendKeys(usr);
	    WebElement b = driver.findElement(By.id("password"));
	    b.sendKeys(pas);
	    WebElement c = driver.findElement(By.id("login"));
		c.click();
		
	}
	@When("user should select hotels {string} {string} {string}  {string} {string} {string} {string} and {string}")
	public void user_should_select_hotels_and(String loca, String hot, String romtyp, String romno, String dpick, String dout, String adrom, String chldr) {
	  
		WebElement d = driver.findElement(By.id("location"));
		 Select dd = new Select(d);
		 dd.selectByVisibleText(loca);
		 
		 WebElement e = driver.findElement(By.id("hotels"));
			Select ee = new Select(e);
			ee.selectByVisibleText(hot);
		
			WebElement f = driver.findElement(By.id("room_type"));
		 Select ff = new Select(f);
		 ff.selectByVisibleText(romtyp);
		
		WebElement g = driver.findElement(By.id("room_nos"));
			 Select gg = new Select(g);
			 gg.selectByVisibleText(romno);
		
		WebElement h = driver.findElement(By.id("datepick_in"));
		h.sendKeys(dpick);
		
		 WebElement i = driver.findElement(By.id("datepick_out"));
		 i.sendKeys(dout);
		
		 WebElement j = driver.findElement(By.id("adult_room"));
		 Select jj = new Select(j);
		 jj.selectByVisibleText(adrom);
		 
		 WebElement k = driver.findElement(By.id("child_room"));
		 Select kk = new Select(k);
		 kk.selectByVisibleText(chldr);
		 
		 WebElement l = driver.findElement(By.id("Submit"));
		l.click();	
	}
	@When("user should slct hotel")
	public void user_should_slct_hotel() {
	    WebElement m = driver.findElement(By.id("radiobutton_0"));
	    m.click();
	    WebElement n = driver.findElement(By.id("continue"));
	    n.click();
	}
	
	
	@When("user should book a hotel {string} {string} {string} {string} {string} {string} {string} and {string}")
	public void user_should_book_a_hotel_and(String fnam, String lname, String addrs, String ccno, String ctyp, String cmonth, String cyear, String cvv) throws InterruptedException {
	         
		         WebElement o = driver.findElement(By.id("first_name")); 
		         o.sendKeys(fnam);
	
	
	    		 WebElement p = driver.findElement(By.id("last_name"));
		         p.sendKeys(lname);
	    		 
	    		 WebElement q = driver.findElement(By.id("address"));
	    		  q.sendKeys(addrs);
	    		 
	    		 WebElement r = driver.findElement(By.id("cc_num"));          
	    		 r.sendKeys(ccno);
	    		 
	    		 WebElement s = driver.findElement(By.id("cc_type"));
	    		 Select ss = new Select(s);
	    		 ss.selectByVisibleText(ctyp);
	    		 
	    		 WebElement t = driver.findElement(By.id("cc_exp_month"));
	    		 Select tt = new Select(t);
	    		 tt.selectByVisibleText(cmonth);
	    		 
	    		 WebElement u = driver.findElement(By.id("cc_exp_year"));
	    		 Select uu = new Select(u);
	    		 uu.selectByVisibleText(cyear);
	
	    		 WebElement v = driver.findElement(By.id("cc_cvv"));
	    		 v.sendKeys(cvv);
	
	    		 WebElement w = driver.findElement(By.id("book_now"));
	             w.click();
	             
	             Thread.sleep(5000);
	             
	             WebElement y = driver.findElement(By.id("order_no"));	
	         	String z = y.getAttribute("value");
	         	System.out.println(z);
	         	
	WebElement x = driver.findElement(By.id("my_itinerary"));
	x.click();
	Thread.sleep(8000);
	driver.quit();
	}
}
