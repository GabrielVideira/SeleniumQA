package com.javaseleniumtemplate.pages;

import com.javaseleniumtemplate.bases.PageBase;
import org.openqa.selenium.By;

public class HomePage extends PageBase{
    //Mapping
    By usernameField = By.id("username");
    By passwordField = By.id("password");
    By emailField = By.id("email-field");
    By loginButton1 = By.xpath("//*[@id=\"login-form\"]/fieldset/input[2]");

    //Actions
    public void preenhcerUsuario(String usuario){ sendKeys(usernameField, usuario);}

    public void clicarEmEntrar1(){ click(loginButton1); }

}
