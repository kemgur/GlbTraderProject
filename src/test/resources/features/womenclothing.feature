@womenclothing
Feature: Glb Trader

  Background: Glb Trader Login Page
    Given user goes to the "https://www.glbtrader.com/login.html"
    And user sends valid username
    And user sends password
    Then user clicks login button

  @womenclothingdresseslinks
  Scenario:Sublink Dresses must  forward a customer to the true pages

    Given user clicks Global Trader picture button from upleft corner
    And user clicks Women Clothing & Accessories button
    And user clicks Dresses button
    And user asserts Dresses page title
    And user turns back to previous page
    And user clicks Dresses-Tassels Dresses button
    And user asserts Dresses-Tassels Dresses page title
    And user turns back to previous page
    And user turns back to previous page
    And user clicks Dresses-Pleat Dresses button
    And user asserts Dresses-Pleat Dresses page title
    And user turns back to previous page
    And user clicks Dresses-Knit Dresses button
    Then user asserts Dresses-Knit Dresses page title
