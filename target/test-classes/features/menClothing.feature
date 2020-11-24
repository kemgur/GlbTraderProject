
@glbtrader
Feature: Glb Trader

  Background: Glb Trader Admin Giris
    Given   kullanici glbtrader admin sayfasina gider
    And     kullanici kullanici adı ve sifreyi girer
    And     kullanici oturum acma islemini gerceklestirir
    Then    kullanici anasayfa linkine tiklar

  @testCase01

  Scenario: TC_01_kullanici alt kategorilerde urun arama yapar
    Given kullanici MenClothing & Accessories sayfasına gider
    And   kullanıcı subCategoryHoodies alt kategorisine gider
    Then  kullanici sayfa basligini assert eder

  @testCase02

  Scenario: TC_02_kullanici filtreleme ile arama yapar
    Given kullanici MenClothing & Accessories sayfasına gider
    And   kullanıcı subCategoryTops alt kategorisine gider
    And   kullanici orders butonuna tiklar
    And   kullanici ilk urunun basligini alir ve assert eder
    And   kullanici newest butonuna tiklar
    And   kullanici newest olan ilk urunun basligini alir ve assert eder
    And   kullanici hot butonuna tiklar
    And   kullanici hot olan ilk urunun basligini alir ve assert eder
    And   kullanici featured butonuna tiklar
    And   kullanici yaziyi alir ve assert eder
    And   kullanici minprice butonuna tiklar
    And   kullanici minprice olan ilk urunun basligini alir ve assert eder
    And   kullanici maxprice butonuna tiklar
    And   kullanici maxprice olan ilk urunun basligini alir ve assert eder
    And   kullanici freeshipping butonuna tiklar
    Then  kullanici freeshipping olan ilk urunun basligini alir ve assert eder

  @testCase03
  Scenario: TC_03_kullanici filtreleme ile arama yapar
    Given kullanici MenClothing & Accessories sayfasına gider
    And   kullanıcı subCategoryTops alt kategorisine gider
    And   kullanici tshirt alt kategoriye gider
    And   kullanici price filter min kutusuna tiklar ve "1" yazar
    And   kullanici price filter max kutusuna tiklar ve "1000" yazar
    And   kullanici price filter arama butonuna tiklar
    Then  kullanici cikan urunun basligini alir ve assert eder

  @testCase04
  Scenario: TC_04_kullanici filtreleme ile arama yapar
    Given kullanici MenClothing & Accessories sayfasına gider
    And   kullanıcı subCategoryTops alt kategorisine gider
    And   kullanici tshirt alt kategoriye gider
    And   kullanici bir marka ismini secer
    And   kullanici brand filter ile arama yapar
    Then  kullanici urunun basligini alir ve assert eder

  @testCase05
  Scenario: TC_05_kullanici filtreleme ile arama yapar
    Given kullanici MenClothing & Accessories sayfasına gider
    And   kullanıcı subCategoryTops alt kategorisine gider
    And   kullanici tshirt alt kategoriye gider
    And   kullanici bir size secer
    And   kullanici size filter ile arama yapar
    Then  kullanici size arama sonucunun basligini alir ve assert eder

  @testCase06
  Scenario: TC_06_kullanici filtreleme ile arama yapar
    Given kullanici MenClothing & Accessories sayfasına gider
    And   kullanıcı subCategoryTops alt kategorisine gider
    And   kullanici tshirt alt kategoriye gider
    And   kullanici male kutusunu secer
    And   kullanici filter applicable ile arama yapar
    Then  kullanici size arama sonucunun basligini alir ve assert eder

  @testCase07
  Scenario: TC_07_kullanici satinalma sayfasinda islem yapar
    Given kullanici MenClothing & Accessories sayfasına gider
    And   kullanıcı subCategoryTops alt kategorisine gider
    And   kullanici tshirt alt kategoriye gider
    And   kullanici bir urun secer
    And   kullanici buynow butonuna tiklar
    Then  kullanici urunun eklendigini assert eder

  @testCase08
  Scenario: TC_08_kullanici satinalma sayfasinda islem yapar
    Given kullanici MenClothing & Accessories sayfasına gider
    And   kullanıcı subCategoryTops alt kategorisine gider
    And   kullanici tshirt alt kategoriye gider
    And   kullanici bir urun secer
    And   kullanici contact seller butonuna tiklar
    Then  kullanici contactus sayfasina gectigini assert eder

  @testCase09
  Scenario: TC_09_kullanici satinalma sayfasinda islem yapar
    Given kullanici MenClothing & Accessories sayfasına gider
    And   kullanıcı subCategoryTops alt kategorisine gider
    And   kullanici tshirt alt kategoriye gider
    And   kullanici bir urun secer
    And   kullanici AddToWishlist butonuna tiklar
    Then  kullanici wishlist sayfasina gectigini assert eder

  @testCase10
  Scenario: TC_10_kullanici satinalma sayfasinda islem yapar
    Given kullanici MenClothing & Accessories sayfasına gider
    And   kullanıcı subCategoryTops alt kategorisine gider
    And   kullanici tshirt alt kategoriye gider
    And   kullanici bir urun secer
    And   kullanici AddToWishlist butonuna tiklar
    Then  kullanici alert mesajini alir