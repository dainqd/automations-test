package auth.register;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.Scanner;

public class RegisterCaseTrueEmail {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "D:\\ChromeDriver\\chromedriver.exe");
        // mở trình duyệt.
        WebDriver webDriver = new ChromeDriver();
        // truy cập đến trang register
        webDriver.get("https://accounts.gometaworld.io/service/register?service=MYACCOUNT&continue=https://myaccount.gometaworld.io/");
        // tìm đến input username.
        WebElement usernameInput = webDriver.findElement(By.id("email"));
        // tìm đến password input.
        WebElement passwordInput = webDriver.findElement(By.id("password-account"));
        // tìm đến password input.
        WebElement passwordConfirmInput = webDriver.findElement(By.id("password-confirm"));
        // tìm đến check condition.
        WebElement checkCondition = webDriver.findElement(By.id("termAgree"));
        // tìm đến nút register.
        WebElement btnRegister = webDriver.findElement(By.xpath("//button[text()=\"\n" +
                "                                                        Signup\n" +
                "                                                    \"]"));
        // nhập dữ liệu vào input username.
        Scanner scan = new Scanner(System.in);
        System.out.println("Email: ");
        String email = scan.nextLine();
        usernameInput.sendKeys(email);
        // nhập dữ liệu vào input password.
        passwordInput.sendKeys("123456");
        // nhập dữ liệu vào input confirm password.
        passwordConfirmInput.sendKeys("123456");
        checkCondition.click();
        btnRegister.click();

        // mở trình duyệt.
        webDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
//        webDriver.get("https://accounts.gometaworld.io/service/register/");
        // tìm đến input verify code.
        WebElement verifyCodeInput = webDriver.findElement(By.id("verifyCode"));
        Scanner scanner = new Scanner(System.in);
        System.out.println("Code: ");
        String code = scanner.nextLine();
        // nhập dữ liệu vào input verify code.
        verifyCodeInput.sendKeys(code);
        // tìm đến nút check send.
        WebElement btnSend = webDriver.findElement(By.xpath("//button[text()=\"\n" +
                "                                                        Send\n" +
                "                                                    \"]"));
        btnSend.click();
    }
}
