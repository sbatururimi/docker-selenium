import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxOptions;

import java.net.URL;

public class MyTest {
    public static void main(String[] args)throws Exception{
//    public static void main() throws Exception {
        ChromeOptions chromeOptions = new ChromeOptions();
        // DesiredCapabilities chromeCapabilities = DesiredCapabilities.chrome();
        DesiredCapabilities firefoxCapabilities = DesiredCapabilities.firefox();


        // RemoteWebDriver chrome = new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"), chromeCapabilities);
        RemoteWebDriver chrome = new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"), chromeOptions);
        RemoteWebDriver firefox = new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"), firefoxCapabilities);

        // run against chrome
        chrome.get("https://www.google.com");
        System.out.println(chrome.getTitle());

        // run against firefox
        firefox.get("https://www.google.com");
        System.out.println(firefox.getTitle());

        chrome.quit();
        firefox.quit();
    }
}

