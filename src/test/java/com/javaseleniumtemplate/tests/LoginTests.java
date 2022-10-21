package com.javaseleniumtemplate.tests;

import com.javaseleniumtemplate.bases.TestBase;
import com.javaseleniumtemplate.pages.LoginPage;
import org.junit.Assert;
import org.junit.Test;

public class LoginTests extends TestBase {
    //Objects
    LoginPage loginPage;

    //Tests
    @Test
    public void efetuarLoginEmailInvalido(){

        //Objects instances
        loginPage = new LoginPage();

        //Parameteres
        String usuario = "gabriedangelo";
        String senha = "123456";
        String mensagemErroEsperada = "Sua conta pode estar desativada ou bloqueada";

        //Test
        loginPage.preenhcerUsuario(usuario);
        loginPage.clicarEmEntrar1();
        loginPage.preencherSenha(senha);
        loginPage.clicarEmEntrar2();

        Assert.assertTrue(loginPage.retornaMensagemErroLogin().contains(mensagemErroEsperada));
    }
}
