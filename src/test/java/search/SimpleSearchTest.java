package search;

import com.google.common.annotations.VisibleForTesting;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SimpleSearchTest {


    @Test
    public void simpleSearchWithOneKeyword() {

        WebDriver driver = new ChromeDriver();

        driver.get("https://www.cel.ro/");

    }

}
