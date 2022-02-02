package Selenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium14 {
    /*
    Postoji pesma koja je himna ITBootcampa: https://www.youtube.com/watch?v=dQw4w9WgXcQ
Vas domaci zadatak je da otvorite pretrazivac, odete na youtube i pustite Rick Astley-a
     */
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver= new ChromeDriver();
        driver.manage().window().maximize();

        driver.navigate().to("https://www.google.rs/");
        WebElement searchbox= driver.findElement(By.cssSelector(".gLFyf.gsfi"));
        searchbox.sendKeys("youtube");
        Thread.sleep(2000);
        WebElement pretraga= driver.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[2]/div[2]/div[5]/center/input[1]"));
        pretraga.click();
        WebElement youtubeLink= driver.findElement(By.cssSelector(".LC20lb.MBeuO.DKV0Md"));
        youtubeLink.click();
        Thread.sleep(2000);
        WebElement unosPesmeUPretragu= driver.findElement(By.name("search_query"));
        unosPesmeUPretragu.sendKeys("Rick Astley - Never Gonna Give You Up");
        Thread.sleep(2000);
        WebElement dugmeZaPretragu= driver.findElement(By.cssSelector("#search-icon-legacy > yt-icon"));
        dugmeZaPretragu.click();
        Thread.sleep(2000);
        WebElement video= driver.findElement(By.xpath("/html/body/ytd-app/div/ytd-page-manager/ytd-search/div[1]/ytd-two-column-search-results-renderer/div/ytd-section-list-renderer/div[2]/ytd-item-section-renderer/div[3]/ytd-video-renderer[1]/div[1]/div/div[1]/div/h3/a/yt-formatted-string"));
        video.click();
        Thread.sleep(2000);
    }
}
