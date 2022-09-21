package auth.login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginCaseFalseByWrongPassWord {
    public static void main(String[] args) {
        // cần có để load driver.
        System.setProperty("webdriver.chrome.driver", "D:\\ChromeDriver\\chromedriver.exe");
        // mở trình duyệt.
        WebDriver webDriver = new ChromeDriver();
        // truy cập đến trang login
        webDriver.get("https://accounts.gometaworld.io/service/login?service=MYACCOUNT&continue=https://myaccount.gometaworld.io/");
        // tìm đến input username.
        WebElement usernameInput = webDriver.findElement(By.id("email"));
        // tìm đến password input.
        WebElement passwordInput = webDriver.findElement(By.id("password"));
        // tìm đến nút login.
        WebElement btnLogin = webDriver.findElement(By.xpath("//button[text()=\"Login\"]"));
        // nhập dữ liệu vào input username.
        usernameInput.sendKeys("test01@gmail.com");
        // nhập dữ liệu vào input password.
        passwordInput.sendKeys("test12334546");
        btnLogin.click();
    }
}
