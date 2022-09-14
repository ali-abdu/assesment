package cars.stepdefinitions;

import cars.pages.BasePage;
import cars.utilities.BrowserUtils;
import cars.utilities.ConfigurationReader;
import cars.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.JavascriptExecutor;


import java.util.concurrent.TimeUnit;

public class nur extends BasePage {

    @Given("User logs in")
    public void user_logs_in() throws InterruptedException {

    String url = ConfigurationReader.get("url2");
    Driver.get().get(url);

 user.sendKeys("NurlanQA");
 pass.sendKeys("Baku2020");
 login.click();

        Thread.sleep(10000);
//        Driver.get().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//        waitUntilLoaderMaskDisappear();
//        BrowserUtils.waitForPageToLoad(10);


    }

    @When("User on main page")
    public void user_on_main_page() throws InterruptedException {

        String url1 = ConfigurationReader.get("url3");
        Driver.get().get(url1);
        Driver.get().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);


        Thread.sleep(3000);

        Driver.get().switchTo().frame("builder-iframe");

        Thread.sleep(3000);

        JavascriptExecutor jse = (JavascriptExecutor)Driver.get();
        jse.executeScript("arguments[0].click()", consoleCustomization);
        
    }

    @Then("User does some action")
    public void user_does_some_action() {


    }
}
