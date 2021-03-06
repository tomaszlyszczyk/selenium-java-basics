import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

// Zmiana testowa

public class AdvancedTests {

    @Test
    public void SeleniumBasicTest1() throws InterruptedException {
//         System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("window-position=2000,0");
        ChromeDriver driver = new ChromeDriver(options);
        driver.manage().window().maximize();
        driver.get("https://aniagotuje.pl/");
        driver.quit();
    }

    @Test
    public void SeleniumBasicTest2() throws InterruptedException {
//         System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("window-position=2000,0");
        ChromeDriver driver = new ChromeDriver(options);
        driver.manage().window().maximize();
        driver.get("https://www.x-kom.pl/");
        driver.quit();
    }
}
