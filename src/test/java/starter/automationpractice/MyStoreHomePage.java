package starter.automationpractice;

import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.*;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.targets.Target;
import net.serenitybdd.screenplay.waits.WaitUntil;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.time.Duration;

public class MyStoreHomePage {
    // TODO: This page has multiple shop now buttons, may need to locate them differently according to the clarified requirement
    public static final Target BUTTON_SHOP_NOW = Target.the("shop now button")
            .locatedBy("#homeslider > li:nth-child(2) button");

    // TODO: Also, there are multiple ways to get a product "add to cart" button, will have to modify this based on the requirement
    public static final Target IMG_PRODUCT = Target.the("product image")
            .locatedBy("(//*[@id=\"homefeatured\"]//*[@class=\"product-image-container\"])[1]");
    public static final Target BUTTON_ADD_TO_CART = Target.the("add to cart button")
            .locatedBy("(//*[@id=\"homefeatured\"]//*[@class=\"button-container\"])[1]");

    public static final Target BUTTON_CONTINUE_SHOPPING = Target.the("continue shopping button")
            .locatedBy("//*[@id=\"layer_cart\"]//span[contains(@class, 'continue')]");
    public static final Target BUTTON_PROCEED_TO_CHECKOUT = Target.the("add to cart button")
            .locatedBy("//*[@id=\"layer_cart\"]//a[contains(@class,'button')]");

    public static Performable clickShopNow() {
        // TODO: 30 seconds is now a hardcoded magic number
        return Task.where("{0} clicks shop now button",
                WaitUntil.the(BUTTON_SHOP_NOW, WebElementStateMatchers.isClickable()).forNoMoreThan(Duration.ofSeconds(30)),
                Click.on(BUTTON_SHOP_NOW)
        );
    }

    public static Performable mouseoverOnProduct() {
        return Task.where("{0} puts mouse on a product image",
                Scroll.to(IMG_PRODUCT),
                HoverOverTarget.over(IMG_PRODUCT)
        );
    }

    public static Performable clickAddToCart() {
        return Task.where("{0} clicks shop now button",
                Click.on(BUTTON_ADD_TO_CART)
        );
    }

    public static Performable clickContinueShopping() {
        // TODO: seems like many elements needs to wait until it's ready. Can refactor this to a general factory method.
        return Task.where("{0} clicks continue shopping",
                WaitUntil.the(BUTTON_CONTINUE_SHOPPING, WebElementStateMatchers.isClickable()).forNoMoreThan(Duration.ofSeconds(30)),
                Click.on(BUTTON_CONTINUE_SHOPPING)
        );
    }

    public static Performable clickProceedToCheckout() {
        return Task.where("{0} clicks proceed to checkout",
                WaitUntil.the(BUTTON_PROCEED_TO_CHECKOUT, WebElementStateMatchers.isClickable()).forNoMoreThan(Duration.ofSeconds(30)),
                Click.on(BUTTON_PROCEED_TO_CHECKOUT)
        );
    }
}