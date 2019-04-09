
package Views;

import java.awt.Component;
import java.net.URL;
import javax.media.Manager;
import javax.media.Player;
import javax.swing.JOptionPane;

/**
 *
 * @author David Lemos Pombal
 */
public class Interfaz extends javax.swing.JFrame {
    
    URL urlArchivoMusica;
    Player reproductor;
    public Interfaz() {
        
        try{
            urlArchivoMusica = new URL("C:/Users/David Lemos Pombal/Desktop/Música/Fairy Tail - Dragon Force Ost.m4a");//indicamos carpeta donde está la musica y una canción.
            reproductor = Manager.createRealizedPlayer(urlArchivoMusica);
            //Agregamos controles
            Component controles = reproductor.getControlPanelComponent();
            
            if(controles != null){
                this.add(controles);
                //coordenadas donde inician los controles
                controles.setLocation(0, 185);
                controles.setSize(320, 25);
            }
            
            //reprodictor.start:
            
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Error al tratar de reproducir el archivo"+ e);
        }
        
        initComponents();
    }
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        PlayBlind = new javax.swing.JLabel();
        AdvanceBlind = new javax.swing.JLabel();
        ResetBlind = new javax.swing.JLabel();
        PauseBlind = new javax.swing.JLabel();
        BackwardBlind = new javax.swing.JLabel();
        ListBlind = new javax.swing.JLabel();
        MinimizeBlind = new javax.swing.JLabel();
        CloseBlind = new javax.swing.JLabel();
        RepeatBlind = new javax.swing.JLabel();
        TextBlind = new javax.swing.JLabel();
        lbPrincipal = new javax.swing.JLabel();

        jLabel1.setText("jLabel1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(PlayBlind, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 170, 40, 50));
        getContentPane().add(AdvanceBlind, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 200, 40, 40));
        getContentPane().add(ResetBlind, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 190, 50, 50));
        getContentPane().add(PauseBlind, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 190, 50, 50));
        getContentPane().add(BackwardBlind, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 190, 40, 50));
        getContentPane().add(ListBlind, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 30, 40));
        getContentPane().add(MinimizeBlind, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 0, 30, 30));
        getContentPane().add(CloseBlind, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 0, 30, 30));
        getContentPane().add(RepeatBlind, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 340, 40, 40));
        getContentPane().add(TextBlind, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 24, 300, 50));

        lbPrincipal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imges/FondoMejorado3.png"))); // NOI18N
        getContentPane().add(lbPrincipal, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 500, 400));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Interfaz().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel AdvanceBlind;
    private javax.swing.JLabel BackwardBlind;
    private javax.swing.JLabel CloseBlind;
    private javax.swing.JLabel ListBlind;
    private javax.swing.JLabel MinimizeBlind;
    private javax.swing.JLabel PauseBlind;
    private javax.swing.JLabel PlayBlind;
    private javax.swing.JLabel RepeatBlind;
    private javax.swing.JLabel ResetBlind;
    private javax.swing.JLabel TextBlind;
    private javax.swing.JLabel jLabel1;
    public javax.swing.JLabel lbPrincipal;
    // End of variables declaration//GEN-END:variables
}
