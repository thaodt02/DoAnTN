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

import java.util.List;

public class XemTTChiTietVeCongTy {
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
        sleep(2000);

        WebElement btnCompanyIT = chromeDriver.findElement(By.xpath("/html/body/div/div/div[1]/div/div/div[2]/ul/li[3]/span[2]/a"));
        sleep(5000);
        btnCompanyIT.click();
        sleep(5000);

        WebElement Acompany = chromeDriver.findElement(By.xpath("/html/body/div/div/div[2]/div/div/div/div/div/div/div/div[1]/div[5]"));
        sleep(5000);
        Acompany.click();
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
