package config;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClass {

    public static WebDriver driver;

    public static void createDriver(){
        if(driver==null){
            driver=new ChromeDriver();
        }
        driver.manage().window().maximize();
    }

    public static void closeDriver() {
        if(driver!=null){
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            driver.quit();
        }

    }
}
