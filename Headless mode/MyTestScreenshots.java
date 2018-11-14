import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxOptions;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import java.net.URL;

import java.io.File;
import org.apache.commons.io.FileUtils;
import java.io.IOException;


public class MyTestScreenshots {
    public static void main(String[] args)throws Exception{
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.setHeadless(true);

        FirefoxOptions firefoxOptions = new FirefoxOptions();
        firefoxOptions.setHeadless(true);
        
        RemoteWebDriver chrome = new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"), chromeOptions);
        RemoteWebDriver firefox = new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"), firefoxOptions);

        // run against chrome
        chrome.get("https://histography.io/");
        System.out.println("chrome: "+ chrome.getTitle());

        //Take screenshot
        File file = ((TakesScreenshot)chrome).getScreenshotAs(OutputType.FILE);
        try {
            String path = "./headless_screenshot.png";
            FileUtils.copyFile(file, new File(path));
            System.out.println("screen shot saved at: "+ path);
        } catch (IOException e) {
            e.printStackTrace();
            chrome.quit();
        }

        // run against firefox
        firefox.get("https://histography.io/");
        System.out.println("firefox: "+firefox.getTitle());

        chrome.quit();
        firefox.quit();
    }
}

