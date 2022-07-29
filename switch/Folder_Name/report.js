$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/java/CucuSwitch/Background.feature");
formatter.feature({
  "name": "Test the background feature in AUT",
  "description": "",
  "keyword": "Feature"
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.step({
  "name": "User is on EDU Teller Login Page",
  "keyword": "Given "
});
formatter.match({
  "location": "Background.user_is_on_EDU_Teller_Login_Page()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "User checks for Add Money",
  "keyword": "When "
});
formatter.match({
  "location": "Background.user_checks_for_Add_Money()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Enter Account number details and Search",
  "keyword": "Then "
});
formatter.match({
  "location": "Background.enter_Account_number_details_and_Search()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Closes",
  "keyword": "And "
});
formatter.match({
  "location": "Background.closes()"
});
formatter.result({
  "status": "passed"
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.step({
  "name": "User is on EDU Teller Login Page",
  "keyword": "Given "
});
formatter.match({
  "location": "Background.user_is_on_EDU_Teller_Login_Page()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "User checks for My Customers",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "The user checks for My Customers link",
  "keyword": "When "
});
formatter.match({
  "location": "Background.the_user_checks_for_My_Customers_link()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "All Customer details displayed",
  "keyword": "Then "
});
formatter.match({
  "location": "Background.all_Customer_details_displayed()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Closes The Browser",
  "keyword": "And "
});
formatter.match({
  "location": "Background.closes_The_Browser()"
});
formatter.result({
  "status": "passed"
});
});