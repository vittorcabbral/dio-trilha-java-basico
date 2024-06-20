package edu.dev.joao.banco_digital.interfaces;

import edu.dev.joao.banco_digital.conta.Conta;

public interface IConta {

    void sacar(double valor);

    void depositar(double valor);

    void transferir(double valor, Conta contaDestino);
    
    void imprimirExtrato();
} 
