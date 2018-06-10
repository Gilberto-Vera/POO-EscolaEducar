/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifg.escolaAprender.util;

import br.edu.ifg.escolaAprender.frame.FrmCadAluno;
import br.edu.ifg.escolaAprender.frame.FrmConsAluno;

/**
 *
 * @author gilberto
 */
public class FrmContext {
    private static FrmCadAluno frmCadAluno;
    private static FrmConsAluno frmConsAluno;
    
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
}
