package com.javaseleniumtemplate.tests;

import com.javaseleniumtemplate.bases.TestBase;
import com.javaseleniumtemplate.pages.HomePage;
import org.junit.Assert;
import org.junit.Test;

public class HomeTests extends TestBase{
    //Objects
    HomePage homePage;

    //Tests
    @Test
    public void efetuarLoginEmailInvalido(){

        //Objects instances
        homePage = new HomePage();

        //Parameteres
        String usuario = "gabriedangelo";
        String senha = "1234";
        String mensagemErroEsperada = "Sua conta pode estar desativada ou bloqueada";

        //Test
        homePage.preenhcerUsuario(usuario);


        Assert.assertTrue(homePage.retornaMensagemErroLogin().contains(mensagemErroEsperada));
    }
}
