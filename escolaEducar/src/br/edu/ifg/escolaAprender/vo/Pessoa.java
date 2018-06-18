package br.edu.ifg.escolaAprender.vo;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author gilberto
 */
public class Pessoa {
    
    
    protected int codigo;
    protected String nome;
    protected Date dataNascimento;
    protected String endereco;
    
    /**
     * @return the codigo
     */
    public int getCodigo() {
        return codigo;
    }

    /**
     * @param codigo the codigo to set
     */
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return the dataNascimento
     */
    public String getDataNascimento() {
        SimpleDateFormat formato = new SimpleDateFormat("dd/mm/yyyy");
        return formato.format(dataNascimento); //dataNascimento; 
    }

    /**
     * @param dataNascimento the dataNascimento to set
     */
    public void setDataNascimento(Date dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    /**
     * @return the endereco
     */
    public String getEndereco() {
        return endereco;
    }

    /**
     * @param endereco the endereco to set
     */
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
}
