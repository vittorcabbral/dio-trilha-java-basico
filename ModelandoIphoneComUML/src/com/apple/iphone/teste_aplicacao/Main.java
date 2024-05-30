package com.apple.iphone.teste_aplicacao;

import com.apple.iphone.aparelho_telefonico.AparelhoTelefonico;
import com.apple.iphone.aparelho_telefonico.Telefone;
import com.apple.iphone.iphone.Iphone;
import com.apple.iphone.navegador_internet.NavegadorInternet;
import com.apple.iphone.navegador_internet.Safari;
import com.apple.iphone.reprodutor_musical.*;

public class Main {
    public static void main(String[] args) throws Exception {
        //Telefone

        Telefone telefone = new Telefone();
        telefone.atender();
        telefone.ligar("4002-8922");
        telefone.iniciarCorreioVoz();
 

        AparelhoTelefonico telefone2 = new Telefone();
        telefone2.atender();
        AparelhoTelefonico telefone3 = telefone2;
        System.out.println(telefone2.equals(telefone3)); 

        System.out.println();
        
        //Navegador - Internet
        Safari safari = new Safari();
        NavegadorInternet safari_1 = safari;

        safari_1.adicionarNovaAba();
        safari.atualizarPagina();
        safari.exibirPagina("google.com");

        System.out.println();

        //Reprodutor Musical
        Ipod ipod = new Ipod();
        ipod.selecionarMusica("lalalala");
        ipod.pausar();
        ipod.tocar();

        System.out.println();

        //Iphone 
        Iphone iphone = new Iphone();
        iphone.atender();
        iphone.atualizarPagina();
        iphone.tocar();

        NavegadorInternet navegador_iphone = new Iphone();
        AparelhoTelefonico telefone_iphone = iphone;
        ReprodutorMusical reprodutor_iphone = iphone;

        telefone_iphone.iniciarCorreioVoz();
        reprodutor_iphone.pausar();
        navegador_iphone.atualizarPagina();
    }
}
