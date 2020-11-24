$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/ComputerOffice.feature");
formatter.feature({
  "name": "Glb Trader",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@glbTraderTC08"
    }
  ]
});
formatter.scenario({
  "name": "All sublinks of  Computer  \u0026 Office must forward a customer to the true pages.",
  "description": "  //Bilgisayar ve Ofisin tüm alt bağlantıları bir müşteriyi gerçek sayfalara yönlendirmelidir.",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@glbTraderTC08"
    },
    {
      "name": "@testCase01"
    }
  ]
});
formatter.step({
  "name": "go to the link",
  "keyword": "Given "
});
formatter.match({
  "location": "glbTrader.stepdefinitions.CompeterOfficeStepDefinition.go_to_the_link(java.lang.Integer)"
});
formatter.result({
  "error_message": "io.cucumber.core.exception.CucumberException: Step [go to the link] is defined with 1 parameters at \u0027glbTrader.stepdefinitions.CompeterOfficeStepDefinition.go_to_the_link(java.lang.Integer)\u0027.\nHowever, the gherkin step has 0 arguments.\nStep text: go to the link\n\tat io.cucumber.core.runner.PickleStepDefinitionMatch.arityMismatch(PickleStepDefinitionMatch.java:134)\n\tat io.cucumber.core.runner.PickleStepDefinitionMatch.runStep(PickleStepDefinitionMatch.java:42)\n\tat io.cucumber.core.runner.TestStep.executeStep(TestStep.java:64)\n\tat io.cucumber.core.runner.TestStep.run(TestStep.java:49)\n\tat io.cucumber.core.runner.PickleStepTestStep.run(PickleStepTestStep.java:46)\n\tat io.cucumber.core.runner.TestCase.run(TestCase.java:51)\n\tat io.cucumber.core.runner.Runner.runPickle(Runner.java:67)\n\tat io.cucumber.junit.PickleRunners$NoStepDescriptions.run(PickleRunners.java:149)\n\tat io.cucumber.junit.FeatureRunner.runChild(FeatureRunner.java:83)\n\tat io.cucumber.junit.FeatureRunner.runChild(FeatureRunner.java:24)\n\tat org.junit.runners.ParentRunner$4.run(ParentRunner.java:331)\n\tat org.junit.runners.ParentRunner$1.schedule(ParentRunner.java:79)\n\tat org.junit.runners.ParentRunner.runChildren(ParentRunner.java:329)\n\tat org.junit.runners.ParentRunner.access$100(ParentRunner.java:66)\n\tat org.junit.runners.ParentRunner$2.evaluate(ParentRunner.java:293)\n\tat org.junit.runners.ParentRunner$3.evaluate(ParentRunner.java:306)\n\tat org.junit.runners.ParentRunner.run(ParentRunner.java:413)\n\tat io.cucumber.junit.Cucumber.runChild(Cucumber.java:185)\n\tat io.cucumber.junit.Cucumber.runChild(Cucumber.java:83)\n\tat org.junit.runners.ParentRunner$4.run(ParentRunner.java:331)\n\tat org.junit.runners.ParentRunner$1.schedule(ParentRunner.java:79)\n\tat org.junit.runners.ParentRunner.runChildren(ParentRunner.java:329)\n\tat org.junit.runners.ParentRunner.access$100(ParentRunner.java:66)\n\tat org.junit.runners.ParentRunner$2.evaluate(ParentRunner.java:293)\n\tat io.cucumber.junit.Cucumber$RunCucumber.evaluate(Cucumber.java:219)\n\tat org.junit.runners.ParentRunner$3.evaluate(ParentRunner.java:306)\n\tat org.junit.runners.ParentRunner.run(ParentRunner.java:413)\n\tat org.junit.runner.JUnitCore.run(JUnitCore.java:137)\n\tat com.intellij.junit4.JUnit4IdeaTestRunner.startRunnerWithArgs(JUnit4IdeaTestRunner.java:68)\n\tat com.intellij.rt.junit.IdeaTestRunner$Repeater.startRunnerWithArgs(IdeaTestRunner.java:33)\n\tat com.intellij.rt.junit.JUnitStarter.prepareStreamsAndStart(JUnitStarter.java:230)\n\tat com.intellij.rt.junit.JUnitStarter.main(JUnitStarter.java:58)\n",
  "status": "failed"
});
formatter.step({
  "name": "Please enter valid e-mail address.",
  "keyword": "And "
});
formatter.match({
  "location": "glbTrader.stepdefinitions.CompeterOfficeStepDefinition.please_enter_valid_e_mail_address(java.lang.Integer)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "Please enter the valid password.",
  "keyword": "And "
});
formatter.match({
  "location": "glbTrader.stepdefinitions.CompeterOfficeStepDefinition.please_enter_the_valid_password(java.lang.Integer)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "Click Login  Button",
  "keyword": "And "
});
formatter.match({
  "location": "glbTrader.stepdefinitions.CompeterOfficeStepDefinition.click_Login_Button(java.lang.Integer)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "Click \"GLOBAL TRADER\" logo.",
  "keyword": "And "
});
formatter.match({
  "location": "glbTrader.stepdefinitions.CompeterOfficeStepDefinition.click_logo(java.lang.Integer,java.lang.String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "Click on the Computer \u0026 Office link.",
  "keyword": "And "
});
formatter.match({
  "location": "glbTrader.stepdefinitions.CompeterOfficeStepDefinition.click_on_the_Computer_Office_link(java.lang.Integer)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "Tablets link must be clickable.",
  "keyword": "And "
});
formatter.match({
  "location": "glbTrader.stepdefinitions.CompeterOfficeStepDefinition.tablets_link_must_be_clickable(java.lang.Integer)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "Office Electroniccs link must be clickable.",
  "keyword": "And "
});
formatter.match({
  "location": "glbTrader.stepdefinitions.CompeterOfficeStepDefinition.office_Electroniccs_link_must_be_clickable(java.lang.Integer)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "Tablet Accessories link must be clickable.",
  "keyword": "And "
});
formatter.match({
  "location": "glbTrader.stepdefinitions.CompeterOfficeStepDefinition.tablet_Accessories_link_must_be_clickable(java.lang.Integer)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "External Storage link must be clickable.",
  "keyword": "And "
});
formatter.match({
  "location": "glbTrader.stepdefinitions.CompeterOfficeStepDefinition.external_Storage_link_must_be_clickable(java.lang.Integer)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "Networking link must be clickable.",
  "keyword": "And "
});
formatter.match({
  "location": "glbTrader.stepdefinitions.CompeterOfficeStepDefinition.networking_link_must_be_clickable(java.lang.Integer)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "Computer Components link must be clickable.",
  "keyword": "And "
});
formatter.match({
  "location": "glbTrader.stepdefinitions.CompeterOfficeStepDefinition.computer_Components_link_must_be_clickable(java.lang.Integer)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "Computer Perpherals link must be clickable.",
  "keyword": "And "
});
formatter.match({
  "location": "glbTrader.stepdefinitions.CompeterOfficeStepDefinition.computer_Perpherals_link_must_be_clickable(java.lang.Integer)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "Memory Cards \u0026SSD  link must be clickable.",
  "keyword": "And "
});
formatter.match({
  "location": "glbTrader.stepdefinitions.CompeterOfficeStepDefinition.memory_Cards_SSD_link_must_be_clickable(java.lang.Integer)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "Cable \u0026 Connectors link must be clickable.",
  "keyword": "And "
});
formatter.match({
  "location": "glbTrader.stepdefinitions.CompeterOfficeStepDefinition.cable_Connectors_link_must_be_clickable(java.lang.Integer)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "Mini PC  link must be clickable. 18. Demo",
  "keyword": "And "
});
formatter.match({
  "location": "glbTrader.stepdefinitions.CompeterOfficeStepDefinition.mini_PC_link_must_be_clickable_Demo(java.lang.Integer,java.lang.Integer)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "Demo Board \u0026 Accessories  link must be clickable.",
  "keyword": "And "
});
formatter.match({
  "location": "glbTrader.stepdefinitions.CompeterOfficeStepDefinition.demo_Board_Accessories_link_must_be_clickable(java.lang.Integer)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "Desktops \u0026 Servers  link must be clickable.",
  "keyword": "And "
});
formatter.match({
  "location": "glbTrader.stepdefinitions.CompeterOfficeStepDefinition.desktops_Servers_link_must_be_clickable(java.lang.Integer)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "Industrial Computer \u0026 Accessories link must be clickable.",
  "keyword": "And "
});
formatter.match({
  "location": "glbTrader.stepdefinitions.CompeterOfficeStepDefinition.industrial_Computer_Accessories_link_must_be_clickable(java.lang.Integer)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "DIY Gaming PC link must be clickable.",
  "keyword": "And "
});
formatter.match({
  "location": "glbTrader.stepdefinitions.CompeterOfficeStepDefinition.diy_Gaming_PC_link_must_be_clickable(java.lang.Integer)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "Computer Cleaners link must be clickable.",
  "keyword": "And "
});
formatter.match({
  "location": "glbTrader.stepdefinitions.CompeterOfficeStepDefinition.computer_Cleaners_link_must_be_clickable(java.lang.Integer)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "Gaming Laptops link must be clickable.",
  "keyword": "Then "
});
formatter.match({
  "location": "glbTrader.stepdefinitions.CompeterOfficeStepDefinition.gaming_Laptops_link_must_be_clickable(java.lang.Integer)"
});
formatter.result({
  "status": "skipped"
});
});