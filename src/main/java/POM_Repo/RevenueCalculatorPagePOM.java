package POM_Repo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RevenueCalculatorPagePOM {

	@FindBy(xpath = "//*[@class=\"MuiSlider-root MuiSlider-colorPrimary MuiSlider-sizeMedium css-16i48op\"]//input")
	private WebElement ranger;
	
	@FindBy(xpath = "//*[@class=\"MuiFormControl-root MuiTextField-root css-1s5tg4z\"]//input")
	private WebElement rangerTextField;

	public RevenueCalculatorPagePOM(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//p[text()=\"CPT-99091\"]/..//*[@class=\"PrivateSwitchBase-input css-1m9pwf3\"]")
	private WebElement CPT_99091Checkbox;

	@FindBy(xpath = "//p[text()=\"CPT-99453\"]/..//*[@class=\"PrivateSwitchBase-input css-1m9pwf3\"]")
	private WebElement CPT_99453Checkbox;
	
	@FindBy(xpath = "//p[text()=\"CPT-99454\"]/..//*[@class=\"PrivateSwitchBase-input css-1m9pwf3\"]")
	private WebElement CPT_99454Checkbox;
	
	@FindBy(xpath = "//p[text()=\"CPT-99474\"]/..//*[@class=\"PrivateSwitchBase-input css-1m9pwf3\"]")
	private WebElement CPT_99474Checkbox;
 
	@FindBy(xpath = "/html/body/div[1]/div[1]/header/div/p[4]/p")
	private WebElement totalRecuring;
	public WebElement getRanger() {
		return ranger;
	}

	public WebElement getRangerTextField() {
		return rangerTextField;
	}

	public WebElement getCPT_99091Checkbox() {
		return CPT_99091Checkbox;
	}

	public WebElement getCPT_99453Checkbox() {
		return CPT_99453Checkbox;
	}

	public WebElement getCPT_99454Checkbox() {
		return CPT_99454Checkbox;
	}

	public WebElement getCPT_99474Checkbox() {
		return CPT_99474Checkbox;
	}

	public WebElement getTotalRecuring() {
		return totalRecuring;
	}

	public void setTotalRecuring(WebElement totalRecuring) {
		this.totalRecuring = totalRecuring;
	}
	
	
	
}
