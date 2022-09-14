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
  "error_message": "java.lang.AssertionError\n\tat org.junit.Assert.fail(Assert.java:86)\n\tat org.junit.Assert.assertTrue(Assert.java:41)\n\tat org.junit.Assert.assertTrue(Assert.java:52)\n\tat cars.stepdefinitions.sample.take_the_screenshot_of_the_result(sample.java:68)\n\tat ✽.Take the screenshot of the result(file:src/test/resources/features/sample.feature:8)\n",
  "status": "failed"
});
formatter.embedding("image/png", "embedded0.png", null);
formatter.after({
  "status": "passed"
});
});