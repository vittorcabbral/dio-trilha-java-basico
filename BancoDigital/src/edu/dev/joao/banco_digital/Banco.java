package edu.dev.joao.banco_digital;

import java.util.List;

import edu.dev.joao.banco_digital.conta.Conta;

public class Banco {

    private String nome;
    private List<Conta> contas;
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public List<Conta> getContas() {
        return contas;
    }
    public void setContas(List<Conta> contas) {
        this.contas = contas;
    }
    

}
