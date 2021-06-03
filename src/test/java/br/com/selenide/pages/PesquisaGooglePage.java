package br.com.selenide.pages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;
import static com.codeborne.selenide.Selenide.$;

public class PesquisaGooglePage {

    public PesquisaGooglePage preencherCampoPesquisa(String campoPesquisa) {
        $(By.name("q")).setValue(campoPesquisa);
        return this;
    }

    public PesquisaGooglePage clicarBotaoPesquisa() {
        $(By.name("btnK")).click();
        return this;
    }

    public SelenideElement validarPesquisaGoogle() {
        return $(By.className("yuRUbf"));
    }
}
