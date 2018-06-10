/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifg.atividade12.util;

import br.edu.ifg.atividade12.frame.CadastroAlunoFrm;
import br.edu.ifg.atividade12.frame.ConsultaAlunoFrm;
import br.edu.ifg.atividade12.frame.SobreFrm;

/**
 *
 * @author aluno
 */
public class FormulariosContext {
    
    private static CadastroAlunoFrm cadastroAlunoFrm;
    private static ConsultaAlunoFrm consultaAlunoFrm;
    private static SobreFrm sobreFrm;

    public static void showCadastroAlunoFrm() {
        if(cadastroAlunoFrm == null){
            cadastroAlunoFrm = new CadastroAlunoFrm();
        }
        cadastroAlunoFrm.setVisible(true);
    }
    public static void showConsultaAlunoFrm() {
        if(consultaAlunoFrm == null){
            consultaAlunoFrm = new ConsultaAlunoFrm();
        }
        consultaAlunoFrm.setVisible(true);
    }
    public static void showSobreFrm() {
        if(sobreFrm == null){
            sobreFrm = new SobreFrm();
        }
        sobreFrm.setVisible(true);
    }
        
}
