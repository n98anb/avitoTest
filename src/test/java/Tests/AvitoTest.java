package Tests;


import Pages.MainPage;
import org.junit.Assert;
import org.junit.Test;


import static com.codeborne.selenide.Selenide.sleep;

public class AvitoTest {
    public static final String URL = "https://www.avito.ru";
    public static final String URL1 = "https://www.avito.ru/sankt-peterburg/transport";

   MainPage mainPage = new MainPage(URL);
/*
Тест не запускается, видимо не нажимается кнопка транспорта, вернусь к исправлению
 */
    @Test
    public void audiPageTest(){
        sleep(4000);
        Assert.assertTrue(mainPage.returnAudiHref().contains("audi"));
    }
}
