package br.edu.ifg.escolaAprender.util;

import br.edu.ifg.escolaAprender.vo.Aluno;
import br.edu.ifg.escolaAprender.vo.Disciplina;
import br.edu.ifg.escolaAprender.vo.Funcionario;
import br.edu.ifg.escolaAprender.vo.Professor;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author gilberto
 */
public class BancoDeDados {
    
    private static List<Aluno> alunos;
    private static List<Funcionario> funcionarios;
    private static List<Professor> professores;
    private static List<Disciplina> disciplinas;

    static{
        alunos = new ArrayList();
    }

    /**
     * @return the alunos
     */
    public static List<Aluno> getAlunos() {
        return alunos;
    }

    /**
     * @param Aluno the alunos to set
     */
    public static void adicionarAluno(Aluno aluno) {
        alunos.add(aluno);
    }

    /**
     * @return the funcionarios
     */
    public static List<Funcionario> getFuncionarios() {
        return funcionarios;
    }

    /**
     * @param aFuncionarios the funcionarios to set
     */
    public static void setFuncionarios(List<Funcionario> aFuncionarios) {
        funcionarios = aFuncionarios;
    }

    /**
     * @return the professores
     */
    public static List<Professor> getProfessores() {
        return professores;
    }

    /**
     * @param aProfessores the professores to set
     */
    public static void setProfessores(List<Professor> aProfessores) {
        professores = aProfessores;
    }

    /**
     * @return the disciplinas
     */
    public static List<Disciplina> getDisciplinas() {
        return disciplinas;
    }

    /**
     * @param aDisciplinas the disciplinas to set
     */
    public static void setDisciplinas(List<Disciplina> aDisciplinas) {
        disciplinas = aDisciplinas;
    }
}
