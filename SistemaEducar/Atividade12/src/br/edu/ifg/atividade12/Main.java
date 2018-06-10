package br.edu.ifg.atividade12;

import br.edu.ifg.atividade12.frame.PrincipalFrn;
import br.edu.ifg.atividade12.frame.SobreFrm;
import java.util.logging.Logger;
import javax.swing.UIManager;

public class Main {

    public static void main(String[] args) {
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(SobreFrm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            Logger.getLogger(SobreFrm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            Logger.getLogger(SobreFrm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            Logger.getLogger(SobreFrm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        PrincipalFrn principal = new PrincipalFrn();
        principal.setVisible(true);
    }
    
}
