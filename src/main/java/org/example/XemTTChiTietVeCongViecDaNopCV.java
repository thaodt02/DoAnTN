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

public class XemTTChiTietVeCongViecDaNopCV {
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
    public void TC01()
    {
        chromeDriver.get("http://localhost:3000/");
        sleep(5000);
        WebElement button = chromeDriver.findElement(By.className("_extra_db591_86"));
        button.click();
        WebElement txtEmail = chromeDriver.findElement(By.id("basic_username"));
        WebElement txtPass = chromeDriver.findElement(By.id("basic_password"));
        WebElement btnDN = chromeDriver.findElement(By.xpath("/html/body/div/div/main/div/section/form/div[3]/div/div/div/div/button"));

        Actions action = new Actions(chromeDriver);
        action.sendKeys(txtEmail, "abcd@gmail.com").build().perform();
        action.sendKeys(txtPass, "123456").build().perform();
        btnDN.click();
        sleep(5000);

        WebElement LinkWelcome = chromeDriver.findElement(By.className("ant-space-item"));
        LinkWelcome.click();
        sleep(5000);

        WebElement TabQLTK = chromeDriver.findElement(By.xpath("/html/body/div[2]/div/ul/li[1]/span[2]/label"));
        TabQLTK.click();
        sleep(5000);

        WebElement btnXemChiTiet = chromeDriver.findElement(By.xpath("/html/body/div[3]/div/div[2]/div/div[2]/div[2]/div/div/div[2]/div/div/div/div/div/div/div/div/div/table/tbody/tr[24]/td[6]/a"));
        btnXemChiTiet.click();
        sleep(5000);


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
