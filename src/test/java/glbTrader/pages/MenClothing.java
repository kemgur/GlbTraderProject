package glbTrader.pages;

import glbTrader.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class MenClothing {

    public MenClothing() {
        PageFactory.initElements(Driver.getDriver(), this);
    }
    @FindBy(id = "email")
    public WebElement enterEmailAdresse;
    @FindBy(id = "password")
    public WebElement enterPassword;
    @FindBy(name = "submit")
    public WebElement buttonLoginClick;
    @FindBy(xpath = "/html/body/header/section/div/div/div[1]/a/img")
    public WebElement mainPageClick;
    @FindBy(xpath = "//a[@class='left_show_panel_heading']")
    public WebElement categoriesMenClothing;
    @FindBy(xpath = "/html/body/section[2]/div[4]/div/div[1]/div/div[2]/ul/li[2]/a")
    public WebElement subCategoryHoodies;
    @FindBy(xpath = "/html/body/section[2]/div[4]/div/div[1]/div/div[2]/ul/li[1]")
    public WebElement topTeesCategory;
    @FindBy(xpath = "//*[@id=\"listing_sort_by\"]/button[1]")
    public WebElement buttonOrdersClick;
    @FindBy(xpath = "(//div[@class='caption'])[1]")
    public WebElement getTitleOrdersProduct;
    @FindBy(xpath = "//*[@id=\"listing_sort_by\"]/button[2]")
    public WebElement buttonNewestClick;
    @FindBy(xpath = "(//*[@class='icon-hotproduct'])[1]")
    public WebElement getTitleNewestProduct;
    @FindBy(xpath = "//*[@id=\"listing_sort_by\"]/button[3]")
    public WebElement buttonHotClick;
    @FindBy(xpath = "(//*[@class='icon-hotproduct'])[1]")
    public WebElement getTitleHotProduct;
    @FindBy(xpath = "//*[@id=\"listing_sort_by\"]/button[4]")
    public WebElement buttonFeaturedClick;
    @FindBy(xpath = "/html/body/div[1]/div/div[4]/div[4]/div[1]")
    public WebElement getnotFoundYazisi;
    @FindBy(xpath = "//*[@id=\"listing_sort_by\"]/button[5]")
    public WebElement buttonMinPriceClick;
    @FindBy(xpath = "(//*[@title='Maniac Solid Mens Round Neck T-Shirt'])[2]")
    public WebElement getTitleMinProduct;
    @FindBy(xpath = "//*[@id=\"listing_sort_by\"]/button[6]")
    public WebElement buttonMaxPriceClick;
    @FindBy(xpath = "(//*[@title='bhanu Product NameProduct Name Product Name'])[2]")
    public WebElement getMaxPriceProduct;
    @FindBy(xpath = "//*[@id=\"listing_sort_by\"]/button[7]")
    public WebElement buttonFreeShippingClick;
    @FindBy(xpath = "(//*[@title='Maniac Solid Mens Round Neck T-Shirt'])[2]")
    public WebElement getTitleFreeShippingProduct;
    @FindBy(xpath = "/html/body/div[1]/div/div[1]/div[1]/div/div[2]/ul/li[2]")//
    public WebElement subCategoryTshirts;
    @FindBy(xpath = "(//*[@id='usr'])[1]")
    public WebElement boxPriceFilterMin;
    @FindBy(xpath = "(//*[@id='usr'])[2]")
    public WebElement boxPriceFilterMax;
    @FindBy(xpath = "(//*[@name='price_range'])[1]")
    public WebElement searchByPriceFilter;
    @FindBy(xpath = "/html/body/div[1]/div/div[3]/div[4]/div[1]/div/div[3]/h4/a")
    public WebElement resultPriceFilter;
    @FindBy(xpath = "(//*[@id='select_brand_id'])[1]")
    public WebElement selectByBrandGHPC;
    @FindBy(xpath = "(//*[@class='btn btn-sm btn-warning btn-block'])[2]")
    public WebElement searchByBrand;
    @FindBy(xpath = " (//*[@title='bhanu Product NameProduct Name Product Name'])[2]")
    public WebElement getTitleBrandSearchProduct;
    @FindBy(xpath = "(//*[@id=\"Size\"])[2]")
    public WebElement selectSizeXs;
    @FindBy(xpath = "(//*[@class='btn btn-sm btn-warning btn-block'])[3]")
    public WebElement searchBySizeFilter;
    @FindBy(xpath = "//*[@class='icon-hotproduct']")
    public WebElement getTitleBySizeFilter;
    @FindBy(xpath = "(//*[@id=\"Applicable People\"])[2]")
    public WebElement selectByGenderMale;
    @FindBy(xpath = "(//*[@class='btn btn-sm btn-warning btn-block'])[4]")
    public WebElement searchByGenderFilter;
    @FindBy(xpath = "(//*[@title='Maniac Solid Mens Round Neck T-Shirt'])[1]")
    public WebElement selectOneProduct;
    @FindBy(xpath = "//*[@name='buynow_submit']")
    public WebElement selectBuyNowButton;
    @FindBy(xpath = "//div[@class='page-header']")
    public WebElement getBuyNowTextResult;
    @FindBy(xpath = "//div[@class='col-md-4 col-xs-6']")
    public WebElement selectContactSellerButton;
    @FindBy(xpath = "(//*[@class='col-md-4'])[2]")
    public WebElement clickAddToWishlistButton;
    @FindBy(xpath = "//*[@class='fa fa-heart fa-2x']")
    public WebElement selectWishlistButton;
    @FindBy(id = "alert_messages_show")
    public WebElement getAlertMessage;
}
