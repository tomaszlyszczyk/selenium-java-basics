import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.Test;

public class BasicTests {

    @Test
    public void SeleniumBasicTest() {
        // System.setProperty("webdriver.chrome.driver", "to_byl_chromedriver.exe");
        WebDriverManager.chromedriver().setup();
    }
}
