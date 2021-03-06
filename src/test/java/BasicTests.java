import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

// Zmiana testowa

public class BasicTests {

    @Test
    public void SeleniumBasicTest() throws InterruptedException {
//         System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
        WebDriverManager.chromedriver().setup();

        ChromeOptions options = new ChromeOptions();
        options.addArguments("window-position=2000,0");

        ChromeDriver driver = new ChromeDriver(options);
        // implicit wait - globalny tlyko na find element
//        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();

//        driver.navigate().to("https://aniagotuje.pl/");
//
//        WebElement tytul = driver.findElement(By.className("logo-caption"));
//        String s = tytul.getText();
//        System.out.println(s);
//
//        WebElement przepisy = driver.findElement(By.xpath("//*[@id=\"logo-headline\"]/div[2]"));
//        System.out.println(przepisy.getText());//
//
//        WebElement tytulzlinku = driver.findElement();
//        String abc = tytulzlinku.getAttribute();
//        System.out.println(abc);

        driver.get("http://formy-project.herokuapp.com/form");

        // explicit wait - lokalny, z konkretnym warunkiem
//        WebDriverWait wait = new WebDriverWait(driver, 10);
//        wait.until(ExpectedConditions.presenceOfElementLocated(By.id("super grupa")));
//        driver.findElement(By.id("super grupa")).click();


        // zloklalizowanie pol na imie, nazwisko i prace

        WebElement imie = driver.findElement(By.id("first-name"));
        // input[id='last-name']
        WebElement nazwisko = driver.findElement(By.cssSelector("#last-name"));
        WebElement praca = driver.findElement(By.xpath("//form/div/div[3]/input"));
        imie.sendKeys("Tomek");
        nazwisko.sendKeys("Lyszczyk");
        praca.sendKeys("tester");

        Thread.sleep(5000);

        // kliknij radio button
        driver.findElement(By.id("radio-button-2")).click();

        // kliknij checkbox

        // wybierz opcje z menu
        Select experience = new Select(driver.findElement(By.cssSelector("#select-menu")));
//        experience.selectByIndex(2);
//        experience.selectByValue("3");
          experience.selectByVisibleText("5-9");

        // wpisz date
        driver.findElement(By.id("datepicker")).sendKeys("05/12/2000" + Keys.ENTER);

        // kliknij submit





//        driver.quit();
    }
}
