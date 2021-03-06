package OrangeHRM.Pages;

import OrangeHRM.Utilities.BrowserUtils;
import OrangeHRM.Utilities.ConfigurationReader;
import OrangeHRM.Utilities.Driver;
import org.openqa.selenium.By;

public final class LoginPage {

    private final By textBoxUserName = By.id("txtUsername");
    private final By textBoxPassword = By.id("txtPassword");
    private final By loginBtn = By.id("btnLogin");
    private final By spanMessage = By.id("spanMessage");

    public LoginPage enterUserName(String username){
        BrowserUtils.waitForClickablility(textBoxPassword,10);
        Driver.get().findElement(textBoxUserName).sendKeys(username);
        return this;
    }

    public LoginPage enterPassword(String password){
        Driver.get().findElement(textBoxPassword).sendKeys(password);
        return this;
    }

    public MainPage clickLoginBtn(){
        Driver.get().findElement(loginBtn).click();
        return new MainPage();
    }

    public By login(){
        return loginBtn;
    }

    public String getSpan(){
        return Driver.get().findElement(spanMessage).getText();
    }
}
