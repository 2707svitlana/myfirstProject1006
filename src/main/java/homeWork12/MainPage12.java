package homeWork12;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class MainPage12 {
    @FindBy(xpath = "//div[contains(@class,'descriptor_title')]")
    WebElement Title;
    @FindBy(xpath = "//*[@id=\"body\"]/div[1]/main/section[1]/div[3]/div/div/div[2]/div/span")
    WebElement Rate;
    @FindBy(xpath = "//*[@id=\"body\"]/div[1]/main/section[2]/div/div/div[1]/div[2]/div/p")

    WebElement Description;
    @FindBy(xpath="//*[@id=\"body\"]/div[1]/main/section[2]/div/div/div[1]/div[2]/div/div/h3")
    WebElement Goals;

    public String getTitle() {return Title.getText();}

    public String getRate() {return Rate.getText();}

    public String getDescription() {return Description.getText();}

    public String getGoals() {return Goals.getText();}


}
