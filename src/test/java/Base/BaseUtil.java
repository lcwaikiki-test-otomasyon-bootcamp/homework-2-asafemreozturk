package Base;

import io.github.bonigarcia.wdm.WebDriverManager;
import Steps.AddShoppingItem;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseUtil {
    public static WebDriver driver; //Initialize driver
    public BaseUtil()
    {
        WebDriverManager.chromedriver().setup(); //Setup chrome driver
        driver = new ChromeDriver(); //Create chrome driver object
        driver.manage().window().maximize();  //Maximize browser window

    }

}
