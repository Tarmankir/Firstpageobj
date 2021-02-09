package pages;

import enums.Credentials;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import sun.jvm.hotspot.utilities.Assert;

public class LoginPage {

    //todo rewrite constructors to methods
    //todo rewrite selectors
    //todo add gitignore and delete useless files from repository
    private WebDriver driver;

    @FindBy(css = "input[aria-label='E-mail или мобильный телефон']")
    private WebElement Login;

    @FindBy(css = "input[aria-label='Пароль']")
    private WebElement Pass;

    @FindBy(css = "button[aria-label='Войти']")
    private WebElement Button;

    @FindBy(css = "username")
    private WebElement username;

    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    public LoginPage typeLogin(String login) {
        Login.sendKeys(login);
        return this;
    }

    public LoginPage typePass(String pass) {
        Pass.sendKeys(pass);
        return this;
    }

    public void loginin(Credentials creds) {
        typeLogin(creds.login);
        typePass(creds.password);
    }

    public void clickLogin(){
        Button.click();
    }

    public void checkUsername(String test) {
        Assert.that(Boolean.parseBoolean(username.getText()), "test");
    }
}