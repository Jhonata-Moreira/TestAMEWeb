package ame.web.login;

import ame.web.login.LoginPage;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class LoginTest {

    private LoginPage paginaDelogin;

    @BeforeEach
    public void beforeEach() {
        this.paginaDelogin = new LoginPage();
    }

    @AfterEach
    public void afterEach() {
        this.paginaDelogin.fechar();
    }

    @Test
    public void deveEfetuarLogin() {
        paginaDelogin.preencheLogin("jhonata.filizola@gmail.com", "pass123456");

        Assertions.assertFalse(paginaDelogin.isPaginaDeLogin());
        Assertions.assertTrue(paginaDelogin.isPaginaUsuarioLogado());

    }
    @Test
    public void naoDeveEfetuaLoginComSenhaIncorreta() {
        paginaDelogin.preencheLogin("","pass123456");
        Assertions.assertTrue(paginaDelogin.msgSenhaIncorreta());
    }

    @Test
    public void naoDeveEfetuarLoginComEmailEsenhaEmBranco() {
        paginaDelogin.preencheLogin("", "" );
        Assertions.assertTrue(paginaDelogin.msgEmailEsenhaEmBranco());
    }
}




