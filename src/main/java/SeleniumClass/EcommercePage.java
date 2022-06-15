package SeleniumClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;

public class EcommercePage {
    static WebDriver driver = null;

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "/Users/tamanna/Desktop/Tamanna/Java/FirstSampleSelenium/src/main/resources/Driver/chromedriver");
        driver = new ChromeDriver();
        driver.manage().window().fullscreen();

        driver.get("https://www.demoblaze.com/");


        Thread.sleep(2000);

        String title = driver.getTitle();
        System.out.println("Title is " + title);


        if (title.equals("STORE")) {
            System.out.println("Page opened successfully");
        } else {
            System.out.println("Page cannot be opened");
        }


        driver.findElement(By.id("login2")).click();

        Thread.sleep(2000);

        driver.findElement(By.id("loginusername")).sendKeys("Tamima");
        driver.findElement(By.id("loginpassword")).sendKeys("Tamima123");

        Thread.sleep(2000);

        driver.findElement(By.xpath("//button[@onclick='logIn()']")).click();



//        Thread.sleep(2000);
//        driver.findElement(By.id("signin2")).click();
//
//        Thread.sleep(2000);
//        driver.findElement(By.id("sign-username")).sendKeys("Tamima");
//        driver.findElement(By.id("sign-password")).sendKeys("Tamima123");
//
//        Thread.sleep(2000);
//        driver.findElement(By.xpath("//button[@onclick = 'register()']")).click();
//        Thread.sleep(2000);
//        driver.switchTo().alert().accept();
//        Thread.sleep(2000);
//        driver.findElement(By.xpath("(//button[text() = 'Close'])[2]")).click();

//        For Samsung galaxy s6
        Thread.sleep(2000);
        driver.findElement(By.xpath("//a[text() = 'Samsung galaxy s6']")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//a[@onclick = 'addToCart(1)']")).click();

        Thread.sleep(2000);
        driver.switchTo().alert().accept();
        Thread.sleep(2000);
        driver.navigate().back();
        Thread.sleep(2000);
        driver.navigate().back();

//
////        For NOKIA
//        Thread.sleep(2000);
//        driver.findElement(By.xpath("//a[text() = 'Nokia lumia 1520']")).click();
//        Thread.sleep(3000);
//        driver.findElement(By.xpath("//a[@onclick = 'addToCart(2)']")).click();
//
//        Thread.sleep(2000);
//        driver.switchTo().alert().accept();
//        Thread.sleep(1000);
//        driver.findElement(By.xpath("(//a[@href = 'index.html']) [2]")).click();
//
//        //For NEXUS
//        Thread.sleep(2000);
//        driver.findElement(By.xpath("//a[text() = 'Nexus 6']")).click();
//        Thread.sleep(3000);
//        driver.findElement(By.xpath("//a[@onclick = 'addToCart(3)']")).click();
//
//        Thread.sleep(2000);
//        driver.switchTo().alert().accept();
//        Thread.sleep(1000);
//        driver.findElement(By.xpath("(//a[@href = 'index.html']) [2]")).click();
//
//
//        //For Samsung galaxy s7
//        Thread.sleep(2000);
//        driver.findElement(By.xpath("//a[text() = 'Samsung galaxy s7']")).click();
//        Thread.sleep(3000);
//        driver.findElement(By.xpath("//a[@onclick = 'addToCart(4)']")).click();
//
//        Thread.sleep(2000);
//        driver.switchTo().alert().accept();
//        Thread.sleep(1000);
//        driver.findElement(By.xpath("(//a[@href = 'index.html']) [2]")).click();
//
//
//        //For Iphone 6 32gb
//        Thread.sleep(2000);
//        driver.findElement(By.xpath("//a[text() = 'Iphone 6 32gb']")).click();
//        Thread.sleep(3000);
//        driver.findElement(By.xpath("//a[@onclick = 'addToCart(5)']")).click();
//
//        Thread.sleep(2000);
//        driver.switchTo().alert().accept();
//        Thread.sleep(1000);
//        driver.findElement(By.xpath("(//a[@href = 'index.html']) [2]")).click();
//
//
//        //For Sony xperia z5
//        Thread.sleep(2000);
//        driver.findElement(By.xpath("//a[text() = 'Sony xperia z5']")).click();
//        Thread.sleep(3000);
//        driver.findElement(By.xpath("//a[@onclick = 'addToCart(6)']")).click();
//
//        Thread.sleep(2000);
//        driver.switchTo().alert().accept();
//        Thread.sleep(1000);
//        driver.findElement(By.xpath("(//a[@href = 'index.html']) [2]")).click();
//
//
//        //For HTC One M9
//        Thread.sleep(2000);
//        driver.findElement(By.xpath("//a[text() = 'HTC One M9']")).click();
//        Thread.sleep(3000);
//        driver.findElement(By.xpath("//a[@onclick = 'addToCart(7)']")).click();
//        Thread.sleep(2000);
//        driver.switchTo().alert().accept();
//        Thread.sleep(2000);
//        driver.navigate().back();
//        Thread.sleep(2000);
//        driver.navigate().back();
//
//
//        //For Sony vaio i5
//        Thread.sleep(2000);
//        driver.findElement(By.xpath("//a[text() = 'Sony vaio i5']")).click();
//        Thread.sleep(3000);
//        driver.findElement(By.xpath("//a[@onclick = 'addToCart(8)']")).click();
//
//        Thread.sleep(2000);
//        driver.switchTo().alert().accept();
//        Thread.sleep(1000);
//        driver.findElement(By.xpath("(//a[@href = 'index.html']) [2]")).click();
//
//
        //For Sony vaio i7
        Thread.sleep(2000);
        driver.findElement(By.xpath("(//a[@class = 'hrefch'])[9]")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//a[@onclick = 'addToCart(9)']")).click();
        Thread.sleep(2000);
        driver.switchTo().alert().accept();

//        //Cart
        Thread.sleep(3000);
        driver.findElement(By.id("cartur")).click();
        Thread.sleep(1000);

       // WebElement category = driver.findElement(By.xpath("//a[@id = 'itemc']"));

        List<WebElement> categories =  driver.findElements(By.xpath("//tbody/tr/td[3]"));
        int sum = 0;
        int[] list = null;
        for ( WebElement el : categories) {

            String str = el.getText();
            System.out.println(str);
            int price = Integer.parseInt(str);
            sum = sum + price;

        }

        System.out.println("Total price of the products are: " + sum);
        Thread.sleep(2000);

        if (sum == 6020) {
            System.out.println("All the products are added successfully");
        } else {
            System.out.println(" All the products are not added");
        }

//
//        //Finished
//        Thread.sleep(3000);
//        driver.findElement(By.xpath("(//a[@href = 'index.html']) [2]")).click();
//        Thread.sleep(5000);
//        driver.close();





//                categories.get(1).click();

                }


}




