package cars.pages;

import cars.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class ResultsPage {

    //****************************************************************

    //AMAZON
    @FindBy(id = "twotabsearchtextbox")
    public WebElement amazonSearchBox;

    @FindBy(id = "nav-search-submit-button")
    public WebElement amazonSearchButtonClick;

    @FindBy(xpath = "//img[@alt='Sponsored Ad - 4681EA2001T Washer Drain Pump Motor by Beaquicy - Replacement part for Ken-more and L-G Washing Machine (OE...']")
    public WebElement amazonProductSearchResult;

    @FindBy(xpath = "//p[@class='a-spacing-base'][4]")
    public List<WebElement > checkCompatibilityModel;

    @FindBy(xpath = "//div[@class='aplus-module-wrapper aplus-3p-fixed-width']")
    public WebElement checkCompatibilityModelScreen;

    //****************************************************************



    @FindBy(xpath = "//li/label[contains(text(),'Maximum Price:')]")
    public WebElement priceFilter;

    @FindBy(xpath = "//li/label[contains(text(),'Honda')]")
    public WebElement makeFilter;

    @FindBy(xpath = "//li/label[contains(text(),'Pilot')]")
    public WebElement modelFilter;

    @FindBy(xpath = "//li/label[contains(text(),'Used')]")
    public WebElement usedFilter;

    @FindBy(xpath = "//label[@for='stkTypId-28880']")
    public WebElement newRadioButton;


    @FindBy(xpath = "//label[@for='stkTypId-28881']")
    public WebElement usedRadioButton;

    @FindBy(xpath = "//label[@for='trId-36434822']")
    public WebElement touring8Paasenger;

    @FindBy(xpath = "(//h2[@class='listing-row__title'])[2]")
    public WebElement secondCar;

    @FindBy(xpath = "//h1[@class='cui-heading-2--secondary vehicle-info__title']")
    public WebElement carTitle;

    @FindBy(xpath = "//button[contains(text(),'Check Availability')]")
    public WebElement checkAvailability;

    @FindBy(name = "fname")
    public WebElement firstName;

    @FindBy(name = "lname")
    public WebElement lastName;

    @FindBy(name = "email")
    public WebElement email;



    @FindBy(xpath = "//a[contains(text(),'Contact Seller']")
    public WebElement contactSeller;

    public ResultsPage() {
        //this method requires to provide webdriver object for @FindBy
        //and page class
        //this means this page class
        PageFactory.initElements(Driver.get(), this);
    }


}