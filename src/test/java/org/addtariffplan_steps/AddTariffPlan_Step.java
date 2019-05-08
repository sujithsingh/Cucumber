package org.addtariffplan_steps;

import java.util.List;
import java.util.Map;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import baseclasses.AddTeriffPlan_Page;
import baseclasses.ReUsableCodes;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.cucumber.datatable.DataTable;

public class AddTariffPlan_Step extends ReUsableCodes {

	public static AddTeriffPlan_Page al ;

	@Given("The user is in Telecom home page")
	public void the_user_is_in_Telecom_home_page() {
		driver = getDriver();
		loadUrl("http://demo.guru99.com/telecom/index.html");
		al=new AddTeriffPlan_Page();
	}

	@When("The user to Click the Add Tariff Plan")
	public void the_user_to_Click_the_Add_Tariff_Plan() {

		click(al.getAddTeriffPlan());
	}

	@When("The user should navigate to Add Tariff Plan page")
	public void the_user_should_navigate_to_Add_Tariff_Plan_page() {
		Assert.assertTrue(driver.getCurrentUrl().contains("telecom"));
	}

	@When("The user to fill the Tariff plan details")
	public void the_user_to_fill_the_Tariff_plan_details(DataTable data) {
		List<Map<String,String>> asMaps = data.asMaps();
		valueInsert(al.getMonRent(), asMaps.get(0).get("MonRent"));
		valueInsert(al.getLocMin(), asMaps.get(0).get("locMin"));
		valueInsert(al.getIntMin(), asMaps.get(0).get("IntMin"));
		valueInsert(al.getFreeSms(), asMaps.get(0).get("smsPack"));
		valueInsert(al.getLocChPeMin(), asMaps.get(0).get("Locpermin"));
		valueInsert(al.getInterCharge(), asMaps.get(0).get("IntPerMin"));
		valueInsert(al.getSmsCha(), asMaps.get(0).get("smschar"));
	}

	@When("The click the submit button")
	public void the_click_the_submit_button() {
		click(al.getSubmit());
	}

	@When("The user should see the Congratulation you add Tariff Plan")
	public void the_user_should_see_the_Congratulation_you_add_Tariff_Plan() {
		Assert.assertTrue(driver.getCurrentUrl().contains("addtariffplans"));
	}

	@When("The user click the home button")
	public void the_user_click_the_home_button() {
		click(al.getHome());
	}

	@Then("The user return to Telecom home page")
	public void the_user_return_to_Telecom_home_page() {
		Assert.assertTrue(driver.getCurrentUrl().contains("index"));
		driver.quit();
	}

}
