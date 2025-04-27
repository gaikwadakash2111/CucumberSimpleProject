package utils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClass {
    public static WebDriver driver;

    public static void launchBrowser() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    public static void quitBrowser() {
        if (driver != null) {
            driver.quit();
        }
    }
}