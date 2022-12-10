package pageobjectsHomeWork;

import data.UserHomeWork;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class FormConsultationHomeWork {
    @FindBy(id="firstName")
    WebElement firstname;
    @FindBy(id="lastName")
    WebElement secondname;
    @FindBy(id="userEmail")
    WebElement email;
    @FindBy(id="userNumber")
    WebElement tel;
    @FindBy(id="subjectsInput")
    WebElement subjects;

    public void compliteForm(UserHomeWork user){
        this.firstname.sendKeys(user.getFirstname());
        this.secondname.sendKeys(user.getSecondname());
        this.email.sendKeys(user.getEmail());
        this.tel.sendKeys(user.getTelephone());
        this.subjects.sendKeys(user.getSubjects());
        this.subjects.sendKeys(Keys.ENTER);

    }
    public void compliteForm(String firstname,String secondname, String email, String tel, String subjects){
        this.firstname.sendKeys(firstname);
        this.secondname.sendKeys(secondname);
        this.email.sendKeys(email);
        this.tel.sendKeys(tel);
        this.subjects.sendKeys(subjects);
        this.subjects.sendKeys(Keys.ENTER);

    }
}

