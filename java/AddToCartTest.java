import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class AddToCartTest extends BaseTest {

    @Test
    public void testAddProductToCart() {
        driver.get("https://magento.softwaretestingboard.com");

        // Buscar por "shirt"
        driver.findElement(By.id("search")).sendKeys("shirt");
        driver.findElement(By.id("search")).submit();

        // Clicar no primeiro produto
        driver.findElement(By.cssSelector(".product-item a.product-item-link")).click();

        // Escolher tamanho, cor etc. se existir
        if (!driver.findElements(By.id("option-label-size-143-item-166")).isEmpty()) {
            driver.findElement(By.id("option-label-size-143-item-166")).click();
        }
        if (!driver.findElements(By.id("option-label-color-93-item-50")).isEmpty()) {
            driver.findElement(By.id("option-label-color-93-item-50")).click();
        }

        // Adicionar ao carrinho
        driver.findElement(By.id("product-addtocart-button")).click();

        // Validar mensagem de sucesso
        boolean success = driver.findElements(By.cssSelector(".message-success")).size() > 0;

        assertTrue(success, "Produto não foi adicionado ao carrinho.");
    }
}
