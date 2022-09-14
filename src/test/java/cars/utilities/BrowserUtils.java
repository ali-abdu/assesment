package cars.utilities;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.File;
import java.io.IOException;

public class BrowserUtils {

//    public static void waitForPageToLoad(long timeOutInSeconds) {
//        ExpectedCondition<Boolean> expectation = driver -> ((JavascriptExecutor) driver).
//                executeScript("return document.readyState").equals("complete");
//        try {
//            WebDriverWait wait = new WebDriverWait(Driver.get(), timeOutInSeconds);
//            wait.until(expectation);
//        } catch (Throwable error) {
//            error.printStackTrace();
//        }
//    }

    public static void takeScreenshot(String fileName) throws IOException {

        File file=((TakesScreenshot)Driver.get()).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(file,new File("/Users/aliabdullayev/IdeaProjects/CarsApplication/target/default-cucumber-reports/"+fileName+".jpg"));
    }

}