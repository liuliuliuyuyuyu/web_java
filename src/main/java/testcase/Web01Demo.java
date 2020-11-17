package testcase;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Web01Demo {
    private WebDriver driver;
    @BeforeTest
    public void beforeTest() {
        //get网页
        driver.get("http://114.115.205.214:8686/Ecan_Platform/loginAction!login_page.action");
    }
    @AfterTest
    public void afterTest() {
        driver.quit();
    }
    @Test
    public void test_demo01() throws InterruptedException {
        driver.findElement(By.id("userid")).sendKeys("00");
        driver.findElement(By.id("password")).sendKeys("1");
        driver.findElement(By.id("loginButton")).click();
        System.out.println("success");
        Thread.sleep(6000);
    }
}
