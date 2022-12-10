package testsHomeWork;

import configuration.BaseClass;
import data.UserHomeWork;
import org.junit.Test;
import org.openqa.selenium.support.PageFactory;
import pageobjectsHomeWork.FormConsultationHomeWork;


public class FormTestHomeWork extends BaseClass {

        static FormConsultationHomeWork formConsultation=PageFactory.initElements(driver, FormConsultationHomeWork.class);
        @Test
        public  void formTest(){
            driver.get("https://demoqa.com/automation-practice-form");

            formConsultation.compliteForm(new UserHomeWork());

        }
    }


