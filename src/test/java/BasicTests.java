import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

// Zmiana testowa

public class BasicTests {

    @Test
    public void SeleniumBasicTest() {
//         System.setProperty("webdriver.chrome.driver", "to_byl_chromedriver.exe");
        WebDriverManager.chromedriver().setup();

        ChromeOptions options = new ChromeOptions();
        options.addArguments("window-position=2000,0");

        ChromeDriver driver = new ChromeDriver(options);
        driver.manage().window().maximize();

        driver.navigate().to("https://aniagotuje.pl/");

//        driver.quit();
    }
}
