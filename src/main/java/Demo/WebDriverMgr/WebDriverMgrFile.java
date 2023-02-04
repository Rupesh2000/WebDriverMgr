package Demo.WebDriverMgr;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebDriverMgrFile {
    public static void main(String[] args) {

        //Launch Chrome browser
        //WebDriverManager.chromedriver().setup();
        //WebDriver driver = new ChromeDriver();

        //Launch edge driver
        //WebDriverManager.edgedriver().setup();
        //WebDriver driver = new EdgeDriver();

        //Launch Firefox driver
        WebDriverManager.firefoxdriver().setup();
        WebDriver driver = new FirefoxDriver();

        //for maximize the window browser
        driver.manage().window().maximize();

        //open url
        driver.get("https://www.google.co.in/");
    }
}
