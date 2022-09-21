package auth.forgotPassword;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ForgotPasswordCase {
    public static void main(String[] args) {
        // cần có để load driver.
        System.setProperty("webdriver.chrome.driver", "D:\\ChromeDriver\\chromedriver.exe");
        // mở trình duyệt.
        WebDriver webDriver = new ChromeDriver();
        // truy cập đến trang login
        webDriver.get("https://accounts.gometaworld.io/service/forgot-password?service=MYACCOUNT&continue=https://myaccount.gometaworld.io/");
        // tìm đến input username.
        WebElement usernameInput = webDriver.findElement(By.id("email"));
        usernameInput.sendKeys("test01@gmail.com");

        // tìm đến input username.
        WebElement submit = webDriver.findElement(By.id("btn-submit-forgot-password"));
        submit.click();

        webDriver.get("https://accounts.google.com/v3/signin/identifier?dsh=S-603135289%3A1663749133816946&continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&rip=1&sacu=1&service=mail&flowName=GlifWebSignIn&flowEntry=ServiceLogin&ifkv=AQDHYWpbYg6_fy2wAzgGaV2KWmV-1Qr0b--0watLnCdAzlNTHS9-DboU3ELW01CFI9jK6wqCdVWtnA");

        WebElement email = webDriver.findElement(By.id("identifierId"));
        email.sendKeys("ngodaix5tp@gmail.com");

        WebElement btnLogin1 = webDriver.findElement(By.xpath("//span[text()=\"Next\"]"));
        btnLogin1.click();

//        tắc chưa xong được cho chặn trình duyệt ảo
    }
}
