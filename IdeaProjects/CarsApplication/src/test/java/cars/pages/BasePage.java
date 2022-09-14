package cars.pages;

import cars.utilities.Driver;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class BasePage {

    private static Logger logger = Logger.getLogger(BasePage.class);

    @FindBy(name = "stockType")
    public WebElement newsUsedCars;

    @FindBy(name = "makeId")
    public WebElement makes;

    @FindBy(name = "modelId")
    public WebElement models;

    @FindBy(name = "priceMax")
    public WebElement price;

    @FindBy(name = "radius")
    public WebElement distance;

    @FindBy(xpath = "//input[@type='tel']")
    public WebElement zipcode;

    @FindBy(xpath = "//input[@type='submit']")
    public WebElement searchButton ;



    
    @FindBy(id = "login")
    public WebElement user;
    @FindBy(id = "password")
    public WebElement pass;
    @FindBy(id = "loginSubmit")
    public WebElement login;

    @FindBy(xpath = "(//button/span[@class='visuallyhidden'])[1]")
    public WebElement consoleCustomization;






    public static void selectValueFromDropdown(WebElement element,String value){
        Select select=new Select(element);
        select.selectByVisibleText(value);
    }


    public BasePage() {
        //this method requires to provide webdriver object for @FindBy
        //and page class
        //this means this page class
        PageFactory.initElements(Driver.get(), this);
    }

    public boolean waitUntilLoaderMaskDisappear() {
        WebDriverWait wait = new WebDriverWait(Driver.get(), 30);
        try {
            wait.until(ExpectedConditions.invisibilityOfElementLocated(By.cssSelector("div[class='loader-mask shown']")));
            return true;
        } catch (NoSuchElementException e) {
            logger.warn("Loader mask not found!");
            e.printStackTrace();
            return true; // no loader mask, all good, return true
        } catch (WebDriverException e) {
            e.printStackTrace();
            logger.error(e.getMessage());
        }
        return false;
    }


}