$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("C:/Users/TYSS/Desktop/punit/mavenproject/src/main/java/featurefile/loginsimpledatadriven.feature");
formatter.feature({
  "line": 1,
  "name": "gmail application",
  "description": "",
  "id": "gmail-application",
  "keyword": "Feature"
});
formatter.before({
  "duration": 23217936166,
  "status": "passed"
});
formatter.scenario({
  "line": 2,
  "name": "login to gmail application",
  "description": "",
  "id": "gmail-application;login-to-gmail-application",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "comments": [
    {
      "line": 3,
      "value": "#Given user are already in login page"
    }
  ],
  "line": 4,
  "name": "verify the login page by title",
  "keyword": "When "
});
formatter.step({
  "line": 5,
  "name": "now enter the username \"pksample4@gmail.com\" and password \"punitkumar@16\"",
  "keyword": "And "
});
formatter.step({
  "line": 6,
  "name": "get all the mail of given date",
  "keyword": "And "
});
formatter.match({
  "location": "loginPage.verifyThePage()"
});
formatter.result({
  "duration": 140335457,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "pksample4@gmail.com",
      "offset": 24
    },
    {
      "val": "punitkumar@16",
      "offset": 59
    }
  ],
  "location": "loginPage.enterTheUse(String,String)"
});
formatter.result({
  "duration": 17906721699,
  "status": "passed"
});
formatter.match({
  "location": "loginPage.get_all_the_mail_of()"
});
formatter.result({
  "duration": 18012480800,
  "status": "passed"
});
formatter.after({
  "duration": 2460974122,
  "status": "passed"
});
});