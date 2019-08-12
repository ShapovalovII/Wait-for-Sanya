import io.trueautomation.client.driver.TrueAutomationDriver;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

import static io.trueautomation.client.TrueAutomationHelper.byTa;

public class exampleTest {
    private WebDriver driver;


    @BeforeTest
    public void beforeTest() {
        driver = new TrueAutomationDriver();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
    }

    @Test
    public void exampleTest() throws InterruptedException {
        driver.get("https://translate.google.com/?hl=uk");

        driver.findElement(byTa("TA:test2")).click();
        //Locator TA taken from another from another page

    }


    @AfterTest
    public void afterTest() {
        driver.quit();
    }
}
