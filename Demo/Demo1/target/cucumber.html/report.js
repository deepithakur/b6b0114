$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:Feature/demo1.feature");
formatter.feature({
  "name": "login Feature",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "User enter Username And Password",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "the login page is opened",
  "keyword": "Given "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "user enters Lalitha as username",
  "keyword": "When "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "user enters password123 as password",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "user will finds a testmeapp home page",
  "keyword": "Then "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
});