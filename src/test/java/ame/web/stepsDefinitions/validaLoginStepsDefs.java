package ame.web.stepsDefinitions;

import ame.web.login.LoginPage;
import ame.web.login.LoginTest;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;

import static org.junit.jupiter.api.Assertions.*;

public class validaLoginStepsDefs {

    LoginPage paginaLogin;

    @BeforeEach
    public void initialize() {
        this.paginaLogin = new LoginPage();
    }

    @AfterEach
    public void afterEach(){
        this.paginaLogin.fechar();
    }

    @Dado("que o cliente acesse a pagina de login")
    public void que_o_cliente_acesse_a_pagina_de_login() {
        paginaLogin = new LoginPage();
    }

    @Quando("realizar a login com dados validos")
    public void realizar_a_login_com_dados_validos() {
       paginaLogin.preencheLogin("jhonata.filizola@gmail.com", "pass123456");
    }

    @Quando("realizar login com email e senha em branco")
    public void realizarLoginComEmailESenhaEmBranco() {
        paginaLogin.preencheLogin("", "");
    }

    @Quando("realizar login com senha errada")
    public void realizarLoginComaSenhaErrada() {
        paginaLogin.preencheLogin("jhonata.filizola@gmail.com", "pass");
    }

    @Entao("devera retornar a pagina logado")
    public void devera_retornar_a_pagina_logado() {
        assertTrue(paginaLogin.isPaginaUsuarioLogado());
    }

    @Entao("devera retornar a mensagem de senha errada")
    public void deveraRetornarAMensagemDeErro() {
        assertTrue(paginaLogin.msgSenhaIncorreta());
    }

    @Entao("devera retornar a mensagem de erro email e senha em branco")
    public void deveraRetornarMensagemDeErroEmailIncompleto(){
        assertTrue(paginaLogin.msgEmailEsenhaEmBranco());
    }
}
