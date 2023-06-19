import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class ChromeBrowserTest {

    public static void main(String[] args) {

        //Setup ChromeBrowser
        WebDriver driver = new ChromeDriver();

        //Open Url
        String baseurl = "https://www.saucedemo.com";
        driver.get(baseurl);

        //Maimise the window
        driver.manage().window().maximize();

        //Implicit wait time
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

        //Print the title of the Page
        String title = driver.getTitle();
        System.out.println("Print title"+title);

        //Print the current url
         String currentUrl = driver.getCurrentUrl();
        System.out.println("Current Url of the page" + currentUrl);

        //Print Page source
         String pageSource = driver.getPageSource();
        System.out.println("Page source is" + pageSource);

        //Enter the Username to username field
         WebElement username = driver.findElement(By.id("user-name"));
         username.sendKeys("adv@gmail.com");

         //Enter the password to password field
       WebElement password = driver.findElement(By.name("password"));
       password.sendKeys("cVad1207");

       //Close browser
        driver.close();
        }
    }
