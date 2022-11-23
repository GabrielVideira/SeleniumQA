package com.javaseleniumtemplate.flows;

import com.javaseleniumtemplate.pages.HomePage;
import com.javaseleniumtemplate.pages.LoginPage;


public class HomeFlows {
    //Objects and constructor
    HomePage homePage;

    public HomeFlows(){
        //Page and Steps Objects
        homePage = new HomePage();
    }

    //Flows
    public void verificarPlanejamento(String usuario, String senha){
        homePage.preenhcerUsuario(usuario);
        homePage.clicarEmEntrar1();
        homePage.preencherSenha(senha);
        homePage.clicarEmEntrar2();
        homePage.clicarEmPlanejamento();

    }

}
