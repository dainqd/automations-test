package auth.register;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.Scanner;

public class RegisterCaseTruePhone {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "D:\\ChromeDriver\\chromedriver.exe");
        // mở trình duyệt.
        WebDriver webDriver = new ChromeDriver();
        // truy cập đến trang register
        webDriver.get("https://accounts.gometaworld.io/service/register?service=MYACCOUNT&continue=https://myaccount.gometaworld.io/");
        // tìm đến  phone.
        WebElement phone = webDriver.findElement(By.id("pills-phone-tab"));
        // Chuyển đến login by phone
        phone.click();

        webDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        // tìm đến input phone.
        WebElement phoneInput = webDriver.findElement(By.id("phoneInput"));
        // nhập dữ liệu vào input phone.
        phoneInput.sendKeys("+84388111888");

        webDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        // tìm đến send otp.
        WebElement sendOTP = webDriver.findElement(By.id("btn-send-otp"));
        sendOTP.click();

        webDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        // tìm đến verifyCode input.
        WebElement verifyCodeInput = webDriver.findElement(By.id("verifyCode"));
        // tìm đến check condition.
        WebElement checkCondition = webDriver.findElement(By.id("termAgree-1"));

        // nhập dữ liệu vào input verifyCode.
        Scanner scan = new Scanner(System.in);
        System.out.println("Code: ");
        String code = scan.nextLine();
        verifyCodeInput.sendKeys(code);
        checkCondition.click();

        // tìm đến nút signup.
        WebElement btnSignup = webDriver.findElement(By.id("btn-submit-login-by-phone"));
        btnSignup.click();
    }
}
