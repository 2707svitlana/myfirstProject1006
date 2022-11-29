package lekcia12;

import config.BaseClass;
import data.User;
import net.bytebuddy.asm.Advice;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import static org.openqa.selenium.Keys.ENTER;

public class HomeWork12 extends BaseClass {
    static String mainUrl = "https://demoqa.com/automation-practice-form";

    public static void main(String[] args) {

        BaseClass.createDriver();
        driver.get("https://demoqa.com/automation-practice-form");
        RegistrationForm();
        BaseClass.closeDriver();
    }
        private static void RegistrationForm() {
            User user=new User();
            By inputFirstNameLocator=By.id("firstName");
            By inputLastNameLocator=By.id("lastName");
            By inputEmailLocator=By.id("userEmail");
            By inputTelephoneLocator=By.id("userNumber");
            By inputSubjectsLocator=By.id("subjectsInput");

            driver.findElement(inputFirstNameLocator).sendKeys(user.getFirstname());
            driver.findElement(inputLastNameLocator).sendKeys(user.getLastname());
            driver.findElement(inputEmailLocator).sendKeys(user.getEmail());
            driver.findElement(inputTelephoneLocator).sendKeys(user.getTelephone());
            driver.findElement(inputSubjectsLocator).sendKeys(user.getSubjects());
            driver.findElement(inputSubjectsLocator).sendKeys(Keys.ENTER);
            if(driver.findElement(By.xpath("//*[@id=\"subjectsContainer\"]/div/div[1]/div[1]/div[1]")).getText().equals("Maths")){
                System.out.println("Ok");
            }
           
        }
    }

