package testcase;

import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;

public class TestMobileApp {
	@Test
	public void OpenCalculater() throws MalformedURLException, URISyntaxException {
		AndroidDriver driver = setup();
		driver.findElement(By.xpath("")).click();
	}

	public AndroidDriver setup() throws MalformedURLException, URISyntaxException {
		DesiredCapabilities caps = new DesiredCapabilities();
		caps.setCapability("platformName", "Android");
		caps.setCapability("appium:appPackage", "com.org.AmarUjala.news");
		caps.setCapability("appium:appActivity", "com.org.AmarUjala.news.HomeActivity");
		caps.setCapability("appium:automationName", "uiautomator2");
		caps.setCapability("appium:udid", "137547384200071");
		URL url = new URI("http://127.0.0.1:4723/").toURL();
		AndroidDriver driver = new AndroidDriver(url, caps);

		return driver;
	}

}
