package com.apple.iphone.aparelho_telefonico;

public class Telefone implements AparelhoTelefonico {

    @Override
    public void ligar(String numero) {

        System.out.println("Ligando do telefone");
    }

    @Override
    public void atender() {

        System.out.println("Atendendo do telefone");
    }

    @Override
    public void iniciarCorreioVoz() {

        System.out.println("Iniciando correio de voz no telefone");
    }
    
}
