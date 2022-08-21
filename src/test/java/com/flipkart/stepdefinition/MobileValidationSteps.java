package com.flipkart.stepdefinition;

import java.util.List;
import java.util.Map;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.flipkart.objectrepository.MobileValidationPage;
import com.flipkart.resources.Commonactions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.cucumber.datatable.DataTable;

public class MobileValidationSteps{
	static String name1;
	static String mn;
	Commonactions a = new Commonactions();
	MobileValidationPage m = new MobileValidationPage();

	@Given("user login using valid credentials")
	public void user_login_using_valid_credentials() {
		a.click(m.getLoginHandle());
		}
		

	@When("user search mobile")
	public void user_search_mobile() {
		mn = "Redmi";
		a.insertText(m.getSearchBox(), mn);
	}

	@Then("user select mobile")
	public void user_select_mobile() {
		WebElement mobileName1 = Hooks.driver.findElement(By.xpath("(//div[@class ='_4rR01T'])[1]"));
		name1 = mobileName1.getText();
		System.out.println(name1);
		a.click(mobileName1);

	}

	@Then("switch window")
	public void switch_window() {
		String pWin = Hooks.driver.getWindowHandle();
		Set <String> cWin = Hooks.driver.getWindowHandles();
		for(String x:cWin) {
			if(!pWin.equals(x)) {
				Hooks.driver.switchTo().window(x);
			}
		}
		WebElement mobileName2 = Hooks.driver.findElement(By.xpath("//span[@class ='B_NuCI']"));
		String name2 = mobileName2.getText();
				System.out.println(name2);
	}


@When("user search mobile using one dimensional list")
public void user_search_mobile_using_one_dimensional_list(DataTable dataTable) {
    List<String> datas = dataTable.asList();
    mn = datas.get(0);
	a.insertText(m.getSearchBox(), mn);
        
}
@When("user search mobile using one dimensional map")
public void user_search_mobile_using_one_dimensional_map(DataTable dataTable) {
   Map<String,String> datas = dataTable.asMap(String.class, String.class);
   mn = datas.get("2");
	a.insertText(m.getSearchBox(), mn);
}

@When("user search mobile {string}")

public void user_search_mobile(String phone) {
	   mn = phone;
		a.insertText(m.getSearchBox(), mn);
}

}


	