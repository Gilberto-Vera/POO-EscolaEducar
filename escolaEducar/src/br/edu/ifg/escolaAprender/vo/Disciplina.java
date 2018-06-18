/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifg.escolaAprender.vo;

import java.util.ArrayList;

/**
 *
 * @author gilberto
 */
public class Disciplina {
    
    private int codigo;
    private String nome;
    private Professor professor;
    private ArrayList<Aluno> aluno;
    private int semestre;
    private int ano;
    
    public Disciplina(){}
    
    public Disciplina(String nome, Professor prof, ArrayList<Aluno> aluno, int semestre, int ano){
        this.nome = nome;
        this.professor = prof;
        this.aluno = aluno;
        this.semestre = semestre;
        this.ano = ano;
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
     * @return the professor
     */
    public Professor getProfessor() {
        return professor;
    }

    /**
     * @param professor the professor to set
     */
    public void setProfessor(Professor professor) {
        this.professor = professor;
    }

    /**
     * @return the aluno
     */
    public ArrayList<Aluno> getAluno() {
        return aluno;
    }

    /**
     * @param aluno the aluno to set
     */
    public void setAluno(ArrayList<Aluno> aluno) {
        this.aluno = aluno;
    }

    /**
     * @return the semestre
     */
    public int getSemestre() {
        return semestre;
    }

    /**
     * @param semestre the semestre to set
     */
    public void setSemestre(int semestre) {
        this.semestre = semestre;
    }

    /**
     * @return the ano
     */
    public int getAno() {
        return ano;
    }

    /**
     * @param ano the ano to set
     */
    public void setAno(int ano) {
        this.ano = ano;
    }

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
    
}
