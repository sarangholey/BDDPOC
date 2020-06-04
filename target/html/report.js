$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("features/LandingPage.feature");
formatter.feature({
  "name": "Landing page features",
  "description": "  This feature file contains landing page features",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@landingPage"
    }
  ]
});
formatter.scenario({
  "name": "Validate title of the landing page",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@landingPage"
    },
    {
      "name": "@landingPageTitle"
    }
  ]
});
formatter.step({
  "name": "Browser opened and url entered",
  "keyword": "Given "
});
formatter.match({
  "location": "LandingPageTest.browser_opened_and_url_entered()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Landing page is loaded and I validate the title",
  "keyword": "When "
});
formatter.match({
  "location": "LandingPageTest.Landing_page_is_loaded_and_I_validate_the_title()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I closed the browser",
  "keyword": "Then "
});
formatter.match({
  "location": "LandingPageTest.I_closed_the_browser()"
});
formatter.result({
  "status": "passed"
});
});