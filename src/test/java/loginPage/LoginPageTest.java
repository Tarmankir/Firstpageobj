package loginPage;

import enums.Credentials;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pages.Example;
import pages.ExampleTwo;
import pages.LoginPage;

import static enums.Credentials.TEST;

public class LoginPageTest extends ExampleTwo implements Example {

    //todo create abstract class for setting driver configuration
    //todo remove hardcoded values from test
    //todo use testng annotations (BeforeTest, BeforeMethod)
    //todo add tests

    private LoginPage loginPage;

    @BeforeTest
    void beforeTest() {
        loginPage = PageFactory.initElements(driver, LoginPage.class);
    }

    @Test
    void loginPageTest() {
        System.setProperty("webdriver.gecko.driver", "/home/knosov/IdeaProjects/N1/drivers/geckodriver");
        WebDriver driver = new FirefoxDriver();
        driver.get("https://www.rabota.ru/passport/sign-in/");


        loginPage.loginin(TEST);

        loginPage.typeLogin("artol@bk.ru");

        loginPage.typePass("test");

        loginPage.clickLogin();

        loginPage.checkUsername("test");
    }

    @Override
    public void runExample() {
        System.out.println("test");
    }
}