package com.apple.iphone.navegador_internet;

public class Safari implements NavegadorInternet{

    @Override
    public void exibirPagina(String url) {

        System.out.println("Exibindo página no Safari");  
    }

    @Override
    public void adicionarNovaAba() {
        
        System.out.println("Adicionando nova aba no Safari");
    }

    @Override
    public void atualizarPagina() {
        
        System.out.println("Atualizando página no Safari");
    }
    
}
