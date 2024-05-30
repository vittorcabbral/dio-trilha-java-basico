package com.apple.iphone.iphone;

import com.apple.iphone.aparelho_telefonico.AparelhoTelefonico;
import com.apple.iphone.navegador_internet.NavegadorInternet;
import com.apple.iphone.reprodutor_musical.ReprodutorMusical;


public class Iphone implements AparelhoTelefonico, NavegadorInternet, ReprodutorMusical {

    //Aparelho Telefone
    @Override
    public void ligar(String numero){

        System.out.println("Ligando do Iphone");
    }

    @Override
    public void atender() {

        System.out.println("Atendendo no Iphone");
    }

    @Override
    public void iniciarCorreioVoz() {

        System.out.println("Iniciando correio de voz no Iphone");
    }

    //Navegador - Internet
    @Override
    public void adicionarNovaAba() {

        System.out.println("Abrindo nova aba no Iphone");
    }

    @Override
    public void atualizarPagina() {
       
        System.out.println("Atualizando página no Iphone");
    }

    @Override
    public void exibirPagina(String url) {

        System.out.println("Exibindo página no Iphone");
    }

    //Reprodutor Musical
    @Override
    public void pausar() {

        System.out.println("Pausando no Iphone");
    }

    @Override
    public void selecionarMusica(String musica) {
        
        System.out.println("Selecionando música no Iphone");
    }

    @Override
    public void tocar() {

        System.out.println("Tocando no Iphone");
    }

}
