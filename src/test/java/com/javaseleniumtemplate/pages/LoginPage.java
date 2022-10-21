package com.javaseleniumtemplate.pages;

import com.javaseleniumtemplate.bases.PageBase;
import org.openqa.selenium.By;

public class LoginPage extends PageBase {
    //Mapping
    By usernameField = By.id("username");
    By passwordField = By.id("password");
    By loginButton1 = By.xpath("//*[@id=\"login-form\"]/fieldset/input[2]");
    By loginButton2 = By.xpath("//*[@id=\"login-form\"]/fieldset/input[3]");
    By errorMessageLabel = By.xpath("//*[@id=\"main-container\"]/div/div/div/div/div[4]/p");

    //Actions
    public void preenhcerUsuario(String usuario){
        sendKeys(usernameField, usuario);
    }

    public void clicarEmEntrar1(){ click(loginButton1); }

    public void preencherSenha(String senha){
        sendKeys(passwordField, senha);
    }

    public void clicarEmEntrar2(){ click(loginButton2); }

    public String retornaMensagemErroLogin(){ return getText(errorMessageLabel); }
}
