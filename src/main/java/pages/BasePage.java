package pages;

import base.AbstractPage;
import com.codeborne.selenide.SelenideElement;
import com.sun.tools.javac.util.List;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selectors.byXpath;
import static com.codeborne.selenide.Selenide.$;

public class BasePage extends AbstractPage {
    public SelenideElement greetingTitle = $(byXpath("//*[contains(text(),'добро пожаловать!')]"));
    public SelenideElement signUpTitle = $(byXpath("//*[contains(text(),'Вы впервые берете турбозайм?')]"));
    public SelenideElement signInTitle = $(byXpath("//*[contains(text(),'Уже пользовались турбозаймом?')]"));

    public void waitForLoaded() {
        super.waitForLoaded();
        List.of(
                greetingTitle,
                signInTitle,
                signUpTitle
        ).forEach(it -> it.shouldBe(visible));
    }

    public void clickButton(String text) {
        $(By.xpath("//*[contains(@class,'btn') and contains(text(),'" + text + "')]")).click();
    }

    public void contentIsVisible(String text) {
        $(By.xpath("//*[text()='" + text + "']")).shouldBe(visible);
    }
}