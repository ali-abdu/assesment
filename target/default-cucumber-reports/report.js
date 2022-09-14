$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/sample.feature");
formatter.feature({
  "name": "Amazon sample test",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@wip"
    }
  ]
});
formatter.scenario({
  "name": "sample scenario",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@wip"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "user on amazon",
  "keyword": "Given "
});
formatter.match({
  "location": "sample.user_on_google()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User search for product",
  "keyword": "When "
});
formatter.match({
  "location": "sample.user_search_for_product()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Check if the model matches",
  "keyword": "Then "
});
formatter.match({
  "location": "sample.check_if_the_model_matches()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Take the screenshot of the result",
  "keyword": "And "
});
formatter.match({
  "location": "sample.take_the_screenshot_of_the_result()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});