package com.javaseleniumtemplate.pages;

import com.javaseleniumtemplate.bases.PageBase;
import org.openqa.selenium.By;

public class LoginPage extends PageBase {
    //Mapping
    By usernameField = By.id("username");
    By passwordField = By.id("password");
    By emailField = By.id("email-field");
    By loginButton1 = By.xpath("//*[@id=\"login-form\"]/fieldset/input[2]");
    By loginButton2 = By.xpath("//*[@id=\"login-form\"]/fieldset/input[3]");
    By errorMessageLabel = By.xpath("//*[@id=\"main-container\"]/div/div/div/div/div[4]/p");
    By perdeuSenha = By.xpath("//*[@id=\"login-form\"]/fieldset/a");
    By submitButton = By.xpath("//*[@id=\"lost-password-form\"]/fieldset/input[2]");
    By errorMessageRecuperarSenha = By.xpath("//*[@id=\"main-container\"]/div/div[2]/p[2]");
    //Actions
    public void preenhcerUsuario(String usuario){ sendKeys(usernameField, usuario);}

    public void clicarEmEntrar1(){ click(loginButton1); }

    public void preencherSenha(String senha){ sendKeys(passwordField, senha);}

    public void clicarEmEntrar2(){ click(loginButton2); }

    public String retornaMensagemErroLogin(){ return getText(errorMessageLabel); }

    public void clicarEmPerdeuSenha(){ click(perdeuSenha); }

    public void preencherEmail(String email){ sendKeys(emailField, email); }

    public void clicarEmEnviar(){ click(submitButton); }

    public String retornaMensagemErroContaNaoRegistrada(){ return getText(errorMessageRecuperarSenha); }
}
