/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifg.escolaAprender.vo;

/**
 *
 * @author gilberto
 */
public class Professor extends Funcionario {
    
    private String areaEspecializacao;

    /**
     * @return the areaEspecializacao
     */
    public String getAreaEspecializacao() {
        return areaEspecializacao;
    }

    /**
     * @param areaEspecializacao the areaEspecializacao to set
     */
    public void setAreaEspecializacao(String areaEspecializacao) {
        this.areaEspecializacao = areaEspecializacao;
    }
    
}
