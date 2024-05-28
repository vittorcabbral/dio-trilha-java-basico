package com.apple.iphone.reprodutor_musical;

public class Ipod implements ReprodutorMusical {

    @Override
    public void tocar() {
        
        System.out.println("Tocando no Ipod");
    }

    @Override
    public void pausar() {
        
        System.out.println("Pausando no Ipod");
    }

    @Override
    public void selecionarMusica(String musica) {
        
        System.out.println("Selecionando música no Ipod");
    }
    
}
