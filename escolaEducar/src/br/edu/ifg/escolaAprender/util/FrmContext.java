/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifg.escolaAprender.util;

import br.edu.ifg.escolaAprender.frame.FrmCadAluno;
import br.edu.ifg.escolaAprender.frame.FrmCadDisciplina;
import br.edu.ifg.escolaAprender.frame.FrmCadFuncionario;
import br.edu.ifg.escolaAprender.frame.FrmCadProfessor;
import br.edu.ifg.escolaAprender.frame.FrmConsAluno;
import br.edu.ifg.escolaAprender.frame.FrmConsDisciplina;
import br.edu.ifg.escolaAprender.frame.FrmConsFuncionario;
import br.edu.ifg.escolaAprender.frame.FrmConsProfessor;
import br.edu.ifg.escolaAprender.frame.FrmInserirAluno;

/**
 *
 * @author gilberto
 */
public class FrmContext {
    private static FrmCadAluno frmCadAluno;
    private static FrmConsAluno frmConsAluno;
    private static FrmCadFuncionario frmCadFunc;
    private static FrmConsFuncionario frmConsFunc;
    private static FrmCadProfessor frmCadProf;
    private static FrmConsProfessor frmConsProf;
    private static FrmCadDisciplina frmCadDisc;
    private static FrmConsDisciplina frmConsDisc;
    private static FrmInserirAluno frmInsAluno;
    
    public static void showFrmCadAluno(){
        if(frmCadAluno == null)
            frmCadAluno = new FrmCadAluno();
        frmCadAluno.setVisible(true);
    }
    
    public static void showfrmConsAluno(){
        if(frmConsAluno == null)
            frmConsAluno = new FrmConsAluno();
        frmConsAluno.setVisible(true);
    }
    
    public static void showfrmCadFunc(){
        if(frmCadFunc == null)
            frmCadFunc = new FrmCadFuncionario();
        frmCadFunc.setVisible(true);
    }
    
    public static void showfrmConsFunc(){
        if(frmConsFunc == null)
            frmConsFunc = new FrmConsFuncionario();
        frmConsFunc.setVisible(true);
    }
    
    public static void showfrmCadProf(){
        if(frmCadProf == null)
            frmCadProf = new FrmCadProfessor();
        frmCadProf.setVisible(true);
    }
    
    public static void showfrmConsProf(){
        if(frmConsProf == null)
            frmConsProf = new FrmConsProfessor();
        frmConsProf.setVisible(true);
    }

    public static void showfrmCadDisc(){
        if(frmCadDisc == null)
            frmCadDisc = new FrmCadDisciplina();
        frmCadDisc.setVisible(true);
    }
    
    public static void showfrmConsDisc(){
        if(frmConsDisc == null)
            frmConsDisc = new FrmConsDisciplina();
        frmConsDisc.setVisible(true);
    }
    
    public static void showfrmInsAluno(){
        if(frmInsAluno == null)
            frmInsAluno = new FrmInserirAluno();
        frmInsAluno.setVisible(true);
    }
}
