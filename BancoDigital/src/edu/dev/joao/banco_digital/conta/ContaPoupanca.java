package edu.dev.joao.banco_digital.conta;

import edu.dev.joao.banco_digital.cliente.Cliente;

public class ContaPoupanca  extends Conta{

    public ContaPoupanca(Cliente cliente){
        super(cliente);
    } 

    @Override
    public void imprimirExtrato() {
        System.out.println("Extrato Conta Poupança");
        super.imprimirInfosComuns();
    }
    
    
}
