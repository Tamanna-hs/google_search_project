package SeleniumClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SeleniumDemo {

     public static void main(String[] args) throws InterruptedException {

         System.setProperty("webdriver.chrome.driver", "/Users/tamanna/Desktop/Tamanna/Java/FirstSampleSelenium/src/main/resources/Driver/chromedriver");
         WebDriver driver= new ChromeDriver();
         driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/validateCredentials");

         Thread.sleep(5000);

         String title = driver.getTitle();

         if (title.equals("Google")){
             System.out.println("Browser launched sucessfully");
         }
         else {
             System.out.println("Browser cannot be launched");
         }

         driver.findElement(By.name("q")).sendKeys("Selenium");

         System.out.println("Hello Hello");


         System.out.println("Hello Hello");


//         driver.findElement(By.xpath("(//input[id() = 'txtUsername'])[1]")).click();
         driver.findElement(By.id("txtUsername")).sendKeys("Admin");
         driver.findElement(By.id("txtPassword")).sendKeys("admin123");
         driver.findElement(By.name("Submit")).click();


         System.out.println("Hello Hello");

         Thread.sleep(5000);
         System.out.println("Hello Hello");


         driver.close();

//         System.setProperty("webdriver.gecko.driver", "/Users/tamanna/Desktop/Tamanna/Java/FirstSampleSelenium/src/main/resources/Driver/geckodriver");
//         WebDriver driver1 = new FirefoxDriver();
//         driver1.get("https://www.google.com/");
//         driver1.close();

         //button[text() ='Close']/parent::div/parent::div/parent::div/parent::div/parent::body/div[2]/div/div/div[3]/button[text() = 'Close']



    }
}
