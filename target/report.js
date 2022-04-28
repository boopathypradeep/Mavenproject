$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resource/FeatureFile.feature");
formatter.feature({
  "name": "validate login functionalities of facebook login",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "validate facebook login with valid username and password",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "user is on login page of facebook in chromebrowser",
  "keyword": "Given "
});
formatter.match({
  "location": "StepDef.user_is_on_login_page_of_facebook_in_chromebrowser()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enter valid username and password",
  "keyword": "When "
});
formatter.match({
  "location": "StepDef.user_enter_valid_username_and_password()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user clicks login button",
  "keyword": "And "
});
formatter.match({
  "location": "StepDef.user_clicks_login_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user should verify the successfull login of facebook",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDef.user_should_verify_the_successfull_login_of_facebook()"
});
formatter.result({
  "status": "passed"
});
});