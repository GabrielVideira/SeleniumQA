package com.javaseleniumtemplate.pages;

import com.javaseleniumtemplate.bases.PageBase;
import org.openqa.selenium.By;

public class HomePage extends PageBase{
    //mapping
    By usernameField = By.id("username");

    By passwordField = By.id("password");

    By loginButton1 = By.xpath("//*[@id=\"login-form\"]/fieldset/input[2]");

    By loginButton2 = By.xpath("//*[@id=\"login-form\"]/fieldset/input[3]");

    By planejamentoButton = By.xpath("//*[@id=\"sidebar\"]/ul/li[5]/a");

    By mensagemSemPlanejamento  = By.xpath("//*[@id=\"main-container\"]/div[2]/div[2]/div/div/p");

    By criarTarefaButton1 = By.xpath("//*[@id=\"navbar-container\"]/div[2]/ul/li[1]/div/a");

    By summaryField = By.id("summary");

    By descriptionField = By.id("description");

    By criarTarefaButton2 = By.xpath("//*[@id=\"report_bug_form\"]/div/div[2]/div[2]/input");

    By mensagemTarefaEnviada = By.xpath("//*[@id=\"breadcrumbs\"]/div[1]");

    By profileButton = By.xpath("//*[@id=\"navbar-container\"]/div[2]/ul/li[3]/a/span");

    By myAccountButton = By.xpath("//*[@id=\"navbar-container\"]/div[2]/ul/li[3]/ul/li[1]/a");

    By updateButton = By.xpath("//*[@id=\"account-update-form\"]/div/div[2]/div[2]/input");

    By mensagemUpdate = By.xpath("//*[@id=\"main-container\"]/div[2]/div[2]/div/div/div/div[2]/p");

    //Actions
    public void preenhcerUsuario(String usuario){ sendKeys(usernameField, usuario);}

    public void clicarEmEntrar1(){ click(loginButton1); }

    public void preencherSenha(String senha){ sendKeys(passwordField, senha);}

    public void clicarEmEntrar2(){ click(loginButton2); }

    public void clicarEmPlanejamento(){ click(planejamentoButton); }

    public String retornaMensagemSemPlanejamento(){ return getText(mensagemSemPlanejamento); }

    public void clicarCriarTarefa1(){ click(criarTarefaButton1); }

    public void preencherResumo(String summary){ sendKeys(summaryField, summary);}

    public void preencherDescricao(String description){ sendKeys(descriptionField, description);}

    public void clicarCriarTarefa2(){ click(criarTarefaButton2); }

    public String retornaMensagemTarefaEnviada(){ return getText(mensagemTarefaEnviada); }

    public void clicarProfileButton(){ click(profileButton); }

    public void clicarMyAccountButton(){ click(myAccountButton);}

    public void clicarUpdateButton(){ click(updateButton);}

    public String retornaMensagemUpdate(){ return getText(mensagemUpdate); }
}
