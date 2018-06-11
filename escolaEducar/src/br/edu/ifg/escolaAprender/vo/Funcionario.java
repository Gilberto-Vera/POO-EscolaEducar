/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifg.escolaAprender.vo;

import java.util.Date;

/**
 *
 * @author gilberto
 */
public class Funcionario extends Pessoa {
    
    private String setor;
    private String funcao;
    
    public Funcionario(){
    }
    
    public Funcionario(int codigo, String nome, Date dataNascimento, String endereco, String responsavel, String setor, String funcao){
        this.codigo = codigo;
        this.nome = nome;
        this.dataNascimento = dataNascimento;
        this.endereco = endereco;
        this.setor = setor;
        this.funcao = funcao;
    }

    /**
     * @return the setor
     */
    public String getSetor() {
        return setor;
    }

    /**
     * @param setor the setor to set
     */
    public void setSetor(String setor) {
        this.setor = setor;
    }

    /**
     * @return the funcao
     */
    public String getFuncao() {
        return funcao;
    }

    /**
     * @param funcao the funcao to set
     */
    public void setFuncao(String funcao) {
        this.funcao = funcao;
    }
    
}
