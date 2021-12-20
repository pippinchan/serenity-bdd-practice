package starter.automationpractice;

import net.serenitybdd.screenplay.targets.Target;

public class MyStoreCheckoutPage {
    public static final Target H1_CART_TITLE = Target.the("cart title")
            .locatedBy("//*[@id=\"cart_title\"]");
}