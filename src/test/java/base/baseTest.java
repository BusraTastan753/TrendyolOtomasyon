package base;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.Properties;


public class baseTest  {

    public static WebDriver driver;
    public WebDriverWait wait;

    private Logger LOGGER = Logger.getLogger(baseTest.class);

    @Before
    public void beginTest() {
        System.setProperty("webdriver.chrome.driver", "driver/chromedriver.exe");

        ChromeOptions options = new ChromeOptions(); //Chrome ayarlarını tanımladık
        options.addArguments("--start-fullscreen");
        options.addArguments("--disable-web-security");
        options.addArguments("--no-proxy-server");

        driver = new ChromeDriver(options);
        driver.get("https://www.trendyol.com/");

        wait = new WebDriverWait(driver, 30, 1000);
    }
    @After
    public void afterTest() throws InterruptedException {
        LOGGER.info("Test finished.");
        driver.quit();
    }




}
