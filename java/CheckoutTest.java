import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class CheckoutTest extends BaseTest {

    @Test
    public void testProceedToCheckout() throws InterruptedException {
        driver.get("https://magento.softwaretestingboard.com");

        // Buscar e adicionar produto
        driver.findElement(By.id("search")).sendKeys("shirt");
        driver.findElement(By.id("search")).submit();

        driver.findElement(By.cssSelector(".product-item a.product-item-link")).click();

        if (!driver.findElements(By.id("option-label-size-143-item-166")).isEmpty()) {
            driver.findElement(By.id("option-label-size-143-item-166")).click();
        }
        if (!driver.findElements(By.id("option-label-color-93-item-50")).isEmpty()) {
            driver.findElement(By.id("option-label-color-93-item-50")).click();
        }

        driver.findElement(By.id("product-addtocart-button")).click();

        // Ir ao carrinho
        Thread.sleep(2000);
        driver.findElement(By.cssSelector(".showcart")).click();
        driver.findElement(By.id("top-cart-btn-checkout")).click();

        Thread.sleep(3000);

        boolean checkoutPage = driver.getCurrentUrl().contains("checkout");
        assertTrue(checkoutPage, "Checkout não foi iniciado.");
    }
}

