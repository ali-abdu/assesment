package cars.stepdefinitions;

import cars.pages.ResultsPage;
import cars.utilities.BrowserUtils;
import cars.utilities.ConfigurationReader;
import cars.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

import org.openqa.selenium.JavascriptExecutor;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class sample {
    ResultsPage resultsPage=new ResultsPage();
    @Given("user on amazon")
    public void user_on_google() {
        String url = ConfigurationReader.get("url");
        Driver.get().get(url);
    }


    @When("User search for product")
    public void user_search_for_product() throws InterruptedException {

        resultsPage.amazonSearchBox.sendKeys("LG Drain pump 4681 EA2001T");
        resultsPage.amazonSearchButtonClick.click();

        resultsPage.amazonProductSearchResult.click();

        Thread.sleep(5000);


    }

    @Then("Check if the model matches")
    public void check_if_the_model_matches() {


       if(resultsPage.checkCompatibilityModel.contains("WT7900HBA")){
           System.out.println("It is compatible!");
       }
       else {
           System.out.println("Not compatible!");
       }

    }

    @Then("Take the screenshot of the result")
    public void take_the_screenshot_of_the_result() throws IOException, InterruptedException {

        //scrolling down to payment calculator
        ((JavascriptExecutor)Driver.get()).executeScript("arguments[0].scrollIntoView (true);", resultsPage.checkCompatibilityModelScreen);

        //this method taking the screenshot of Paymemt calculator
        BrowserUtils.takeScreenshot("Compatibility");

        System.out.println("Screenchot is taken and stored in cucumber reports");
        Driver.get().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        Assert.assertFalse(resultsPage.checkCompatibilityModel.contains("WT7900HBA"));

        Thread.sleep(3000);
    }



}
