package com.javaseleniumtemplate.flows;

import com.javaseleniumtemplate.pages.HomePage;


public class HomeFlows {
    //Objects and constructor
    HomePage homePage;

    public HomeFlows(){
        //Page and Steps Objects
        homePage = new HomePage();
    }

    //Flows
    public void efetuarLogin(String usuario, String senha){
        homePage.preenhcerUsuario(usuario);


}
