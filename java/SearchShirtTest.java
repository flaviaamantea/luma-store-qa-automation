import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class SearchShirtTest extends BaseTest {

    @Test
    public void testSearchShirt() {
        driver.get("https://magento.softwaretestingboard.com");

        driver.findElement(By.id("search")).sendKeys("shirt");
        driver.findElement(By.id("search")).sendKeys(Keys.ENTER);

        boolean resultsVisible = driver.findElements(By.cssSelector(".product-item")).size() > 0;

        assertTrue(resultsVisible, "Nenhum produto encontrado na busca por 'shirt'.");
    }
}
