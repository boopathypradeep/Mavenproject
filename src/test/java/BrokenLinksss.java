import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.List;

import javax.net.ssl.HttpsURLConnection;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrokenLinksss {
	public static void main(String[] args) throws IOException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		List<WebElement> elements = driver.findElements(By.tagName("a"));
		int size = elements.size();
		System.out.println(size);
		int count = 0;
		for (int i = 0; i < elements.size(); i++) {
			WebElement webElement = elements.get(i);
			String attribute = webElement.getAttribute("href");
			System.out.println(attribute);
			if (attribute != null) {
				URL u = new URL(attribute);
				URLConnection openConnection = u.openConnection();
				HttpsURLConnection connection = (HttpsURLConnection) openConnection;
				int responseCode = connection.getResponseCode();
				if (responseCode != 200) {
					System.out.println(attribute);
					count++;
				}

			}

		}

		System.out.println(count);

	}
}
