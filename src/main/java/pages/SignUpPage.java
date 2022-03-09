package pages;

import base.AbstractPage;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selectors.byXpath;
import static com.codeborne.selenide.Selenide.$;

public class SignUpPage extends AbstractPage {
    public SelenideElement phoneInput = $(byXpath("//*[@class='form-control mobilePhone']"));
    public SelenideElement emailInput = $(byXpath("//*[@class='form-control email']"));
    public SelenideElement inputDataTitle = $(byXpath("//*[contains(text(),'Введите личные данные для регистрации в системе')]"));
    public SelenideElement nextButton = $(byXpath("//*[@id='step1NextButton']"));

    public SelenideElement secondNameInput = $(byXpath("//*[@placeholder='Фамилия']"));
    public SelenideElement nameInput = $(byXpath("//*[@placeholder='Имя']"));
    public SelenideElement fatherNameInput = $(byXpath("//*[@placeholder='Отчество']"));


    public void waitForLoaded() {
        super.waitForLoaded();
        inputDataTitle.shouldBe(visible);
    }

    public void inputPhone(String text) {
        this.phoneInput.val(text);
    }

    public void inputEmail(String text) {
        this.emailInput.val(text);
    }

    public void nextButtonClick() {
        this.nextButton.click();
    }

    public void inputUsersData(String secondName, String name, String fatherName) {
        this.secondNameInput.val(secondName);
        this.nameInput.val(name);
        this.fatherNameInput.val(fatherName);
    }


}
