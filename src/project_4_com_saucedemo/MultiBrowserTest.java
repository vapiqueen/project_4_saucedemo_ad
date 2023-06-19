package project_4_com_saucedemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;

public class MultiBrowserTest {
    static String browser = "Edge";

    // Set Up baseurl
    static String baseurl = "https://www.saucedemo.com";

    static WebDriver driver;

    public static void main(String[] args) {

        if(browser.equalsIgnoreCase("Edge")){
        driver=new EdgeDriver();
    }else if(browser.equalsIgnoreCase("Chrome")){
            driver=new ChromeDriver();
        } else if (browser.equalsIgnoreCase("Firefox")) {
            driver=new FirefoxDriver();
        }else{
            System.out.println("Wrong Browser Name.");

         //Open URL
         driver.get(baseurl);

         //Maximise Browser Window
            driver.manage().window().maximize();

            //Implicit wait window
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

            //Print the title of the page
             String title = driver.getTitle();
            System.out.println("Print the title"+ title);

            //Print the current url
            String currentUrl =driver.getCurrentUrl();
            System.out.println("Current URL of the page"+ currentUrl);

            //Print the page source
           String pageSource = driver.getPageSource();
            System.out.println("Page Source is"+ pageSource);

            //Enter Username in the username field
            WebElement username =driver.findElement(By.id("user-name"));
            username.sendKeys("adv@gmail.com");

            //Enter Password in password field
            WebElement password =driver.findElement(By.name("password"));
            password.sendKeys("cVad1207");

            //Close Browser
            driver.close();
        }

        }


    }
