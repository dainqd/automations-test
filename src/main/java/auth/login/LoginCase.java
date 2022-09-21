package auth.login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public interface LoginCase {
    public void LoginCaseTrueEmail();
    public void LoginCaseTruePhone();

    public void LoginCaseFalseByWrongUsername();
    public void LoginCaseFalseByBlankPassWord();
    public void LoginCaseFalseByWrongPassWord();

    public void LoginCaseByFacebook();
    public void LoginCaseByGoogle();
    public void LoginCaseByApple();
    public void LoginCaseByMetaMark();
}
