import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class HomePageTest extends BaseTest {

    @Test
    public void testHomePageLoads() {
        driver.get("https://magento.softwaretestingboard.com");
        assertTrue(driver.getTitle().contains("Home Page"), "Página inicial não carregou corretamente.");
    }
}
