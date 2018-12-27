$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("C:/Users/TYSS/Desktop/punit/mavenproject/src/main/java/featurefile/examplegroup.feature");
formatter.feature({
  "comments": [
    {
      "line": 1,
      "value": "#@FunctionalTest"
    }
  ],
  "line": 2,
  "name": "ECommerce Application",
  "description": "",
  "id": "ecommerce-application",
  "keyword": "Feature"
});
formatter.before({
  "duration": 22891643080,
  "status": "passed"
});
formatter.scenario({
  "line": 9,
  "name": "UnSuccessful Login",
  "description": "",
  "id": "ecommerce-application;unsuccessful-login",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 8,
      "name": "@RegressionTest"
    }
  ]
});
formatter.step({
  "line": 10,
  "name": "This is a blank test",
  "keyword": "Given "
});
formatter.match({
  "location": "loginPage.This_is_a_blank_test()"
});
formatter.result({
  "duration": 74397799,
  "status": "passed"
});
formatter.after({
  "duration": 2316175246,
  "status": "passed"
});
});