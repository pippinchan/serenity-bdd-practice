package starter.automationpractice;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.ensure.Ensure;
import starter.navigation.NavigateTo;

public class AddToCartStepDefinitions {
    @Given("{actor} goes to automation practice home page")
    public void actorGoesToAutomationPracticeHomePage(Actor actor) {
        actor.wasAbleTo(
                NavigateTo.automationPracticeHomePage()
        );
    }

    @When("{actor} clicks shop now button")
    public void actorClicksShopNowButton(Actor actor) {
        actor.attemptsTo(
                MyStoreHomePage.clickShopNow()
        );
    }

    @When("{actor} adds an item into cart")
    public void actorAddsAnItemIntoCart(Actor actor) {
        actor.attemptsTo(
                MyStoreHomePage.mouseoverOnProduct(),
                MyStoreHomePage.clickAddToCart()
        );
    }

    @When("{actor} clicks continue shopping")
    public void actorClicksContinueShopping(Actor actor) {
        actor.attemptsTo(
                MyStoreHomePage.clickContinueShopping()
        );
    }

    @When("{actor} adds 2 items into cart")
    public void actorAdds2ItemsIntoCart(Actor actor) {
        // TODO: learn how to reuse test steps as building blocks for more sophisticated business flow
        actor.attemptsTo(
                MyStoreHomePage.mouseoverOnProduct(),
                MyStoreHomePage.clickAddToCart(),
                MyStoreHomePage.clickContinueShopping(),
                MyStoreHomePage.mouseoverOnProduct(),
                MyStoreHomePage.clickAddToCart()
        );
    }

    @When("{actor} proceeds to checkout")
    public void actorProceedsToCheckout(Actor actor) {
        actor.attemptsTo(
                MyStoreHomePage.clickProceedToCheckout()
        );
    }

    @Then("{actor} should see the checkout page")
    public void actorShouldSeeTheCheckoutPage(Actor actor) {
        actor.attemptsTo(
                Ensure.that(MyStoreCheckoutPage.H1_CART_TITLE).isDisplayed()
        );
    }
}
