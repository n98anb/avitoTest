package Pages;

import com.codeborne.selenide.SelenideElement;
import org.junit.Assert;
import org.junit.Test;

import static com.codeborne.selenide.Selenide.$x;

public class AudiPage {
    SelenideElement header = $x("//h1");
    SelenideElement model = $x("//span[contains(text(), 'Audi')]");
    SelenideElement car = $x("//h3[not(contains(text(),'Проверяйте'))]");

    String headerString = header.text();
    String modelString = model.text();
    String carString = car.text();

}
