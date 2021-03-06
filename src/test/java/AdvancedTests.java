import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

// Zmiana testowa

public class AdvancedTests {

    static ChromeDriver driver;
    ChromeOptions options = new ChromeOptions();

    @BeforeAll
    static void SetUpAll() {
        System.out.println("setup all");
        //         System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
        WebDriverManager.chromedriver().setup();
    }

    @BeforeEach
    public void SetUp() {
        options.addArguments("window-position=2000,0");
        driver = new ChromeDriver(options);
        driver.manage().window().maximize();
    }

    @Test
    public void SeleniumBasicTest1() throws InterruptedException {
        driver.get("https://aniagotuje.pl/");

        Assertions.assertEquals("Tomek", driver.getTitle(), "Tytul to nie Tomek");




        // wejsc w przepis

        // wypisac liczbe glosow

        // napisac komentarz - tylko wpisac tekst, nie zatwierdzac

    }

    @Test
    public void SeleniumBasicTest2() throws InterruptedException {
        driver.get("https://www.x-kom.pl/");

        // wyszukac produkt

        // wejsc na strone produktu

        // dodac do koszyka

        // przejsc do koszyka - UWAGA pop-up

        // przejsc do dostawy

    }

    @AfterEach
    public void TearDown() {
        driver.close();
    }
}
