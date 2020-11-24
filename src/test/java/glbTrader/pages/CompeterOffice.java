package glbTrader.pages;

import glbTrader.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CompeterOffice {

    public CompeterOffice() { PageFactory.initElements(Driver.getDriver(), this);}
        @FindBy(id = "email")
        public WebElement enterEmailAdress;

        @FindBy(id = "password")
        public WebElement enterPassword;

        @FindBy(name = "submit")
        public WebElement buttonLoginClick;

        @FindBy(linkText = "GLOBAL TRADER")
        public WebElement clickLogo;

        @FindBy(className = "icon_with_fon")
        public WebElement clickCompeterOffice;

        @FindBy(linkText = "Tablets")
        public WebElement clickTablest;



}


