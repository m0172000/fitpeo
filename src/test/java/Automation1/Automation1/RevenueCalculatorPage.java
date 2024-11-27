package Automation1.Automation1;

import static org.testng.Assert.assertEquals;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Reporter;
import org.testng.annotations.Test;

import POM_Repo.RevenueCalculatorPagePOM;
import utilities.BaseClass;

public class RevenueCalculatorPage extends BaseClass {

	@Test(priority = 1)
	public void validatingTheRanger() throws Throwable {
		RevenueCalculatorPagePOM Ele=new RevenueCalculatorPagePOM(driver);
		Actions act = new Actions(driver);
		act.scrollByAmount(0, 300).perform();
		Thread.sleep(Duration.ofSeconds(5));
		WebElement drag=Ele.getRanger();
		String num = drag.getAttribute("value");
		for (; Integer.parseInt(num) != 820;) {
			System.out.println(num);
			act.dragAndDropBy(drag, 3, 0).perform();
			num = drag.getAttribute("value");
		}
		String rangerTextFieldActualyValue = Ele.getRangerTextField().getAttribute("value");
		assertEquals(rangerTextFieldActualyValue, "820","The ranger is not setted to the 820 value");
		Reporter.log("The ranger is successfully setted the 820 values ");
		
	}
	
	@Test(priority = 2)
	public void validatingRangertext() throws Throwable {
		Actions act = new Actions(driver);
		act.scrollByAmount(0, 300).perform();
		RevenueCalculatorPagePOM Ele=new RevenueCalculatorPagePOM(driver);
		WebElement ragertextfield=Ele.getRangerTextField();
		ragertextfield.click();
		ragertextfield.sendKeys(Keys.BACK_SPACE);
		ragertextfield.sendKeys(Keys.BACK_SPACE);
		ragertextfield.sendKeys(Keys.BACK_SPACE);
		ragertextfield.sendKeys("560");
		ragertextfield.sendKeys(Keys.ENTER);
		String rangerdActualyValue = Ele.getRanger().getAttribute("value");
		assertEquals(rangerdActualyValue, "560","The ranger is not updated to the 560 value when we enter the value to the text");
		Reporter.log("The ranger is successfully upated to 560 when we enter the value to the text field");
		
	}
	@Test(priority = 3)
	public void validatingTheTotalRecuringReimbursement() throws Throwable {
		RevenueCalculatorPagePOM Ele=new RevenueCalculatorPagePOM(driver);
		Ele.getCPT_99091Checkbox().click();
		Ele.getCPT_99453Checkbox().click();
		Ele.getCPT_99454Checkbox().click();
		Ele.getCPT_99474Checkbox().click();
		String rangerTextFieldActualyValue = Ele.getTotalRecuring().getText();
		assertEquals(rangerTextFieldActualyValue, "$110700","The Total Recuring Reimbursement total is not equall to the $110700");
		Reporter.log("The Total Recuring Reimbursement getting as exepected $110700");
		
	}
	
}
