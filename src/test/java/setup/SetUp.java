package setup;



import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class SetUp {

    public static WebDriver driver;
    @Before
    public  void setUp()
    {
        System.setProperty("webdriver.edge.driver",System.getProperty("user.dir")+"\\src\\test\\resources\\Driver\\msedgedriver.exe");
        driver=new EdgeDriver();
        driver.manage().window().maximize();
        driver.get("https://practice.automationtesting.in/");
    }

    @After
    public void teardown()
    {
        try {
            Thread.sleep(2000);
            driver.close();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }
}

