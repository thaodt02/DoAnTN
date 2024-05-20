package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class DangKy {
    ChromeDriver chromeDriver;

    @BeforeMethod
    public void Setup(){
        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();

        options.addArguments("--remote-allow-origins=*");
        chromeDriver = new ChromeDriver(options);
        System.out.println("Setup");
    }

    @Test
    public void TC01(){
        System.out.println("Hello");
        chromeDriver.get("http://localhost:3000/");
        sleep(5000);
        WebElement button = chromeDriver.findElement(By.className("_extra_db591_86"));
        button.click();
        WebElement txtEmail = chromeDriver.findElement(By.id("basic_username"));
        WebElement txtPass = chromeDriver.findElement(By.id("basic_password"));
        WebElement btnDN = chromeDriver.findElement(By.xpath("/html/body/div/div/main/div/section/form/div[3]/div/div/div/div/button/span"));

        Actions action = new Actions(chromeDriver);
        action.sendKeys(txtEmail, "admin@gmail.com").build().perform();
        action.sendKeys(txtPass, "123456").build().perform();
        btnDN.click();
        sleep(10000);
    }

    @Test
    public void TC02(){
        chromeDriver.get("http://localhost:3000/");
        sleep(5000);
        WebElement button = chromeDriver.findElement(By.className("_extra_db591_86"));
        button.click();
        WebElement txtEmail = chromeDriver.findElement(By.id("basic_username"));
        WebElement txtPass = chromeDriver.findElement(By.id("basic_password"));
        WebElement btnDN = chromeDriver.findElement(By.xpath("/html/body/div/div/main/div/section/form/div[3]/div/div/div/div/button/span"));

        Actions action = new Actions(chromeDriver);
        action.sendKeys(txtEmail, "").build().perform();
        action.sendKeys(txtPass, "123456").build().perform();
        btnDN.click();
        //WebElement lbStatusMail1 = chromeDriver.findElement(By.xpath("/html/body/div/div/main/div/section/form/div[1]/div[1]/div[2]/div[2]/div[1]/div"));
        WebElement lbStatusMail = chromeDriver.findElement(By.className("ant-form-item-explain-error"));
        String lbStatusMailValue = lbStatusMail.getText();
        Assert.assertEquals(lbStatusMailValue, "Email khong duoc de trong!");
        sleep(10000);
    }

    @Test
    public void TC03(){
        chromeDriver.get("http://localhost:3000/");
        sleep(5000);
        WebElement button = chromeDriver.findElement(By.className("_extra_db591_86"));
        button.click();
        WebElement txtEmail = chromeDriver.findElement(By.id("basic_username"));
        WebElement txtPass = chromeDriver.findElement(By.id("basic_password"));
        WebElement btnDN = chromeDriver.findElement(By.xpath("/html/body/div/div/main/div/section/form/div[3]/div/div/div/div/button/span"));

        Actions action = new Actions(chromeDriver);
        action.sendKeys(txtEmail, "admin").build().perform();
        action.sendKeys(txtPass, "123456").build().perform();
        btnDN.click();
        sleep(5000);
        WebElement lbMessage = chromeDriver.findElement(By.className("ant-notification-notice-description"));
        String lbMessageValue = lbMessage.getText();
        Assert.assertEquals(lbMessageValue, "Email nhap vao khong dung dinh dang");
        sleep(10000);
    }

    @Test
    public void TC04(){
        chromeDriver.get("http://localhost:3000/");
        sleep(5000);
        WebElement button = chromeDriver.findElement(By.className("_extra_db591_86"));
        button.click();
        WebElement txtEmail = chromeDriver.findElement(By.id("basic_username"));
        WebElement txtPass = chromeDriver.findElement(By.id("basic_password"));
        WebElement btnDN = chromeDriver.findElement(By.xpath("/html/body/div/div/main/div/section/form/div[3]/div/div/div/div/button/span"));

        Actions action = new Actions(chromeDriver);
        action.sendKeys(txtEmail, "thao@gmail.com").build().perform();
        action.sendKeys(txtPass, "123456").build().perform();
        btnDN.click();
        sleep(5000);
        WebElement lbMessage = chromeDriver.findElement(By.className("ant-notification-notice-description"));
        String lbMessageValue = lbMessage.getText();
        Assert.assertEquals(lbMessageValue, "Email khong hop le");
        sleep(10000);
    }

    @Test
    public void TC05(){
        chromeDriver.get("http://localhost:3000/");
        sleep(5000);
        WebElement button = chromeDriver.findElement(By.className("_extra_db591_86"));
        button.click();
        WebElement txtEmail = chromeDriver.findElement(By.id("basic_username"));
        WebElement txtPass = chromeDriver.findElement(By.id("basic_password"));
        WebElement btnDN = chromeDriver.findElement(By.xpath("/html/body/div/div/main/div/section/form/div[3]/div/div/div/div/button/span"));

        Actions action = new Actions(chromeDriver);
        action.sendKeys(txtEmail, "admin@gmail.com").build().perform();
        action.sendKeys(txtPass, "").build().perform();
        btnDN.click();
        //WebElement lbStatusPass1 = chromeDriver.findElement(By.xpath("/html/body/div/div/main/div/section/form/div[1]/div[1]/div[2]/div[2]/div[1]/div"));
        WebElement lbStatusPass = chromeDriver.findElement(By.className("ant-form-item-explain-error"));
        String lbStatusPassValue = lbStatusPass.getText();
        Assert.assertEquals(lbStatusPassValue, "Mat khau khong duoc de trong!");
        sleep(10000);
    }

    @Test
    public void TC06(){
        chromeDriver.get("http://localhost:3000/");
        sleep(5000);
        WebElement button = chromeDriver.findElement(By.className("_extra_db591_86"));
        button.click();
        WebElement txtEmail = chromeDriver.findElement(By.id("basic_username"));
        WebElement txtPass = chromeDriver.findElement(By.id("basic_password"));
        WebElement btnDN = chromeDriver.findElement(By.xpath("/html/body/div/div/main/div/section/form/div[3]/div/div/div/div/button/span"));

        Actions action = new Actions(chromeDriver);
        action.sendKeys(txtEmail, "admin@gmail.com").build().perform();
        action.sendKeys(txtPass, " 123456 ").build().perform();
        btnDN.click();
        sleep(5000);
        WebElement lbMessage = chromeDriver.findElement(By.className("ant-form-item-explain-error"));
        String lbMessageValue = lbMessage.getText();
        Assert.assertEquals(lbMessageValue, "Mat khau nhap vao khong dung");
        sleep(10000);
    }

    @Test
    public void TC07(){
        chromeDriver.get("http://localhost:3000/");
        sleep(5000);
        WebElement button = chromeDriver.findElement(By.className("_extra_db591_86"));
        button.click();
        WebElement txtEmail = chromeDriver.findElement(By.id("basic_username"));
        WebElement txtPass = chromeDriver.findElement(By.id("basic_password"));
        WebElement btnDN = chromeDriver.findElement(By.xpath("/html/body/div/div/main/div/section/form/div[3]/div/div/div/div/button/span"));

        Actions action = new Actions(chromeDriver);
        action.sendKeys(txtEmail, "admin@gmail.com").build().perform();
        action.sendKeys(txtPass, "12345678").build().perform();
        btnDN.click();
        sleep(5000);
        WebElement lbMessage = chromeDriver.findElement(By.className("ant-notification-notice-description"));
        String lbMessageValue = lbMessage.getText();
        Assert.assertEquals(lbMessageValue, "Mat khau nhap vao khong dung");
        sleep(10000);
    }

    @Test
    public void TC08(){
        chromeDriver.get("http://localhost:3000/");
        sleep(5000);
        WebElement button = chromeDriver.findElement(By.className("_extra_db591_86"));
        button.click();
        WebElement txtEmail = chromeDriver.findElement(By.id("basic_username"));
        WebElement txtPass = chromeDriver.findElement(By.id("basic_password"));
        WebElement btnDN = chromeDriver.findElement(By.xpath("/html/body/div/div/main/div/section/form/div[3]/div/div/div/div/button/span"));

        Actions action = new Actions(chromeDriver);
        action.sendKeys(txtEmail, "admin123@gmail.com").build().perform();
        action.sendKeys(txtPass, "12345678").build().perform();
        btnDN.click();
        sleep(5000);
        WebElement lbMessage = chromeDriver.findElement(By.className("ant-notification-notice-description"));
        String lbMessageValue = lbMessage.getText();
        Assert.assertEquals(lbMessageValue, "Email va mat khau nhap vao khong dung");
        sleep(10000);
    }

    @Test
    public void TC09(){
        chromeDriver.get("http://localhost:3000/");
        sleep(5000);
        WebElement button = chromeDriver.findElement(By.className("_extra_db591_86"));
        button.click();
        WebElement txtEmail = chromeDriver.findElement(By.id("basic_username"));
        WebElement txtPass = chromeDriver.findElement(By.id("basic_password"));
        WebElement btnDN = chromeDriver.findElement(By.xpath("/html/body/div/div/main/div/section/form/div[3]/div/div/div/div/button/span"));

        Actions action = new Actions(chromeDriver);
        action.sendKeys(txtEmail, "admin123@gmail.com").build().perform();
        action.sendKeys(txtPass, "123456").build().perform();
        btnDN.click();
        sleep(5000);
        WebElement lbMessage = chromeDriver.findElement(By.className("ant-notification-notice-description"));
        String lbMessageValue = lbMessage.getText();
        Assert.assertEquals(lbMessageValue, "Email nhap vao khong dung");
        sleep(10000);
    }

    @AfterMethod
    public void Cleanup(){
        //WebElement button = chromeDriver.findElement(By.xpath("/html/body/div[2]/div/ul/li[3]/span[2]/label"));
        chromeDriver.quit();
        System.out.println("bye");
    }

    private void sleep(int time){
        try{
            Thread.sleep(time);
        }catch (Exception ex){
            System.out.print(ex.getMessage());
        }
    }
}
