package com.javaseleniumtemplate.tests;

import com.javaseleniumtemplate.bases.TestBase;
import com.javaseleniumtemplate.pages.HomePage;
import com.javaseleniumtemplate.pages.LoginPage;
import org.junit.Assert;
import org.junit.Test;

public class HomeTests extends TestBase{
    //Objects
    HomePage homePage;

    //Parameters

    @Test
    public void verificarPlanejamento(){

        //Objects instances
        homePage = new HomePage();

        //Parameters
        String usuario = "gabriedangelo";
        String senha = "chowder900";
        String mensagemEsperadaPlanejamento = "Nenhum planejamento disponível. Apenas tarefas com a versão indicada aparecerão no planejamento";

        //Tests
        homePage.preenhcerUsuario(usuario);
        homePage.clicarEmEntrar1();
        homePage.preencherSenha(senha);
        homePage.clicarEmEntrar2();
        homePage.clicarEmPlanejamento();

        Assert.assertTrue(homePage.retornaMensagemSemPlanejamento().contains(mensagemEsperadaPlanejamento));

    }

    @Test
    public void verificarCriacaoTarefa(){
        //Objects instances
        homePage = new HomePage();

        //Parameters
        String usuario = "gabriedangelo";
        String senha = "chowder900";
        String resumo = "Teste";
        String descricao = "Automatizando";
        String mensagemEsperadaTarefa = "Recentemente";

        //Tests
        homePage.preenhcerUsuario(usuario);
        homePage.clicarEmEntrar1();
        homePage.preencherSenha(senha);
        homePage.clicarEmEntrar2();
        homePage.clicarCriarTarefa1();
        homePage.preencherResumo(resumo);
        homePage.preencherDescricao(descricao);
        homePage.clicarCriarTarefa2();

        Assert.assertTrue(homePage.retornaMensagemTarefaEnviada().contains(mensagemEsperadaTarefa));
    }

    @Test
    public void verificarAlteracaoDadosConta(){
        //Objects instances
        homePage = new HomePage();

        //Parameters
        String usuario = "gabriedangelo";
        String senha = "chowder900";
        String mensagemEsperadaUpdate = "realizada";

        //Tests
        homePage.preenhcerUsuario(usuario);
        homePage.clicarEmEntrar1();
        homePage.preencherSenha(senha);
        homePage.clicarEmEntrar2();
        homePage.clicarProfileButton();
        homePage.clicarMyAccountButton();
        homePage.clicarUpdateButton();

        Assert.assertTrue(homePage.retornaMensagemUpdate().contains(mensagemEsperadaUpdate));

    }
}

