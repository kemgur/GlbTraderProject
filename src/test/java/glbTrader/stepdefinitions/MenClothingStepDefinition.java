package glbTrader.stepdefinitions;

import glbTrader.pages.MenClothing;
import glbTrader.utilities.ConfigurationReader;
import glbTrader.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;

public class MenClothingStepDefinition {

    MenClothing menClothing = new MenClothing();


    @Given("kullanici glbtrader admin sayfasina gider")
    public void kullanici_glbtrader_admin_sayfasina_gider() {
        Driver.getDriver().get(ConfigurationReader.getProperty("glbTraderSignIn"));
    }

    @Given("kullanici kullanici adı ve sifreyi girer")
    public void kullanici_kullanici_adı_ve_sifreyi_girer() {
        menClothing.enterEmailAdresse.sendKeys(ConfigurationReader.getProperty("glbTraderEnterEmail"));
        menClothing.enterPassword.sendKeys(ConfigurationReader.getProperty("glbTraderEnterPassword"));
    }

    @Given("kullanici oturum acma islemini gerceklestirir")
    public void kullanici_oturum_acma_islemini_gerceklestirir() {
        menClothing.buttonLoginClick.click();
    }

    @Then("kullanici anasayfa linkine tiklar")
    public void kullanici_anasayfa_linkine_tiklar() {
        menClothing.mainPageClick.click();
    }

    @Given("kullanici MenClothing & Accessories sayfasına gider")
    public void kullanici_MenClothing_Accessories_sayfasına_gider() {
        menClothing.categoriesMenClothing.click();
    }

    @Given("kullanıcı subCategoryHoodies alt kategorisine gider")
    public void kullanıcı_subCategoryHoodies_alt_kategorisine_gider() {
        menClothing.subCategoryHoodies.click();
    }

    @Then("kullanici sayfa basligini assert eder")
    public void kullanici_sayfa_basligini_assert_eder() {
        String sayfaBaslgi= Driver.getDriver().getCurrentUrl();
        Assert.assertTrue(sayfaBaslgi.contains("Men-Clothing-Accessories"));
    }

    @Given("kullanıcı subCategoryTops alt kategorisine gider")
    public void kullanıcı_subCategoryTops_alt_kategorisine_gider() {
        menClothing.topTeesCategory.click();
    }

    @Given("kullanici orders butonuna tiklar")
    public void kullanici_orders_butonuna_tiklar() {
        menClothing.buttonOrdersClick.click();
    }

    @Given("kullanici ilk urunun basligini alir ve assert eder")
    public void kullanici_ilk_urunun_basligini_alir_ve_assert_eder() {
        String titleOrder=menClothing.getTitleOrdersProduct.getText();
        System.out.println(titleOrder);
        Assert.assertTrue(titleOrder.contains("Maniac Solid Mens"));
    }

    @Given("kullanici newest butonuna tiklar")
    public void kullanici_newest_butonuna_tiklar() {
        menClothing.buttonNewestClick.click();
    }

    @Given("kullanici newest olan ilk urunun basligini alir ve assert eder")
    public void kullanici_newest_olan_ilk_urunun_basligini_alir_ve_assert_eder() {
        String titleNewest=menClothing.getTitleNewestProduct.getText();
        System.out.println(titleNewest);
        Assert.assertTrue(titleNewest.contains("bhanu Product NameProduct"));
    }

    @Given("kullanici hot butonuna tiklar")
    public void kullanici_hot_butonuna_tiklar() {
        menClothing.buttonHotClick.click();
    }

    @Given("kullanici hot olan ilk urunun basligini alir ve assert eder")
    public void kullanici_hot_olan_ilk_urunun_basligini_alir_ve_assert_eder() {
        String titleHot= menClothing.getTitleHotProduct.getText();
        System.out.println(titleHot);
        Assert.assertTrue(titleHot.contains("bhanu Product NameProduct"));
    }

    @Given("kullanici featured butonuna tiklar")
    public void kullanici_featured_butonuna_tiklar() {
        menClothing.buttonFeaturedClick.click();
    }

    @Given("kullanici yaziyi alir ve assert eder")
    public void kullanici_yaziyi_alir_ve_assert_eder() {
        String titleFeatured=menClothing.getnotFoundYazisi.getText();
        System.out.println(titleFeatured);
        Assert.assertTrue(titleFeatured.contains("Record Not Found"));
    }

    @Given("kullanici minprice butonuna tiklar")
    public void kullanici_minprice_butonuna_tiklar() {
        menClothing.buttonMinPriceClick.click();
    }

    @Given("kullanici minprice olan ilk urunun basligini alir ve assert eder")
    public void kullanici_minprice_olan_ilk_urunun_basligini_alir_ve_assert_eder() {
        String titleMinPrice=menClothing.getTitleMinProduct.getText();
        System.out.println(titleMinPrice);
        Assert.assertTrue(titleMinPrice.contains("Maniac Solid Mens"));
    }

    @Given("kullanici maxprice butonuna tiklar")
    public void kullanici_maxprice_butonuna_tiklar() {
        menClothing.buttonMaxPriceClick.click();
    }

    @Given("kullanici maxprice olan ilk urunun basligini alir ve assert eder")
    public void kullanici_maxprice_olan_ilk_urunun_basligini_alir_ve_assert_eder() {
        String titleMaxPrice= menClothing.getMaxPriceProduct.getText();
        System.out.println(titleMaxPrice);
        Assert.assertTrue(titleMaxPrice.contains("bhanu Product NameProduct"));
    }

