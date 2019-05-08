package baseclasses;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddTeriffPlan_Page extends ReUsableCodes {

	public AddTeriffPlan_Page() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//a[text()='Add Tariff Plan']")
	private WebElement addTeriffPlan;
	@FindBy(id = "rental1")
	private WebElement monRent;
	public WebElement getAddTeriffPlan() {
		return addTeriffPlan;
	}
	public WebElement getMonRent() {
		return monRent;
	}
	public WebElement getLocMin() {
		return locMin;
	}
	public WebElement getIntMin() {
		return intMin;
	}
	public WebElement getFreeSms() {
		return freeSms;
	}
	public WebElement getLocChPeMin() {
		return locChPeMin;
	}
	public WebElement getInterCharge() {
		return interCharge;
	}
	public WebElement getSmsCha() {
		return smsCha;
	}
	public WebElement getSubmit() {
		return submit;
	}
	
	public WebElement getHome() {
		return home;
	}

	@FindBy(className="button")
	private WebElement home;
	@FindBy(id = "local_minutes")
	private WebElement locMin;
	@FindBy(id = "inter_minutes")
	private WebElement intMin;
	@FindBy(id = "sms_pack")
	private WebElement freeSms;
	@FindBy(id = "minutes_charges")
	private WebElement locChPeMin;
	@FindBy(id = "inter_charges")
	private WebElement interCharge;
	@FindBy(id = "sms_charges")
	private WebElement smsCha;
	@FindBy(name = "submit")
	private WebElement submit;

}
