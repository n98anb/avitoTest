package Pages;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.*;

public class MainPage {
    SelenideElement autoButton = $x("//div[@class = 'index-outerPosition-VKXYP index-outerPosition_main-C2CVT']//img[@alt ='Авто']");

    public MainPage(String url){
        Selenide.open(url);
    }

    public String returnAudiHref(){
        sleep(4000);
        autoButton.click();
        AutoPage autoPage = new AutoPage();
        return autoPage.audiHref;
    }
}
