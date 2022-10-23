package com.javaseleniumtemplate.flows;

import com.javaseleniumtemplate.pages.LoginPage;

public class LoginFlows {
    //Objects and constructor
    LoginPage loginPage;

    public LoginFlows(){
        //Page and Steps Objects
        loginPage = new LoginPage();
    }

    //Flows
    public void efetuarLogin(String usuario, String senha){
        loginPage.preenhcerUsuario(usuario);
        loginPage.clicarEmEntrar1();
        loginPage.preencherSenha(senha);
        loginPage.clicarEmEntrar2();
    }
    public void reajusteSenha(String usuario, String email){
        loginPage.preenhcerUsuario(usuario);
        loginPage.clicarEmEntrar1();
        loginPage.clicarEmPerdeuSenha();
        loginPage.preencherEmail(email);
        loginPage.clicarEmEnviar();
    }
}