    @Given("kullanici freeshipping butonuna tiklar")
    public void kullanici_freeshipping_butonuna_tiklar() {
        menClothing.buttonFreeShippingClick.click();
    }

    @Then("kullanici freeshipping olan ilk urunun basligini alir ve assert eder")
    public void kullanici_freeshipping_olan_ilk_urunun_basligini_alir_ve_assert_eder() {
        String titleFreeShip=menClothing.getTitleFreeShippingProduct.getText();
        System.out.println(titleFreeShip);
        Assert.assertTrue(titleFreeShip.contains("Maniac Solid Mens"));
    }

    @Given("kullanici tshirt alt kategoriye gider")
    public void kullanici_tshirt_alt_kategoriye_gider() {
        menClothing.subCategoryTshirts.click();
    }

    @Given("kullanici price filter min kutusuna tiklar ve {string} yazar")
    public void kullanici_price_filter_min_kutusuna_tiklar_ve_yazar(String string) {
        menClothing.boxPriceFilterMin.sendKeys(string);
    }

    @Given("kullanici price filter max kutusuna tiklar ve {string} yazar")
    public void kullanici_price_filter_max_kutusuna_tiklar_ve_yazar(String string) {
        menClothing.boxPriceFilterMax.sendKeys(string);
    }

    @Given("kullanici price filter arama butonuna tiklar")
    public void kullanici_price_filter_arama_butonuna_tiklar() {
        menClothing.searchByPriceFilter.click();
    }

    @Then("kullanici cikan urunun basligini alir ve assert eder")
    public void kullanici_cikan_urunun_basligini_alir_ve_assert_eder() {
        String resultByPriceFilter= menClothing.resultPriceFilter.getText();
        System.out.println(resultByPriceFilter);
        Assert.assertTrue(resultByPriceFilter.contains("Maniac Solid"));
    }

    @Given("kullanici bir marka ismini secer")
    public void kullanici_bir_marka_ismini_secer() {
        menClothing.selectByBrandGHPC.click();
    }

    @Given("kullanici brand filter ile arama yapar")
    public void kullanici_brand_filter_ile_arama_yapar() {
        menClothing.searchByBrand.click();
    }

    @Then("kullanici urunun basligini alir ve assert eder")
    public void kullanici_urunun_basligini_alir_ve_assert_eder() {
        String resultByBrandFilter=menClothing.getTitleBrandSearchProduct.getText();
        System.out.println(resultByBrandFilter);
        Assert.assertTrue(resultByBrandFilter.contains("bhanu Product"));
    }

    @Given("kullanici bir size secer")
    public void kullanici_bir_size_secer() {
        menClothing.selectSizeXs.click();
    }

    @Given("kullanici size filter ile arama yapar")
    public void kullanici_size_filter_ile_arama_yapar() {
        menClothing.searchBySizeFilter.click();
    }

    @Then("kullanici size arama sonucunun basligini alir ve assert eder")
    public void kullanici_size_arama_sonucunun_basligini_alir_ve_assert_eder() {
        String searchBySize=menClothing.getTitleBySizeFilter.getText();
        System.out.println(searchBySize);
        Assert.assertTrue(searchBySize.contains("Maniac Solid"));
    }

    @Given("kullanici male kutusunu secer")
    public void kullanici_male_kutusunu_secer() {
        menClothing.selectByGenderMale.click();
    }

    @Given("kullanici filter applicable ile arama yapar")
    public void kullanici_filter_applicable_ile_arama_yapar() {
        menClothing.searchByGenderFilter.click();
    }

    @Given("kullanici bir urun secer")
    public void kullanici_bir_urun_secer() {
        menClothing.selectOneProduct.click();
    }

    @Given("kullanici buynow butonuna tiklar")
    public void kullanici_buynow_butonuna_tiklar() {
        menClothing.selectBuyNowButton.click();
    }

    @Then("kullanici urunun eklendigini assert eder")
    public void kullanici_urunun_eklendigini_assert_eder() {
        String shoppingCart=menClothing.getBuyNowTextResult.getText();
        System.out.println(shoppingCart);
        Assert.assertTrue(shoppingCart.contains("1 Item"));
    }

    @Given("kullanici contact seller butonuna tiklar")
    public void kullanici_contact_seller_butonuna_tiklar() {
        menClothing.selectContactSellerButton.click();
    }

    @Then("kullanici contactus sayfasina gectigini assert eder")
    public void kullanici_contactus_sayfasina_gectigini_assert_eder() {
        String contactUsUrl= Driver.getDriver().getCurrentUrl();
        System.out.println(contactUsUrl);
        Assert.assertTrue(contactUsUrl.contains("seller_contact"));
    }

    @Given("kullanici AddToWishlist butonuna tiklar")
    public void kullanici_AddToWishlist_butonuna_tiklar() {
        menClothing.clickAddToWishlistButton.click();
    }

    @Then("kullanici wishlist sayfasina gectigini assert eder")
    public void kullanici_wishlist_sayfasina_gectigini_assert_eder() {
        menClothing.selectWishlistButton.click();
        String wishList= Driver.getDriver().getCurrentUrl();
        System.out.println(wishList);
        Assert.assertTrue(wishList.contains("my_wishlist"));
    }

    @Then("kullanici alert mesajini alir")
    public void kullanici_alert_mesajini_alir() {
        Driver.waitForVisibility(menClothing.getAlertMessage,10);
        String alertMessage=  menClothing.getAlertMessage.getText();
        System.out.println(alertMessage);


        Assert.assertEquals("Oops ! Already added to Wishlist",alertMessage);

    }
}