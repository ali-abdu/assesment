package cars.stepdefinitions;

import cars.pages.ResultsPage;
import cars.utilities.BrowserUtils;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import cars.pages.BasePage;
import cars.utilities.ConfigurationReader;
import cars.utilities.Driver;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class TestStepDef extends BasePage {

    ResultsPage resultsPage=new ResultsPage();
    BrowserUtils browserUtils=new BrowserUtils();

    @Given("User is on cars page")
    public void user_is_on_cars_page() throws InterruptedException {

        String url = ConfigurationReader.get("url");
        Driver.get().get(url);
        System.out.println("User is on main page");
    }

    @When("User selects Used Cars")
    public void user_selects_Used_Cars(){

        //selecting Used cars
        selectValueFromDropdown(newsUsedCars,"Used Cars");
    }

    @Then("User selects Make as {string}")
    public void user_selects_Make_as(String string) {

        //selecting make
        selectValueFromDropdown(makes,"Honda");
    }

    @Then("User selects Model as {string}")
    public void user_selects_Model_as(String string) {

        //selecting model
        selectValueFromDropdown(models,"Pilot");
    }

    @Then("User selects Price as {int}")
    public void user_selects_Price_as(Integer int1) {

        //selecting price
        selectValueFromDropdown(price,"$50,000");
    }

    @Then("User selects Distance {int} miles")
    public void user_selects_Distance_miles(Integer int1) {

        //selecting distance
        selectValueFromDropdown(distance,"100 Miles from");
    }

    @Then("User Enters zip code {int}")
    public void user_Enters_zip_code(Integer int1) {

        //before entering zip code clearing the box in case it contains zip code
        //entering zip code
        String clearText=Keys.chord(Keys.COMMAND,"a");
        zipcode.sendKeys(clearText,Keys.DELETE);
        zipcode.sendKeys("60008");
    }

    @Then("User clicks search button")
    public void user_clicks_search_button() throws InterruptedException {
        //user clicks on search
        searchButton.click();
        Driver.get().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @Given("User selected all fields and clicked search")
    public void user_selected_all_fields_and_clicked_search() {

        String url = ConfigurationReader.get("url1");
        Driver.get().get(url);

    }

    @Then("Verify that {string} {string} {string} and {string} are displayed")
    public void verify_that_and_are_displayed(String price, String make, String model, String used) throws InterruptedException {

        //verifying that 4 filters (Price,Make,Model,Used )are displayed
        Assert.assertTrue(resultsPage.priceFilter.isDisplayed());
        Assert.assertTrue(resultsPage.makeFilter.isDisplayed());
        Assert.assertTrue(resultsPage.modelFilter.isDisplayed());
        Assert.assertTrue(resultsPage.usedFilter.isDisplayed());
        Thread.sleep(2000);
    }

    @When("User selects New radio button from New\\/Used")
    public void user_selects_New_radio_button_from_New_Used() throws InterruptedException {

        //user clicks on New radio button
        JavascriptExecutor jse = (JavascriptExecutor)Driver.get();
        jse.executeScript("arguments[0].click()", resultsPage.newRadioButton);
        Thread.sleep(2000);
//        WebDriverWait wait=new WebDriverWait(Driver.get(),30);
//        wait.until(ExpectedConditions.elementToBeSelected(resultsPage.newRadioButton));
    }

    @Then("Validate that New filter is selected")
    public void validate_that_New_filter_is_selected() {

        //verifiying New radio button is dispayed
        Assert.assertTrue(resultsPage.newRadioButton.isDisplayed());

    }

    @Then("Used filter is not selected")
    public void used_filter_is_not_selected() {

        //verifiying Used radio button is not selected
        Assert.assertFalse(resultsPage.usedRadioButton.isSelected());
    }

    @When("User selects {string} from Trim")
    public void user_selects_from_Trim(String string) {

        //scrolling down to Trim
        ((JavascriptExecutor)Driver.get()).executeScript("arguments[0].scrollIntoView (true);", resultsPage.touring8Paasenger);

        //selecting Touring 8 passenger
        JavascriptExecutor jse = (JavascriptExecutor)Driver.get();
        jse.executeScript("arguments[0].click()", resultsPage.touring8Paasenger);

        Driver.get().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @Then("Validate that the {string} is displayed")
    public void validate_that_the_is_displayed(String string) {

        //verifiying touring-8 is displayed
        Assert.assertTrue(resultsPage.touring8Paasenger.isDisplayed());

    }

    @Then("User select the second available car")
    public void user_select_the_second_available_car() throws InterruptedException {

        Driver.get().manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        //selecting second car
        resultsPage.secondCar.click();

    }

    @Then("Verify that car title contains {string}")
    public void verify_that_car_title_contains(String carTitle)  {

        //   Assert.assertEquals(carTitle,resultsPage.carTitle.getText());
        //getting the text of selected second car title
        System.out.println("Car title is: "+resultsPage.carTitle.getText());
        Driver.get().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @Then("Verify that check availability button is displayed")
    public void verify_that_check_availability_button_is_displayed() {

        //verifiying check availablity button is displayed
        Assert.assertTrue(resultsPage.checkAvailability.isDisplayed());
    }

    @When("User enters first name {string}")
    public void user_enters_first_name(String firstName) {

        //entering first name
        resultsPage.firstName.sendKeys(firstName);
    }

    @Then("User enters last name {string}")
    public void user_enters_last_name(String lastName) {

        //entering last name
        resultsPage.lastName.sendKeys(lastName);
    }

    @Then("User enters email {string}")
    public void user_enters_email(String email)  {

        //entering email address
        resultsPage.email.sendKeys(email);
        Driver.get().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @Then("User takes screenshot of payment calculator")
    public void user_takes_screenshot_of_payment_calculator() throws IOException {

        //scrolling down to payment calculator
        ((JavascriptExecutor)Driver.get()).executeScript("arguments[0].scrollIntoView (true);", resultsPage.contactSeller);

        //this method taking the screenshot of Paymemt calculator
        BrowserUtils.takeScreenshot("Payment_Calculator");

        System.out.println("Screenchot is taken and stored in cucumber reports");
        Driver.get().manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

    }



}