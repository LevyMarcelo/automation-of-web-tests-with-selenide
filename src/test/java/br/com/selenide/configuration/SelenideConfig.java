package br.com.selenide.configuration;

import com.codeborne.selenide.Configuration;
import org.testng.annotations.BeforeClass;
import static com.codeborne.selenide.Selenide.open;

public class SelenideConfig {

    @BeforeClass
    public void setUp() {
        Configuration.browser = "chrome";
//        Configuration.headless = true;
        Configuration.timeout = 10000;
        Configuration.startMaximized = true;
        open("http://www.google.com.br");
    }
}
