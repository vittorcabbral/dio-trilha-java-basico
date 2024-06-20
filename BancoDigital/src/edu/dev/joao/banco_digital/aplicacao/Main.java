package edu.dev.joao.banco_digital.aplicacao;

import edu.dev.joao.banco_digital.cliente.Cliente;
import edu.dev.joao.banco_digital.conta.Conta;
import edu.dev.joao.banco_digital.conta.ContaCorrente;
import edu.dev.joao.banco_digital.conta.ContaPoupanca;

public class Main {
    public static void main(String[] args) {
        
        Cliente cliente = new Cliente();
        cliente.setNome("João");

        Conta cc = new ContaCorrente(cliente);
        cc.depositar(250.56);

        Conta cp = new ContaPoupanca(cliente);
        cp.depositar(100);
        cp.sacar(50);

        cc.transferir(50, cp);

        cc.imprimirExtrato();
        cp.imprimirExtrato();
    }
}
