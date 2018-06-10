package br.edu.ifg.atividade12.util;

import br.edu.ifg.atividade12.vo.Aluno;
import br.edu.ifg.atividade12.vo.Curso;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 *
 * @author danilo
 */
public class Banco {

    private static List<Curso> cursos;
    private static List<Aluno> alunos;
    
    static {
        
        alunos = new ArrayList();
        cursos = new ArrayList();
        
        cursos.add(new Curso(1, "Tecnologia em Sistemas de Informação"));
        cursos.add(new Curso(2, "Engenharia Elétrica"));
        cursos.add(new Curso(3, "Engenharia Civil"));
        cursos.add(new Curso(4, "Administração"));
        cursos.add(new Curso(5, "Engenharia Mecânica"));
        cursos.add(new Curso(6, "Pedagogia"));
        cursos.add(new Curso(7, "Ciência da Computação"));
        cursos.add(new Curso(8, "Química"));
        cursos.add(new Curso(9, "Geografia"));
        cursos.add(new Curso(10, "História"));
        cursos.add(new Curso(11, "Portugês"));
        
        //Código para ordenar por nome.
        Collections.sort(cursos, new Comparator<Curso>() {
            @Override
            public int compare(Curso o1, Curso o2) {
                return o1.getNome().compareTo(o2.getNome());
            }
        });
        
        alunos.add(new Aluno(12, "João", cursos.get(0)));
        alunos.add(new Aluno(13, "Maria", cursos.get(3)));
        alunos.add(new Aluno(14, "Marta", cursos.get(4)));
        alunos.add(new Aluno(15, "Pedro", cursos.get(2)));
        
    }

    public static List<Curso> getCursos() {
        return cursos;
    }

    public static List<Aluno> getAlunos() {
        return alunos;
    }
    
    public static void adicionarAluno(Aluno aluno){
        alunos.add(aluno);
    }
}
