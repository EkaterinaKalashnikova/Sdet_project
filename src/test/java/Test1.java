import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Test1 {

    private String http;

    @Test
    public void test1() {
        WebDriver driver = new ChromeDriver();
        driver.get("http://google.com");


    }
}
