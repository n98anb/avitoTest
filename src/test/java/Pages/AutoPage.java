package Pages;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$x;
import static com.codeborne.selenide.Selenide.sleep;

public class AutoPage {
    SelenideElement audiButton = $x("//div[@class='popular-rubricator-links-eSjcl']//*[contains(text(), 'Audi')] ");

    String audiHref = audiButton.getAttribute("href");


    public AudiPage clickOnAudiImg(){
        sleep(4000);
        audiButton.click();
        return new AudiPage();
    }
}
