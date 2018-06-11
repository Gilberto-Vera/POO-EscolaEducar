package br.edu.ifg.escolaAprender.vo;

import java.util.Date;

/**
 *
 * @author gilberto
 */
public class Aluno extends Pessoa {
    
    private String responsavel;
    
    public Aluno(){}
    
    public Aluno(int codigo, String nome, Date dataNascimento, String endereco, String responsavel){
        this.codigo = codigo;
        this.nome = nome;
        this.dataNascimento = dataNascimento;
        this.endereco = endereco;
        this.responsavel = responsavel;
    }
  
    /**
     * @return the responsavel
     */
    public String getResponsavel() {
        return responsavel;
    }

    /**
     * @param responsavel the responsavel to set
     */
    public void setResponsavel(String responsavel) {
        this.responsavel = responsavel;
    }

    @Override
    public String toString() {
        return nome;
    }
    
    
    
}
