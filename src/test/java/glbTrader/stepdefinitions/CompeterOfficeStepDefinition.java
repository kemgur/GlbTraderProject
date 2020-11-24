package glbTrader.stepdefinitions;

import glbTrader.pages.CompeterOffice;
import glbTrader.utilities.ConfigurationReader;
import glbTrader.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class CompeterOfficeStepDefinition {
    CompeterOffice competerOffice = new CompeterOffice();

    @Given("go to the link")
    public void go_to_the_link(Integer int1) {
        Driver.getDriver().get(ConfigurationReader.getProperty("glbTraderSignIn"));
    }

    @Given("Please enter valid e-mail address.")
    public void please_enter_valid_e_mail_address(Integer int1) {
     competerOffice.enterEmailAdress.sendKeys(ConfigurationReader.getProperty("glbTraderEnterEmail"));
    }

    @Given("Please enter the valid password.")
    public void please_enter_the_valid_password(Integer int1) {
      competerOffice.enterPassword.sendKeys(ConfigurationReader.getProperty("glbTraderEnterPassword"));
    }

    @Given("Click Login  Button")
    public void click_Login_Button(Integer int1) {
   competerOffice.buttonLoginClick.click();
    }

    @Given("Click {string} logo.")
    public void click_logo(Integer int1, String string) {
    competerOffice.clickLogo.click();
    }

    @Given("Click on the Computer & Office link.")
    public void click_on_the_Computer_Office_link(Integer int1) {
    competerOffice.clickCompeterOffice.click();
    }

    @Given("Tablets link must be clickable.")
    public void tablets_link_must_be_clickable(Integer int1) {
        competerOffice.clickTablest.click();
    }

    @Given("Office Electroniccs link must be clickable.")
    public void office_Electroniccs_link_must_be_clickable(Integer int1) {

    }

    @Given("Tablet Accessories link must be clickable.")
    public void tablet_Accessories_link_must_be_clickable(Integer int1) {

    }

    @Given("External Storage link must be clickable.")
    public void external_Storage_link_must_be_clickable(Integer int1) {

    }

    @Given("Networking link must be clickable.")
    public void networking_link_must_be_clickable(Integer int1) {

    }

    @Given("Computer Components link must be clickable.")
    public void computer_Components_link_must_be_clickable(Integer int1) {

    }

    @Given("Computer Perpherals link must be clickable.")
    public void computer_Perpherals_link_must_be_clickable(Integer int1) {

    }

    @Given("Memory Cards &SSD  link must be clickable.")
    public void memory_Cards_SSD_link_must_be_clickable(Integer int1) {

    }

    @Given("Cable & Connectors link must be clickable.")
    public void cable_Connectors_link_must_be_clickable(Integer int1) {

    }

    @Given("Mini PC  link must be clickable. {int}. Demo")
    public void mini_PC_link_must_be_clickable_Demo(Integer int1, Integer int2) {

    }

    @Given("Demo Board & Accessories  link must be clickable.")
    public void demo_Board_Accessories_link_must_be_clickable(Integer int1) {

    }

    @Given("Desktops & Servers  link must be clickable.")
    public void desktops_Servers_link_must_be_clickable(Integer int1) {

    }

    @Given("Industrial Computer & Accessories link must be clickable.")
    public void industrial_Computer_Accessories_link_must_be_clickable(Integer int1) {

    }

    @Given("DIY Gaming PC link must be clickable.")
    public void diy_Gaming_PC_link_must_be_clickable(Integer int1) {

    }

    @Given("Computer Cleaners link must be clickable.")
    public void computer_Cleaners_link_must_be_clickable(Integer int1) {

    }

    @Then("Gaming Laptops link must be clickable.")
    public void gaming_Laptops_link_must_be_clickable(Integer int1) {

    }


}