package pages;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class BasePage {
    protected static WebDriver driver;
    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

    static {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
    }

    public BasePage(WebDriver driver){
        BasePage.driver = driver;
    }
    public static void navigateTo(String url){
        driver.get(url);
    }
    public static void closeBrowser(){
        driver.quit();
    }
    private WebElement Find(String locator){
        return wait.until(ExpectedConditions.elementToBeClickable(By.xpath(locator)));
    }
    public void clickElement(String locator){
        Find(locator).click();
    }
    public void waitForSeconds(int seconds){
        try{
            Thread.sleep(seconds * 1000L);
        }catch (InterruptedException e){
            Thread.currentThread().interrupt();
        }
    }
}
