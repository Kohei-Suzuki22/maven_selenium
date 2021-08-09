package com.hi;

import org.openqa.selenium.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ){
        // System.out.println( "Hello World!" );
        System.setProperty("webdriver.chrome.driver","/mnt/c/Program Files (x86)/Google/Chrome/Application/chrome.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.linkedin.com/");
        WebElement inputUsername = driver.findElement(By.xpath("//input[@id='login-email']"));
        inputUsername.sendKeys("yourLinkedinUsername");
        WebElement inputPassword = driver.findElement(By.xpath("//input[@id='login-password']"));
        inputPassword.sendKeys("yourLinkedInPassword");
        WebElement btnLogIn = driver.findElement(By.xpath("//input[@id='login-submit']"));
        btnLogIn.click();
    }
}
