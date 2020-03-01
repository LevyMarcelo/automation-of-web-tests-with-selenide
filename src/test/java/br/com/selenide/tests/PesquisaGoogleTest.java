package br.com.selenide.tests;

import br.com.selenide.pages.PesquisaGooglePage;
import br.com.selenide.configuration.SelenideConfig;
import org.testng.annotations.Test;
import static com.codeborne.selenide.Condition.text;

public class PesquisaGoogleTest extends SelenideConfig {

    private PesquisaGooglePage pesquisa = new PesquisaGooglePage();

    @Test
    public void pesquisaGoogleComSucesso() {
        pesquisa.preencherCampoPesquisa("Selenide").clicarBotaoPesquisa();
        pesquisa.validarPesquisaGoogle().shouldHave(text("Selenide: concise UI tests in Java"));
    }
}
