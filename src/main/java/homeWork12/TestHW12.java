package homeWork12;

import configuration.BaseClass;
import data.DataProvider;
import data.UserBuilder;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.support.PageFactory;
import pageobjects.FormConsultation;
import pageobjects.MainPage;

public class TestHW12 extends BaseClass {
    static final String mainURL="https://ithillel.ua/courses/introduction-kiev";
    static MainPage12 mainPage= PageFactory.initElements(driver, MainPage12.class);

    @Before
    public void before(){
        if(!driver.getCurrentUrl().equals(mainURL)){
            driver.get("https://ithillel.ua/courses/introduction-kiev");
        }
    }
    @Test
    public  void TestHW12(){
       System.out.println(mainPage.getRate());
       System.out.println(mainPage.getGoals());
       System.out.println(mainPage.getDescription());
       System.out.println(mainPage.getTitle());

    }
}

