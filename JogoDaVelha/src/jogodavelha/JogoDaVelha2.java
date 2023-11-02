/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package jogodavelha;

import java.awt.Color;
import javax.swing.JOptionPane;

/**
 *
 * @author alice
 */
public class JogoDaVelha2 extends javax.swing.JFrame {

    /**
     * Creates new form JogoDaVelha2
     */
    public JogoDaVelha2() {
        initComponents();
        
        PlacarX.setText("" + pontX);
        PlacarO.setText("" + pontO);
        
        jButtonX.setText("X");
        jButtonO.setText("O");
    }

    private boolean cont = true;
    private boolean primeiraJogada = true;
    private int pontX = 0;
    private int pontO = 0;

    private String p1 = "";
    private String p2 = "";
    private String p3 = "";
    private String p4 = "";
    private String p5 = "";
    private String p6 = "";
    private String p7 = "";
    private String p8 = "";
    private String p9 = "";

    private boolean p1finish = false;
    private boolean p2finish = false;
    private boolean p3finish = false;
    private boolean p4finish = false;
    private boolean p5finish = false;
    private boolean p6finish = false;
    private boolean p7finish = false;
    private boolean p8finish = false;
    private boolean p9finish = false;

    Color Vermelho = new Color(255, 204, 204);
    Color Azul = new Color(204, 204, 255);
    Color Amarelo = new Color(255, 255, 204);
    Color Original = new Color(255, 255, 255);

    public void AtivarP1() {
        jButton11.setEnabled(true);
        jButton12.setEnabled(true);
        jButton13.setEnabled(true);
        jButton14.setEnabled(true);
        jButton15.setEnabled(true);
        jButton16.setEnabled(true);
        jButton17.setEnabled(true);
        jButton18.setEnabled(true);
        jButton19.setEnabled(true);
    }

    public void AtivarP2() {
        jButton21.setEnabled(true);
        jButton22.setEnabled(true);
        jButton23.setEnabled(true);
        jButton24.setEnabled(true);
        jButton25.setEnabled(true);
        jButton26.setEnabled(true);
        jButton27.setEnabled(true);
        jButton28.setEnabled(true);
        jButton29.setEnabled(true);
    }

    public void AtivarP3() {
        jButton31.setEnabled(true);
        jButton32.setEnabled(true);
        jButton33.setEnabled(true);
        jButton34.setEnabled(true);
        jButton35.setEnabled(true);
        jButton36.setEnabled(true);
        jButton37.setEnabled(true);
        jButton38.setEnabled(true);
        jButton39.setEnabled(true);
    }

    public void AtivarP4() {
        jButton41.setEnabled(true);
        jButton42.setEnabled(true);
        jButton43.setEnabled(true);
        jButton44.setEnabled(true);
        jButton45.setEnabled(true);
        jButton46.setEnabled(true);
        jButton47.setEnabled(true);
        jButton48.setEnabled(true);
        jButton49.setEnabled(true);
    }

    public void AtivarP5() {
        jButton51.setEnabled(true);
        jButton52.setEnabled(true);
        jButton53.setEnabled(true);
        jButton54.setEnabled(true);
        jButton55.setEnabled(true);
        jButton56.setEnabled(true);
        jButton57.setEnabled(true);
        jButton58.setEnabled(true);
        jButton59.setEnabled(true);
    }

    public void AtivarP6() {
        jButton61.setEnabled(true);
        jButton62.setEnabled(true);
        jButton63.setEnabled(true);
        jButton64.setEnabled(true);
        jButton65.setEnabled(true);
        jButton66.setEnabled(true);
        jButton67.setEnabled(true);
        jButton68.setEnabled(true);
        jButton69.setEnabled(true);
    }

    public void AtivarP7() {
        jButton71.setEnabled(true);
        jButton72.setEnabled(true);
        jButton73.setEnabled(true);
        jButton74.setEnabled(true);
        jButton75.setEnabled(true);
        jButton76.setEnabled(true);
        jButton77.setEnabled(true);
        jButton78.setEnabled(true);
        jButton79.setEnabled(true);
    }

    public void AtivarP8() {
        jButton81.setEnabled(true);
        jButton82.setEnabled(true);
        jButton83.setEnabled(true);
        jButton84.setEnabled(true);
        jButton85.setEnabled(true);
        jButton86.setEnabled(true);
        jButton87.setEnabled(true);
        jButton88.setEnabled(true);
        jButton89.setEnabled(true);
    }

    public void AtivarP9() {
        jButton91.setEnabled(true);
        jButton92.setEnabled(true);
        jButton93.setEnabled(true);
        jButton94.setEnabled(true);
        jButton95.setEnabled(true);
        jButton96.setEnabled(true);
        jButton97.setEnabled(true);
        jButton98.setEnabled(true);
        jButton99.setEnabled(true);
    }
    
    public void AtivarTP(){
        AtivarP1();
        AtivarP2();
        AtivarP3();
        AtivarP4();
        AtivarP5();
        AtivarP6();
        AtivarP7();
        AtivarP8();
        AtivarP9();
        
        p1 = "";
        p2 = "";
        p3 = "";
        p4 = "";
        p5 = "";
        p6 = "";
        p7 = "";
        p8 = "";
        p9 = "";
        
        primeiraJogada = true;
        
        p1finish = false;
        p2finish = false;
        p3finish = false;
        p4finish = false;
        p5finish = false;
        p6finish = false;
        p7finish = false;
        p8finish = false;
        p9finish = false;
        
        jButton11.setText("");
        jButton12.setText("");
        jButton13.setText("");
        jButton14.setText("");
        jButton15.setText("");
        jButton16.setText("");
        jButton17.setText("");
        jButton18.setText("");     
        jButton19.setText("");
        
        jButton11.setBackground(Original);
        jButton12.setBackground(Original);
        jButton13.setBackground(Original);
        jButton14.setBackground(Original);
        jButton15.setBackground(Original);
        jButton16.setBackground(Original);
        jButton17.setBackground(Original);
        jButton18.setBackground(Original);
        jButton19.setBackground(Original);
        
        jButton21.setText("");
        jButton22.setText("");
        jButton23.setText("");
        jButton24.setText("");
        jButton25.setText("");
        jButton26.setText("");
        jButton27.setText("");
        jButton28.setText("");     
        jButton29.setText("");
        
        jButton21.setBackground(Original);
        jButton22.setBackground(Original);
        jButton23.setBackground(Original);
        jButton24.setBackground(Original);
        jButton25.setBackground(Original);
        jButton26.setBackground(Original);
        jButton27.setBackground(Original);
        jButton28.setBackground(Original);
        jButton29.setBackground(Original);
        
        jButton31.setText("");
        jButton32.setText("");
        jButton33.setText("");
        jButton34.setText("");
        jButton35.setText("");
        jButton36.setText("");
        jButton37.setText("");
        jButton38.setText("");     
        jButton39.setText("");
        
        jButton31.setBackground(Original);
        jButton32.setBackground(Original);
        jButton33.setBackground(Original);
        jButton34.setBackground(Original);
        jButton35.setBackground(Original);
        jButton36.setBackground(Original);
        jButton37.setBackground(Original);
        jButton38.setBackground(Original);
        jButton39.setBackground(Original);
        
        jButton41.setText("");
        jButton42.setText("");
        jButton43.setText("");
        jButton44.setText("");
        jButton45.setText("");
        jButton46.setText("");
        jButton47.setText("");
        jButton48.setText("");     
        jButton49.setText("");
        
        jButton41.setBackground(Original);
        jButton42.setBackground(Original);
        jButton43.setBackground(Original);
        jButton44.setBackground(Original);
        jButton45.setBackground(Original);
        jButton46.setBackground(Original);
        jButton47.setBackground(Original);
        jButton48.setBackground(Original);
        jButton49.setBackground(Original);
                
        jButton51.setText("");
        jButton52.setText("");
        jButton53.setText("");
        jButton54.setText("");
        jButton55.setText("");
        jButton56.setText("");
        jButton57.setText("");
        jButton58.setText("");     
        jButton59.setText("");

        jButton51.setBackground(Original);
        jButton52.setBackground(Original);
        jButton53.setBackground(Original);
        jButton54.setBackground(Original);
        jButton55.setBackground(Original);
        jButton56.setBackground(Original);
        jButton57.setBackground(Original);
        jButton58.setBackground(Original);
        jButton59.setBackground(Original);
        
        jButton61.setText("");
        jButton62.setText("");
        jButton63.setText("");
        jButton64.setText("");
        jButton65.setText("");
        jButton66.setText("");
        jButton67.setText("");
        jButton68.setText("");     
        jButton69.setText("");
        
        jButton61.setBackground(Original);
        jButton62.setBackground(Original);
        jButton63.setBackground(Original);
        jButton64.setBackground(Original);
        jButton65.setBackground(Original);
        jButton66.setBackground(Original);
        jButton67.setBackground(Original);
        jButton68.setBackground(Original);
        jButton69.setBackground(Original);
        
        jButton71.setText("");
        jButton72.setText("");
        jButton73.setText("");
        jButton74.setText("");
        jButton75.setText("");
        jButton76.setText("");
        jButton77.setText("");
        jButton78.setText("");     
        jButton79.setText("");
        
        jButton71.setBackground(Original);
        jButton72.setBackground(Original);
        jButton73.setBackground(Original);
        jButton74.setBackground(Original);
        jButton75.setBackground(Original);
        jButton76.setBackground(Original);
        jButton77.setBackground(Original);
        jButton78.setBackground(Original);
        jButton79.setBackground(Original);
        
        jButton81.setText("");
        jButton82.setText("");
        jButton83.setText("");
        jButton84.setText("");
        jButton85.setText("");
        jButton86.setText("");
        jButton87.setText("");
        jButton88.setText("");     
        jButton89.setText("");
        
        jButton81.setBackground(Original);
        jButton82.setBackground(Original);
        jButton83.setBackground(Original);
        jButton84.setBackground(Original);
        jButton85.setBackground(Original);
        jButton86.setBackground(Original);
        jButton87.setBackground(Original);
        jButton88.setBackground(Original);
        jButton89.setBackground(Original);
        
        jButton91.setText("");
        jButton92.setText("");
        jButton93.setText("");
        jButton94.setText("");
        jButton95.setText("");
        jButton96.setText("");
        jButton97.setText("");
        jButton98.setText("");     
        jButton99.setText("");
        
        jButton91.setBackground(Original);
        jButton92.setBackground(Original);
        jButton93.setBackground(Original);
        jButton94.setBackground(Original);
        jButton95.setBackground(Original);
        jButton96.setBackground(Original);
        jButton97.setBackground(Original);
        jButton98.setBackground(Original);
        jButton99.setBackground(Original);
    }
    
    /////////////////////////////////////////////////////////////////////////////////////
    public void DesativarP1() {
        jButton11.setEnabled(false);
        jButton12.setEnabled(false);
        jButton13.setEnabled(false);
        jButton14.setEnabled(false);
        jButton15.setEnabled(false);
        jButton16.setEnabled(false);
        jButton17.setEnabled(false);
        jButton18.setEnabled(false);
        jButton19.setEnabled(false);
    }

    public void DesativarP2() {
        jButton21.setEnabled(false);
        jButton22.setEnabled(false);
        jButton23.setEnabled(false);
        jButton24.setEnabled(false);
        jButton25.setEnabled(false);
        jButton26.setEnabled(false);
        jButton27.setEnabled(false);
        jButton28.setEnabled(false);
        jButton29.setEnabled(false);
    }

    public void DesativarP3() {
        jButton31.setEnabled(false);
        jButton32.setEnabled(false);
        jButton33.setEnabled(false);
        jButton34.setEnabled(false);
        jButton35.setEnabled(false);
        jButton36.setEnabled(false);
        jButton37.setEnabled(false);
        jButton38.setEnabled(false);
        jButton39.setEnabled(false);
    }

    public void DesativarP4() {
        jButton41.setEnabled(false);
        jButton42.setEnabled(false);
        jButton43.setEnabled(false);
        jButton44.setEnabled(false);
        jButton45.setEnabled(false);
        jButton46.setEnabled(false);
        jButton47.setEnabled(false);
        jButton48.setEnabled(false);
        jButton49.setEnabled(false);
    }

    public void DesativarP5() {
        jButton51.setEnabled(false);
        jButton52.setEnabled(false);
        jButton53.setEnabled(false);
        jButton54.setEnabled(false);
        jButton55.setEnabled(false);
        jButton56.setEnabled(false);
        jButton57.setEnabled(false);
        jButton58.setEnabled(false);
        jButton59.setEnabled(false);
    }

    public void DesativarP6() {
        jButton61.setEnabled(false);
        jButton62.setEnabled(false);
        jButton63.setEnabled(false);
        jButton64.setEnabled(false);
        jButton65.setEnabled(false);
        jButton66.setEnabled(false);
        jButton67.setEnabled(false);
        jButton68.setEnabled(false);
        jButton69.setEnabled(false);
    }

    public void DesativarP7() {
        jButton71.setEnabled(false);
        jButton72.setEnabled(false);
        jButton73.setEnabled(false);
        jButton74.setEnabled(false);
        jButton75.setEnabled(false);
        jButton76.setEnabled(false);
        jButton77.setEnabled(false);
        jButton78.setEnabled(false);
        jButton79.setEnabled(false);
    }

    public void DesativarP8() {
        jButton81.setEnabled(false);
        jButton82.setEnabled(false);
        jButton83.setEnabled(false);
        jButton84.setEnabled(false);
        jButton85.setEnabled(false);
        jButton86.setEnabled(false);
        jButton87.setEnabled(false);
        jButton88.setEnabled(false);
        jButton89.setEnabled(false);
    }

    public void DesativarP9() {
        jButton91.setEnabled(false);
        jButton92.setEnabled(false);
        jButton93.setEnabled(false);
        jButton94.setEnabled(false);
        jButton95.setEnabled(false);
        jButton96.setEnabled(false);
        jButton97.setEnabled(false);
        jButton98.setEnabled(false);
        jButton99.setEnabled(false);
    }

    public void DesativarTP(){
        DesativarP1();
        DesativarP2();
        DesativarP3();
        DesativarP4();
        DesativarP5();
        DesativarP6();
        DesativarP7();
        DesativarP8();
        DesativarP9();
    }
    
    /////////////////////////////////////////////////////////////////////////////
    public void XVencedorP1() {
        jButton11.setBackground(Vermelho);
        jButton12.setBackground(Vermelho);
        jButton13.setBackground(Vermelho);
        jButton14.setBackground(Vermelho);
        jButton15.setBackground(Vermelho);
        jButton16.setBackground(Vermelho);
        jButton17.setBackground(Vermelho);
        jButton18.setBackground(Vermelho);
        jButton19.setBackground(Vermelho);

        p1finish = true;
        
        }

    public void XVencedorP2() {
        jButton21.setBackground(Vermelho);
        jButton22.setBackground(Vermelho);
        jButton23.setBackground(Vermelho);
        jButton24.setBackground(Vermelho);
        jButton25.setBackground(Vermelho);
        jButton26.setBackground(Vermelho);
        jButton27.setBackground(Vermelho);
        jButton28.setBackground(Vermelho);
        jButton29.setBackground(Vermelho);

        p2finish = true;
    }

    public void XVencedorP3() {
        jButton31.setBackground(Vermelho);
        jButton32.setBackground(Vermelho);
        jButton33.setBackground(Vermelho);
        jButton34.setBackground(Vermelho);
        jButton35.setBackground(Vermelho);
        jButton36.setBackground(Vermelho);
        jButton37.setBackground(Vermelho);
        jButton38.setBackground(Vermelho);
        jButton39.setBackground(Vermelho);

        p3finish = true;
    }

    public void XVencedorP4() {
        jButton41.setBackground(Vermelho);
        jButton42.setBackground(Vermelho);
        jButton43.setBackground(Vermelho);
        jButton44.setBackground(Vermelho);
        jButton45.setBackground(Vermelho);
        jButton46.setBackground(Vermelho);
        jButton47.setBackground(Vermelho);
        jButton48.setBackground(Vermelho);
        jButton49.setBackground(Vermelho);

        p4finish = true;
    }

    public void XVencedorP5() {
        jButton51.setBackground(Vermelho);
        jButton52.setBackground(Vermelho);
        jButton53.setBackground(Vermelho);
        jButton54.setBackground(Vermelho);
        jButton55.setBackground(Vermelho);
        jButton56.setBackground(Vermelho);
        jButton57.setBackground(Vermelho);
        jButton58.setBackground(Vermelho);
        jButton59.setBackground(Vermelho);

        p5finish = true;
    }

    public void XVencedorP6() {
        jButton61.setBackground(Vermelho);
        jButton62.setBackground(Vermelho);
        jButton63.setBackground(Vermelho);
        jButton64.setBackground(Vermelho);
        jButton65.setBackground(Vermelho);
        jButton66.setBackground(Vermelho);
        jButton67.setBackground(Vermelho);
        jButton68.setBackground(Vermelho);
        jButton69.setBackground(Vermelho);

        p6finish = true;
    }

    public void XVencedorP7() {
        jButton71.setBackground(Vermelho);
        jButton72.setBackground(Vermelho);
        jButton73.setBackground(Vermelho);
        jButton74.setBackground(Vermelho);
        jButton75.setBackground(Vermelho);
        jButton76.setBackground(Vermelho);
        jButton77.setBackground(Vermelho);
        jButton78.setBackground(Vermelho);
        jButton79.setBackground(Vermelho);

        p7finish = true;
    }

    public void XVencedorP8() {
        jButton81.setBackground(Vermelho);
        jButton82.setBackground(Vermelho);
        jButton83.setBackground(Vermelho);
        jButton84.setBackground(Vermelho);
        jButton85.setBackground(Vermelho);
        jButton86.setBackground(Vermelho);
        jButton87.setBackground(Vermelho);
        jButton88.setBackground(Vermelho);
        jButton89.setBackground(Vermelho);

        p8finish = true;
    }

    public void XVencedorP9() {
        jButton91.setBackground(Vermelho);
        jButton92.setBackground(Vermelho);
        jButton93.setBackground(Vermelho);
        jButton94.setBackground(Vermelho);
        jButton95.setBackground(Vermelho);
        jButton96.setBackground(Vermelho);
        jButton97.setBackground(Vermelho);
        jButton98.setBackground(Vermelho);
        jButton99.setBackground(Vermelho);

        p9finish = true;
    }

    ////////////////////////////////////////////////////////////////////////////
    public void OVencedorP1() {
        jButton11.setBackground(Azul);
        jButton12.setBackground(Azul);
        jButton13.setBackground(Azul);
        jButton14.setBackground(Azul);
        jButton15.setBackground(Azul);
        jButton16.setBackground(Azul);
        jButton17.setBackground(Azul);
        jButton18.setBackground(Azul);
        jButton19.setBackground(Azul);

        p1finish = true;
    }

    public void OVencedorP2() {
        jButton21.setBackground(Azul);
        jButton22.setBackground(Azul);
        jButton23.setBackground(Azul);
        jButton24.setBackground(Azul);
        jButton25.setBackground(Azul);
        jButton26.setBackground(Azul);
        jButton27.setBackground(Azul);
        jButton28.setBackground(Azul);
        jButton29.setBackground(Azul);

        p2finish = true;
    }

    public void OVencedorP3() {
        jButton31.setBackground(Azul);
        jButton32.setBackground(Azul);
        jButton33.setBackground(Azul);
        jButton34.setBackground(Azul);
        jButton35.setBackground(Azul);
        jButton36.setBackground(Azul);
        jButton37.setBackground(Azul);
        jButton38.setBackground(Azul);
        jButton39.setBackground(Azul);

        p3finish = true;
    }

    public void OVencedorP4() {
        jButton41.setBackground(Azul);
        jButton42.setBackground(Azul);
        jButton43.setBackground(Azul);
        jButton44.setBackground(Azul);
        jButton45.setBackground(Azul);
        jButton46.setBackground(Azul);
        jButton47.setBackground(Azul);
        jButton48.setBackground(Azul);
        jButton49.setBackground(Azul);

        p4finish = true;
    }

    public void OVencedorP5() {
        jButton51.setBackground(Azul);
        jButton52.setBackground(Azul);
        jButton53.setBackground(Azul);
        jButton54.setBackground(Azul);
        jButton55.setBackground(Azul);
        jButton56.setBackground(Azul);
        jButton57.setBackground(Azul);
        jButton58.setBackground(Azul);
        jButton59.setBackground(Azul);

        p5finish = true;
    }

    public void OVencedorP6() {
        jButton61.setBackground(Azul);
        jButton62.setBackground(Azul);
        jButton63.setBackground(Azul);
        jButton64.setBackground(Azul);
        jButton65.setBackground(Azul);
        jButton66.setBackground(Azul);
        jButton67.setBackground(Azul);
        jButton68.setBackground(Azul);
        jButton69.setBackground(Azul);

        p6finish = true;
    }

    public void OVencedorP7() {
        jButton71.setBackground(Azul);
        jButton72.setBackground(Azul);
        jButton73.setBackground(Azul);
        jButton74.setBackground(Azul);
        jButton75.setBackground(Azul);
        jButton76.setBackground(Azul);
        jButton77.setBackground(Azul);
        jButton78.setBackground(Azul);
        jButton79.setBackground(Azul);

        p7finish = true;
    }

    public void OVencedorP8() {
        jButton81.setBackground(Azul);
        jButton82.setBackground(Azul);
        jButton83.setBackground(Azul);
        jButton84.setBackground(Azul);
        jButton85.setBackground(Azul);
        jButton86.setBackground(Azul);
        jButton87.setBackground(Azul);
        jButton88.setBackground(Azul);
        jButton89.setBackground(Azul);

        p8finish = true;
    }

    public void OVencedorP9() {
        jButton91.setBackground(Azul);
        jButton92.setBackground(Azul);
        jButton93.setBackground(Azul);
        jButton94.setBackground(Azul);
        jButton95.setBackground(Azul);
        jButton96.setBackground(Azul);
        jButton97.setBackground(Azul);
        jButton98.setBackground(Azul);
        jButton99.setBackground(Azul);

        p9finish = true;
    }

    ////////////////////////////////////////////////////////////////////////////
    public void VelhaP1() {
            jButton11.setBackground(Amarelo);
            jButton12.setBackground(Amarelo);
            jButton13.setBackground(Amarelo);
            jButton14.setBackground(Amarelo);
            jButton15.setBackground(Amarelo);
            jButton16.setBackground(Amarelo);
            jButton17.setBackground(Amarelo);
            jButton18.setBackground(Amarelo);
            jButton19.setBackground(Amarelo);

            p1finish = true;
    }

    public void VelhaP2() {
        
            jButton21.setBackground(Amarelo);
            jButton22.setBackground(Amarelo);
            jButton23.setBackground(Amarelo);
            jButton24.setBackground(Amarelo);
            jButton25.setBackground(Amarelo);
            jButton26.setBackground(Amarelo);
            jButton27.setBackground(Amarelo);
            jButton28.setBackground(Amarelo);
            jButton29.setBackground(Amarelo);

            p2finish = true;
        
    }

    public void VelhaP3() {
       
            jButton31.setBackground(Amarelo);
            jButton32.setBackground(Amarelo);
            jButton33.setBackground(Amarelo);
            jButton34.setBackground(Amarelo);
            jButton35.setBackground(Amarelo);
            jButton36.setBackground(Amarelo);
            jButton37.setBackground(Amarelo);
            jButton38.setBackground(Amarelo);
            jButton39.setBackground(Amarelo);

            p3finish = true;
        
    }

    public void VelhaP4() {
      
            jButton41.setBackground(Amarelo);
            jButton42.setBackground(Amarelo);
            jButton43.setBackground(Amarelo);
            jButton44.setBackground(Amarelo);
            jButton45.setBackground(Amarelo);
            jButton46.setBackground(Amarelo);
            jButton47.setBackground(Amarelo);
            jButton48.setBackground(Amarelo);
            jButton49.setBackground(Amarelo);

            p4finish = true;
        
    }

    public void VelhaP5() {
        
            jButton51.setBackground(Amarelo);
            jButton52.setBackground(Amarelo);
            jButton53.setBackground(Amarelo);
            jButton54.setBackground(Amarelo);
            jButton55.setBackground(Amarelo);
            jButton56.setBackground(Amarelo);
            jButton57.setBackground(Amarelo);
            jButton58.setBackground(Amarelo);
            jButton59.setBackground(Amarelo);

            p5finish = true;
        
    }

    public void VelhaP6() {
       
            jButton61.setBackground(Amarelo);
            jButton62.setBackground(Amarelo);
            jButton63.setBackground(Amarelo);
            jButton64.setBackground(Amarelo);
            jButton65.setBackground(Amarelo);
            jButton66.setBackground(Amarelo);
            jButton67.setBackground(Amarelo);
            jButton68.setBackground(Amarelo);
            jButton69.setBackground(Amarelo);

            p6finish = true;
        
    }

    public void VelhaP7() {
            jButton71.setBackground(Amarelo);
            jButton72.setBackground(Amarelo);
            jButton73.setBackground(Amarelo);
            jButton74.setBackground(Amarelo);
            jButton75.setBackground(Amarelo);
            jButton76.setBackground(Amarelo);
            jButton77.setBackground(Amarelo);
            jButton78.setBackground(Amarelo);
            jButton79.setBackground(Amarelo);

            p7finish = true;
        
    }

    public void VelhaP8() {
        
            jButton81.setBackground(Amarelo);
            jButton82.setBackground(Amarelo);
            jButton83.setBackground(Amarelo);
            jButton84.setBackground(Amarelo);
            jButton85.setBackground(Amarelo);
            jButton86.setBackground(Amarelo);
            jButton87.setBackground(Amarelo);
            jButton88.setBackground(Amarelo);
            jButton89.setBackground(Amarelo);

            p8finish = true;
        
    }

    public void VelhaP9() {
       
            jButton91.setBackground(Amarelo);
            jButton92.setBackground(Amarelo);
            jButton93.setBackground(Amarelo);
            jButton94.setBackground(Amarelo);
            jButton95.setBackground(Amarelo);
            jButton96.setBackground(Amarelo);
            jButton97.setBackground(Amarelo);
            jButton98.setBackground(Amarelo);
            jButton99.setBackground(Amarelo);

            p9finish = true;
    }
    
    /////////////////////////////////////////////////////////////////////////////
    //Solicitando nomes
    
    String JogadorX = (JOptionPane.showInputDialog("Informe o nome do jogador X:"));
    String JogadorO = (JOptionPane.showInputDialog("Informe o nome do jogador O:"));

    ////////////////////////////////////////////////////////////////////////////
    public void VerificarVelha() {
        if (p1.equals("X") && p2.equals("X") && p3.equals("X")) {
            DesativarTP();
            JOptionPane.showMessageDialog(null, JogadorX + " venceu!");
            pontX++;
            cont = true;
            AtivarTP();

        } else if (p1.equals("X") && p4.equals("X") && p7.equals("X")) {
            DesativarTP();
            JOptionPane.showMessageDialog(null, JogadorX + " venceu!");
            pontX++;
            cont = true;
            AtivarTP();

        } else if (p1.equals("X") && p5.equals("X") && p9.equals("X")) {
            DesativarTP();
            JOptionPane.showMessageDialog(null, JogadorX + " venceu!");
            pontX++; 
            cont = true;
            AtivarTP();

        } else if (p2.equals("X") && p5.equals("X") && p8.equals("X")) {
            DesativarTP();
            JOptionPane.showMessageDialog(null, JogadorX + " venceu!");
            pontX++; 
            cont = true;
            AtivarTP();

        } else if (p3.equals("X") && p5.equals("X") && p7.equals("X")) {
            DesativarTP();
            JOptionPane.showMessageDialog(null, JogadorX + " venceu!");
            pontX++; 
            cont = true;
            AtivarTP();

        } else if (p4.equals("X") && p5.equals("X") && p6.equals("X")) {
            DesativarTP();
            JOptionPane.showMessageDialog(null, JogadorX + " venceu!");
            pontX++; 
            cont = true;
            AtivarTP();
            

        } else if (p3.equals("X") && p6.equals("X") && p9.equals("X")) {
            DesativarTP();
            JOptionPane.showMessageDialog(null, JogadorX + " venceu!");
            pontX++; 
            cont = true;
            AtivarTP();

        } else if (p7.equals("X") && p8.equals("X") && p9.equals("X")) {
            DesativarTP();
            JOptionPane.showMessageDialog(null, JogadorX + " venceu!");
            pontX++; 
            cont = true;
            AtivarTP();

            /////////////////////////////////////////////////////////////////////////////
        } else if (p1.equals("O") && p2.equals("O") && p3.equals("O")) {
            DesativarTP();
            JOptionPane.showMessageDialog(null, JogadorO + " venceu!");
            pontO++; 
            cont = false;
            AtivarTP();

        } else if (p1.equals("O") && p4.equals("O") && p7.equals("O")) {
            DesativarTP();
            JOptionPane.showMessageDialog(null, JogadorO + " venceu!");
            pontO++;
            cont = false;
            AtivarTP();

        } else if (p1.equals("O") && p5.equals("O") && p9.equals("O")) {
            DesativarTP();
            JOptionPane.showMessageDialog(null, JogadorO + " venceu!");
            pontO++;
            cont = false;
            AtivarTP();

        } else if (p2.equals("O") && p5.equals("O") && p8.equals("O")) {
            DesativarTP();
            JOptionPane.showMessageDialog(null, JogadorO + " venceu!");
            pontO++;
            cont = false;
            AtivarTP();

        } else if (p3.equals("O") && p5.equals("O") && p7.equals("O")) {
            DesativarTP();
            JOptionPane.showMessageDialog(null, JogadorO + " venceu!");
            pontO++;
            cont = false;
            AtivarTP();

        } else if (p4.equals("O") && p5.equals("O") && p6.equals("O")) {
            DesativarTP();
            JOptionPane.showMessageDialog(null, JogadorO + " venceu!");
            pontO++;
            cont = false;
            AtivarTP();

        } else if (p3.equals("O") && p6.equals("O") && p9.equals("O")) {
            DesativarTP();
            JOptionPane.showMessageDialog(null, JogadorO + " venceu!");
            pontO++;
            cont = false;
            AtivarTP();

        } else if (p7.equals("O") && p8.equals("O") && p9.equals("O")) {
            DesativarTP();
            JOptionPane.showMessageDialog(null, JogadorO + " venceu!");
            pontO++;
            cont = false;
            AtivarTP();

        } else if (!p1.equals("") && !p2.equals("") && !p3.equals("") && !p4.equals("") && !p5.equals("") && !p6.equals("") && !p7.equals("") && !p8.equals("") && !p9.equals("")) {
            DesativarTP();
            JOptionPane.showMessageDialog(null, "Deu velha!");
            AtivarTP();
        }
        
        if(cont == true){
            jButtonX.setBackground(Vermelho);
            jButtonO.setBackground(Original);
        } else if (cont == false){
            jButtonO.setBackground(Azul);
            jButtonX.setBackground(Original);
        }
        
        PlacarX.setText("" + pontX);
        PlacarO.setText("" + pontO);
    }
               
                
    ////////////////////////////////////////////////////////////////////////////
    //Iniciar mostrando que é vez do jogador X
    //jButtonX.setBackground(Vermelho);
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jButton11 = new javax.swing.JButton();
        jButton12 = new javax.swing.JButton();
        jButton13 = new javax.swing.JButton();
        jButton14 = new javax.swing.JButton();
        jButton15 = new javax.swing.JButton();
        jButton16 = new javax.swing.JButton();
        jButton17 = new javax.swing.JButton();
        jButton18 = new javax.swing.JButton();
        jButton19 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jButton21 = new javax.swing.JButton();
        jButton22 = new javax.swing.JButton();
        jButton23 = new javax.swing.JButton();
        jButton24 = new javax.swing.JButton();
        jButton25 = new javax.swing.JButton();
        jButton26 = new javax.swing.JButton();
        jButton27 = new javax.swing.JButton();
        jButton28 = new javax.swing.JButton();
        jButton29 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jButton31 = new javax.swing.JButton();
        jButton32 = new javax.swing.JButton();
        jButton33 = new javax.swing.JButton();
        jButton34 = new javax.swing.JButton();
        jButton35 = new javax.swing.JButton();
        jButton36 = new javax.swing.JButton();
        jButton37 = new javax.swing.JButton();
        jButton38 = new javax.swing.JButton();
        jButton39 = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jButton41 = new javax.swing.JButton();
        jButton42 = new javax.swing.JButton();
        jButton43 = new javax.swing.JButton();
        jButton44 = new javax.swing.JButton();
        jButton45 = new javax.swing.JButton();
        jButton46 = new javax.swing.JButton();
        jButton47 = new javax.swing.JButton();
        jButton48 = new javax.swing.JButton();
        jButton49 = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jButton51 = new javax.swing.JButton();
        jButton52 = new javax.swing.JButton();
        jButton53 = new javax.swing.JButton();
        jButton54 = new javax.swing.JButton();
        jButton55 = new javax.swing.JButton();
        jButton56 = new javax.swing.JButton();
        jButton57 = new javax.swing.JButton();
        jButton58 = new javax.swing.JButton();
        jButton59 = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
        jButton61 = new javax.swing.JButton();
        jButton62 = new javax.swing.JButton();
        jButton63 = new javax.swing.JButton();
        jButton64 = new javax.swing.JButton();
        jButton65 = new javax.swing.JButton();
        jButton66 = new javax.swing.JButton();
        jButton67 = new javax.swing.JButton();
        jButton68 = new javax.swing.JButton();
        jButton69 = new javax.swing.JButton();
        jPanel7 = new javax.swing.JPanel();
        jButton71 = new javax.swing.JButton();
        jButton72 = new javax.swing.JButton();
        jButton73 = new javax.swing.JButton();
        jButton74 = new javax.swing.JButton();
        jButton75 = new javax.swing.JButton();
        jButton76 = new javax.swing.JButton();
        jButton77 = new javax.swing.JButton();
        jButton78 = new javax.swing.JButton();
        jButton79 = new javax.swing.JButton();
        jPanel8 = new javax.swing.JPanel();
        jButton81 = new javax.swing.JButton();
        jButton82 = new javax.swing.JButton();
        jButton83 = new javax.swing.JButton();
        jButton84 = new javax.swing.JButton();
        jButton85 = new javax.swing.JButton();
        jButton86 = new javax.swing.JButton();
        jButton87 = new javax.swing.JButton();
        jButton88 = new javax.swing.JButton();
        jButton89 = new javax.swing.JButton();
        jPanel9 = new javax.swing.JPanel();
        jButton91 = new javax.swing.JButton();
        jButton92 = new javax.swing.JButton();
        jButton93 = new javax.swing.JButton();
        jButton94 = new javax.swing.JButton();
        jButton95 = new javax.swing.JButton();
        jButton96 = new javax.swing.JButton();
        jButton97 = new javax.swing.JButton();
        jButton98 = new javax.swing.JButton();
        jButton99 = new javax.swing.JButton();
        jPanel10 = new javax.swing.JPanel();
        jButtonX = new javax.swing.JButton();
        jPanel11 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        PlacarX = new javax.swing.JTextField();
        PlacarO = new javax.swing.JTextField();
        jPanel12 = new javax.swing.JPanel();
        jButtonO = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(153, 153, 153));
        getContentPane().setLayout(new java.awt.GridLayout(4, 3, 3, 4));

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.setLayout(new java.awt.GridLayout(3, 3, 3, 3));

        jButton11.setFont(new java.awt.Font("Corbel Light", 1, 36)); // NOI18N
        jButton11.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton11);

        jButton12.setFont(new java.awt.Font("Corbel Light", 1, 36)); // NOI18N
        jButton12.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton12ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton12);

        jButton13.setFont(new java.awt.Font("Corbel Light", 1, 36)); // NOI18N
        jButton13.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton13ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton13);

        jButton14.setFont(new java.awt.Font("Corbel Light", 1, 36)); // NOI18N
        jButton14.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton14ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton14);

        jButton15.setFont(new java.awt.Font("Corbel Light", 1, 36)); // NOI18N
        jButton15.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton15ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton15);

        jButton16.setFont(new java.awt.Font("Corbel Light", 1, 36)); // NOI18N
        jButton16.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton16ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton16);

        jButton17.setFont(new java.awt.Font("Corbel Light", 1, 36)); // NOI18N
        jButton17.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton17ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton17);

        jButton18.setFont(new java.awt.Font("Corbel Light", 1, 36)); // NOI18N
        jButton18.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton18ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton18);

        jButton19.setFont(new java.awt.Font("Corbel Light", 1, 36)); // NOI18N
        jButton19.setToolTipText("");
        jButton19.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton19ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton19);

        getContentPane().add(jPanel1);

        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel2.setLayout(new java.awt.GridLayout(3, 3, 3, 3));

        jButton21.setFont(new java.awt.Font("Corbel Light", 1, 36)); // NOI18N
        jButton21.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton21.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton21ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton21);

        jButton22.setFont(new java.awt.Font("Corbel Light", 1, 36)); // NOI18N
        jButton22.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton22.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton22ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton22);

        jButton23.setFont(new java.awt.Font("Corbel Light", 1, 36)); // NOI18N
        jButton23.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton23.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton23ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton23);

        jButton24.setFont(new java.awt.Font("Corbel Light", 1, 36)); // NOI18N
        jButton24.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton24.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton24ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton24);

        jButton25.setFont(new java.awt.Font("Corbel Light", 1, 36)); // NOI18N
        jButton25.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton25.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton25ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton25);

        jButton26.setFont(new java.awt.Font("Corbel Light", 1, 36)); // NOI18N
        jButton26.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton26.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton26ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton26);

        jButton27.setFont(new java.awt.Font("Corbel Light", 1, 36)); // NOI18N
        jButton27.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton27.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton27ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton27);

        jButton28.setFont(new java.awt.Font("Corbel Light", 1, 36)); // NOI18N
        jButton28.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton28.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton28ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton28);

        jButton29.setFont(new java.awt.Font("Corbel Light", 1, 36)); // NOI18N
        jButton29.setToolTipText("");
        jButton29.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton29.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton29ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton29);

        getContentPane().add(jPanel2);

        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel3.setLayout(new java.awt.GridLayout(3, 3, 3, 3));

        jButton31.setFont(new java.awt.Font("Corbel Light", 1, 36)); // NOI18N
        jButton31.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton31.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton31ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton31);

        jButton32.setFont(new java.awt.Font("Corbel Light", 1, 36)); // NOI18N
        jButton32.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton32.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton32ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton32);

        jButton33.setFont(new java.awt.Font("Corbel Light", 1, 36)); // NOI18N
        jButton33.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton33.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton33ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton33);

        jButton34.setFont(new java.awt.Font("Corbel Light", 1, 36)); // NOI18N
        jButton34.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton34.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton34ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton34);

        jButton35.setFont(new java.awt.Font("Corbel Light", 1, 36)); // NOI18N
        jButton35.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton35.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton35ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton35);

        jButton36.setFont(new java.awt.Font("Corbel Light", 1, 36)); // NOI18N
        jButton36.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton36.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton36ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton36);

        jButton37.setFont(new java.awt.Font("Corbel Light", 1, 36)); // NOI18N
        jButton37.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton37.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton37ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton37);

        jButton38.setFont(new java.awt.Font("Corbel Light", 1, 36)); // NOI18N
        jButton38.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton38.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton38ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton38);

        jButton39.setFont(new java.awt.Font("Corbel Light", 1, 36)); // NOI18N
        jButton39.setToolTipText("");
        jButton39.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton39.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton39ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton39);

        getContentPane().add(jPanel3);

        jPanel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel4.setLayout(new java.awt.GridLayout(3, 3, 3, 3));

        jButton41.setFont(new java.awt.Font("Corbel Light", 1, 36)); // NOI18N
        jButton41.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton41ActionPerformed(evt);
            }
        });
        jPanel4.add(jButton41);

        jButton42.setFont(new java.awt.Font("Corbel Light", 1, 36)); // NOI18N
        jButton42.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton42ActionPerformed(evt);
            }
        });
        jPanel4.add(jButton42);

        jButton43.setFont(new java.awt.Font("Corbel Light", 1, 36)); // NOI18N
        jButton43.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton43ActionPerformed(evt);
            }
        });
        jPanel4.add(jButton43);

        jButton44.setFont(new java.awt.Font("Corbel Light", 1, 36)); // NOI18N
        jButton44.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton44ActionPerformed(evt);
            }
        });
        jPanel4.add(jButton44);

        jButton45.setFont(new java.awt.Font("Corbel Light", 1, 36)); // NOI18N
        jButton45.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton45ActionPerformed(evt);
            }
        });
        jPanel4.add(jButton45);

        jButton46.setFont(new java.awt.Font("Corbel Light", 1, 36)); // NOI18N
        jButton46.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton46ActionPerformed(evt);
            }
        });
        jPanel4.add(jButton46);

        jButton47.setFont(new java.awt.Font("Corbel Light", 1, 36)); // NOI18N
        jButton47.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton47ActionPerformed(evt);
            }
        });
        jPanel4.add(jButton47);

        jButton48.setFont(new java.awt.Font("Corbel Light", 1, 36)); // NOI18N
        jButton48.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton48ActionPerformed(evt);
            }
        });
        jPanel4.add(jButton48);

        jButton49.setFont(new java.awt.Font("Corbel Light", 1, 36)); // NOI18N
        jButton49.setToolTipText("");
        jButton49.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton49ActionPerformed(evt);
            }
        });
        jPanel4.add(jButton49);

        getContentPane().add(jPanel4);

        jPanel5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel5.setLayout(new java.awt.GridLayout(3, 3, 3, 3));

        jButton51.setFont(new java.awt.Font("Corbel Light", 1, 36)); // NOI18N
        jButton51.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton51ActionPerformed(evt);
            }
        });
        jPanel5.add(jButton51);

        jButton52.setFont(new java.awt.Font("Corbel Light", 1, 36)); // NOI18N
        jButton52.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton52ActionPerformed(evt);
            }
        });
        jPanel5.add(jButton52);

        jButton53.setFont(new java.awt.Font("Corbel Light", 1, 36)); // NOI18N
        jButton53.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton53ActionPerformed(evt);
            }
        });
        jPanel5.add(jButton53);

        jButton54.setFont(new java.awt.Font("Corbel Light", 1, 36)); // NOI18N
        jButton54.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton54ActionPerformed(evt);
            }
        });
        jPanel5.add(jButton54);

        jButton55.setFont(new java.awt.Font("Corbel Light", 1, 36)); // NOI18N
        jButton55.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton55ActionPerformed(evt);
            }
        });
        jPanel5.add(jButton55);

        jButton56.setFont(new java.awt.Font("Corbel Light", 1, 36)); // NOI18N
        jButton56.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton56ActionPerformed(evt);
            }
        });
        jPanel5.add(jButton56);

        jButton57.setFont(new java.awt.Font("Corbel Light", 1, 36)); // NOI18N
        jButton57.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton57ActionPerformed(evt);
            }
        });
        jPanel5.add(jButton57);

        jButton58.setFont(new java.awt.Font("Corbel Light", 1, 36)); // NOI18N
        jButton58.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton58ActionPerformed(evt);
            }
        });
        jPanel5.add(jButton58);

        jButton59.setFont(new java.awt.Font("Corbel Light", 1, 36)); // NOI18N
        jButton59.setToolTipText("");
        jButton59.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton59ActionPerformed(evt);
            }
        });
        jPanel5.add(jButton59);

        getContentPane().add(jPanel5);

        jPanel6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel6.setLayout(new java.awt.GridLayout(3, 3, 3, 3));

        jButton61.setFont(new java.awt.Font("Corbel Light", 1, 36)); // NOI18N
        jButton61.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton61ActionPerformed(evt);
            }
        });
        jPanel6.add(jButton61);

        jButton62.setFont(new java.awt.Font("Corbel Light", 1, 36)); // NOI18N
        jButton62.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton62ActionPerformed(evt);
            }
        });
        jPanel6.add(jButton62);

        jButton63.setFont(new java.awt.Font("Corbel Light", 1, 36)); // NOI18N
        jButton63.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton63ActionPerformed(evt);
            }
        });
        jPanel6.add(jButton63);

        jButton64.setFont(new java.awt.Font("Corbel Light", 1, 36)); // NOI18N
        jButton64.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton64ActionPerformed(evt);
            }
        });
        jPanel6.add(jButton64);

        jButton65.setFont(new java.awt.Font("Corbel Light", 1, 36)); // NOI18N
        jButton65.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton65ActionPerformed(evt);
            }
        });
        jPanel6.add(jButton65);

        jButton66.setFont(new java.awt.Font("Corbel Light", 1, 36)); // NOI18N
        jButton66.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton66ActionPerformed(evt);
            }
        });
        jPanel6.add(jButton66);

        jButton67.setFont(new java.awt.Font("Corbel Light", 1, 36)); // NOI18N
        jButton67.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton67ActionPerformed(evt);
            }
        });
        jPanel6.add(jButton67);

        jButton68.setFont(new java.awt.Font("Corbel Light", 1, 36)); // NOI18N
        jButton68.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton68ActionPerformed(evt);
            }
        });
        jPanel6.add(jButton68);

        jButton69.setFont(new java.awt.Font("Corbel Light", 1, 36)); // NOI18N
        jButton69.setToolTipText("");
        jButton69.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton69ActionPerformed(evt);
            }
        });
        jPanel6.add(jButton69);

        getContentPane().add(jPanel6);

        jPanel7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel7.setLayout(new java.awt.GridLayout(3, 3, 3, 3));

        jButton71.setFont(new java.awt.Font("Corbel Light", 1, 36)); // NOI18N
        jButton71.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton71ActionPerformed(evt);
            }
        });
        jPanel7.add(jButton71);

        jButton72.setFont(new java.awt.Font("Corbel Light", 1, 36)); // NOI18N
        jButton72.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton72ActionPerformed(evt);
            }
        });
        jPanel7.add(jButton72);

        jButton73.setFont(new java.awt.Font("Corbel Light", 1, 36)); // NOI18N
        jButton73.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton73ActionPerformed(evt);
            }
        });
        jPanel7.add(jButton73);

        jButton74.setFont(new java.awt.Font("Corbel Light", 1, 36)); // NOI18N
        jButton74.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton74ActionPerformed(evt);
            }
        });
        jPanel7.add(jButton74);

        jButton75.setFont(new java.awt.Font("Corbel Light", 1, 36)); // NOI18N
        jButton75.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton75ActionPerformed(evt);
            }
        });
        jPanel7.add(jButton75);

        jButton76.setFont(new java.awt.Font("Corbel Light", 1, 36)); // NOI18N
        jButton76.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton76ActionPerformed(evt);
            }
        });
        jPanel7.add(jButton76);

        jButton77.setFont(new java.awt.Font("Corbel Light", 1, 36)); // NOI18N
        jButton77.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton77ActionPerformed(evt);
            }
        });
        jPanel7.add(jButton77);

        jButton78.setFont(new java.awt.Font("Corbel Light", 1, 36)); // NOI18N
        jButton78.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton78ActionPerformed(evt);
            }
        });
        jPanel7.add(jButton78);

        jButton79.setFont(new java.awt.Font("Corbel Light", 1, 36)); // NOI18N
        jButton79.setToolTipText("");
        jButton79.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton79ActionPerformed(evt);
            }
        });
        jPanel7.add(jButton79);

        getContentPane().add(jPanel7);

        jPanel8.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel8.setLayout(new java.awt.GridLayout(3, 3, 3, 3));

        jButton81.setFont(new java.awt.Font("Corbel Light", 1, 36)); // NOI18N
        jButton81.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton81ActionPerformed(evt);
            }
        });
        jPanel8.add(jButton81);

        jButton82.setFont(new java.awt.Font("Corbel Light", 1, 36)); // NOI18N
        jButton82.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton82ActionPerformed(evt);
            }
        });
        jPanel8.add(jButton82);

        jButton83.setFont(new java.awt.Font("Corbel Light", 1, 36)); // NOI18N
        jButton83.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton83ActionPerformed(evt);
            }
        });
        jPanel8.add(jButton83);

        jButton84.setFont(new java.awt.Font("Corbel Light", 1, 36)); // NOI18N
        jButton84.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton84ActionPerformed(evt);
            }
        });
        jPanel8.add(jButton84);

        jButton85.setFont(new java.awt.Font("Corbel Light", 1, 36)); // NOI18N
        jButton85.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton85ActionPerformed(evt);
            }
        });
        jPanel8.add(jButton85);

        jButton86.setFont(new java.awt.Font("Corbel Light", 1, 36)); // NOI18N
        jButton86.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton86ActionPerformed(evt);
            }
        });
        jPanel8.add(jButton86);

        jButton87.setFont(new java.awt.Font("Corbel Light", 1, 36)); // NOI18N
        jButton87.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton87ActionPerformed(evt);
            }
        });
        jPanel8.add(jButton87);

        jButton88.setFont(new java.awt.Font("Corbel Light", 1, 36)); // NOI18N
        jButton88.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton88ActionPerformed(evt);
            }
        });
        jPanel8.add(jButton88);

        jButton89.setFont(new java.awt.Font("Corbel Light", 1, 36)); // NOI18N
        jButton89.setToolTipText("");
        jButton89.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton89ActionPerformed(evt);
            }
        });
        jPanel8.add(jButton89);

        getContentPane().add(jPanel8);

        jPanel9.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel9.setLayout(new java.awt.GridLayout(3, 3, 3, 3));

        jButton91.setFont(new java.awt.Font("Corbel Light", 1, 36)); // NOI18N
        jButton91.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton91ActionPerformed(evt);
            }
        });
        jPanel9.add(jButton91);

        jButton92.setFont(new java.awt.Font("Corbel Light", 1, 36)); // NOI18N
        jButton92.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton92ActionPerformed(evt);
            }
        });
        jPanel9.add(jButton92);

        jButton93.setFont(new java.awt.Font("Corbel Light", 1, 36)); // NOI18N
        jButton93.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton93ActionPerformed(evt);
            }
        });
        jPanel9.add(jButton93);

        jButton94.setFont(new java.awt.Font("Corbel Light", 1, 36)); // NOI18N
        jButton94.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton94ActionPerformed(evt);
            }
        });
        jPanel9.add(jButton94);

        jButton95.setFont(new java.awt.Font("Corbel Light", 1, 36)); // NOI18N
        jButton95.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton95ActionPerformed(evt);
            }
        });
        jPanel9.add(jButton95);

        jButton96.setFont(new java.awt.Font("Corbel Light", 1, 36)); // NOI18N
        jButton96.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton96ActionPerformed(evt);
            }
        });
        jPanel9.add(jButton96);

        jButton97.setFont(new java.awt.Font("Corbel Light", 1, 36)); // NOI18N
        jButton97.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton97ActionPerformed(evt);
            }
        });
        jPanel9.add(jButton97);

        jButton98.setFont(new java.awt.Font("Corbel Light", 1, 36)); // NOI18N
        jButton98.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton98ActionPerformed(evt);
            }
        });
        jPanel9.add(jButton98);

        jButton99.setFont(new java.awt.Font("Corbel Light", 1, 36)); // NOI18N
        jButton99.setToolTipText("");
        jButton99.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton99ActionPerformed(evt);
            }
        });
        jPanel9.add(jButton99);

        getContentPane().add(jPanel9);

        jButtonX.setFont(new java.awt.Font("Corbel Light", 1, 48)); // NOI18N
        jButtonX.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonXActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addGap(63, 63, 63)
                .addComponent(jButtonX, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(64, Short.MAX_VALUE))
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(jButtonX, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(40, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel10);

        jLabel1.setFont(new java.awt.Font("Rockwell Extra Bold", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("PLACAR");

        PlacarX.setFont(new java.awt.Font("Corbel Light", 1, 24)); // NOI18N
        PlacarX.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        PlacarO.setFont(new java.awt.Font("Corbel Light", 1, 24)); // NOI18N
        PlacarO.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel11Layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addComponent(PlacarX, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 85, Short.MAX_VALUE)
                .addComponent(PlacarO, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel11Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(14, 14, 14))
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(PlacarO, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(PlacarX, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(54, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel11);

        jButtonO.setFont(new java.awt.Font("Corbel Light", 1, 36)); // NOI18N
        jButtonO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonOActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addGap(63, 63, 63)
                .addComponent(jButtonO, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(64, Short.MAX_VALUE))
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(jButtonO, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(41, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel12);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
        // TODO add your handling code here:
        if (primeiraJogada) {
            jButton11.setEnabled(true);
            primeiraJogada = false;
            DesativarP2();
            DesativarP3();
            DesativarP4();
            DesativarP5();
            DesativarP6();
            DesativarP7();
            DesativarP8();
            DesativarP9();
        }

        if (p1finish == false) {
            if (cont && jButton11.getText().equals("")) {
                jButton11.setText("X");
                jButton11.setBackground(Vermelho);
                cont = false;
                AtivarP1();
                DesativarP2();
                DesativarP3();
                DesativarP4();
                DesativarP5();
                DesativarP6();
                DesativarP7();
                DesativarP8();
                DesativarP9();
             

                if (jButton12.getText().equals("X") && jButton13.getText().equals("X")) {
                    p1 = "X";
                    XVencedorP1();
                } else if (jButton15.getText().equals("X") && jButton19.getText().equals("X")) {
                    p1 = "X";
                    XVencedorP1();
                } else if (jButton14.getText().equals("X") && jButton17.getText().equals("X")) {
                    p1 = "X";
                    XVencedorP1();
                } else if (!jButton11.getText().equals("") && !jButton12.getText().equals("") && !jButton13.getText().equals("") && !jButton14.getText().equals("") && !jButton15.getText().equals("") && !jButton16.getText().equals("") && !jButton17.getText().equals("") && !jButton18.getText().equals("") && !jButton19.getText().equals("")) {
                    p1 = "V";
                    VelhaP1();
                }
            } else if (!cont && jButton11.getText().equals("")) {
                jButton11.setText("O");
                jButton11.setBackground(Azul);
                cont = true;
                AtivarP1();
                DesativarP2();
                DesativarP3();
                DesativarP4();
                DesativarP5();
                DesativarP6();
                DesativarP7();
                DesativarP8();
                DesativarP9();

                if (jButton12.getText().equals("O") && jButton13.getText().equals("O")) {
                    p1 = "O";
                    OVencedorP1();
                } else if (jButton15.getText().equals("O") && jButton19.getText().equals("O")) {
                    p1 = "O";
                    OVencedorP1();
                } else if (jButton14.getText().equals("O") && jButton17.getText().equals("O")) {
                    p1 = "O";
                    OVencedorP1();
                } else if (!jButton11.getText().equals("") && !jButton12.getText().equals("") && !jButton13.getText().equals("") && !jButton14.getText().equals("") && !jButton15.getText().equals("") && !jButton16.getText().equals("") && !jButton17.getText().equals("") && !jButton18.getText().equals("") && !jButton19.getText().equals("")) {
                    p1 = "V";
                    VelhaP1();
                }
            }
        }
        
        if (p1finish == true) {
            AtivarP2();
            AtivarP3();
            AtivarP4();
            AtivarP5();
            AtivarP6();
            AtivarP7();
            AtivarP8();
            AtivarP9();
        }
        
        VerificarVelha();

    }//GEN-LAST:event_jButton11ActionPerformed

    private void jButton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton12ActionPerformed
        // TODO add your handling code here:
        if (primeiraJogada) {
            jButton12.setEnabled(true); // Habilita o botão jButton11 na primeira jogada
            primeiraJogada = false; // Marque que a primeira jogada já ocorreu
            DesativarP1();
            DesativarP3();
            DesativarP4();
            DesativarP5();
            DesativarP6();
            DesativarP7();
            DesativarP8();
            DesativarP9();
        }

        if (p1finish == false) {
            if (cont && jButton12.getText().equals("")) {
                jButton12.setText("X");
                jButton12.setBackground(Vermelho);
                cont = false;
                AtivarP2();
                DesativarP1();
                DesativarP3();
                DesativarP4();
                DesativarP5();
                DesativarP6();
                DesativarP7();
                DesativarP8();
                DesativarP9();

                if (jButton11.getText().equals("X") && jButton13.getText().equals("X")) {
                    p1 = "X";
                    XVencedorP1();
                } else if (jButton15.getText().equals("X") && jButton18.getText().equals("X")) {
                    p1 = "X";
                    XVencedorP1();
                } else if (!jButton11.getText().equals("") && !jButton12.getText().equals("") && !jButton13.getText().equals("") && !jButton14.getText().equals("") && !jButton15.getText().equals("") && !jButton16.getText().equals("") && !jButton17.getText().equals("") && !jButton18.getText().equals("") && !jButton19.getText().equals("")) {
                    p1 = "V";
                    VelhaP1();
                }

            } else if (!cont && jButton12.getText().equals("")) {
                jButton12.setText("O");
                jButton12.setBackground(Azul);
                cont = true;
                AtivarP2();
                DesativarP1();
                DesativarP3();
                DesativarP4();
                DesativarP5();
                DesativarP6();
                DesativarP7();
                DesativarP8();
                DesativarP9();

                if (jButton11.getText().equals("O") && jButton13.getText().equals("O")) {
                    p1 = "O";
                    OVencedorP1();
                } else if (jButton15.getText().equals("O") && jButton18.getText().equals("O")) {
                    p1 = "O";
                    OVencedorP1();
                } else if (!jButton11.getText().equals("") && !jButton12.getText().equals("") && !jButton13.getText().equals("") && !jButton14.getText().equals("") && !jButton15.getText().equals("") && !jButton16.getText().equals("") && !jButton17.getText().equals("") && !jButton18.getText().equals("") && !jButton19.getText().equals("")) {
                    p1 = "V";
                    VelhaP1();
                }
            }
        }
        if (p2finish == true) {
            AtivarP1();
            AtivarP3();
            AtivarP4();
            AtivarP5();
            AtivarP6();
            AtivarP7();
            AtivarP8();
            AtivarP9();
        }
        VerificarVelha();

    }//GEN-LAST:event_jButton12ActionPerformed

    private void jButton13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton13ActionPerformed
        // TODO add your handling code here:
        if (primeiraJogada) {
            jButton13.setEnabled(true); // Habilita o botão jButton11 na primeira jogada
            primeiraJogada = false; // Marque que a primeira jogada já ocorreu
            DesativarP1();
            DesativarP2();
            DesativarP4();
            DesativarP5();
            DesativarP6();
            DesativarP7();
            DesativarP8();
            DesativarP9();
        }

        if (p1finish == false) {
            if (cont && jButton13.getText().equals("")) {
                jButton13.setText("X");
                jButton13.setBackground(Vermelho);
                cont = false;
                AtivarP3();
                DesativarP1();
                DesativarP2();
                DesativarP4();
                DesativarP5();
                DesativarP6();
                DesativarP7();
                DesativarP8();
                DesativarP9();

                if (jButton12.getText().equals("X") && jButton11.getText().equals("X")) {
                    p1 = "X";
                    XVencedorP1();
                } else if (jButton15.getText().equals("X") && jButton17.getText().equals("X")) {
                    p1 = "X";
                    XVencedorP1();
                } else if (jButton16.getText().equals("X") && jButton19.getText().equals("X")) {
                    p1 = "X";
                    XVencedorP1();
                } else if (!jButton11.getText().equals("") && !jButton12.getText().equals("") && !jButton13.getText().equals("") && !jButton14.getText().equals("") && !jButton15.getText().equals("") && !jButton16.getText().equals("") && !jButton17.getText().equals("") && !jButton18.getText().equals("") && !jButton19.getText().equals("")) {
                    p1 = "V";
                    VelhaP1();
                }
            } else if (!cont && jButton13.getText().equals("")) {
                jButton13.setText("O");
                jButton13.setBackground(Azul);
                cont = true;
                AtivarP3();
                DesativarP1();
                DesativarP2();
                DesativarP4();
                DesativarP5();
                DesativarP6();
                DesativarP7();
                DesativarP8();
                DesativarP9();

                if (jButton12.getText().equals("O") && jButton11.getText().equals("O")) {
                    p1 = "O";
                    OVencedorP1();
                } else if (jButton15.getText().equals("O") && jButton17.getText().equals("O")) {
                    p1 = "O";
                    OVencedorP1();
                } else if (jButton16.getText().equals("O") && jButton19.getText().equals("O")) {
                    p1 = "O";
                    OVencedorP1();
                } else if (!jButton11.getText().equals("") && !jButton12.getText().equals("") && !jButton13.getText().equals("") && !jButton14.getText().equals("") && !jButton15.getText().equals("") && !jButton16.getText().equals("") && !jButton17.getText().equals("") && !jButton18.getText().equals("") && !jButton19.getText().equals("")) {
                    p1 = "V";
                    VelhaP1();
                }
            }
        }
        if (p3finish == true) {
            
            AtivarP1();
            AtivarP2();
            AtivarP3();
            AtivarP4();
            AtivarP5();
            AtivarP6();
            AtivarP7();
            AtivarP8();
            AtivarP9();
        }
        VerificarVelha();

    }//GEN-LAST:event_jButton13ActionPerformed

    private void jButton14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton14ActionPerformed
        // TODO add your handling code here:
        if (primeiraJogada) {
            jButton14.setEnabled(true); // Habilita o botão jButton11 na primeira jogada
            primeiraJogada = false; // Marque que a primeira jogada já ocorreu
            DesativarP1();
            DesativarP2();
            DesativarP3();
            DesativarP5();
            DesativarP6();
            DesativarP7();
            DesativarP8();
            DesativarP9();
        }

        if (p1finish == false) {
            if (cont && jButton14.getText().equals("")) {
                jButton14.setText("X");
                jButton14.setBackground(Vermelho);
                cont = false;
                AtivarP4();
                DesativarP1();
                DesativarP2();
                DesativarP3();
                DesativarP5();
                DesativarP6();
                DesativarP7();
                DesativarP8();
                DesativarP9();

                if (jButton11.getText().equals("X") && jButton17.getText().equals("X")) {
                    p1 = "X";
                    XVencedorP1();
                } else if (jButton15.getText().equals("X") && jButton16.getText().equals("X")) {
                    p1 = "X";
                    XVencedorP1();
                } else if (!jButton11.getText().equals("") && !jButton12.getText().equals("") && !jButton13.getText().equals("") && !jButton14.getText().equals("") && !jButton15.getText().equals("") && !jButton16.getText().equals("") && !jButton17.getText().equals("") && !jButton18.getText().equals("") && !jButton19.getText().equals("")) {
                    p1 = "V";
                    VelhaP1();
                }

            } else if (!cont && jButton14.getText().equals("")) {
                jButton14.setText("O");
                jButton14.setBackground(Azul);
                cont = true;
                AtivarP4();
                DesativarP1();

                if (jButton11.getText().equals("O") && jButton17.getText().equals("O")) {
                    p1 = "O";
                    OVencedorP1();
                } else if (jButton15.getText().equals("O") && jButton16.getText().equals("O")) {
                    p1 = "O";
                    OVencedorP1();
                } else if (!jButton11.getText().equals("") && !jButton12.getText().equals("") && !jButton13.getText().equals("") && !jButton14.getText().equals("") && !jButton15.getText().equals("") && !jButton16.getText().equals("") && !jButton17.getText().equals("") && !jButton18.getText().equals("") && !jButton19.getText().equals("")) {
                    p1 = "V";
                    VelhaP1();
                }
            }

        }
        if (p4finish == true) {
            
            AtivarP2();
            AtivarP3();
            AtivarP4();
            AtivarP5();
            AtivarP6();
            AtivarP7();
            AtivarP8();
            AtivarP9();
        }
        VerificarVelha();

    }//GEN-LAST:event_jButton14ActionPerformed

    private void jButton21ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton21ActionPerformed
        // TODO add your handling code here:
        if (primeiraJogada) {
            jButton21.setEnabled(true);
            primeiraJogada = false;
            jPanel1.setEnabled(false);
            DesativarP3();
            DesativarP4();
            DesativarP5();
            DesativarP6();
            DesativarP7();
            DesativarP8();
            DesativarP9();
        }

        if (p2finish == false) {
            if (cont && jButton21.getText().equals("")) {
                jButton21.setText("X");
                jButton21.setBackground(Vermelho);
                cont = false;
                AtivarP1();
                DesativarP2();
                DesativarP3();
                DesativarP4();
                DesativarP5();
                DesativarP6();
                DesativarP7();
                DesativarP8();
                DesativarP9();

                if (jButton22.getText().equals("X") && jButton23.getText().equals("X")) {
                    p2 = "X";
                    XVencedorP2();
                } else if (jButton25.getText().equals("X") && jButton29.getText().equals("X")) {
                    p2 = "X";
                    XVencedorP2();
                } else if (jButton24.getText().equals("X") && jButton27.getText().equals("X")) {
                    p2 = "X";
                    XVencedorP2();
                } else if (!jButton21.getText().equals("") && !jButton22.getText().equals("") && !jButton23.getText().equals("") && !jButton24.getText().equals("") && !jButton25.getText().equals("") && !jButton26.getText().equals("") && !jButton27.getText().equals("") && !jButton28.getText().equals("") && !jButton29.getText().equals("")) {
                    p2 = "V";
                    VelhaP2();
                }
            } else if (!cont && jButton21.getText().equals("")) {
                jButton21.setText("O");
                jButton21.setBackground(Azul);
                cont = true;
                AtivarP1();
                DesativarP2();
                DesativarP3();
                DesativarP4();
                DesativarP5();
                DesativarP6();
                DesativarP7();
                DesativarP8();
                DesativarP9();

                if (jButton22.getText().equals("O") && jButton23.getText().equals("O")) {
                    p2 = "O";
                    OVencedorP2();
                } else if (jButton25.getText().equals("O") && jButton29.getText().equals("O")) {
                    p2 = "O";
                    OVencedorP2();
                } else if (jButton24.getText().equals("O") && jButton27.getText().equals("O")) {
                    p2 = "O";
                    OVencedorP2();
                } else if (!jButton21.getText().equals("") && !jButton22.getText().equals("") && !jButton23.getText().equals("") && !jButton24.getText().equals("") && !jButton25.getText().equals("") && !jButton26.getText().equals("") && !jButton27.getText().equals("") && !jButton28.getText().equals("") && !jButton29.getText().equals("")) {
                    p2 = "V";
                    VelhaP2();
                }
            }
        }
        if (p1finish == true) {
            
            AtivarP2();
            AtivarP3();
            AtivarP4();
            AtivarP5();
            AtivarP6();
            AtivarP7();
            AtivarP8();
            AtivarP9();
        }
        VerificarVelha();

    }//GEN-LAST:event_jButton21ActionPerformed

    private void jButton22ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton22ActionPerformed
        // TODO add your handling code here:
        if (primeiraJogada) {
            jButton22.setEnabled(true);
            primeiraJogada = false;
            DesativarP1();
            DesativarP3();
            DesativarP4();
            DesativarP5();
            DesativarP6();
            DesativarP7();
            DesativarP8();
            DesativarP9();
        }

        if (p2finish == false) {
            if (cont && jButton22.getText().equals("")) {
                jButton22.setText("X");
                jButton22.setBackground(Vermelho);
                cont = false;
                AtivarP2();
                DesativarP1();
                DesativarP3();
                DesativarP4();
                DesativarP5();
                DesativarP6();
                DesativarP7();
                DesativarP8();
                DesativarP9();

                if (jButton21.getText().equals("X") && jButton23.getText().equals("X")) {
                    p2 = "X";
                    XVencedorP2();
                } else if (jButton25.getText().equals("X") && jButton28.getText().equals("X")) {
                    p2 = "X";
                    XVencedorP2();
                } else if (!jButton21.getText().equals("") && !jButton22.getText().equals("") && !jButton23.getText().equals("") && !jButton24.getText().equals("") && !jButton25.getText().equals("") && !jButton26.getText().equals("") && !jButton27.getText().equals("") && !jButton28.getText().equals("") && !jButton29.getText().equals("")) {
                    p2 = "V";
                    VelhaP2();
                }
            } else if (!cont && jButton22.getText().equals("")) {
                jButton22.setText("O");
                jButton22.setBackground(Azul);
                cont = true;
                AtivarP2();
                DesativarP1();
                DesativarP3();
                DesativarP4();
                DesativarP5();
                DesativarP6();
                DesativarP7();
                DesativarP8();
                DesativarP9();

                if (jButton21.getText().equals("O") && jButton23.getText().equals("O")) {
                    p2 = "O";
                    OVencedorP2();
                } else if (jButton25.getText().equals("O") && jButton28.getText().equals("O")) {
                    p2 = "O";
                    OVencedorP2();
                } else if (!jButton21.getText().equals("") && !jButton22.getText().equals("") && !jButton23.getText().equals("") && !jButton24.getText().equals("") && !jButton25.getText().equals("") && !jButton26.getText().equals("") && !jButton27.getText().equals("") && !jButton28.getText().equals("") && !jButton29.getText().equals("")) {
                    p2 = "V";
                    VelhaP2();
                }
            }
        }
        if (p2finish == true) {
            
            AtivarP1();
            AtivarP3();
            AtivarP4();
            AtivarP5();
            AtivarP6();
            AtivarP7();
            AtivarP8();
            AtivarP9();
        }
        VerificarVelha();

    }//GEN-LAST:event_jButton22ActionPerformed

    private void jButton23ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton23ActionPerformed
        // TODO add your handling code here:
        if (primeiraJogada) {
            jButton23.setEnabled(true);
            primeiraJogada = false;
            DesativarP1();
            DesativarP2();
            DesativarP4();
            DesativarP5();
            DesativarP6();
            DesativarP7();
            DesativarP8();
            DesativarP9();
        }

        if (p2finish == false) {
            if (cont && jButton23.getText().equals("")) {
                jButton23.setText("X");
                jButton23.setBackground(Vermelho);
                cont = false;
                AtivarP3();
                DesativarP1();
                DesativarP2();
                DesativarP4();
                DesativarP5();
                DesativarP6();
                DesativarP7();
                DesativarP8();
                DesativarP9();

                if (jButton22.getText().equals("X") && jButton21.getText().equals("X")) {
                    p2 = "X";
                    XVencedorP2();
                } else if (jButton25.getText().equals("X") && jButton27.getText().equals("X")) {
                    p2 = "X";
                    XVencedorP2();
                } else if (jButton26.getText().equals("X") && jButton29.getText().equals("X")) {
                    p2 = "X";
                    XVencedorP2();
                } else if (!jButton21.getText().equals("") && !jButton22.getText().equals("") && !jButton23.getText().equals("") && !jButton24.getText().equals("") && !jButton25.getText().equals("") && !jButton26.getText().equals("") && !jButton27.getText().equals("") && !jButton28.getText().equals("") && !jButton29.getText().equals("")) {
                    p2 = "V";
                    VelhaP2();
                }
            } else if (!cont && jButton23.getText().equals("")) {
                jButton23.setText("O");
                jButton23.setBackground(Azul);
                cont = true;
                AtivarP3();
                DesativarP1();
                DesativarP2();
                DesativarP4();
                DesativarP5();
                DesativarP6();
                DesativarP7();
                DesativarP8();
                DesativarP9();

                if (jButton22.getText().equals("O") && jButton21.getText().equals("O")) {
                    p2 = "O";
                    OVencedorP2();
                } else if (jButton25.getText().equals("O") && jButton27.getText().equals("O")) {
                    p2 = "O";
                    OVencedorP2();
                } else if (jButton26.getText().equals("O") && jButton29.getText().equals("O")) {
                    p2 = "O";
                    OVencedorP2();
                } else if (!jButton21.getText().equals("") && !jButton22.getText().equals("") && !jButton23.getText().equals("") && !jButton24.getText().equals("") && !jButton25.getText().equals("") && !jButton26.getText().equals("") && !jButton27.getText().equals("") && !jButton28.getText().equals("") && !jButton29.getText().equals("")) {
                    p2 = "V";
                    VelhaP2();
                }

            }
        }
        if (p3finish == true) {
            
            AtivarP1();
            AtivarP2();
            AtivarP4();
            AtivarP5();
            AtivarP6();
            AtivarP7();
            AtivarP8();
            AtivarP9();
        }
        VerificarVelha();

    }//GEN-LAST:event_jButton23ActionPerformed

    private void jButton24ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton24ActionPerformed
        // TODO add your handling code here:
        if (primeiraJogada) {
            jButton24.setEnabled(true);
            primeiraJogada = false;
            DesativarP1();
            DesativarP2();
            DesativarP3();
            DesativarP5();
            DesativarP6();
            DesativarP7();
            DesativarP8();
            DesativarP9();
        }

        if (p2finish == false) {
            if (cont && jButton24.getText().equals("")) {
                jButton24.setText("X");
                jButton24.setBackground(Vermelho);
                cont = false;
                AtivarP4();
                DesativarP1();
                DesativarP2();
                DesativarP3();
                DesativarP5();
                DesativarP6();
                DesativarP7();
                DesativarP8();
                DesativarP9();

                if (jButton21.getText().equals("X") && jButton27.getText().equals("X")) {
                    p2 = "X";
                    XVencedorP2();
                } else if (jButton25.getText().equals("X") && jButton26.getText().equals("X")) {
                    p2 = "X";
                    XVencedorP2();
                } else if (!jButton21.getText().equals("") && !jButton22.getText().equals("") && !jButton23.getText().equals("") && !jButton24.getText().equals("") && !jButton25.getText().equals("") && !jButton26.getText().equals("") && !jButton27.getText().equals("") && !jButton28.getText().equals("") && !jButton29.getText().equals("")) {
                    p2 = "V";
                    VelhaP2();
                }
            } else if (!cont && jButton24.getText().equals("")) {
                jButton24.setText("O");
                jButton24.setBackground(Azul);
                cont = true;
                AtivarP4();
                DesativarP1();
                DesativarP2();
                DesativarP3();
                DesativarP5();
                DesativarP6();
                DesativarP7();
                DesativarP8();
                DesativarP9();

                if (jButton21.getText().equals("O") && jButton27.getText().equals("O")) {
                    p2 = "O";
                    OVencedorP2();
                } else if (jButton25.getText().equals("O") && jButton26.getText().equals("O")) {
                    p2 = "O";
                    OVencedorP2();
                } else if (!jButton21.getText().equals("") && !jButton22.getText().equals("") && !jButton23.getText().equals("") && !jButton24.getText().equals("") && !jButton25.getText().equals("") && !jButton26.getText().equals("") && !jButton27.getText().equals("") && !jButton28.getText().equals("") && !jButton29.getText().equals("")) {
                    p2 = "V";
                    VelhaP2();
                }
            }
        }
        if (p4finish == true) {
            
            AtivarP1();
            AtivarP2();
            AtivarP3();
            AtivarP5();
            AtivarP6();
            AtivarP7();
            AtivarP8();
            AtivarP9();
        }
        VerificarVelha();


    }//GEN-LAST:event_jButton24ActionPerformed

    private void jButton31ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton31ActionPerformed
        // TODO add your handling code here:
        if (primeiraJogada) {
            jButton31.setEnabled(true);
            primeiraJogada = false;
            DesativarP2();
            DesativarP3();
            DesativarP4();
            DesativarP5();
            DesativarP6();
            DesativarP7();
            DesativarP8();
            DesativarP9();
        }

        if (p3finish == false) {
            if (cont && jButton31.getText().equals("")) {
                jButton31.setText("X");
                jButton31.setBackground(Vermelho);
                cont = false;
                AtivarP1();
                DesativarP2();
                DesativarP3();
                DesativarP4();
                DesativarP5();
                DesativarP6();
                DesativarP7();
                DesativarP8();
                DesativarP9();

                if (jButton32.getText().equals("X") && jButton33.getText().equals("X")) {
                    p3 = "X";
                    XVencedorP3();
                } else if (jButton35.getText().equals("X") && jButton39.getText().equals("X")) {
                    p3 = "X";
                    XVencedorP3();
                } else if (jButton34.getText().equals("X") && jButton37.getText().equals("X")) {
                    p3 = "X";
                    XVencedorP3();
                } else if (!jButton31.getText().equals("") && !jButton32.getText().equals("") && !jButton33.getText().equals("") && !jButton34.getText().equals("") && !jButton35.getText().equals("") && !jButton36.getText().equals("") && !jButton37.getText().equals("") && !jButton38.getText().equals("") && !jButton39.getText().equals("")) {
                p3 = "V";
                VelhaP3();
            }
            } else if (!cont && jButton31.getText().equals("")) {
                jButton31.setText("O");
                jButton31.setBackground(Azul);
                cont = true;
                AtivarP1();
                DesativarP2();
                DesativarP3();
                DesativarP4();
                DesativarP5();
                DesativarP6();
                DesativarP7();
                DesativarP8();
                DesativarP9();

                if (jButton32.getText().equals("O") && jButton33.getText().equals("O")) {
                    p3 = "O";
                    OVencedorP3();
                } else if (jButton35.getText().equals("O") && jButton39.getText().equals("O")) {
                    p3 = "O";
                    OVencedorP3();
                } else if (jButton34.getText().equals("O") && jButton37.getText().equals("O")) {
                    p3 = "O";
                    OVencedorP3();
                } else if (!jButton31.getText().equals("") && !jButton32.getText().equals("") && !jButton33.getText().equals("") && !jButton34.getText().equals("") && !jButton35.getText().equals("") && !jButton36.getText().equals("") && !jButton37.getText().equals("") && !jButton38.getText().equals("") && !jButton39.getText().equals("")) {
                p3 = "V";
                VelhaP3();
            }
            } 
        }
        if (p1finish == true) {
            
            AtivarP2();
            AtivarP3();
            AtivarP4();
            AtivarP5();
            AtivarP6();
            AtivarP7();
            AtivarP8();
            AtivarP9();
        }
        VerificarVelha();

    }//GEN-LAST:event_jButton31ActionPerformed

    private void jButton32ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton32ActionPerformed
        // TODO add your handling code here:
        if (primeiraJogada) {
            jButton32.setEnabled(true);
            primeiraJogada = false;
            DesativarP1();
            DesativarP3();
            DesativarP4();
            DesativarP5();
            DesativarP6();
            DesativarP7();
            DesativarP8();
            DesativarP9();
        }

        if (p3finish == false) {
            if (cont && jButton32.getText().equals("")) {
                jButton32.setText("X");
                jButton32.setBackground(Vermelho);
                cont = false;
                AtivarP2();
                DesativarP1();
                DesativarP3();
                DesativarP4();
                DesativarP5();
                DesativarP6();
                DesativarP7();
                DesativarP8();
                DesativarP9();

                if (jButton31.getText().equals("X") && jButton33.getText().equals("X")) {
                    p3 = "X";
                    XVencedorP3();
                } else if (jButton35.getText().equals("X") && jButton38.getText().equals("X")) {
                    p3 = "X";
                    XVencedorP3();
                } else if (!jButton31.getText().equals("") && !jButton32.getText().equals("") && !jButton33.getText().equals("") && !jButton34.getText().equals("") && !jButton35.getText().equals("") && !jButton36.getText().equals("") && !jButton37.getText().equals("") && !jButton38.getText().equals("") && !jButton39.getText().equals("")) {
                p3 = "V";
                VelhaP3();
            }
            } else if (!cont && jButton32.getText().equals("")) {
                jButton32.setText("O");
                jButton32.setBackground(Azul);
                cont = true;
                AtivarP2();
                DesativarP1();
                DesativarP3();
                DesativarP4();
                DesativarP5();
                DesativarP6();
                DesativarP7();
                DesativarP8();
                DesativarP9();

                if (jButton31.getText().equals("O") && jButton33.getText().equals("O")) {
                    p3 = "O";
                    OVencedorP3();
                } else if (jButton35.getText().equals("O") && jButton38.getText().equals("O")) {
                    p3 = "O";
                    OVencedorP3();
                } else if (!jButton31.getText().equals("") && !jButton32.getText().equals("") && !jButton33.getText().equals("") && !jButton34.getText().equals("") && !jButton35.getText().equals("") && !jButton36.getText().equals("") && !jButton37.getText().equals("") && !jButton38.getText().equals("") && !jButton39.getText().equals("")) {
                p3 = "V";
                VelhaP3();
            }
                        }
        }
        if (p2finish == true) {
            
            AtivarP1();
            AtivarP3();
            AtivarP4();
            AtivarP5();
            AtivarP6();
            AtivarP7();
            AtivarP8();
            AtivarP9();
        }
        VerificarVelha();

    }//GEN-LAST:event_jButton32ActionPerformed

    private void jButton33ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton33ActionPerformed
        // TODO add your handling code here:
        if (primeiraJogada) {
            jButton33.setEnabled(true);
            primeiraJogada = false;
            DesativarP1();
            DesativarP3();
            DesativarP4();
            DesativarP5();
            DesativarP6();
            DesativarP7();
            DesativarP8();
            DesativarP9();
        }

        if (p3finish == false) {
            if (cont && jButton33.getText().equals("")) {
                jButton33.setText("X");
                jButton33.setBackground(Vermelho);
                cont = false;
                AtivarP3();
                DesativarP1();
                DesativarP2();
                DesativarP4();
                DesativarP5();
                DesativarP6();
                DesativarP7();
                DesativarP8();
                DesativarP9();

                if (jButton32.getText().equals("X") && jButton31.getText().equals("X")) {
                    p3 = "X";
                    XVencedorP3();
                } else if (jButton35.getText().equals("X") && jButton37.getText().equals("X")) {
                    p3 = "X";
                    XVencedorP3();
                } else if (jButton36.getText().equals("X") && jButton39.getText().equals("X")) {
                    p3 = "X";
                    XVencedorP3();
                } else if (!jButton31.getText().equals("") && !jButton32.getText().equals("") && !jButton33.getText().equals("") && !jButton34.getText().equals("") && !jButton35.getText().equals("") && !jButton36.getText().equals("") && !jButton37.getText().equals("") && !jButton38.getText().equals("") && !jButton39.getText().equals("")) {
                p3 = "V";
                VelhaP3();
            }
            } else if (!cont && jButton33.getText().equals("")) {
                jButton33.setText("O");
                jButton33.setBackground(Azul);
                cont = true;
                AtivarP3();
                DesativarP1();
                DesativarP2();
                DesativarP4();
                DesativarP5();
                DesativarP6();
                DesativarP7();
                DesativarP8();
                DesativarP9();

                if (jButton32.getText().equals("O") && jButton31.getText().equals("O")) {
                    p3 = "O";
                    OVencedorP3();
                } else if (jButton35.getText().equals("O") && jButton37.getText().equals("O")) {
                    p3 = "O";
                    OVencedorP3();
                } else if (jButton36.getText().equals("O") && jButton39.getText().equals("O")) {
                    p3 = "O";
                    OVencedorP3();
                } else if (!jButton31.getText().equals("") && !jButton32.getText().equals("") && !jButton33.getText().equals("") && !jButton34.getText().equals("") && !jButton35.getText().equals("") && !jButton36.getText().equals("") && !jButton37.getText().equals("") && !jButton38.getText().equals("") && !jButton39.getText().equals("")) {
                p3 = "V";
                VelhaP3();
            }
                        }
        }
        if (p3finish == true) {
            
            AtivarP1();
            AtivarP2();
            AtivarP4();
            AtivarP5();
            AtivarP6();
            AtivarP7();
            AtivarP8();
            AtivarP9();
        }
        VerificarVelha();

    }//GEN-LAST:event_jButton33ActionPerformed

    private void jButton34ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton34ActionPerformed
        // TODO add your handling code here:
        if (primeiraJogada) {
            jButton34.setEnabled(true);
            primeiraJogada = false;
            DesativarP1();
            DesativarP2();
            DesativarP3();
            DesativarP5();
            DesativarP6();
            DesativarP7();
            DesativarP8();
            DesativarP9();
        }

        if (p3finish == false) {
            if (cont && jButton34.getText().equals("")) {
                jButton34.setText("X");
                jButton34.setBackground(Vermelho);
                cont = false;
                AtivarP4();
                DesativarP1();
                DesativarP2();
                DesativarP3();
                DesativarP5();
                DesativarP6();
                DesativarP7();
                DesativarP8();
                DesativarP9();

                if (jButton31.getText().equals("X") && jButton37.getText().equals("X")) {
                    p3 = "X";
                    XVencedorP3();
                } else if (jButton35.getText().equals("X") && jButton36.getText().equals("X")) {
                    p3 = "X";
                    XVencedorP3();
                } else if (!jButton31.getText().equals("") && !jButton32.getText().equals("") && !jButton33.getText().equals("") && !jButton34.getText().equals("") && !jButton35.getText().equals("") && !jButton36.getText().equals("") && !jButton37.getText().equals("") && !jButton38.getText().equals("") && !jButton39.getText().equals("")) {
                p3 = "V";
                VelhaP3();
            }
            } else if (!cont && jButton34.getText().equals("")) {
                jButton34.setText("O");
                jButton34.setBackground(Azul);
                cont = true;
                AtivarP4();
                DesativarP1();
                DesativarP2();
                DesativarP3();
                DesativarP5();
                DesativarP6();
                DesativarP7();
                DesativarP8();
                DesativarP9();

                if (jButton31.getText().equals("O") && jButton37.getText().equals("O")) {
                    p3 = "O";
                    OVencedorP3();
                } else if (jButton35.getText().equals("O") && jButton36.getText().equals("O")) {
                    p3 = "O";
                    OVencedorP3();
                } else if (!jButton31.getText().equals("") && !jButton32.getText().equals("") && !jButton33.getText().equals("") && !jButton34.getText().equals("") && !jButton35.getText().equals("") && !jButton36.getText().equals("") && !jButton37.getText().equals("") && !jButton38.getText().equals("") && !jButton39.getText().equals("")) {
                p3 = "V";
                VelhaP3();
            }
                        }
        }
        if (p4finish == true) {
            
            AtivarP1();
            AtivarP2();
            AtivarP3();
            AtivarP5();
            AtivarP6();
            AtivarP7();
            AtivarP8();
            AtivarP9();
        }
        VerificarVelha();


    }//GEN-LAST:event_jButton34ActionPerformed

    private void jButton41ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton41ActionPerformed
        // TODO add your handling code here:
        if (primeiraJogada) {
            jButton41.setEnabled(true);
            primeiraJogada = false;
            DesativarP2();
            DesativarP3();
            DesativarP4();
            DesativarP5();
            DesativarP6();
            DesativarP7();
            DesativarP8();
            DesativarP9();
        }

        if (p4finish == false) {
            if (cont && jButton41.getText().equals("")) {
                jButton41.setText("X");
                jButton41.setBackground(Vermelho);
                cont = false;
                AtivarP1();
                DesativarP2();
                DesativarP3();
                DesativarP4();
                DesativarP5();
                DesativarP6();
                DesativarP7();
                DesativarP8();
                DesativarP9();

                if (jButton42.getText().equals("X") && jButton43.getText().equals("X")) {
                    p4 = "X";
                    XVencedorP4();
                } else if (jButton45.getText().equals("X") && jButton49.getText().equals("X")) {
                    p4 = "X";
                    XVencedorP4();
                } else if (jButton44.getText().equals("X") && jButton47.getText().equals("X")) {
                    p4 = "X";
                    XVencedorP4();
                } else if (!jButton41.getText().equals("") && !jButton42.getText().equals("") && !jButton43.getText().equals("") && !jButton44.getText().equals("") && !jButton45.getText().equals("") && !jButton46.getText().equals("") && !jButton47.getText().equals("") && !jButton48.getText().equals("") && !jButton49.getText().equals("")) {
                p4 = "V";
                VelhaP4();
            }
            } else if (!cont && jButton41.getText().equals("")) {
                jButton41.setText("O");
                jButton41.setBackground(Azul);
                cont = true;
                AtivarP1();
                DesativarP2();
                DesativarP3();
                DesativarP4();
                DesativarP5();
                DesativarP6();
                DesativarP7();
                DesativarP8();
                DesativarP9();

                if (jButton42.getText().equals("O") && jButton43.getText().equals("O")) {
                    p4 = "O";
                    OVencedorP4();
                } else if (jButton45.getText().equals("O") && jButton49.getText().equals("O")) {
                    p4 = "O";
                    OVencedorP4();
                } else if (jButton44.getText().equals("O") && jButton47.getText().equals("O")) {
                    p4 = "O";
                    OVencedorP4();
                } else if (!jButton41.getText().equals("") && !jButton42.getText().equals("") && !jButton43.getText().equals("") && !jButton44.getText().equals("") && !jButton45.getText().equals("") && !jButton46.getText().equals("") && !jButton47.getText().equals("") && !jButton48.getText().equals("") && !jButton49.getText().equals("")) {
                p4 = "V";
                VelhaP4();
            }
            } 
        }
        if (p1finish == true) {
            
            AtivarP2();
            AtivarP3();
            AtivarP4();
            AtivarP5();
            AtivarP6();
            AtivarP7();
            AtivarP8();
            AtivarP9();
        }
        VerificarVelha();

    }//GEN-LAST:event_jButton41ActionPerformed

    private void jButton42ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton42ActionPerformed
        // TODO add your handling code here:
        if (primeiraJogada) {
            jButton42.setEnabled(true);
            primeiraJogada = false;
            DesativarP1();
            DesativarP3();
            DesativarP4();
            DesativarP5();
            DesativarP6();
            DesativarP7();
            DesativarP8();
            DesativarP9();
        }

        if (p4finish == false) {
            if (cont && jButton42.getText().equals("")) {
                jButton42.setText("X");
                jButton42.setBackground(Vermelho);
                cont = false;
                AtivarP2();
                DesativarP1();
                DesativarP3();
                DesativarP4();
                DesativarP5();
                DesativarP6();
                DesativarP7();
                DesativarP8();
                DesativarP9();

                if (jButton41.getText().equals("X") && jButton43.getText().equals("X")) {
                    p4 = "X";
                    XVencedorP4();
                } else if (jButton45.getText().equals("X") && jButton48.getText().equals("X")) {
                    p4 = "X";
                    XVencedorP4();
                } else if (!jButton41.getText().equals("") && !jButton42.getText().equals("") && !jButton43.getText().equals("") && !jButton44.getText().equals("") && !jButton45.getText().equals("") && !jButton46.getText().equals("") && !jButton47.getText().equals("") && !jButton48.getText().equals("") && !jButton49.getText().equals("")) {
                p4 = "V";
                VelhaP4();
            }
            } else if (!cont && jButton42.getText().equals("")) {
                jButton42.setText("O");
                jButton42.setBackground(Azul);
                cont = true;
                AtivarP2();
                DesativarP1();
                DesativarP3();
                DesativarP4();
                DesativarP5();
                DesativarP6();
                DesativarP7();
                DesativarP8();
                DesativarP9();

                if (jButton41.getText().equals("O") && jButton43.getText().equals("O")) {
                    p4 = "O";
                    OVencedorP4();
                } else if (jButton45.getText().equals("O") && jButton48.getText().equals("O")) {
                    p4 = "O";
                    OVencedorP4();
                } else if (!jButton41.getText().equals("") && !jButton42.getText().equals("") && !jButton43.getText().equals("") && !jButton44.getText().equals("") && !jButton45.getText().equals("") && !jButton46.getText().equals("") && !jButton47.getText().equals("") && !jButton48.getText().equals("") && !jButton49.getText().equals("")) {
                p4 = "V";
                VelhaP4();
            }
                        }
        }
        if (p2finish == true) {
            
            AtivarP1();
            AtivarP3();
            AtivarP4();
            AtivarP5();
            AtivarP6();
            AtivarP7();
            AtivarP8();
            AtivarP9();
        }
        VerificarVelha();

    }//GEN-LAST:event_jButton42ActionPerformed

    private void jButton43ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton43ActionPerformed
        // TODO add your handling code here:
        if (primeiraJogada) {
            jButton43.setEnabled(true);
            primeiraJogada = false;
            DesativarP1();
            DesativarP2();
            DesativarP4();
            DesativarP5();
            DesativarP6();
            DesativarP7();
            DesativarP8();
            DesativarP9();
        }

        if (p4finish == false) {
            if (cont && jButton43.getText().equals("")) {
                jButton43.setText("X");
                jButton43.setBackground(Vermelho);
                cont = false;
                AtivarP3();
                DesativarP1();
                DesativarP2();
                DesativarP4();
                DesativarP5();
                DesativarP6();
                DesativarP7();
                DesativarP8();
                DesativarP9();

                if (jButton42.getText().equals("X") && jButton41.getText().equals("X")) {
                    p4 = "X";
                    XVencedorP4();
                } else if (jButton45.getText().equals("X") && jButton47.getText().equals("X")) {
                    p4 = "X";
                    XVencedorP4();
                } else if (jButton46.getText().equals("X") && jButton49.getText().equals("X")) {
                    p4 = "X";
                    XVencedorP4();
                } else if (!jButton41.getText().equals("") && !jButton42.getText().equals("") && !jButton43.getText().equals("") && !jButton44.getText().equals("") && !jButton45.getText().equals("") && !jButton46.getText().equals("") && !jButton47.getText().equals("") && !jButton48.getText().equals("") && !jButton49.getText().equals("")) {
                p4 = "V";
                VelhaP4();
            }
            } else if (!cont && jButton43.getText().equals("")) {
                jButton43.setText("O");
                jButton43.setBackground(Azul);
                cont = true;
                AtivarP3();
                DesativarP1();
                DesativarP2();
                DesativarP4();
                DesativarP5();
                DesativarP6();
                DesativarP7();
                DesativarP8();
                DesativarP9();

                if (jButton42.getText().equals("O") && jButton41.getText().equals("O")) {
                    p4 = "O";
                    OVencedorP4();
                } else if (jButton45.getText().equals("O") && jButton47.getText().equals("O")) {
                    p4 = "O";
                    OVencedorP4();
                } else if (jButton46.getText().equals("O") && jButton49.getText().equals("O")) {
                    p4 = "O";
                    OVencedorP4();
                } else if (!jButton41.getText().equals("") && !jButton42.getText().equals("") && !jButton43.getText().equals("") && !jButton44.getText().equals("") && !jButton45.getText().equals("") && !jButton46.getText().equals("") && !jButton47.getText().equals("") && !jButton48.getText().equals("") && !jButton49.getText().equals("")) {
                p4 = "V";
                VelhaP4();
            }
            }
        }
        if (p3finish == true) {
            
            AtivarP1();
            AtivarP2();
            AtivarP4();
            AtivarP5();
            AtivarP6();
            AtivarP7();
            AtivarP8();
            AtivarP9();
        }
        VerificarVelha();

    }//GEN-LAST:event_jButton43ActionPerformed

    private void jButton44ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton44ActionPerformed
        // TODO add your handling code here:
        if (primeiraJogada) {
            jButton44.setEnabled(true);
            primeiraJogada = false;
            DesativarP1();
            DesativarP2();
            DesativarP3();
            DesativarP5();
            DesativarP6();
            DesativarP7();
            DesativarP8();
            DesativarP9();
        }

        if (p4finish == false) {
            if (cont && jButton44.getText().equals("")) {
                jButton44.setText("X");
                jButton44.setBackground(Vermelho);
                cont = false;
                AtivarP4();
                DesativarP1();
                DesativarP2();
                DesativarP3();
                DesativarP5();
                DesativarP6();
                DesativarP7();
                DesativarP8();
                DesativarP9();

                if (jButton41.getText().equals("X") && jButton47.getText().equals("X")) {
                    p4 = "X";
                    XVencedorP4();
                } else if (jButton45.getText().equals("X") && jButton46.getText().equals("X")) {
                    p4 = "X";
                    XVencedorP4();
                } else if (!jButton41.getText().equals("") && !jButton42.getText().equals("") && !jButton43.getText().equals("") && !jButton44.getText().equals("") && !jButton45.getText().equals("") && !jButton46.getText().equals("") && !jButton47.getText().equals("") && !jButton48.getText().equals("") && !jButton49.getText().equals("")) {
                p4 = "V";
                VelhaP4();
            }
            } else if (!cont && jButton44.getText().equals("")) {
                jButton44.setText("O");
                jButton44.setBackground(Azul);
                cont = true;
                AtivarP4();
                DesativarP1();
                DesativarP2();
                DesativarP3();
                DesativarP5();
                DesativarP6();
                DesativarP7();
                DesativarP8();
                DesativarP9();

                if (jButton41.getText().equals("O") && jButton47.getText().equals("O")) {
                    p4 = "O";
                    OVencedorP4();
                } else if (jButton45.getText().equals("O") && jButton46.getText().equals("O")) {
                    p4 = "O";
                    OVencedorP4();
                } else if (!jButton41.getText().equals("") && !jButton42.getText().equals("") && !jButton43.getText().equals("") && !jButton44.getText().equals("") && !jButton45.getText().equals("") && !jButton46.getText().equals("") && !jButton47.getText().equals("") && !jButton48.getText().equals("") && !jButton49.getText().equals("")) {
                p4 = "V";
                VelhaP4();
            }
            } 
        }
        if (p4finish == true) {
            
            AtivarP1();
            AtivarP2();
            AtivarP3();
            AtivarP5();
            AtivarP6();
            AtivarP7();
            AtivarP8();
            AtivarP9();
        }
        VerificarVelha();

    }//GEN-LAST:event_jButton44ActionPerformed

    private void jButton51ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton51ActionPerformed
        // TODO add your handling code here:
        if (primeiraJogada) {
            jButton51.setEnabled(true);
            primeiraJogada = false;
            DesativarP2();
            DesativarP3();
            DesativarP4();
            DesativarP5();
            DesativarP6();
            DesativarP7();
            DesativarP8();
            DesativarP9();
        }

        if (p5finish == false) {
            if (cont && jButton51.getText().equals("")) {
                jButton51.setText("X");
                jButton51.setBackground(Vermelho);
                cont = false;
                AtivarP1();
                DesativarP2();
                DesativarP3();
                DesativarP4();
                DesativarP5();
                DesativarP6();
                DesativarP7();
                DesativarP8();
                DesativarP9();

                if (jButton52.getText().equals("X") && jButton53.getText().equals("X")) {
                    p5 = "X";
                    XVencedorP5();
                } else if (jButton55.getText().equals("X") && jButton59.getText().equals("X")) {
                    p5 = "X";
                    XVencedorP5();
                } else if (jButton54.getText().equals("X") && jButton57.getText().equals("X")) {
                    p5 = "X";
                    XVencedorP5();
                } else if (!jButton51.getText().equals("") && !jButton52.getText().equals("") && !jButton53.getText().equals("") && !jButton54.getText().equals("") && !jButton55.getText().equals("") && !jButton56.getText().equals("") && !jButton57.getText().equals("") && !jButton58.getText().equals("") && !jButton59.getText().equals("")) {
                p5 = "V";
                VelhaP5();
            }
            } else if (!cont && jButton51.getText().equals("")) {
                jButton51.setText("O");
                jButton51.setBackground(Azul);
                cont = true;
                AtivarP1();
                DesativarP2();
                DesativarP3();
                DesativarP4();
                DesativarP5();
                DesativarP6();
                DesativarP7();
                DesativarP8();
                DesativarP9();

                if (jButton52.getText().equals("O") && jButton53.getText().equals("O")) {
                    p5 = "O";
                    OVencedorP5();
                } else if (jButton55.getText().equals("O") && jButton59.getText().equals("O")) {
                    p5 = "O";
                    OVencedorP5();
                } else if (jButton54.getText().equals("O") && jButton57.getText().equals("O")) {
                    p5 = "O";
                    OVencedorP5();
                } else if (!jButton51.getText().equals("") && !jButton52.getText().equals("") && !jButton53.getText().equals("") && !jButton54.getText().equals("") && !jButton55.getText().equals("") && !jButton56.getText().equals("") && !jButton57.getText().equals("") && !jButton58.getText().equals("") && !jButton59.getText().equals("")) {
                p5 = "V";
                VelhaP5();
            }
            } 
        }
        if (p1finish == true) {
            
            AtivarP2();
            AtivarP3();
            AtivarP4();
            AtivarP5();
            AtivarP6();
            AtivarP7();
            AtivarP8();
            AtivarP9();
        }
        VerificarVelha();

    }//GEN-LAST:event_jButton51ActionPerformed

    private void jButton52ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton52ActionPerformed
        // TODO add your handling code here:
        if (primeiraJogada) {
            jButton52.setEnabled(true);
            primeiraJogada = false;
            DesativarP1();
            DesativarP3();
            DesativarP4();
            DesativarP5();
            DesativarP6();
            DesativarP7();
            DesativarP8();
            DesativarP9();
        }

        if (p5finish == false) {
            if (cont && jButton52.getText().equals("")) {
                jButton52.setText("X");
                jButton52.setBackground(Vermelho);
                cont = false;
                AtivarP2();
                DesativarP1();
                DesativarP3();
                DesativarP4();
                DesativarP5();
                DesativarP6();
                DesativarP7();
                DesativarP8();
                DesativarP9();

                if (jButton51.getText().equals("X") && jButton53.getText().equals("X")) {
                    p5 = "X";
                    XVencedorP5();
                } else if (jButton55.getText().equals("X") && jButton58.getText().equals("X")) {
                    p5 = "X";
                    XVencedorP5();
                } else if (!jButton51.getText().equals("") && !jButton52.getText().equals("") && !jButton53.getText().equals("") && !jButton54.getText().equals("") && !jButton55.getText().equals("") && !jButton56.getText().equals("") && !jButton57.getText().equals("") && !jButton58.getText().equals("") && !jButton59.getText().equals("")) {
                p5 = "V";
                VelhaP5();
            }
            } else if (!cont && jButton52.getText().equals("")) {
                jButton52.setText("O");
                jButton52.setBackground(Azul);
                cont = true;
                AtivarP2();
                DesativarP1();
                DesativarP3();
                DesativarP4();
                DesativarP5();
                DesativarP6();
                DesativarP7();
                DesativarP8();
                DesativarP9();

                if (jButton51.getText().equals("O") && jButton53.getText().equals("O")) {
                    p5 = "O";
                    OVencedorP5();
                } else if (jButton55.getText().equals("O") && jButton58.getText().equals("O")) {
                    p5 = "O";
                    OVencedorP5();
                } else if (!jButton51.getText().equals("") && !jButton52.getText().equals("") && !jButton53.getText().equals("") && !jButton54.getText().equals("") && !jButton55.getText().equals("") && !jButton56.getText().equals("") && !jButton57.getText().equals("") && !jButton58.getText().equals("") && !jButton59.getText().equals("")) {
                p5 = "V";
                VelhaP5();
            }
            
            }
        }
        if (p2finish == true) {
            
            AtivarP1();
            AtivarP3();
            AtivarP4();
            AtivarP5();
            AtivarP6();
            AtivarP7();
            AtivarP8();
            AtivarP9();
        }
        VerificarVelha();

    }//GEN-LAST:event_jButton52ActionPerformed

    private void jButton53ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton53ActionPerformed
        // TODO add your handling code here:
        if (primeiraJogada) {
            jButton53.setEnabled(true);
            primeiraJogada = false;
            DesativarP1();
            DesativarP2();
            DesativarP4();
            DesativarP5();
            DesativarP6();
            DesativarP7();
            DesativarP8();
            DesativarP9();
        }

        if (p5finish == false) {
            if (cont && jButton53.getText().equals("")) {
                jButton53.setText("X");
                jButton53.setBackground(Vermelho);
                cont = false;
                AtivarP3();
                DesativarP1();
                DesativarP2();
                DesativarP4();
                DesativarP5();
                DesativarP6();
                DesativarP7();
                DesativarP8();
                DesativarP9();

                if (jButton52.getText().equals("X") && jButton51.getText().equals("X")) {
                    p5 = "X";
                    XVencedorP5();
                } else if (jButton55.getText().equals("X") && jButton57.getText().equals("X")) {
                    p5 = "X";
                    XVencedorP5();
                } else if (jButton56.getText().equals("X") && jButton59.getText().equals("X")) {
                    p5 = "X";
                    XVencedorP5();
                } else if (!jButton51.getText().equals("") && !jButton52.getText().equals("") && !jButton53.getText().equals("") && !jButton54.getText().equals("") && !jButton55.getText().equals("") && !jButton56.getText().equals("") && !jButton57.getText().equals("") && !jButton58.getText().equals("") && !jButton59.getText().equals("")) {
                p5 = "V";
                VelhaP5();
            }
            } else if (!cont && jButton53.getText().equals("")) {
                jButton53.setText("O");
                jButton53.setBackground(Azul);
                cont = true;
                AtivarP3();
                DesativarP1();
                DesativarP2();
                DesativarP4();
                DesativarP5();
                DesativarP6();
                DesativarP7();
                DesativarP8();
                DesativarP9();

                if (jButton52.getText().equals("O") && jButton51.getText().equals("O")) {
                    p5 = "O";
                    OVencedorP5();
                } else if (jButton55.getText().equals("O") && jButton57.getText().equals("O")) {
                    p5 = "O";
                    OVencedorP5();
                } else if (jButton56.getText().equals("O") && jButton59.getText().equals("O")) {
                    p5 = "O";
                    OVencedorP5();
                } else if (!jButton51.getText().equals("") && !jButton52.getText().equals("") && !jButton53.getText().equals("") && !jButton54.getText().equals("") && !jButton55.getText().equals("") && !jButton56.getText().equals("") && !jButton57.getText().equals("") && !jButton58.getText().equals("") && !jButton59.getText().equals("")) {
                p5 = "V";
                VelhaP5();
            }
                        }
        }
        if (p3finish == true) {
            
            AtivarP1();
            AtivarP2();
            AtivarP4();
            AtivarP5();
            AtivarP6();
            AtivarP7();
            AtivarP8();
            AtivarP9();
        }
        VerificarVelha();

    }//GEN-LAST:event_jButton53ActionPerformed

    private void jButton54ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton54ActionPerformed
        // TODO add your handling code here:
        if (primeiraJogada) {
            jButton54.setEnabled(true);
            primeiraJogada = false;
            DesativarP1();
            DesativarP2();
            DesativarP3();
            DesativarP5();
            DesativarP6();
            DesativarP7();
            DesativarP8();
            DesativarP9();
        }

        if (p5finish == false) {
            if (cont && jButton54.getText().equals("")) {
                jButton54.setText("X");
                jButton54.setBackground(Vermelho);
                cont = false;
                AtivarP4();
                DesativarP1();
                DesativarP2();
                DesativarP3();
                DesativarP5();
                DesativarP6();
                DesativarP7();
                DesativarP8();
                DesativarP9();

                if (jButton51.getText().equals("X") && jButton57.getText().equals("X")) {
                    p5 = "X";
                    XVencedorP5();
                } else if (jButton55.getText().equals("X") && jButton56.getText().equals("X")) {
                    p5 = "X";
                    XVencedorP5();
                } else if (!jButton51.getText().equals("") && !jButton52.getText().equals("") && !jButton53.getText().equals("") && !jButton54.getText().equals("") && !jButton55.getText().equals("") && !jButton56.getText().equals("") && !jButton57.getText().equals("") && !jButton58.getText().equals("") && !jButton59.getText().equals("")) {
                p5 = "V";
                VelhaP5();
            }
            } else if (!cont && jButton54.getText().equals("")) {
                jButton54.setText("O");
                jButton54.setBackground(Azul);
                cont = true;
                AtivarP4();
                DesativarP1();
                DesativarP2();
                DesativarP3();
                DesativarP5();
                DesativarP6();
                DesativarP7();
                DesativarP8();
                DesativarP9();

                if (jButton51.getText().equals("O") && jButton57.getText().equals("O")) {
                    p5 = "O";
                    OVencedorP5();
                } else if (jButton55.getText().equals("O") && jButton56.getText().equals("O")) {
                    p5 = "O";
                    OVencedorP5();
                } else if (!jButton51.getText().equals("") && !jButton52.getText().equals("") && !jButton53.getText().equals("") && !jButton54.getText().equals("") && !jButton55.getText().equals("") && !jButton56.getText().equals("") && !jButton57.getText().equals("") && !jButton58.getText().equals("") && !jButton59.getText().equals("")) {
                p5 = "V";
                VelhaP5();
            }
            
            }
        }
        if (p4finish == true) {
            
            AtivarP1();
            AtivarP2();
            AtivarP3();
            AtivarP5();
            AtivarP6();
            AtivarP7();
            AtivarP8();
            AtivarP9();
        }
        VerificarVelha();

    }//GEN-LAST:event_jButton54ActionPerformed

    private void jButton61ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton61ActionPerformed
        // TODO add your handling code here:
        if (primeiraJogada) {
            jButton61.setEnabled(true);
            primeiraJogada = false;
            DesativarP2();
            DesativarP3();
            DesativarP4();
            DesativarP5();
            DesativarP6();
            DesativarP7();
            DesativarP8();
            DesativarP9();
        }

        if (p6finish == false) {
            if (cont && jButton61.getText().equals("")) {
                jButton61.setText("X");
                jButton61.setBackground(Vermelho);
                cont = false;
                AtivarP1();
                DesativarP2();
                DesativarP3();
                DesativarP4();
                DesativarP5();
                DesativarP6();
                DesativarP7();
                DesativarP8();
                DesativarP9();

                if (jButton62.getText().equals("X") && jButton63.getText().equals("X")) {
                    p6 = "X";
                    XVencedorP6();
                } else if (jButton65.getText().equals("X") && jButton69.getText().equals("X")) {
                    p6 = "X";
                    XVencedorP6();
                } else if (jButton64.getText().equals("X") && jButton67.getText().equals("X")) {
                    p6 = "X";
                    XVencedorP6();
                } else if (!jButton61.getText().equals("") && !jButton62.getText().equals("") && !jButton63.getText().equals("") && !jButton64.getText().equals("") && !jButton65.getText().equals("") && !jButton66.getText().equals("") && !jButton67.getText().equals("") && !jButton68.getText().equals("") && !jButton69.getText().equals("")) {
                p6 = "V";
                VelhaP6();
            }
            } else if (!cont && jButton61.getText().equals("")) {
                jButton61.setText("O");
                jButton61.setBackground(Azul);
                cont = true;
                AtivarP1();
                DesativarP2();
                DesativarP3();
                DesativarP4();
                DesativarP5();
                DesativarP6();
                DesativarP7();
                DesativarP8();
                DesativarP9();

                if (jButton62.getText().equals("O") && jButton63.getText().equals("O")) {
                    p6 = "O";
                    OVencedorP6();
                } else if (jButton65.getText().equals("O") && jButton69.getText().equals("O")) {
                    p6 = "O";
                    OVencedorP6();
                } else if (jButton64.getText().equals("O") && jButton67.getText().equals("O")) {
                    p6 = "O";
                    OVencedorP6();
                } else if (!jButton61.getText().equals("") && !jButton62.getText().equals("") && !jButton63.getText().equals("") && !jButton64.getText().equals("") && !jButton65.getText().equals("") && !jButton66.getText().equals("") && !jButton67.getText().equals("") && !jButton68.getText().equals("") && !jButton69.getText().equals("")) {
                p6 = "V";
                VelhaP6();
            }
            } 
        }
        if (p1finish == true) {
            
            AtivarP2();
            AtivarP3();
            AtivarP4();
            AtivarP5();
            AtivarP6();
            AtivarP7();
            AtivarP8();
            AtivarP9();
        }
        VerificarVelha();

    }//GEN-LAST:event_jButton61ActionPerformed

    private void jButton62ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton62ActionPerformed
        // TODO add your handling code here:
        if (primeiraJogada) {
            jButton62.setEnabled(true);
            primeiraJogada = false;
            DesativarP1();
            DesativarP3();
            DesativarP4();
            DesativarP5();
            DesativarP6();
            DesativarP7();
            DesativarP8();
            DesativarP9();
        }

        if (p6finish == false) {
            if (cont && jButton62.getText().equals("")) {
                jButton62.setText("X");
                jButton62.setBackground(Vermelho);
                cont = false;
                AtivarP2();
                DesativarP1();
                DesativarP3();
                DesativarP4();
                DesativarP5();
                DesativarP6();
                DesativarP7();
                DesativarP8();
                DesativarP9();

                if (jButton61.getText().equals("X") && jButton63.getText().equals("X")) {
                    p6 = "X";
                    XVencedorP6();
                } else if (jButton65.getText().equals("X") && jButton68.getText().equals("X")) {
                    p6 = "X";
                    XVencedorP6();
                } else if (!jButton61.getText().equals("") && !jButton62.getText().equals("") && !jButton63.getText().equals("") && !jButton64.getText().equals("") && !jButton65.getText().equals("") && !jButton66.getText().equals("") && !jButton67.getText().equals("") && !jButton68.getText().equals("") && !jButton69.getText().equals("")) {
                p6 = "V";
                VelhaP6();
            }
            } else if (!cont && jButton62.getText().equals("")) {
                jButton62.setText("O");
                jButton62.setBackground(Azul);
                cont = true;
                AtivarP2();
                DesativarP1();
                DesativarP3();
                DesativarP4();
                DesativarP5();
                DesativarP6();
                DesativarP7();
                DesativarP8();
                DesativarP9();

                if (jButton61.getText().equals("O") && jButton63.getText().equals("O")) {
                    p6 = "O";
                    OVencedorP6();
                } else if (jButton65.getText().equals("O") && jButton68.getText().equals("O")) {
                    p6 = "O";
                    OVencedorP6();
                } else if (!jButton61.getText().equals("") && !jButton62.getText().equals("") && !jButton63.getText().equals("") && !jButton64.getText().equals("") && !jButton65.getText().equals("") && !jButton66.getText().equals("") && !jButton67.getText().equals("") && !jButton68.getText().equals("") && !jButton69.getText().equals("")) {
                p6 = "V";
                VelhaP6();
            }
                        }
        }
        if (p2finish == true) {
            
            AtivarP1();
            AtivarP3();
            AtivarP4();
            AtivarP5();
            AtivarP6();
            AtivarP7();
            AtivarP8();
            AtivarP9();
        }
        VerificarVelha();

    }//GEN-LAST:event_jButton62ActionPerformed

    private void jButton63ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton63ActionPerformed
        // TODO add your handling code here:
        if (primeiraJogada) {
            jButton63.setEnabled(true);
            primeiraJogada = false;
            DesativarP1();
            DesativarP2();
            DesativarP4();
            DesativarP5();
            DesativarP6();
            DesativarP7();
            DesativarP8();
            DesativarP9();
        }

        if (p6finish == false) {
            if (cont && jButton63.getText().equals("")) {
                jButton63.setText("X");
                jButton63.setBackground(Vermelho);
                cont = false;
                AtivarP3();
                DesativarP1();
                DesativarP2();
                DesativarP4();
                DesativarP5();
                DesativarP6();
                DesativarP7();
                DesativarP8();
                DesativarP9();

                if (jButton62.getText().equals("X") && jButton61.getText().equals("X")) {
                    p6 = "X";
                    XVencedorP6();
                } else if (jButton65.getText().equals("X") && jButton67.getText().equals("X")) {
                    p6 = "X";
                    XVencedorP6();
                } else if (jButton66.getText().equals("X") && jButton69.getText().equals("X")) {
                    p5 = "X";
                    XVencedorP5();
                } else if (!jButton61.getText().equals("") && !jButton62.getText().equals("") && !jButton63.getText().equals("") && !jButton64.getText().equals("") && !jButton65.getText().equals("") && !jButton66.getText().equals("") && !jButton67.getText().equals("") && !jButton68.getText().equals("") && !jButton69.getText().equals("")) {
                p6 = "V";
                VelhaP6();
            }
            } else if (!cont && jButton63.getText().equals("")) {
                jButton63.setText("O");
                jButton63.setBackground(Azul);
                cont = true;
                AtivarP3();
                DesativarP1();
                DesativarP2();
                DesativarP4();
                DesativarP5();
                DesativarP6();
                DesativarP7();
                DesativarP8();
                DesativarP9();

                if (jButton62.getText().equals("O") && jButton61.getText().equals("O")) {
                    p6 = "O";
                    OVencedorP6();
                } else if (jButton65.getText().equals("O") && jButton67.getText().equals("O")) {
                    p6 = "O";
                    OVencedorP6();
                } else if (jButton66.getText().equals("O") && jButton69.getText().equals("O")) {
                    p6 = "O";
                    OVencedorP6();
                } else if (!jButton61.getText().equals("") && !jButton62.getText().equals("") && !jButton63.getText().equals("") && !jButton64.getText().equals("") && !jButton65.getText().equals("") && !jButton66.getText().equals("") && !jButton67.getText().equals("") && !jButton68.getText().equals("") && !jButton69.getText().equals("")) {
                p6 = "V";
                VelhaP6();
            }
            }
        }
        if (p3finish == true) {
            
            AtivarP1();
            AtivarP2();
            AtivarP4();
            AtivarP5();
            AtivarP6();
            AtivarP7();
            AtivarP8();
            AtivarP9();
        }
        VerificarVelha();

    }//GEN-LAST:event_jButton63ActionPerformed

    private void jButton64ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton64ActionPerformed
        // TODO add your handling code here:
        if (primeiraJogada) {
            jButton64.setEnabled(true);
            primeiraJogada = false;
            DesativarP1();
            DesativarP2();
            DesativarP3();
            DesativarP5();
            DesativarP6();
            DesativarP7();
            DesativarP8();
            DesativarP9();
        }

        if (p6finish == false) {
            if (cont && jButton64.getText().equals("")) {
                jButton64.setText("X");
                jButton64.setBackground(Vermelho);
                cont = false;
                AtivarP4();
                DesativarP1();
                DesativarP2();
                DesativarP3();
                DesativarP5();
                DesativarP6();
                DesativarP7();
                DesativarP8();
                DesativarP9();

                if (jButton61.getText().equals("X") && jButton67.getText().equals("X")) {
                    p6 = "X";
                    XVencedorP6();
                } else if (jButton65.getText().equals("X") && jButton66.getText().equals("X")) {
                    p6 = "X";
                    XVencedorP6();
                } else if (!jButton61.getText().equals("") && !jButton62.getText().equals("") && !jButton63.getText().equals("") && !jButton64.getText().equals("") && !jButton65.getText().equals("") && !jButton66.getText().equals("") && !jButton67.getText().equals("") && !jButton68.getText().equals("") && !jButton69.getText().equals("")) {
                p6 = "V";
                VelhaP6();
            }
            } else if (!cont && jButton64.getText().equals("")) {
                jButton64.setText("O");
                jButton64.setBackground(Azul);
                cont = true;
                AtivarP4();
                DesativarP1();
                DesativarP2();
                DesativarP3();
                DesativarP5();
                DesativarP6();
                DesativarP7();
                DesativarP8();
                DesativarP9();

                if (jButton61.getText().equals("O") && jButton67.getText().equals("O")) {
                    p6 = "O";
                    OVencedorP6();
                } else if (jButton65.getText().equals("O") && jButton66.getText().equals("O")) {
                    p6 = "O";
                    OVencedorP6();
                } else if (!jButton61.getText().equals("") && !jButton62.getText().equals("") && !jButton63.getText().equals("") && !jButton64.getText().equals("") && !jButton65.getText().equals("") && !jButton66.getText().equals("") && !jButton67.getText().equals("") && !jButton68.getText().equals("") && !jButton69.getText().equals("")) {
                p6 = "V";
                VelhaP6();
            }
            
            }
        }
        if (p4finish == true) {
            
            AtivarP1();
            AtivarP2();
            AtivarP3();
            AtivarP5();
            AtivarP6();
            AtivarP7();
            AtivarP8();
            AtivarP9();
        }
        VerificarVelha();

    }//GEN-LAST:event_jButton64ActionPerformed

    private void jButton71ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton71ActionPerformed
        // TODO add your handling code here:
        if (primeiraJogada) {
            jButton71.setEnabled(true);
            primeiraJogada = false;
            DesativarP2();
            DesativarP3();
            DesativarP4();
            DesativarP5();
            DesativarP6();
            DesativarP7();
            DesativarP8();
            DesativarP9();
        }

        if (p7finish == false) {
            if (cont && jButton71.getText().equals("")) {
                jButton71.setText("X");
                jButton71.setBackground(Vermelho);
                cont = false;
                AtivarP1();
                DesativarP2();
                DesativarP3();
                DesativarP4();
                DesativarP5();
                DesativarP6();
                DesativarP7();
                DesativarP8();
                DesativarP9();

                if (jButton72.getText().equals("X") && jButton73.getText().equals("X")) {
                    p7 = "X";
                    XVencedorP7();
                } else if (jButton75.getText().equals("X") && jButton79.getText().equals("X")) {
                    p7 = "X";
                    XVencedorP7();
                } else if (jButton74.getText().equals("X") && jButton77.getText().equals("X")) {
                    p7 = "X";
                    XVencedorP7();
                }else if (!jButton71.getText().equals("") && !jButton72.getText().equals("") && !jButton73.getText().equals("") && !jButton74.getText().equals("") && !jButton75.getText().equals("") && !jButton76.getText().equals("") && !jButton77.getText().equals("") && !jButton78.getText().equals("") && !jButton79.getText().equals("")) {
                p7 = "V";
                VelhaP7();
            }
            } else if (!cont && jButton71.getText().equals("")) {
                jButton71.setText("O");
                jButton71.setBackground(Azul);
                cont = true;
                AtivarP1();
                DesativarP2();
                DesativarP3();
                DesativarP4();
                DesativarP5();
                DesativarP6();
                DesativarP7();
                DesativarP8();
                DesativarP9();

                if (jButton72.getText().equals("O") && jButton73.getText().equals("O")) {
                    p7 = "O";
                    OVencedorP7();
                } else if (jButton75.getText().equals("O") && jButton79.getText().equals("O")) {
                    p7 = "O";
                    OVencedorP7();
                } else if (jButton74.getText().equals("O") && jButton77.getText().equals("O")) {
                    p7 = "O";
                    OVencedorP7();
                }else if (!jButton71.getText().equals("") && !jButton72.getText().equals("") && !jButton73.getText().equals("") && !jButton74.getText().equals("") && !jButton75.getText().equals("") && !jButton76.getText().equals("") && !jButton77.getText().equals("") && !jButton78.getText().equals("") && !jButton79.getText().equals("")) {
                p7 = "V";
                VelhaP7();
            }
            } 
        }
        if (p1finish == true) {
            
            AtivarP2();
            AtivarP3();
            AtivarP4();
            AtivarP5();
            AtivarP6();
            AtivarP7();
            AtivarP8();
            AtivarP9();
        }
        VerificarVelha();
    }//GEN-LAST:event_jButton71ActionPerformed

    private void jButton72ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton72ActionPerformed
        // TODO add your handling code here:
        if (primeiraJogada) {
            jButton72.setEnabled(true);
            primeiraJogada = false;
            DesativarP1();
            DesativarP3();
            DesativarP4();
            DesativarP5();
            DesativarP6();
            DesativarP7();
            DesativarP8();
            DesativarP9();
        }

        if (p7finish == false) {
            if (cont && jButton72.getText().equals("")) {
                jButton72.setText("X");
                jButton72.setBackground(Vermelho);
                cont = false;
                AtivarP2();
                DesativarP1();
                DesativarP3();
                DesativarP4();
                DesativarP5();
                DesativarP6();
                DesativarP7();
                DesativarP8();
                DesativarP9();

                if (jButton71.getText().equals("X") && jButton73.getText().equals("X")) {
                    p7 = "X";
                    XVencedorP7();
                } else if (jButton75.getText().equals("X") && jButton78.getText().equals("X")) {
                    p7 = "X";
                    XVencedorP7();
                } else if (!jButton71.getText().equals("") && !jButton72.getText().equals("") && !jButton73.getText().equals("") && !jButton74.getText().equals("") && !jButton75.getText().equals("") && !jButton76.getText().equals("") && !jButton77.getText().equals("") && !jButton78.getText().equals("") && !jButton79.getText().equals("")) {
                p7 = "V";
                VelhaP7();
            }
            } else if (!cont && jButton72.getText().equals("")) {
                jButton72.setText("O");
                jButton72.setBackground(Azul);
                cont = true;
                AtivarP2();
                DesativarP1();
                DesativarP3();
                DesativarP4();
                DesativarP5();
                DesativarP6();
                DesativarP7();
                DesativarP8();
                DesativarP9();

                if (jButton71.getText().equals("O") && jButton73.getText().equals("O")) {
                    p7 = "O";
                    OVencedorP7();
                } else if (jButton75.getText().equals("O") && jButton78.getText().equals("O")) {
                    p7 = "O";
                    OVencedorP7();
                } else if (!jButton71.getText().equals("") && !jButton72.getText().equals("") && !jButton73.getText().equals("") && !jButton74.getText().equals("") && !jButton75.getText().equals("") && !jButton76.getText().equals("") && !jButton77.getText().equals("") && !jButton78.getText().equals("") && !jButton79.getText().equals("")) {
                p7 = "V";
                VelhaP7();
            }
            
            }
        }
        if (p2finish == true) {
            
            AtivarP1();
            AtivarP3();
            AtivarP4();
            AtivarP5();
            AtivarP6();
            AtivarP7();
            AtivarP8();
            AtivarP9();
        }
        VerificarVelha();

    }//GEN-LAST:event_jButton72ActionPerformed

    private void jButton73ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton73ActionPerformed
        // TODO add your handling code here:
        if (primeiraJogada) {
            jButton73.setEnabled(true);
            primeiraJogada = false;
            DesativarP1();
            DesativarP2();
            DesativarP4();
            DesativarP5();
            DesativarP6();
            DesativarP7();
            DesativarP8();
            DesativarP9();
        }

        if (p7finish == false) {
            if (cont && jButton73.getText().equals("")) {
                jButton73.setText("X");
                jButton73.setBackground(Vermelho);
                cont = false;
                AtivarP3();
                DesativarP1();
                DesativarP2();
                DesativarP4();
                DesativarP5();
                DesativarP6();
                DesativarP7();
                DesativarP8();
                DesativarP9();

                if (jButton72.getText().equals("X") && jButton71.getText().equals("X")) {
                    p7 = "X";
                    XVencedorP7();
                } else if (jButton75.getText().equals("X") && jButton77.getText().equals("X")) {
                    p7 = "X";
                    XVencedorP7();
                } else if (jButton76.getText().equals("X") && jButton79.getText().equals("X")) {
                    p7 = "X";
                    XVencedorP7();
                } else if (!jButton71.getText().equals("") && !jButton72.getText().equals("") && !jButton73.getText().equals("") && !jButton74.getText().equals("") && !jButton75.getText().equals("") && !jButton76.getText().equals("") && !jButton77.getText().equals("") && !jButton78.getText().equals("") && !jButton79.getText().equals("")) {
                p7 = "V";
                VelhaP7();
            }
            } else if (!cont && jButton73.getText().equals("")) {
                jButton73.setText("O");
                jButton73.setBackground(Azul);
                cont = true;
                AtivarP3();
                DesativarP1();
                DesativarP2();
                DesativarP4();
                DesativarP5();
                DesativarP6();
                DesativarP7();
                DesativarP8();
                DesativarP9();

                if (jButton72.getText().equals("O") && jButton71.getText().equals("O")) {
                    p7 = "O";
                    OVencedorP7();
                } else if (jButton75.getText().equals("O") && jButton77.getText().equals("O")) {
                    p7 = "O";
                    OVencedorP7();
                } else if (jButton76.getText().equals("O") && jButton79.getText().equals("O")) {
                    p7 = "O";
                    OVencedorP7();
                } else if (!jButton71.getText().equals("") && !jButton72.getText().equals("") && !jButton73.getText().equals("") && !jButton74.getText().equals("") && !jButton75.getText().equals("") && !jButton76.getText().equals("") && !jButton77.getText().equals("") && !jButton78.getText().equals("") && !jButton79.getText().equals("")) {
                p7 = "V";
                VelhaP7();
            }
            
            }
        }
        if (p3finish == true) {
            
            AtivarP1();
            AtivarP2();
            AtivarP4();
            AtivarP5();
            AtivarP6();
            AtivarP7();
            AtivarP8();
            AtivarP9();
        }
        VerificarVelha();

    }//GEN-LAST:event_jButton73ActionPerformed

    private void jButton74ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton74ActionPerformed
        // TODO add your handling code here:
        if (primeiraJogada) {
            jButton74.setEnabled(true);
            primeiraJogada = false;
            DesativarP1();
            DesativarP2();
            DesativarP3();
            DesativarP5();
            DesativarP6();
            DesativarP7();
            DesativarP8();
            DesativarP9();
        }

        if (p7finish == false) {
            if (cont && jButton74.getText().equals("")) {
                jButton74.setText("X");
                jButton74.setBackground(Vermelho);
                cont = false;
                AtivarP4();
                DesativarP1();
                DesativarP2();
                DesativarP3();
                DesativarP5();
                DesativarP6();
                DesativarP7();
                DesativarP8();
                DesativarP9();

                if (jButton71.getText().equals("X") && jButton77.getText().equals("X")) {
                    p7 = "X";
                    XVencedorP7();
                } else if (jButton75.getText().equals("X") && jButton76.getText().equals("X")) {
                    p7 = "X";
                    XVencedorP7();
                } else if (!jButton71.getText().equals("") && !jButton72.getText().equals("") && !jButton73.getText().equals("") && !jButton74.getText().equals("") && !jButton75.getText().equals("") && !jButton76.getText().equals("") && !jButton77.getText().equals("") && !jButton78.getText().equals("") && !jButton79.getText().equals("")) {
                p7 = "V";
                VelhaP7();
            }
            } else if (!cont && jButton74.getText().equals("")) {
                jButton74.setText("O");
                jButton74.setBackground(Azul);
                cont = true;
                AtivarP4();
                DesativarP1();
                DesativarP2();
                DesativarP3();
                DesativarP5();
                DesativarP6();
                DesativarP7();
                DesativarP8();
                DesativarP9();

                if (jButton71.getText().equals("O") && jButton77.getText().equals("O")) {
                    p7 = "O";
                    OVencedorP7();
                } else if (jButton75.getText().equals("O") && jButton76.getText().equals("O")) {
                    p7 = "O";
                    OVencedorP7();
                } else if (!jButton71.getText().equals("") && !jButton72.getText().equals("") && !jButton73.getText().equals("") && !jButton74.getText().equals("") && !jButton75.getText().equals("") && !jButton76.getText().equals("") && !jButton77.getText().equals("") && !jButton78.getText().equals("") && !jButton79.getText().equals("")) {
                p7 = "V";
                VelhaP7();
            }
            
            }
        }
        if (p4finish == true) {
            
            AtivarP1();
            AtivarP2();
            AtivarP3();
            AtivarP5();
            AtivarP6();
            AtivarP7();
            AtivarP8();
            AtivarP9();
        }
        VerificarVelha();
    }//GEN-LAST:event_jButton74ActionPerformed

    private void jButton81ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton81ActionPerformed
        // TODO add your handling code here:
        if (primeiraJogada) {
            jButton81.setEnabled(true);
            primeiraJogada = false;
            DesativarP2();
            DesativarP3();
            DesativarP4();
            DesativarP5();
            DesativarP6();
            DesativarP7();
            DesativarP8();
            DesativarP9();
        }

        if (p8finish == false) {
            if (cont && jButton81.getText().equals("")) {
                jButton81.setText("X");
                jButton81.setBackground(Vermelho);
                cont = false;
                AtivarP1();
                DesativarP2();
                DesativarP3();
                DesativarP4();
                DesativarP5();
                DesativarP6();
                DesativarP7();
                DesativarP8();
                DesativarP9();

                if (jButton82.getText().equals("X") && jButton83.getText().equals("X")) {
                    p8 = "X";
                    XVencedorP8();
                } else if (jButton85.getText().equals("X") && jButton89.getText().equals("X")) {
                    p8 = "X";
                    XVencedorP8();
                } else if (jButton84.getText().equals("X") && jButton87.getText().equals("X")) {
                    p8 = "X";
                    XVencedorP8();
                } else if (!jButton81.getText().equals("") && !jButton82.getText().equals("") && !jButton83.getText().equals("") && !jButton84.getText().equals("") && !jButton85.getText().equals("") && !jButton86.getText().equals("") && !jButton87.getText().equals("") && !jButton88.getText().equals("") && !jButton89.getText().equals("")) {
                p8 = "V";
                VelhaP8();
            }
            } else if (!cont && jButton81.getText().equals("")) {
                jButton81.setText("O");
                jButton81.setBackground(Azul);
                cont = true;
                AtivarP1();
                DesativarP2();
                DesativarP3();
                DesativarP4();
                DesativarP5();
                DesativarP6();
                DesativarP7();
                DesativarP8();
                DesativarP9();

                if (jButton82.getText().equals("O") && jButton83.getText().equals("O")) {
                    p8 = "O";
                    OVencedorP8();
                } else if (jButton85.getText().equals("O") && jButton89.getText().equals("O")) {
                    p8 = "O";
                    OVencedorP8();
                } else if (jButton84.getText().equals("O") && jButton87.getText().equals("O")) {
                    p8 = "O";
                    OVencedorP8();
                } else if (!jButton81.getText().equals("") && !jButton82.getText().equals("") && !jButton83.getText().equals("") && !jButton84.getText().equals("") && !jButton85.getText().equals("") && !jButton86.getText().equals("") && !jButton87.getText().equals("") && !jButton88.getText().equals("") && !jButton89.getText().equals("")) {
                p8 = "V";
                VelhaP8();
            }
            } 
        }
        if (p1finish == true) {
            
            AtivarP2();
            AtivarP3();
            AtivarP4();
            AtivarP5();
            AtivarP6();
            AtivarP7();
            AtivarP8();
            AtivarP9();
        }
        VerificarVelha();

    }//GEN-LAST:event_jButton81ActionPerformed

    private void jButton82ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton82ActionPerformed
        // TODO add your handling code here:
        if (primeiraJogada) {
            jButton82.setEnabled(true);
            primeiraJogada = false;
            DesativarP1();
            DesativarP3();
            DesativarP4();
            DesativarP5();
            DesativarP6();
            DesativarP7();
            DesativarP8();
            DesativarP9();
        }

        if (p8finish == false) {
            if (cont && jButton82.getText().equals("")) {
                jButton82.setText("X");
                jButton82.setBackground(Vermelho);
                cont = false;
                AtivarP2();
                DesativarP1();
                DesativarP3();
                DesativarP4();
                DesativarP5();
                DesativarP6();
                DesativarP7();
                DesativarP8();
                DesativarP9();

                if (jButton81.getText().equals("X") && jButton83.getText().equals("X")) {
                    p8 = "X";
                    XVencedorP8();
                } else if (jButton85.getText().equals("X") && jButton88.getText().equals("X")) {
                    p8 = "X";
                    XVencedorP8();
                } else if (!jButton81.getText().equals("") && !jButton82.getText().equals("") && !jButton83.getText().equals("") && !jButton84.getText().equals("") && !jButton85.getText().equals("") && !jButton86.getText().equals("") && !jButton87.getText().equals("") && !jButton88.getText().equals("") && !jButton89.getText().equals("")) {
                p8 = "V";
                VelhaP8();
            }
            } else if (!cont && jButton82.getText().equals("")) {
                jButton82.setText("O");
                jButton82.setBackground(Azul);
                cont = true;
                AtivarP2();
                DesativarP1();
                DesativarP3();
                DesativarP4();
                DesativarP5();
                DesativarP6();
                DesativarP7();
                DesativarP8();
                DesativarP9();

                if (jButton81.getText().equals("O") && jButton83.getText().equals("O")) {
                    p8 = "O";
                    OVencedorP8();
                } else if (jButton85.getText().equals("O") && jButton88.getText().equals("O")) {
                    p8 = "O";
                    OVencedorP8();
                } else if (!jButton81.getText().equals("") && !jButton82.getText().equals("") && !jButton83.getText().equals("") && !jButton84.getText().equals("") && !jButton85.getText().equals("") && !jButton86.getText().equals("") && !jButton87.getText().equals("") && !jButton88.getText().equals("") && !jButton89.getText().equals("")) {
                p8 = "V";
                VelhaP8();
            }
                        }
        }
        if (p2finish == true) {
            
            AtivarP1();
            AtivarP3();
            AtivarP4();
            AtivarP5();
            AtivarP6();
            AtivarP7();
            AtivarP8();
            AtivarP9();
        }
        VerificarVelha();

    }//GEN-LAST:event_jButton82ActionPerformed

    private void jButton83ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton83ActionPerformed
        // TODO add your handling code here:
        if (primeiraJogada) {
            jButton83.setEnabled(true);
            primeiraJogada = false;
            DesativarP1();
            DesativarP2();
            DesativarP4();
            DesativarP5();
            DesativarP6();
            DesativarP7();
            DesativarP8();
            DesativarP9();
        }

        if (p8finish == false) {
            if (cont && jButton83.getText().equals("")) {
                jButton83.setText("X");
                jButton83.setBackground(Vermelho);
                cont = false;
                AtivarP3();
                DesativarP1();
                DesativarP2();
                DesativarP4();
                DesativarP5();
                DesativarP6();
                DesativarP7();
                DesativarP8();
                DesativarP9();

                if (jButton82.getText().equals("X") && jButton81.getText().equals("X")) {
                    p8 = "X";
                    XVencedorP8();
                } else if (jButton85.getText().equals("X") && jButton87.getText().equals("X")) {
                    p8 = "X";
                    XVencedorP8();
                } else if (jButton86.getText().equals("X") && jButton89.getText().equals("X")) {
                    p8 = "X";
                    XVencedorP8();
                } else if (!jButton81.getText().equals("") && !jButton82.getText().equals("") && !jButton83.getText().equals("") && !jButton84.getText().equals("") && !jButton85.getText().equals("") && !jButton86.getText().equals("") && !jButton87.getText().equals("") && !jButton88.getText().equals("") && !jButton89.getText().equals("")) {
                p8 = "V";
                VelhaP8();
            }
            } else if (!cont && jButton83.getText().equals("")) {
                jButton83.setText("O");
                jButton83.setBackground(Azul);
                cont = true;
                AtivarP3();
                DesativarP1();
                DesativarP2();
                DesativarP4();
                DesativarP5();
                DesativarP6();
                DesativarP7();
                DesativarP8();
                DesativarP9();

                if (jButton82.getText().equals("O") && jButton81.getText().equals("O")) {
                    p8 = "O";
                    OVencedorP8();
                } else if (jButton85.getText().equals("O") && jButton87.getText().equals("O")) {
                    p8 = "O";
                    OVencedorP8();
                } else if (jButton86.getText().equals("O") && jButton89.getText().equals("O")) {
                    p8 = "O";
                    OVencedorP8();
                } else if (!jButton81.getText().equals("") && !jButton82.getText().equals("") && !jButton83.getText().equals("") && !jButton84.getText().equals("") && !jButton85.getText().equals("") && !jButton86.getText().equals("") && !jButton87.getText().equals("") && !jButton88.getText().equals("") && !jButton89.getText().equals("")) {
                p8 = "V";
                VelhaP8();
            }
           
            }
        }
        if (p3finish == true) {
            
            AtivarP1();
            AtivarP2();
            AtivarP4();
            AtivarP5();
            AtivarP6();
            AtivarP7();
            AtivarP8();
            AtivarP9();
        }
        VerificarVelha();

    }//GEN-LAST:event_jButton83ActionPerformed

    private void jButton84ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton84ActionPerformed
        // TODO add your handling code here:
        if (primeiraJogada) {
            jButton84.setEnabled(true);
            primeiraJogada = false;
            DesativarP1();
            DesativarP2();
            DesativarP3();
            DesativarP5();
            DesativarP6();
            DesativarP7();
            DesativarP8();
            DesativarP9();
        }

        if (p8finish == false) {
            if (cont && jButton84.getText().equals("")) {
                jButton84.setText("X");
                jButton84.setBackground(Vermelho);
                cont = false;
                AtivarP4();
                DesativarP1();
                DesativarP2();
                DesativarP3();
                DesativarP5();
                DesativarP6();
                DesativarP7();
                DesativarP8();
                DesativarP9();

                if (jButton81.getText().equals("X") && jButton87.getText().equals("X")) {
                    p8 = "X";
                    XVencedorP8();
                } else if (jButton85.getText().equals("X") && jButton86.getText().equals("X")) {
                    p8 = "X";
                    XVencedorP8();
                } else if (!jButton81.getText().equals("") && !jButton82.getText().equals("") && !jButton83.getText().equals("") && !jButton84.getText().equals("") && !jButton85.getText().equals("") && !jButton86.getText().equals("") && !jButton87.getText().equals("") && !jButton88.getText().equals("") && !jButton89.getText().equals("")) {
                p8 = "V";
                VelhaP8();
            }
            } else if (!cont && jButton84.getText().equals("")) {
                jButton84.setText("O");
                jButton84.setBackground(Azul);
                cont = true;
                AtivarP4();
                DesativarP1();
                DesativarP2();
                DesativarP3();
                DesativarP5();
                DesativarP6();
                DesativarP7();
                DesativarP8();
                DesativarP9();

                if (jButton81.getText().equals("O") && jButton87.getText().equals("O")) {
                    p8 = "O";
                    OVencedorP8();
                } else if (jButton85.getText().equals("O") && jButton86.getText().equals("O")) {
                    p8 = "O";
                    OVencedorP8();
                } else if (!jButton81.getText().equals("") && !jButton82.getText().equals("") && !jButton83.getText().equals("") && !jButton84.getText().equals("") && !jButton85.getText().equals("") && !jButton86.getText().equals("") && !jButton87.getText().equals("") && !jButton88.getText().equals("") && !jButton89.getText().equals("")) {
                p8 = "V";
                VelhaP8();
            }
            
            }
        }
        if (p4finish == true) {
            
            AtivarP1();
            AtivarP2();
            AtivarP3();
            AtivarP5();
            AtivarP6();
            AtivarP7();
            AtivarP8();
            AtivarP9();
        }
        VerificarVelha();
    }//GEN-LAST:event_jButton84ActionPerformed

    private void jButton91ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton91ActionPerformed
        // TODO add your handling code here:
        if (primeiraJogada) {
            jButton91.setEnabled(true);
            primeiraJogada = false;
            DesativarP2();
            DesativarP3();
            DesativarP4();
            DesativarP5();
            DesativarP6();
            DesativarP7();
            DesativarP8();
            DesativarP9();
        }

        if (p9finish == false) {
            if (cont && jButton91.getText().equals("")) {
                jButton91.setText("X");
                jButton91.setBackground(Vermelho);
                cont = false;
                AtivarP1();
                DesativarP2();
                DesativarP3();
                DesativarP4();
                DesativarP5();
                DesativarP6();
                DesativarP7();
                DesativarP8();
                DesativarP9();

                if (jButton92.getText().equals("X") && jButton93.getText().equals("X")) {
                    p9 = "X";
                    XVencedorP9();
                } else if (jButton95.getText().equals("X") && jButton99.getText().equals("X")) {
                    p9 = "X";
                    XVencedorP9();
                } else if (jButton94.getText().equals("X") && jButton97.getText().equals("X")) {
                    p9 = "X";
                    XVencedorP9();
                } else if (!jButton91.getText().equals("") && !jButton92.getText().equals("") && !jButton93.getText().equals("") && !jButton94.getText().equals("") && !jButton95.getText().equals("") && !jButton96.getText().equals("") && !jButton97.getText().equals("") && !jButton98.getText().equals("") && !jButton99.getText().equals("")) {
                p9 = "V";
                VelhaP9();
            }
            } else if (!cont && jButton91.getText().equals("")) {
                jButton91.setText("O");
                jButton91.setBackground(Azul);
                cont = true;
                AtivarP1();
                DesativarP2();
                DesativarP3();
                DesativarP4();
                DesativarP5();
                DesativarP6();
                DesativarP7();
                DesativarP8();
                DesativarP9();

                if (jButton92.getText().equals("O") && jButton93.getText().equals("O")) {
                    p9 = "O";
                    OVencedorP9();
                } else if (jButton95.getText().equals("O") && jButton99.getText().equals("O")) {
                    p9 = "O";
                    OVencedorP9();
                } else if (jButton94.getText().equals("O") && jButton97.getText().equals("O")) {
                    p9 = "O";
                    OVencedorP9();
                } else if (!jButton91.getText().equals("") && !jButton92.getText().equals("") && !jButton93.getText().equals("") && !jButton94.getText().equals("") && !jButton95.getText().equals("") && !jButton96.getText().equals("") && !jButton97.getText().equals("") && !jButton98.getText().equals("") && !jButton99.getText().equals("")) {
                p9 = "V";
                VelhaP9();
            }
            } 
        }
        if (p1finish == true) {
            
            AtivarP2();
            AtivarP3();
            AtivarP4();
            AtivarP5();
            AtivarP6();
            AtivarP7();
            AtivarP8();
            AtivarP9();
        }
        VerificarVelha();
    }//GEN-LAST:event_jButton91ActionPerformed

    private void jButton92ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton92ActionPerformed
        // TODO add your handling code here:
        if (primeiraJogada) {
            jButton92.setEnabled(true);
            primeiraJogada = false;
            DesativarP1();
            DesativarP3();
            DesativarP4();
            DesativarP5();
            DesativarP6();
            DesativarP7();
            DesativarP8();
            DesativarP9();
        }

        if (p9finish == false) {
            if (cont && jButton92.getText().equals("")) {
                jButton92.setText("X");
                jButton92.setBackground(Vermelho);
                cont = false;
                AtivarP2();
                DesativarP1();
                DesativarP3();
                DesativarP4();
                DesativarP5();
                DesativarP6();
                DesativarP7();
                DesativarP8();
                DesativarP9();

                if (jButton91.getText().equals("X") && jButton93.getText().equals("X")) {
                    p9 = "X";
                    XVencedorP9();
                } else if (jButton95.getText().equals("X") && jButton98.getText().equals("X")) {
                    p9 = "X";
                    XVencedorP8();
                } else if (!jButton91.getText().equals("") && !jButton92.getText().equals("") && !jButton93.getText().equals("") && !jButton94.getText().equals("") && !jButton95.getText().equals("") && !jButton96.getText().equals("") && !jButton97.getText().equals("") && !jButton98.getText().equals("") && !jButton99.getText().equals("")) {
                p9 = "V";
                VelhaP9();
            }
            } else if (!cont && jButton92.getText().equals("")) {
                jButton92.setText("O");
                jButton92.setBackground(Azul);
                cont = true;
                AtivarP2();
                DesativarP1();
                DesativarP3();
                DesativarP4();
                DesativarP5();
                DesativarP6();
                DesativarP7();
                DesativarP8();
                DesativarP9();

                if (jButton91.getText().equals("O") && jButton93.getText().equals("O")) {
                    p9 = "O";
                    OVencedorP9();
                } else if (jButton95.getText().equals("O") && jButton98.getText().equals("O")) {
                    p9 = "O";
                    OVencedorP9();
                } else if (!jButton91.getText().equals("") && !jButton92.getText().equals("") && !jButton93.getText().equals("") && !jButton94.getText().equals("") && !jButton95.getText().equals("") && !jButton96.getText().equals("") && !jButton97.getText().equals("") && !jButton98.getText().equals("") && !jButton99.getText().equals("")) {
                p9 = "V";
                VelhaP9();
            }
                        }
        }
        if (p2finish == true) {
            
            AtivarP1();
            AtivarP3();
            AtivarP4();
            AtivarP5();
            AtivarP6();
            AtivarP7();
            AtivarP8();
            AtivarP9();
        }
        VerificarVelha();


    }//GEN-LAST:event_jButton92ActionPerformed

    private void jButton93ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton93ActionPerformed
        // TODO add your handling code here:
        if (primeiraJogada) {
            jButton93.setEnabled(true);
            primeiraJogada = false;
            DesativarP1();
            DesativarP2();
            DesativarP4();
            DesativarP5();
            DesativarP6();
            DesativarP7();
            DesativarP8();
            DesativarP9();
        }

        if (p9finish == false) {
            if (cont && jButton93.getText().equals("")) {
                jButton93.setText("X");
                jButton93.setBackground(Vermelho);
                cont = false;
                AtivarP3();
                DesativarP1();
                DesativarP2();
                DesativarP4();
                DesativarP5();
                DesativarP6();
                DesativarP7();
                DesativarP8();
                DesativarP9();

                if (jButton92.getText().equals("X") && jButton91.getText().equals("X")) {
                    p9 = "X";
                    XVencedorP9();
                } else if (jButton95.getText().equals("X") && jButton97.getText().equals("X")) {
                    p9 = "X";
                    XVencedorP9();
                } else if (jButton96.getText().equals("X") && jButton99.getText().equals("X")) {
                    p9 = "X";
                    XVencedorP9();
                } else if (!jButton91.getText().equals("") && !jButton92.getText().equals("") && !jButton93.getText().equals("") && !jButton94.getText().equals("") && !jButton95.getText().equals("") && !jButton96.getText().equals("") && !jButton97.getText().equals("") && !jButton98.getText().equals("") && !jButton99.getText().equals("")) {
                p9 = "V";
                VelhaP9();
            }
            } else if (!cont && jButton93.getText().equals("")) {
                jButton93.setText("O");
                jButton93.setBackground(Azul);
                cont = true;
                AtivarP3();
                DesativarP1();
                DesativarP2();
                DesativarP4();
                DesativarP5();
                DesativarP6();
                DesativarP7();
                DesativarP8();
                DesativarP9();

                if (jButton92.getText().equals("O") && jButton91.getText().equals("O")) {
                    p9 = "O";
                    OVencedorP9();
                } else if (jButton95.getText().equals("O") && jButton97.getText().equals("O")) {
                    p9 = "O";
                    OVencedorP9();
                } else if (jButton96.getText().equals("O") && jButton99.getText().equals("O")) {
                    p9 = "O";
                    OVencedorP9();
                } else if (!jButton91.getText().equals("") && !jButton92.getText().equals("") && !jButton93.getText().equals("") && !jButton94.getText().equals("") && !jButton95.getText().equals("") && !jButton96.getText().equals("") && !jButton97.getText().equals("") && !jButton98.getText().equals("") && !jButton99.getText().equals("")) {
                p9 = "V";
                VelhaP9();
            }
            
            }
        }
        if (p3finish == true) {
            
            AtivarP1();
            AtivarP2();
            AtivarP4();
            AtivarP5();
            AtivarP6();
            AtivarP7();
            AtivarP8();
            AtivarP9();
        }
        VerificarVelha();

    }//GEN-LAST:event_jButton93ActionPerformed

    private void jButton94ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton94ActionPerformed
        // TODO add your handling code here:
        if (primeiraJogada) {
            jButton94.setEnabled(true);
            primeiraJogada = false;
            DesativarP1();
            DesativarP2();
            DesativarP3();
            DesativarP5();
            DesativarP6();
            DesativarP7();
            DesativarP8();
            DesativarP9();
        }

        if (p9finish == false) {
            if (cont && jButton94.getText().equals("")) {
                jButton94.setText("X");
                jButton94.setBackground(Vermelho);
                cont = false;
                AtivarP4();
                DesativarP1();
                DesativarP2();
                DesativarP3();
                DesativarP5();
                DesativarP6();
                DesativarP7();
                DesativarP8();
                DesativarP9();

                if (jButton91.getText().equals("X") && jButton97.getText().equals("X")) {
                    p9 = "X";
                    XVencedorP9();
                } else if (jButton95.getText().equals("X") && jButton96.getText().equals("X")) {
                    p9 = "X";
                    XVencedorP9();
                } else if (!jButton91.getText().equals("") && !jButton92.getText().equals("") && !jButton93.getText().equals("") && !jButton94.getText().equals("") && !jButton95.getText().equals("") && !jButton96.getText().equals("") && !jButton97.getText().equals("") && !jButton98.getText().equals("") && !jButton99.getText().equals("")) {
                p9 = "V";
                VelhaP9();
            }
            } else if (!cont && jButton94.getText().equals("")) {
                jButton94.setText("O");
                jButton94.setBackground(Azul);
                cont = true;
                AtivarP4();
                DesativarP1();
                DesativarP2();
                DesativarP3();
                DesativarP5();
                DesativarP6();
                DesativarP7();
                DesativarP8();
                DesativarP9();

                if (jButton91.getText().equals("O") && jButton97.getText().equals("O")) {
                    p9 = "O";
                    OVencedorP9();
                } else if (jButton95.getText().equals("O") && jButton96.getText().equals("O")) {
                    p9 = "O";
                    OVencedorP9();
                } else if (!jButton91.getText().equals("") && !jButton92.getText().equals("") && !jButton93.getText().equals("") && !jButton94.getText().equals("") && !jButton95.getText().equals("") && !jButton96.getText().equals("") && !jButton97.getText().equals("") && !jButton98.getText().equals("") && !jButton99.getText().equals("")) {
                p9 = "V";
                VelhaP9();
            }
            
            }
        }
        if (p4finish == true) {
            
            AtivarP1();
            AtivarP2();
            AtivarP3();
            AtivarP5();
            AtivarP6();
            AtivarP7();
            AtivarP8();
            AtivarP9();
        }

        VerificarVelha();

    }//GEN-LAST:event_jButton94ActionPerformed

    private void jButton15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton15ActionPerformed
        // TODO add your handling code here:
        if (primeiraJogada) {
            jButton15.setEnabled(true); // Habilita o botão jButton11 na primeira jogada
            primeiraJogada = false; // Marque que a primeira jogada já ocorreu
            DesativarP1();
            DesativarP2();
            DesativarP3();
            DesativarP4();
            DesativarP6();
            DesativarP7();
            DesativarP8();
            DesativarP9();
        }

        if (p1finish == false) {
            if (cont && jButton15.getText().equals("")) {
                jButton15.setText("X");
                jButton15.setBackground(Vermelho);
                cont = false;
                AtivarP5();
                DesativarP1();
                DesativarP2();
                DesativarP3();
                DesativarP4();
                DesativarP6();
                DesativarP7();
                DesativarP8();
                DesativarP9();

                if (jButton12.getText().equals("X") && jButton18.getText().equals("X")) {
                    p1 = "X";
                    XVencedorP1();
                } else if (jButton13.getText().equals("X") && jButton17.getText().equals("X")) {
                    p1 = "X";
                    XVencedorP1();
                } else if (jButton16.getText().equals("X") && jButton14.getText().equals("X")) {
                    p1 = "X";
                    XVencedorP1();
                } else if (jButton11.getText().equals("X") && jButton19.getText().equals("X")) {
                    p1 = "X";
                    XVencedorP1();
                } else if (!jButton11.getText().equals("") && !jButton12.getText().equals("") && !jButton13.getText().equals("") && !jButton14.getText().equals("") && !jButton15.getText().equals("") && !jButton16.getText().equals("") && !jButton17.getText().equals("") && !jButton18.getText().equals("") && !jButton19.getText().equals("")) {
                    p1 = "V";
                    VelhaP1();
                }
                } else if (!cont && jButton15.getText().equals("")) {
                    jButton15.setText("O");
                    jButton15.setBackground(Azul);
                    cont = true;
                    AtivarP5();
                    DesativarP1();
                    DesativarP2();
                    DesativarP3();
                    DesativarP4();
                    DesativarP6();
                    DesativarP7();
                    DesativarP8();
                    DesativarP9();

                    if (jButton12.getText().equals("O") && jButton19.getText().equals("O")) {
                        p1 = "O";
                        OVencedorP1();
                    } else if (jButton13.getText().equals("O") && jButton17.getText().equals("O")) {
                        p1 = "O";
                        OVencedorP1();
                    } else if (jButton16.getText().equals("O") && jButton14.getText().equals("O")) {
                        p1 = "O";
                        OVencedorP1();
                    } else if (jButton11.getText().equals("O") && jButton19.getText().equals("O")) {
                        p1 = "O";
                        OVencedorP1();
                    } else if (!jButton11.getText().equals("") && !jButton12.getText().equals("") && !jButton13.getText().equals("") && !jButton14.getText().equals("") && !jButton15.getText().equals("") && !jButton16.getText().equals("") && !jButton17.getText().equals("") && !jButton18.getText().equals("") && !jButton19.getText().equals("")) {
                        p1 = "V";
                        VelhaP1();
                    }
                
            }
        }
        if (p5finish == true) {
            
            AtivarP1();
            AtivarP2();
            AtivarP3();
            AtivarP4();
            AtivarP6();
            AtivarP7();
            AtivarP8();
            AtivarP9();
        }
        VerificarVelha();

    }//GEN-LAST:event_jButton15ActionPerformed

    private void jButton16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton16ActionPerformed
        // TODO add your handling code here:
        if (primeiraJogada) {
            jButton16.setEnabled(true); // Habilita o botão jButton11 na primeira jogada
            primeiraJogada = false; // Marque que a primeira jogada já ocorreu
            DesativarP1();
            DesativarP2();
            DesativarP3();
            DesativarP4();
            DesativarP5();
            DesativarP7();
            DesativarP8();
            DesativarP9();
        }

        if (p1finish == false) {
            if (cont && jButton16.getText().equals("")) {
                jButton16.setText("X");
                jButton16.setBackground(Vermelho);
                cont = false;
                AtivarP6();
                DesativarP1();
                DesativarP2();
                DesativarP3();
                DesativarP4();
                DesativarP5();
                DesativarP7();
                DesativarP8();
                DesativarP9();

                if (jButton13.getText().equals("X") && jButton19.getText().equals("X")) {
                    p1 = "X";
                    XVencedorP1();
                } else if (jButton15.getText().equals("X") && jButton14.getText().equals("X")) {
                    p1 = "X";
                    XVencedorP1();
                } else if (!jButton11.getText().equals("") && !jButton12.getText().equals("") && !jButton13.getText().equals("") && !jButton14.getText().equals("") && !jButton15.getText().equals("") && !jButton16.getText().equals("") && !jButton17.getText().equals("") && !jButton18.getText().equals("") && !jButton19.getText().equals("")) {
                    p1 = "V";
                    VelhaP1();
                }
            } else if (!cont && jButton16.getText().equals("")) {
                jButton16.setText("O");
                jButton16.setBackground(Azul);
                cont = true;
                AtivarP6();
                DesativarP1();
                DesativarP2();
                DesativarP3();
                DesativarP4();
                DesativarP5();
                DesativarP7();
                DesativarP8();
                DesativarP9();

                if (jButton13.getText().equals("O") && jButton19.getText().equals("O")) {
                    p1 = "O";
                    OVencedorP1();
                } else if (jButton15.getText().equals("O") && jButton14.getText().equals("O")) {
                    p1 = "O";
                    OVencedorP1();
                } else if (!jButton11.getText().equals("") && !jButton12.getText().equals("") && !jButton13.getText().equals("") && !jButton14.getText().equals("") && !jButton15.getText().equals("") && !jButton16.getText().equals("") && !jButton17.getText().equals("") && !jButton18.getText().equals("") && !jButton19.getText().equals("")) {
                    p1 = "V";
                    VelhaP1();
                }
            }
        }
        if (p6finish == true) {
            
            AtivarP1();
            AtivarP2();
            AtivarP3();
            AtivarP4();
            AtivarP5();
            AtivarP7();
            AtivarP8();
            AtivarP9();
        }
        VerificarVelha();

    }//GEN-LAST:event_jButton16ActionPerformed

    private void jButton17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton17ActionPerformed
        // TODO add your handling code here:
        if (primeiraJogada) {
            jButton17.setEnabled(true); // Habilita o botão jButton11 na primeira jogada
            primeiraJogada = false; // Marque que a primeira jogada já ocorreu
            DesativarP1();
            DesativarP2();
            DesativarP3();
            DesativarP4();
            DesativarP5();
            DesativarP6();
            DesativarP8();
            DesativarP9();
        }

        if (p1finish == false) {
            if (cont && jButton17.getText().equals("")) {
                jButton17.setText("X");
                jButton17.setBackground(Vermelho);
                cont = false;
                AtivarP7();
                DesativarP1();
                DesativarP2();
                DesativarP3();
                DesativarP4();
                DesativarP5();
                DesativarP6();
                DesativarP8();
                DesativarP9();

                if (jButton15.getText().equals("X") && jButton13.getText().equals("X")) {
                    p1 = "X";
                    XVencedorP1();
                } else if (jButton14.getText().equals("X") && jButton16.getText().equals("X")) {
                    p1 = "X";
                    XVencedorP1();
                } else if (jButton18.getText().equals("X") && jButton19.getText().equals("X")) {
                    p1 = "X";
                    XVencedorP1();
                } else if (!jButton11.getText().equals("") && !jButton12.getText().equals("") && !jButton13.getText().equals("") && !jButton14.getText().equals("") && !jButton15.getText().equals("") && !jButton16.getText().equals("") && !jButton17.getText().equals("") && !jButton18.getText().equals("") && !jButton19.getText().equals("")) {
                    p1 = "V";
                    VelhaP1();
                }
            } else if (!cont && jButton17.getText().equals("")) {
                jButton17.setText("O");
                jButton17.setBackground(Azul);
                cont = true;
                AtivarP7();
                DesativarP1();
                DesativarP2();
                DesativarP3();
                DesativarP4();
                DesativarP5();
                DesativarP6();
                DesativarP8();
                DesativarP9();

                if (jButton15.getText().equals("O") && jButton13.getText().equals("O")) {
                    p1 = "O";
                    OVencedorP1();
                } else if (jButton14.getText().equals("O") && jButton16.getText().equals("O")) {
                    p1 = "O";
                    OVencedorP1();
                } else if (jButton18.getText().equals("O") && jButton19.getText().equals("O")) {
                    p1 = "O";
                    OVencedorP1();
                } else if (!jButton11.getText().equals("") && !jButton12.getText().equals("") && !jButton13.getText().equals("") && !jButton14.getText().equals("") && !jButton15.getText().equals("") && !jButton16.getText().equals("") && !jButton17.getText().equals("") && !jButton18.getText().equals("") && !jButton19.getText().equals("")) {
                    p1 = "V";
                    VelhaP1();
                }
            }
        }
        if (p7finish == true) {
            
            AtivarP1();
            AtivarP2();
            AtivarP3();
            AtivarP4();
            AtivarP5();
            AtivarP6();
            AtivarP8();
            AtivarP9();
        }
        VerificarVelha();

    }//GEN-LAST:event_jButton17ActionPerformed

    private void jButton18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton18ActionPerformed
        // TODO add your handling code here:
        if (primeiraJogada) {
            jButton18.setEnabled(true); // Habilita o botão jButton11 na primeira jogada
            primeiraJogada = false; // Marque que a primeira jogada já ocorreu
            DesativarP1();
            DesativarP2();
            DesativarP3();
            DesativarP4();
            DesativarP5();
            DesativarP6();
            DesativarP7();
            DesativarP9();
        }

        if (p1finish == false) {
            if (cont && jButton18.getText().equals("")) {
                jButton18.setText("X");
                jButton18.setBackground(Vermelho);
                cont = false;
                AtivarP8();
                DesativarP1();
                DesativarP2();
                DesativarP3();
                DesativarP4();
                DesativarP5();
                DesativarP6();
                DesativarP7();
                DesativarP9();

                if (jButton17.getText().equals("X") && jButton19.getText().equals("X")) {
                    p1 = "X";
                    XVencedorP1();
                } else if (jButton15.getText().equals("X") && jButton12.getText().equals("X")) {
                    p1 = "X";
                    XVencedorP1();
                } else if (!jButton11.getText().equals("") && !jButton12.getText().equals("") && !jButton13.getText().equals("") && !jButton14.getText().equals("") && !jButton15.getText().equals("") && !jButton16.getText().equals("") && !jButton17.getText().equals("") && !jButton18.getText().equals("") && !jButton19.getText().equals("")) {
                    p1 = "V";
                    VelhaP1();
                }
            } else if (!cont && jButton18.getText().equals("")) {
                jButton18.setText("O");
                jButton18.setBackground(Azul);
                cont = true;
                AtivarP8();
                DesativarP1();
                DesativarP2();
                DesativarP3();
                DesativarP4();
                DesativarP5();
                DesativarP6();
                DesativarP7();
                DesativarP9();

                if (jButton17.getText().equals("O") && jButton19.getText().equals("O")) {
                    p1 = "O";
                    OVencedorP1();
                } else if (jButton15.getText().equals("O") && jButton12.getText().equals("O")) {
                    p1 = "O";
                    OVencedorP1();
                } else if (!jButton11.getText().equals("") && !jButton12.getText().equals("") && !jButton13.getText().equals("") && !jButton14.getText().equals("") && !jButton15.getText().equals("") && !jButton16.getText().equals("") && !jButton17.getText().equals("") && !jButton18.getText().equals("") && !jButton19.getText().equals("")) {
                    p1 = "V";
                    VelhaP1();
                }
            }
        }
        if (p8finish == true) {
            AtivarP1();
            AtivarP2();
            AtivarP3();
            AtivarP4();
            AtivarP5();
            AtivarP6();
            AtivarP7();
            AtivarP9();
        }
        VerificarVelha();

    }//GEN-LAST:event_jButton18ActionPerformed

    private void jButton19ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton19ActionPerformed
        // TODO add your handling code here:
        if (primeiraJogada) {
            jButton19.setEnabled(true); // Habilita o botão jButton11 na primeira jogada
            primeiraJogada = false; // Marque que a primeira jogada já ocorreu
            DesativarP1();
            DesativarP2();
            DesativarP3();
            DesativarP4();
            DesativarP5();
            DesativarP6();
            DesativarP7();
            DesativarP8();
        }

        if (p1finish == false) {
            if (cont && jButton19.getText().equals("")) {
                jButton19.setText("X");
                jButton19.setBackground(Vermelho);
                cont = false;
                AtivarP9();
                DesativarP1();
                DesativarP2();
                DesativarP3();
                DesativarP4();
                DesativarP5();
                DesativarP6();
                DesativarP7();
                DesativarP8();

                if (jButton17.getText().equals("X") && jButton18.getText().equals("X")) {
                    p1 = "X";
                    XVencedorP1();
                } else if (jButton15.getText().equals("X") && jButton11.getText().equals("X")) {
                    p1 = "X";
                    XVencedorP1();
                } else if (jButton16.getText().equals("X") && jButton13.getText().equals("X")) {
                    p1 = "X";
                    XVencedorP1();
                } else if (!jButton11.getText().equals("") && !jButton12.getText().equals("") && !jButton13.getText().equals("") && !jButton14.getText().equals("") && !jButton15.getText().equals("") && !jButton16.getText().equals("") && !jButton17.getText().equals("") && !jButton18.getText().equals("") && !jButton19.getText().equals("")) {
                    p1 = "V";
                    VelhaP1();
                }
            } else if (!cont && jButton19.getText().equals("")) {
                jButton19.setText("O");
                jButton19.setBackground(Azul);
                cont = true;
                AtivarP9();
                DesativarP1();
                DesativarP2();
                DesativarP3();
                DesativarP4();
                DesativarP5();
                DesativarP6();
                DesativarP7();
                DesativarP8();

                if (jButton17.getText().equals("O") && jButton18.getText().equals("O")) {
                    p1 = "O";
                    OVencedorP1();
                } else if (jButton15.getText().equals("O") && jButton11.getText().equals("O")) {
                    p1 = "O";
                    OVencedorP1();
                } else if (jButton16.getText().equals("O") && jButton13.getText().equals("O")) {
                    p1 = "O";
                    OVencedorP1();
                } else if (!jButton11.getText().equals("") && !jButton12.getText().equals("") && !jButton13.getText().equals("") && !jButton14.getText().equals("") && !jButton15.getText().equals("") && !jButton16.getText().equals("") && !jButton17.getText().equals("") && !jButton18.getText().equals("") && !jButton19.getText().equals("")) {
                    p1 = "V";
                    VelhaP1();
                }
            }
        }
        if (p9finish == true) {
            
            AtivarP1();
            AtivarP2();
            AtivarP3();
            AtivarP4();
            AtivarP5();
            AtivarP6();
            AtivarP7();
            AtivarP8();
        }
        VerificarVelha();

    }//GEN-LAST:event_jButton19ActionPerformed

    private void jButton25ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton25ActionPerformed
        // TODO add your handling code here:
        if (primeiraJogada) {
            jButton25.setEnabled(true);
            primeiraJogada = false;
            DesativarP1();
            DesativarP2();
            DesativarP3();
            DesativarP4();
            DesativarP6();
            DesativarP7();
            DesativarP8();
            DesativarP9();
        }

        if (p2finish == false) {
            if (cont && jButton25.getText().equals("")) {
                jButton25.setText("X");
                jButton25.setBackground(Vermelho);
                cont = false;
                AtivarP5();
                DesativarP1();
                DesativarP2();
                DesativarP3();
                DesativarP4();
                DesativarP6();
                DesativarP7();
                DesativarP8();
                DesativarP9();

                if (jButton22.getText().equals("X") && jButton28.getText().equals("X")) {
                    p2 = "X";
                    XVencedorP2();
                } else if (jButton23.getText().equals("X") && jButton27.getText().equals("X")) {
                    p2 = "X";
                    XVencedorP2();
                } else if (jButton24.getText().equals("X") && jButton26.getText().equals("X")) {
                    p2 = "X";
                    XVencedorP2();
                } else if (jButton21.getText().equals("X") && jButton29.getText().equals("X")) {
                    p2 = "X";
                    XVencedorP2();
                } else if (!jButton21.getText().equals("") && !jButton22.getText().equals("") && !jButton23.getText().equals("") && !jButton24.getText().equals("") && !jButton25.getText().equals("") && !jButton26.getText().equals("") && !jButton27.getText().equals("") && !jButton28.getText().equals("") && !jButton29.getText().equals("")) {
                    p2 = "V";
                    VelhaP2();
                }
            } else if (!cont && jButton25.getText().equals("")) {
                jButton25.setText("O");
                jButton25.setBackground(Azul);
                cont = true;
                AtivarP5();
                DesativarP1();
                DesativarP2();
                DesativarP3();
                DesativarP4();
                DesativarP6();
                DesativarP7();
                DesativarP8();
                DesativarP9();

                if (jButton22.getText().equals("O") && jButton28.getText().equals("O")) {
                    p2 = "O";
                    OVencedorP2();
                } else if (jButton23.getText().equals("O") && jButton27.getText().equals("O")) {
                    p2 = "O";
                    OVencedorP2();
                } else if (jButton24.getText().equals("O") && jButton21.getText().equals("O")) {
                    p2 = "O";
                    OVencedorP2();
                } else if (jButton21.getText().equals("O") && jButton29.getText().equals("O")) {
                    p2 = "O";
                    OVencedorP2();
                } else if (!jButton21.getText().equals("") && !jButton22.getText().equals("") && !jButton23.getText().equals("") && !jButton24.getText().equals("") && !jButton25.getText().equals("") && !jButton26.getText().equals("") && !jButton27.getText().equals("") && !jButton28.getText().equals("") && !jButton29.getText().equals("")) {
                    p2 = "V";
                    VelhaP2();
                }

            }
        }
        if (p5finish == true) {
            
            AtivarP1();
            AtivarP2();
            AtivarP3();
            AtivarP4();
            AtivarP6();
            AtivarP7();
            AtivarP8();
            AtivarP9();
        }
        VerificarVelha();

    }//GEN-LAST:event_jButton25ActionPerformed

    private void jButton26ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton26ActionPerformed
        // TODO add your handling code here:
        if (primeiraJogada) {
            jButton26.setEnabled(true);
            primeiraJogada = false;
            DesativarP1();
            DesativarP2();
            DesativarP3();
            DesativarP4();
            DesativarP5();
            DesativarP7();
            DesativarP8();
            DesativarP9();
        }

        if (p2finish == false) {
            if (cont && jButton26.getText().equals("")) {
                jButton26.setText("X");
                jButton26.setBackground(Vermelho);
                cont = false;
                AtivarP6();
                DesativarP1();
                DesativarP2();
                DesativarP3();
                DesativarP4();
                DesativarP5();
                DesativarP7();
                DesativarP8();
                DesativarP9();

                if (jButton25.getText().equals("X") && jButton24.getText().equals("X")) {
                    p2 = "X";
                    XVencedorP2();
                } else if (jButton23.getText().equals("X") && jButton29.getText().equals("X")) {
                    p2 = "X";
                    XVencedorP2();
                } else if (!jButton21.getText().equals("") && !jButton22.getText().equals("") && !jButton23.getText().equals("") && !jButton24.getText().equals("") && !jButton25.getText().equals("") && !jButton26.getText().equals("") && !jButton27.getText().equals("") && !jButton28.getText().equals("") && !jButton29.getText().equals("")) {
                    p2 = "V";
                    VelhaP2();
                }
            } else if (!cont && jButton26.getText().equals("")) {
                jButton26.setText("O");
                jButton26.setBackground(Azul);
                cont = true;
                AtivarP6();
                DesativarP1();
                DesativarP2();
                DesativarP3();
                DesativarP4();
                DesativarP5();
                DesativarP7();
                DesativarP8();
                DesativarP9();

                if (jButton25.getText().equals("O") && jButton24.getText().equals("O")) {
                    p2 = "O";
                    OVencedorP2();
                } else if (jButton23.getText().equals("O") && jButton29.getText().equals("O")) {
                    p2 = "O";
                    OVencedorP2();
                } else if (!jButton21.getText().equals("") && !jButton22.getText().equals("") && !jButton23.getText().equals("") && !jButton24.getText().equals("") && !jButton25.getText().equals("") && !jButton26.getText().equals("") && !jButton27.getText().equals("") && !jButton28.getText().equals("") && !jButton29.getText().equals("")) {
                    p2 = "V";
                    VelhaP2();
                }
            }
        }
        if (p6finish == true) {
            
            AtivarP1();
            AtivarP2();
            AtivarP3();
            AtivarP4();
            AtivarP5();
            AtivarP7();
            AtivarP8();
            AtivarP9();
        }
        VerificarVelha();


    }//GEN-LAST:event_jButton26ActionPerformed

    private void jButton27ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton27ActionPerformed
        // TODO add your handling code here:
        if (primeiraJogada) {
            jButton27.setEnabled(true);
            primeiraJogada = false;
            DesativarP1();
            DesativarP2();
            DesativarP3();
            DesativarP4();
            DesativarP5();
            DesativarP6();
            DesativarP8();
            DesativarP9();
        }

        if (p2finish == false) {
            if (cont && jButton27.getText().equals("")) {
                jButton27.setText("X");
                jButton27.setBackground(Vermelho);
                cont = false;
                AtivarP7();
                DesativarP1();
                DesativarP2();
                DesativarP3();
                DesativarP4();
                DesativarP5();
                DesativarP6();
                DesativarP8();
                DesativarP9();

                if (jButton24.getText().equals("X") && jButton21.getText().equals("X")) {
                    p2 = "X";
                    XVencedorP2();
                } else if (jButton25.getText().equals("X") && jButton23.getText().equals("X")) {
                    p2 = "X";
                    XVencedorP2();
                } else if (jButton28.getText().equals("X") && jButton29.getText().equals("X")) {
                    p2 = "X";
                    XVencedorP2();
                } else if (!jButton21.getText().equals("") && !jButton22.getText().equals("") && !jButton23.getText().equals("") && !jButton24.getText().equals("") && !jButton25.getText().equals("") && !jButton26.getText().equals("") && !jButton27.getText().equals("") && !jButton28.getText().equals("") && !jButton29.getText().equals("")) {
                    p2 = "V";
                    VelhaP2();
                }
            } else if (!cont && jButton27.getText().equals("")) {
                jButton27.setText("O");
                jButton27.setBackground(Azul);
                cont = true;
                AtivarP7();
                DesativarP1();
                DesativarP2();
                DesativarP3();
                DesativarP4();
                DesativarP5();
                DesativarP6();
                DesativarP8();
                DesativarP9();

                if (jButton24.getText().equals("O") && jButton21.getText().equals("O")) {
                    p2 = "O";
                    OVencedorP2();
                } else if (jButton25.getText().equals("O") && jButton23.getText().equals("O")) {
                    p2 = "O";
                    OVencedorP2();
                } else if (jButton28.getText().equals("O") && jButton29.getText().equals("O")) {
                    p2 = "O";
                    OVencedorP2();
                } else if (!jButton21.getText().equals("") && !jButton22.getText().equals("") && !jButton23.getText().equals("") && !jButton24.getText().equals("") && !jButton25.getText().equals("") && !jButton26.getText().equals("") && !jButton27.getText().equals("") && !jButton28.getText().equals("") && !jButton29.getText().equals("")) {
                    p2 = "V";
                    VelhaP2();
                }
            }
        }
        if (p7finish == true) {
            
            AtivarP1();
            AtivarP2();
            AtivarP3();
            AtivarP4();
            AtivarP5();
            AtivarP6();
            AtivarP8();
            AtivarP9();
        }
        VerificarVelha();


    }//GEN-LAST:event_jButton27ActionPerformed

    private void jButton28ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton28ActionPerformed
        // TODO add your handling code here:
        if (primeiraJogada) {
            jButton28.setEnabled(true);
            primeiraJogada = false;
            DesativarP1();
            DesativarP2();
            DesativarP3();
            DesativarP4();
            DesativarP5();
            DesativarP6();
            DesativarP7();
            DesativarP9();
        }

        if (p2finish == false) {
            if (cont && jButton28.getText().equals("")) {
                jButton28.setText("X");
                jButton28.setBackground(Vermelho);
                cont = false;
                AtivarP8();
                DesativarP1();
                DesativarP2();
                DesativarP3();
                DesativarP4();
                DesativarP5();
                DesativarP6();
                DesativarP7();
                DesativarP9();

                if (jButton27.getText().equals("X") && jButton29.getText().equals("X")) {
                    p2 = "X";
                    XVencedorP2();
                } else if (jButton25.getText().equals("X") && jButton22.getText().equals("X")) {
                    p2 = "X";
                    XVencedorP2();
                } else if (!jButton21.getText().equals("") && !jButton22.getText().equals("") && !jButton23.getText().equals("") && !jButton24.getText().equals("") && !jButton25.getText().equals("") && !jButton26.getText().equals("") && !jButton27.getText().equals("") && !jButton28.getText().equals("") && !jButton29.getText().equals("")) {
                p2 = "V";
                VelhaP2();
            }
            } else if (!cont && jButton28.getText().equals("")) {
                jButton28.setText("O");
                jButton28.setBackground(Azul);
                cont = true;
                AtivarP8();
                DesativarP1();
                DesativarP2();
                DesativarP3();
                DesativarP4();
                DesativarP5();
                DesativarP6();
                DesativarP7();
                DesativarP9();

                if (jButton27.getText().equals("O") && jButton29.getText().equals("O")) {
                    p2 = "O";
                    OVencedorP2();
                } else if (jButton25.getText().equals("O") && jButton22.getText().equals("O")) {
                    p2 = "O";
                    OVencedorP2();
                } else if (!jButton21.getText().equals("") && !jButton22.getText().equals("") && !jButton23.getText().equals("") && !jButton24.getText().equals("") && !jButton25.getText().equals("") && !jButton26.getText().equals("") && !jButton27.getText().equals("") && !jButton28.getText().equals("") && !jButton29.getText().equals("")) {
                p2 = "V";
                VelhaP2();
            }
            }
        }
        if (p8finish == true) {
            
            AtivarP1();
            AtivarP2();
            AtivarP3();
            AtivarP4();
            AtivarP5();
            AtivarP6();
            AtivarP7();
            AtivarP9();
        }
        VerificarVelha();

    }//GEN-LAST:event_jButton28ActionPerformed

    private void jButton29ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton29ActionPerformed
        // TODO add your handling code here:
        if (primeiraJogada) {
            jButton29.setEnabled(true);
            primeiraJogada = false;
            DesativarP1();
            DesativarP2();
            DesativarP3();
            DesativarP4();
            DesativarP5();
            DesativarP6();
            DesativarP7();
            DesativarP8();
        }

        if (p2finish == false) {
            if (cont && jButton29.getText().equals("")) {
                jButton29.setText("X");
                jButton29.setBackground(Vermelho);
                cont = false;
                AtivarP9();
                DesativarP1();
                DesativarP2();
                DesativarP3();
                DesativarP4();
                DesativarP5();
                DesativarP6();
                DesativarP7();
                DesativarP8();

                if (jButton27.getText().equals("X") && jButton28.getText().equals("X")) {
                    p2 = "X";
                    XVencedorP2();
                } else if (jButton25.getText().equals("X") && jButton21.getText().equals("X")) {
                    p2 = "X";
                    XVencedorP2();
                } else if (jButton26.getText().equals("X") && jButton23.getText().equals("X")) {
                    p2 = "X";
                    XVencedorP2();
                } else if (!jButton21.getText().equals("") && !jButton22.getText().equals("") && !jButton23.getText().equals("") && !jButton24.getText().equals("") && !jButton25.getText().equals("") && !jButton26.getText().equals("") && !jButton27.getText().equals("") && !jButton28.getText().equals("") && !jButton29.getText().equals("")) {
                p2 = "V";
                VelhaP2();
            }
            } else if (!cont && jButton29.getText().equals("")) {
                jButton29.setText("O");
                jButton29.setBackground(Azul);
                cont = true;
                AtivarP9();
                DesativarP1();
                DesativarP2();
                DesativarP3();
                DesativarP4();
                DesativarP5();
                DesativarP6();
                DesativarP7();
                DesativarP8();

                if (jButton27.getText().equals("O") && jButton28.getText().equals("O")) {
                    p2 = "O";
                    OVencedorP2();
                } else if (jButton25.getText().equals("O") && jButton21.getText().equals("O")) {
                    p2 = "O";
                    OVencedorP2();
                } else if (jButton26.getText().equals("O") && jButton23.getText().equals("O")) {
                    p2 = "O";
                    OVencedorP2();
                } else if (!jButton21.getText().equals("") && !jButton22.getText().equals("") && !jButton23.getText().equals("") && !jButton24.getText().equals("") && !jButton25.getText().equals("") && !jButton26.getText().equals("") && !jButton27.getText().equals("") && !jButton28.getText().equals("") && !jButton29.getText().equals("")) {
                p2 = "V";
                VelhaP2();
            }
                        }
        }
        if (p9finish == true) {
            
            AtivarP1();
            AtivarP2();
            AtivarP3();
            AtivarP4();
            AtivarP5();
            AtivarP6();
            AtivarP7();
            AtivarP8();
        }
        VerificarVelha();

    }//GEN-LAST:event_jButton29ActionPerformed

    private void jButton35ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton35ActionPerformed
        // TODO add your handling code here:
        if (primeiraJogada) {
            jButton35.setEnabled(true);
            primeiraJogada = false;
            DesativarP1();
            DesativarP2();
            DesativarP3();
            DesativarP4();
            DesativarP6();
            DesativarP7();
            DesativarP8();
            DesativarP9();
        }

        if (p3finish == false) {
            if (cont && jButton35.getText().equals("")) {
                jButton35.setText("X");
                jButton35.setBackground(Vermelho);
                cont = false;
                AtivarP5();
                DesativarP1();
                DesativarP2();
                DesativarP3();
                DesativarP4();
                DesativarP6();
                DesativarP7();
                DesativarP8();
                DesativarP9();

                if (jButton32.getText().equals("X") && jButton38.getText().equals("X")) {
                    p3 = "X";
                    XVencedorP3();
                } else if (jButton33.getText().equals("X") && jButton37.getText().equals("X")) {
                    p3 = "X";
                    XVencedorP3();
                } else if (jButton34.getText().equals("X") && jButton36.getText().equals("X")) {
                    p3 = "X";
                    XVencedorP3();
                } else if (jButton39.getText().equals("X") && jButton31.getText().equals("X")) {
                    p3 = "X";
                    XVencedorP3();
                } else if (!jButton31.getText().equals("") && !jButton32.getText().equals("") && !jButton33.getText().equals("") && !jButton34.getText().equals("") && !jButton35.getText().equals("") && !jButton36.getText().equals("") && !jButton37.getText().equals("") && !jButton38.getText().equals("") && !jButton39.getText().equals("")) {
                p3 = "V";
                VelhaP3();
            }
            } else if (!cont && jButton35.getText().equals("")) {
                jButton35.setText("O");
                jButton35.setBackground(Azul);
                cont = true;
                AtivarP5();
                DesativarP1();
                DesativarP2();
                DesativarP3();
                DesativarP4();
                DesativarP6();
                DesativarP7();
                DesativarP8();
                DesativarP9();

                if (jButton32.getText().equals("O") && jButton38.getText().equals("O")) {
                    p3 = "O";
                    OVencedorP3();
                } else if (jButton33.getText().equals("O") && jButton37.getText().equals("O")) {
                    p3 = "O";
                    OVencedorP3();
                } else if (jButton34.getText().equals("O") && jButton36.getText().equals("O")) {
                    p3 = "O";
                    OVencedorP3();
                } else if (jButton39.getText().equals("O") && jButton31.getText().equals("O")) {
                    p3 = "O";
                    OVencedorP3();
                } else if (!jButton31.getText().equals("") && !jButton32.getText().equals("") && !jButton33.getText().equals("") && !jButton34.getText().equals("") && !jButton35.getText().equals("") && !jButton36.getText().equals("") && !jButton37.getText().equals("") && !jButton38.getText().equals("") && !jButton39.getText().equals("")) {
                p3 = "V";
                VelhaP3();
            }
            
            }
        }
        if (p5finish == true) {
            
            AtivarP1();
            AtivarP2();
            AtivarP3();
            AtivarP4();
            AtivarP6();
            AtivarP7();
            AtivarP8();
            AtivarP9();
        }
        VerificarVelha();

    }//GEN-LAST:event_jButton35ActionPerformed

    private void jButton36ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton36ActionPerformed
        // TODO add your handling code here:
        if (primeiraJogada) {
            jButton36.setEnabled(true);
            primeiraJogada = false;
            DesativarP1();
            DesativarP2();
            DesativarP3();
            DesativarP4();
            DesativarP5();
            DesativarP7();
            DesativarP8();
            DesativarP9();
        }

        if (p3finish == false) {
            if (cont && jButton36.getText().equals("")) {
                jButton36.setText("X");
                jButton36.setBackground(Vermelho);
                cont = false;
                AtivarP6();
                DesativarP1();
                DesativarP2();
                DesativarP3();
                DesativarP4();
                DesativarP5();
                DesativarP7();
                DesativarP8();
                DesativarP9();

                if (jButton35.getText().equals("X") && jButton34.getText().equals("X")) {
                    p3 = "X";
                    XVencedorP3();
                } else if (jButton33.getText().equals("X") && jButton39.getText().equals("X")) {
                    p3 = "X";
                    XVencedorP3();
                } else if (!jButton31.getText().equals("") && !jButton32.getText().equals("") && !jButton33.getText().equals("") && !jButton34.getText().equals("") && !jButton35.getText().equals("") && !jButton36.getText().equals("") && !jButton37.getText().equals("") && !jButton38.getText().equals("") && !jButton39.getText().equals("")) {
                p3 = "V";
                VelhaP3();
            }
            } else if (!cont && jButton36.getText().equals("")) {
                jButton36.setText("O");
                jButton36.setBackground(Azul);
                cont = true;
                AtivarP6();
                DesativarP1();
                DesativarP2();
                DesativarP3();
                DesativarP4();
                DesativarP5();
                DesativarP7();
                DesativarP8();
                DesativarP9();

                if (jButton35.getText().equals("O") && jButton34.getText().equals("O")) {
                    p3 = "O";
                    OVencedorP3();
                } else if (jButton33.getText().equals("O") && jButton39.getText().equals("O")) {
                    p3 = "O";
                    OVencedorP3();
                } else if (!jButton31.getText().equals("") && !jButton32.getText().equals("") && !jButton33.getText().equals("") && !jButton34.getText().equals("") && !jButton35.getText().equals("") && !jButton36.getText().equals("") && !jButton37.getText().equals("") && !jButton38.getText().equals("") && !jButton39.getText().equals("")) {
                p3 = "V";
                VelhaP3();
            }
            
            }
        }
        if (p6finish == true) {
            
            AtivarP1();
            AtivarP2();
            AtivarP3();
            AtivarP4();
            AtivarP5();
            AtivarP7();
            AtivarP8();
            AtivarP9();
        }
        VerificarVelha();

    }//GEN-LAST:event_jButton36ActionPerformed

    private void jButton37ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton37ActionPerformed
        // TODO add your handling code here:
        if (primeiraJogada) {
            jButton37.setEnabled(true);
            primeiraJogada = false;
            DesativarP1();
            DesativarP2();
            DesativarP3();
            DesativarP4();
            DesativarP5();
            DesativarP6();
            DesativarP8();
            DesativarP9();
        }

        if (p3finish == false) {
            if (cont && jButton37.getText().equals("")) {
                jButton37.setText("X");
                jButton37.setBackground(Vermelho);
                cont = false;
                AtivarP7();
                DesativarP1();
                DesativarP2();
                DesativarP3();
                DesativarP4();
                DesativarP5();
                DesativarP6();
                DesativarP8();
                DesativarP9();

                if (jButton34.getText().equals("X") && jButton31.getText().equals("X")) {
                    p3 = "X";
                    XVencedorP3();
                } else if (jButton35.getText().equals("X") && jButton33.getText().equals("X")) {
                    p3 = "X";
                    XVencedorP3();
                } else if (jButton38.getText().equals("X") && jButton39.getText().equals("X")) {
                    p3 = "X";
                    XVencedorP3();
                } else if (!jButton31.getText().equals("") && !jButton32.getText().equals("") && !jButton33.getText().equals("") && !jButton34.getText().equals("") && !jButton35.getText().equals("") && !jButton36.getText().equals("") && !jButton37.getText().equals("") && !jButton38.getText().equals("") && !jButton39.getText().equals("")) {
                p3 = "V";
                VelhaP3();
            }
            } else if (!cont && jButton37.getText().equals("")) {
                jButton37.setText("O");
                jButton37.setBackground(Azul);
                cont = true;
                AtivarP7();
                DesativarP1();
                DesativarP2();
                DesativarP3();
                DesativarP4();
                DesativarP5();
                DesativarP6();
                DesativarP8();
                DesativarP9();

                if (jButton34.getText().equals("O") && jButton31.getText().equals("O")) {
                    p3 = "O";
                    OVencedorP3();
                } else if (jButton35.getText().equals("O") && jButton33.getText().equals("O")) {
                    p3 = "O";
                    OVencedorP3();
                } else if (jButton38.getText().equals("O") && jButton39.getText().equals("O")) {
                    p3 = "O";
                    OVencedorP3();
                } else if (!jButton31.getText().equals("") && !jButton32.getText().equals("") && !jButton33.getText().equals("") && !jButton34.getText().equals("") && !jButton35.getText().equals("") && !jButton36.getText().equals("") && !jButton37.getText().equals("") && !jButton38.getText().equals("") && !jButton39.getText().equals("")) {
                p3 = "V";
                VelhaP3();
            }
            
            }
        }
        if (p7finish == true) {
            
            AtivarP1();
            AtivarP2();
            AtivarP3();
            AtivarP4();
            AtivarP5();
            AtivarP6();
            AtivarP8();
            AtivarP9();
        }
        VerificarVelha();

    }//GEN-LAST:event_jButton37ActionPerformed

    private void jButton38ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton38ActionPerformed
        // TODO add your handling code here:
        if (primeiraJogada) {
            jButton38.setEnabled(true);
            primeiraJogada = false;
            DesativarP1();
            DesativarP2();
            DesativarP3();
            DesativarP4();
            DesativarP5();
            DesativarP6();
            DesativarP7();
            DesativarP9();
        }

        if (p3finish == false) {
            if (cont && jButton38.getText().equals("")) {
                jButton38.setText("X");
                jButton38.setBackground(Vermelho);
                cont = false;
                AtivarP8();
                DesativarP1();
                DesativarP2();
                DesativarP3();
                DesativarP4();
                DesativarP5();
                DesativarP6();
                DesativarP7();
                DesativarP9();

                if (jButton37.getText().equals("X") && jButton39.getText().equals("X")) {
                    p3 = "X";
                    XVencedorP3();
                } else if (jButton35.getText().equals("X") && jButton32.getText().equals("X")) {
                    p3 = "X";
                    XVencedorP3();
                } else if (!jButton31.getText().equals("") && !jButton32.getText().equals("") && !jButton33.getText().equals("") && !jButton34.getText().equals("") && !jButton35.getText().equals("") && !jButton36.getText().equals("") && !jButton37.getText().equals("") && !jButton38.getText().equals("") && !jButton39.getText().equals("")) {
                p3 = "V";
                VelhaP3();
            }
            } else if (!cont && jButton38.getText().equals("")) {
                jButton38.setText("O");
                jButton38.setBackground(Azul);
                cont = true;
                AtivarP8();
                DesativarP1();
                DesativarP2();
                DesativarP3();
                DesativarP4();
                DesativarP5();
                DesativarP6();
                DesativarP7();
                DesativarP9();

                if (jButton37.getText().equals("O") && jButton39.getText().equals("O")) {
                    p3 = "O";
                    OVencedorP3();
                } else if (jButton35.getText().equals("O") && jButton32.getText().equals("O")) {
                    p3 = "O";
                    OVencedorP3();
                } else if (!jButton31.getText().equals("") && !jButton32.getText().equals("") && !jButton33.getText().equals("") && !jButton34.getText().equals("") && !jButton35.getText().equals("") && !jButton36.getText().equals("") && !jButton37.getText().equals("") && !jButton38.getText().equals("") && !jButton39.getText().equals("")) {
                p3 = "V";
                VelhaP3();
            }
            
            }
        }
        if (p8finish == true) {
            
            AtivarP1();
            AtivarP2();
            AtivarP3();
            AtivarP4();
            AtivarP5();
            AtivarP6();
            AtivarP7();
            AtivarP9();
        }
        VerificarVelha();

    }//GEN-LAST:event_jButton38ActionPerformed

    private void jButton39ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton39ActionPerformed
        // TODO add your handling code here:
        if (primeiraJogada) {
            jButton39.setEnabled(true);
            primeiraJogada = false;
            DesativarP1();
            DesativarP2();
            DesativarP3();
            DesativarP4();
            DesativarP5();
            DesativarP6();
            DesativarP7();
            DesativarP8();
        }

        if (p3finish == false) {
            if (cont && jButton39.getText().equals("")) {
                jButton39.setText("X");
                jButton39.setBackground(Vermelho);
                cont = false;
                AtivarP9();
                DesativarP1();
                DesativarP2();
                DesativarP3();
                DesativarP4();
                DesativarP5();
                DesativarP6();
                DesativarP7();
                DesativarP8();

                if (jButton38.getText().equals("X") && jButton37.getText().equals("X")) {
                    p3 = "X";
                    XVencedorP3();
                } else if (jButton35.getText().equals("X") && jButton31.getText().equals("X")) {
                    p3 = "X";
                    XVencedorP3();
                } else if (jButton36.getText().equals("X") && jButton33.getText().equals("X")) {
                    p3 = "X";
                    XVencedorP3();
                } else if (!jButton31.getText().equals("") && !jButton32.getText().equals("") && !jButton33.getText().equals("") && !jButton34.getText().equals("") && !jButton35.getText().equals("") && !jButton36.getText().equals("") && !jButton37.getText().equals("") && !jButton38.getText().equals("") && !jButton39.getText().equals("")) {
                p3 = "V";
                VelhaP3();
            }
            } else if (!cont && jButton39.getText().equals("")) {
                jButton39.setText("O");
                jButton39.setBackground(Azul);
                cont = true;
                AtivarP9();
                DesativarP1();
                DesativarP2();
                DesativarP3();
                DesativarP4();
                DesativarP5();
                DesativarP6();
                DesativarP7();
                DesativarP8();

                if (jButton38.getText().equals("O") && jButton37.getText().equals("O")) {
                    p3 = "O";
                    OVencedorP3();
                } else if (jButton35.getText().equals("O") && jButton31.getText().equals("O")) {
                    p3 = "O";
                    OVencedorP3();
                } else if (jButton36.getText().equals("O") && jButton33.getText().equals("O")) {
                    p3 = "O";
                    OVencedorP3();
                } else if (!jButton31.getText().equals("") && !jButton32.getText().equals("") && !jButton33.getText().equals("") && !jButton34.getText().equals("") && !jButton35.getText().equals("") && !jButton36.getText().equals("") && !jButton37.getText().equals("") && !jButton38.getText().equals("") && !jButton39.getText().equals("")) {
                p3 = "V";
                VelhaP3();
            }
                        }
        }
        if (p9finish == true) {
            
            AtivarP1();
            AtivarP2();
            AtivarP3();
            AtivarP4();
            AtivarP5();
            AtivarP6();
            AtivarP7();
            AtivarP8();
        }
        VerificarVelha();

    }//GEN-LAST:event_jButton39ActionPerformed

    private void jButton45ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton45ActionPerformed
        // TODO add your handling code here:
        if (primeiraJogada) {
            jButton45.setEnabled(true);
            primeiraJogada = false;
            DesativarP1();
            DesativarP2();
            DesativarP3();
            DesativarP4();
            DesativarP6();
            DesativarP7();
            DesativarP8();
            DesativarP9();
        }

        if (p4finish == false) {
            if (cont && jButton45.getText().equals("")) {
                jButton45.setText("X");
                jButton45.setBackground(Vermelho);
                cont = false;
                AtivarP5();
                DesativarP1();
                DesativarP2();
                DesativarP3();
                DesativarP4();
                DesativarP6();
                DesativarP7();
                DesativarP8();
                DesativarP9();

                if (jButton42.getText().equals("X") && jButton48.getText().equals("X")) {
                    p4 = "X";
                    XVencedorP4();
                } else if (jButton43.getText().equals("X") && jButton47.getText().equals("X")) {
                    p4 = "X";
                    XVencedorP4();
                } else if (jButton46.getText().equals("X") && jButton44.getText().equals("X")) {
                    p4 = "X";
                    XVencedorP4();
                } else if (jButton49.getText().equals("X") && jButton41.getText().equals("X")) {
                    p4 = "X";
                    XVencedorP4();
                } else if (!jButton41.getText().equals("") && !jButton42.getText().equals("") && !jButton43.getText().equals("") && !jButton44.getText().equals("") && !jButton45.getText().equals("") && !jButton46.getText().equals("") && !jButton47.getText().equals("") && !jButton48.getText().equals("") && !jButton49.getText().equals("")) {
                p4 = "V";
                VelhaP4();
            }
            } else if (!cont && jButton45.getText().equals("")) {
                jButton45.setText("O");
                jButton45.setBackground(Azul);
                cont = true;
                AtivarP5();
                DesativarP1();
                DesativarP2();
                DesativarP3();
                DesativarP4();
                DesativarP6();
                DesativarP7();
                DesativarP8();
                DesativarP9();

                if (jButton42.getText().equals("O") && jButton48.getText().equals("O")) {
                    p4 = "O";
                    OVencedorP4();
                } else if (jButton43.getText().equals("O") && jButton47.getText().equals("O")) {
                    p4 = "O";
                    OVencedorP4();
                } else if (jButton46.getText().equals("O") && jButton44.getText().equals("O")) {
                    p4 = "O";
                    OVencedorP4();
                } else if (jButton49.getText().equals("O") && jButton41.getText().equals("O")) {
                    p4 = "O";
                    OVencedorP4();
                } else if (!jButton41.getText().equals("") && !jButton42.getText().equals("") && !jButton43.getText().equals("") && !jButton44.getText().equals("") && !jButton45.getText().equals("") && !jButton46.getText().equals("") && !jButton47.getText().equals("") && !jButton48.getText().equals("") && !jButton49.getText().equals("")) {
                p4 = "V";
                VelhaP4();
            }
                        }
        }
        if (p5finish == true) {
            
            AtivarP1();
            AtivarP2();
            AtivarP3();
            AtivarP4();
            AtivarP6();
            AtivarP7();
            AtivarP8();
            AtivarP9();
        }
        VerificarVelha();

    }//GEN-LAST:event_jButton45ActionPerformed

    private void jButton46ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton46ActionPerformed
        // TODO add your handling code here:
        if (primeiraJogada) {
            jButton46.setEnabled(true);
            primeiraJogada = false;
            DesativarP1();
            DesativarP2();
            DesativarP3();
            DesativarP4();
            DesativarP5();
            DesativarP7();
            DesativarP8();
            DesativarP9();
        }

        if (p4finish == false) {
            if (cont && jButton46.getText().equals("")) {
                jButton46.setText("X");
                jButton46.setBackground(Vermelho);
                cont = false;
                AtivarP6();
                DesativarP1();
                DesativarP2();
                DesativarP3();
                DesativarP4();
                DesativarP5();
                DesativarP7();
                DesativarP8();
                DesativarP9();

                if (jButton43.getText().equals("X") && jButton49.getText().equals("X")) {
                    p4 = "X";
                    XVencedorP4();
                } else if (jButton45.getText().equals("X") && jButton44.getText().equals("X")) {
                    p4 = "X";
                    XVencedorP4();
                } else if (!jButton41.getText().equals("") && !jButton42.getText().equals("") && !jButton43.getText().equals("") && !jButton44.getText().equals("") && !jButton45.getText().equals("") && !jButton46.getText().equals("") && !jButton47.getText().equals("") && !jButton48.getText().equals("") && !jButton49.getText().equals("")) {
                p4 = "V";
                VelhaP4();
            }
            } else if (!cont && jButton46.getText().equals("")) {
                jButton46.setText("O");
                jButton46.setBackground(Azul);
                cont = true;
                AtivarP6();
                DesativarP1();
                DesativarP2();
                DesativarP3();
                DesativarP4();
                DesativarP5();
                DesativarP7();
                DesativarP8();
                DesativarP9();

                if (jButton43.getText().equals("O") && jButton49.getText().equals("O")) {
                    p4 = "O";
                    OVencedorP4();
                } else if (jButton45.getText().equals("O") && jButton44.getText().equals("O")) {
                    p4 = "O";
                    OVencedorP4();
                } else if (!jButton41.getText().equals("") && !jButton42.getText().equals("") && !jButton43.getText().equals("") && !jButton44.getText().equals("") && !jButton45.getText().equals("") && !jButton46.getText().equals("") && !jButton47.getText().equals("") && !jButton48.getText().equals("") && !jButton49.getText().equals("")) {
                p4 = "V";
                VelhaP4();
            }
            
            }
        }
        if (p6finish == true) {
            
            AtivarP1();
            AtivarP2();
            AtivarP3();
            AtivarP4();
            AtivarP5();
            AtivarP7();
            AtivarP8();
            AtivarP9();
        }
        VerificarVelha();


    }//GEN-LAST:event_jButton46ActionPerformed

    private void jButton47ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton47ActionPerformed
        // TODO add your handling code here:
        if (primeiraJogada) {
            jButton47.setEnabled(true);
            primeiraJogada = false;
            DesativarP1();
            DesativarP2();
            DesativarP3();
            DesativarP4();
            DesativarP5();
            DesativarP6();
            DesativarP8();
            DesativarP9();
        }

        if (p4finish == false) {
            if (cont && jButton47.getText().equals("")) {
                jButton47.setText("X");
                jButton47.setBackground(Vermelho);
                cont = false;
                AtivarP7();
                DesativarP1();
                DesativarP2();
                DesativarP3();
                DesativarP4();
                DesativarP5();
                DesativarP6();
                DesativarP8();
                DesativarP9();

                if (jButton44.getText().equals("X") && jButton41.getText().equals("X")) {
                    p4 = "X";
                    XVencedorP4();
                } else if (jButton45.getText().equals("X") && jButton43.getText().equals("X")) {
                    p4 = "X";
                    XVencedorP4();
                } else if (jButton48.getText().equals("X") && jButton49.getText().equals("X")) {
                    p4 = "X";
                    XVencedorP4();
                } else if (!jButton41.getText().equals("") && !jButton42.getText().equals("") && !jButton43.getText().equals("") && !jButton44.getText().equals("") && !jButton45.getText().equals("") && !jButton46.getText().equals("") && !jButton47.getText().equals("") && !jButton48.getText().equals("") && !jButton49.getText().equals("")) {
                p4 = "V";
                VelhaP4();
            }
            } else if (!cont && jButton47.getText().equals("")) {
                jButton47.setText("O");
                jButton47.setBackground(Azul);
                cont = true;
                AtivarP7();
                DesativarP1();
                DesativarP2();
                DesativarP3();
                DesativarP4();
                DesativarP5();
                DesativarP6();
                DesativarP8();
                DesativarP9();

                if (jButton44.getText().equals("O") && jButton41.getText().equals("O")) {
                    p4 = "O";
                    OVencedorP4();
                } else if (jButton45.getText().equals("O") && jButton43.getText().equals("O")) {
                    p4 = "O";
                    OVencedorP4();
                } else if (jButton48.getText().equals("O") && jButton49.getText().equals("O")) {
                    p4 = "O";
                    OVencedorP4();
                } else if (!jButton41.getText().equals("") && !jButton42.getText().equals("") && !jButton43.getText().equals("") && !jButton44.getText().equals("") && !jButton45.getText().equals("") && !jButton46.getText().equals("") && !jButton47.getText().equals("") && !jButton48.getText().equals("") && !jButton49.getText().equals("")) {
                p4 = "V";
                VelhaP4();
            }
                        }
        }
        if (p7finish == true) {
            
            AtivarP1();
            AtivarP2();
            AtivarP3();
            AtivarP4();
            AtivarP5();
            AtivarP6();
            AtivarP8();
            AtivarP9();
        }
        VerificarVelha();

    }//GEN-LAST:event_jButton47ActionPerformed

    private void jButton48ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton48ActionPerformed
        // TODO add your handling code here:
        if (primeiraJogada) {
            jButton48.setEnabled(true);
            primeiraJogada = false;
            DesativarP1();
            DesativarP2();
            DesativarP3();
            DesativarP4();
            DesativarP5();
            DesativarP6();
            DesativarP7();
            DesativarP9();
        }

        if (p4finish == false) {
            if (cont && jButton48.getText().equals("")) {
                jButton48.setText("X");
                jButton48.setBackground(Vermelho);
                cont = false;
                AtivarP8();
                DesativarP1();
                DesativarP2();
                DesativarP3();
                DesativarP4();
                DesativarP5();
                DesativarP6();
                DesativarP7();
                DesativarP9();

                if (jButton47.getText().equals("X") && jButton49.getText().equals("X")) {
                    p4 = "X";
                    XVencedorP4();
                } else if (jButton45.getText().equals("X") && jButton42.getText().equals("X")) {
                    p4 = "X";
                    XVencedorP4();
                } else if (!jButton41.getText().equals("") && !jButton42.getText().equals("") && !jButton43.getText().equals("") && !jButton44.getText().equals("") && !jButton45.getText().equals("") && !jButton46.getText().equals("") && !jButton47.getText().equals("") && !jButton48.getText().equals("") && !jButton49.getText().equals("")) {
                p4 = "V";
                VelhaP4();
            }
            } else if (!cont && jButton48.getText().equals("")) {
                jButton48.setText("O");
                jButton48.setBackground(Azul);
                cont = true;
                AtivarP8();
                DesativarP1();
                DesativarP2();
                DesativarP3();
                DesativarP4();
                DesativarP5();
                DesativarP6();
                DesativarP7();
                DesativarP9();

                if (jButton47.getText().equals("O") && jButton49.getText().equals("O")) {
                    p4 = "O";
                    OVencedorP4();
                } else if (jButton45.getText().equals("O") && jButton42.getText().equals("O")) {
                    p4 = "O";
                    OVencedorP4();
                } else if (!jButton41.getText().equals("") && !jButton42.getText().equals("") && !jButton43.getText().equals("") && !jButton44.getText().equals("") && !jButton45.getText().equals("") && !jButton46.getText().equals("") && !jButton47.getText().equals("") && !jButton48.getText().equals("") && !jButton49.getText().equals("")) {
                p4 = "V";
                VelhaP4();
            }
            
            }
        }
        if (p8finish == true) {
            
            AtivarP1();
            AtivarP2();
            AtivarP3();
            AtivarP4();
            AtivarP5();
            AtivarP6();
            AtivarP7();
            AtivarP9();
        }
        VerificarVelha();
    }//GEN-LAST:event_jButton48ActionPerformed

    private void jButton49ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton49ActionPerformed
        // TODO add your handling code here:
        if (primeiraJogada) {
            jButton49.setEnabled(true);
            primeiraJogada = false;
            DesativarP1();
            DesativarP2();
            DesativarP3();
            DesativarP4();
            DesativarP5();
            DesativarP6();
            DesativarP7();
            DesativarP8();
        }

        if (p4finish == false) {
            if (cont && jButton49.getText().equals("")) {
                jButton49.setText("X");
                jButton49.setBackground(Vermelho);
                cont = false;
                AtivarP9();
                DesativarP1();
                DesativarP2();
                DesativarP3();
                DesativarP4();
                DesativarP5();
                DesativarP6();
                DesativarP7();
                DesativarP8();

                if (jButton48.getText().equals("X") && jButton47.getText().equals("X")) {
                    p4 = "X";
                    XVencedorP4();
                } else if (jButton45.getText().equals("X") && jButton41.getText().equals("X")) {
                    p4 = "X";
                    XVencedorP4();
                } else if (jButton46.getText().equals("X") && jButton43.getText().equals("X")) {
                    p4 = "X";
                    XVencedorP4();
                } else if (!jButton41.getText().equals("") && !jButton42.getText().equals("") && !jButton43.getText().equals("") && !jButton44.getText().equals("") && !jButton45.getText().equals("") && !jButton46.getText().equals("") && !jButton47.getText().equals("") && !jButton48.getText().equals("") && !jButton49.getText().equals("")) {
                p4 = "V";
                VelhaP4();
            }
            } else if (!cont && jButton49.getText().equals("")) {
                jButton49.setText("O");
                jButton49.setBackground(Azul);
                cont = true;
                AtivarP9();
                DesativarP1();
                DesativarP2();
                DesativarP3();
                DesativarP4();
                DesativarP5();
                DesativarP6();
                DesativarP7();
                DesativarP8();

                if (jButton48.getText().equals("O") && jButton47.getText().equals("O")) {
                    p4 = "O";
                    OVencedorP4();
                } else if (jButton45.getText().equals("O") && jButton41.getText().equals("O")) {
                    p4 = "O";
                    OVencedorP4();
                } else if (jButton46.getText().equals("O") && jButton43.getText().equals("O")) {
                    p4 = "O";
                    OVencedorP4();
                } else if (!jButton41.getText().equals("") && !jButton42.getText().equals("") && !jButton43.getText().equals("") && !jButton44.getText().equals("") && !jButton45.getText().equals("") && !jButton46.getText().equals("") && !jButton47.getText().equals("") && !jButton48.getText().equals("") && !jButton49.getText().equals("")) {
                p4 = "V";
                VelhaP4();
            }
                        }
        }
        if (p9finish == true) {
            
            AtivarP1();
            AtivarP2();
            AtivarP3();
            AtivarP4();
            AtivarP5();
            AtivarP6();
            AtivarP7();
            AtivarP8();
        }
        VerificarVelha();

    }//GEN-LAST:event_jButton49ActionPerformed

    private void jButton55ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton55ActionPerformed
        // TODO add your handling code here:
        if (primeiraJogada) {
            jButton55.setEnabled(true);
            primeiraJogada = false;
            DesativarP1();
            DesativarP2();
            DesativarP3();
            DesativarP4();
            DesativarP6();
            DesativarP7();
            DesativarP8();
            DesativarP9();
        }

        if (p5finish == false) {
            if (cont && jButton55.getText().equals("")) {
                jButton55.setText("X");
                jButton55.setBackground(Vermelho);
                cont = false;
                AtivarP5();
                DesativarP1();
                DesativarP2();
                DesativarP3();
                DesativarP4();
                DesativarP6();
                DesativarP7();
                DesativarP8();
                DesativarP9();

                if (jButton52.getText().equals("X") && jButton58.getText().equals("X")) {
                    p5 = "X";
                    XVencedorP5();
                } else if (jButton53.getText().equals("X") && jButton57.getText().equals("X")) {
                    p5 = "X";
                    XVencedorP5();
                } else if (jButton56.getText().equals("X") && jButton54.getText().equals("X")) {
                    p5 = "X";
                    XVencedorP5();
                } else if (jButton59.getText().equals("X") && jButton51.getText().equals("X")) {
                    p5 = "X";
                    XVencedorP5();
                }
            } else if (!cont && jButton55.getText().equals("")) {
                jButton55.setText("O");
                jButton55.setBackground(Azul);
                cont = true;
                AtivarP5();
                DesativarP1();
                DesativarP2();
                DesativarP3();
                DesativarP4();
                DesativarP6();
                DesativarP7();
                DesativarP8();
                DesativarP9();

                if (jButton52.getText().equals("O") && jButton58.getText().equals("O")) {
                    p5 = "O";
                    OVencedorP5();
                } else if (jButton53.getText().equals("O") && jButton57.getText().equals("O")) {
                    p5 = "O";
                    OVencedorP5();
                } else if (jButton54.getText().equals("O") && jButton56.getText().equals("O")) {
                    p5 = "O";
                    OVencedorP5();
                } else if (jButton59.getText().equals("O") && jButton51.getText().equals("O")) {
                    p5 = "O";
                    OVencedorP5();
                }
            } else if (!jButton51.getText().equals("") && !jButton52.getText().equals("") && !jButton53.getText().equals("") && !jButton54.getText().equals("") && !jButton55.getText().equals("") && !jButton56.getText().equals("") && !jButton57.getText().equals("") && !jButton58.getText().equals("") && !jButton59.getText().equals("")) {
                p5 = "V";
                VelhaP5();
            }
        }
        if (p5finish == true) {
            
            AtivarP1();
            AtivarP2();
            AtivarP3();
            AtivarP4();
            AtivarP6();
            AtivarP7();
            AtivarP8();
            AtivarP9();
        }
        VerificarVelha();

    }//GEN-LAST:event_jButton55ActionPerformed

    private void jButton56ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton56ActionPerformed
        // TODO add your handling code here:
        if (primeiraJogada) {
            jButton56.setEnabled(true);
            primeiraJogada = false;
            DesativarP1();
            DesativarP2();
            DesativarP3();
            DesativarP4();
            DesativarP5();
            DesativarP7();
            DesativarP8();
            DesativarP9();
        }

        if (p5finish == false) {
            if (cont && jButton56.getText().equals("")) {
                jButton56.setText("X");
                jButton56.setBackground(Vermelho);
                cont = false;
                AtivarP6();
                DesativarP1();
                DesativarP2();
                DesativarP3();
                DesativarP4();
                DesativarP5();
                DesativarP7();
                DesativarP8();
                DesativarP9();

                if (jButton53.getText().equals("X") && jButton59.getText().equals("X")) {
                    p5 = "X";
                    XVencedorP5();
                } else if (jButton55.getText().equals("X") && jButton54.getText().equals("X")) {
                    p5 = "X";
                    XVencedorP5();
                }
            } else if (!cont && jButton56.getText().equals("")) {
                jButton56.setText("O");
                jButton56.setBackground(Azul);
                cont = true;
                AtivarP6();
                DesativarP1();
                DesativarP2();
                DesativarP3();
                DesativarP4();
                DesativarP5();
                DesativarP7();
                DesativarP8();
                DesativarP9();

                if (jButton53.getText().equals("O") && jButton59.getText().equals("O")) {
                    p5 = "O";
                    OVencedorP5();
                } else if (jButton55.getText().equals("O") && jButton54.getText().equals("O")) {
                    p5 = "O";
                    OVencedorP5();
                }
            } else if (!jButton51.getText().equals("") && !jButton52.getText().equals("") && !jButton53.getText().equals("") && !jButton54.getText().equals("") && !jButton55.getText().equals("") && !jButton56.getText().equals("") && !jButton57.getText().equals("") && !jButton58.getText().equals("") && !jButton59.getText().equals("")) {
                p5 = "V";
                VelhaP5();
            }
        }
        if (p6finish == true) {
            
            AtivarP1();
            AtivarP2();
            AtivarP3();
            AtivarP4();
            AtivarP5();
            AtivarP7();
            AtivarP8();
            AtivarP9();
        }
        VerificarVelha();

    }//GEN-LAST:event_jButton56ActionPerformed

    private void jButton57ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton57ActionPerformed
        // TODO add your handling code here:
        if (primeiraJogada) {
            jButton57.setEnabled(true);
            primeiraJogada = false;
            DesativarP1();
            DesativarP2();
            DesativarP3();
            DesativarP4();
            DesativarP5();
            DesativarP6();
            DesativarP8();
            DesativarP9();
        }

        if (p5finish == false) {
            if (cont && jButton57.getText().equals("")) {
                jButton57.setText("X");
                jButton57.setBackground(Vermelho);
                cont = false;
                AtivarP7();
                DesativarP1();
                DesativarP2();
                DesativarP3();
                DesativarP4();
                DesativarP5();
                DesativarP6();
                DesativarP8();
                DesativarP9();

                if (jButton54.getText().equals("X") && jButton51.getText().equals("X")) {
                    p5 = "X";
                    XVencedorP5();
                } else if (jButton55.getText().equals("X") && jButton53.getText().equals("X")) {
                    p5 = "X";
                    XVencedorP5();
                } else if (jButton58.getText().equals("X") && jButton59.getText().equals("X")) {
                    p5 = "X";
                    XVencedorP5();
                }
            } else if (!cont && jButton57.getText().equals("")) {
                jButton57.setText("O");
                jButton57.setBackground(Azul);
                cont = true;
                AtivarP7();
                DesativarP1();
                DesativarP2();
                DesativarP3();
                DesativarP4();
                DesativarP5();
                DesativarP6();
                DesativarP8();
                DesativarP9();

                if (jButton54.getText().equals("O") && jButton51.getText().equals("O")) {
                    p5 = "O";
                    OVencedorP5();
                } else if (jButton55.getText().equals("O") && jButton53.getText().equals("O")) {
                    p5 = "O";
                    OVencedorP5();
                } else if (jButton58.getText().equals("O") && jButton59.getText().equals("O")) {
                    p5 = "O";
                    OVencedorP5();
                }
            } else if (!jButton51.getText().equals("") && !jButton52.getText().equals("") && !jButton53.getText().equals("") && !jButton54.getText().equals("") && !jButton55.getText().equals("") && !jButton56.getText().equals("") && !jButton57.getText().equals("") && !jButton58.getText().equals("") && !jButton59.getText().equals("")) {
                p5 = "V";
                VelhaP5();
            }
        }
        if (p7finish == true) {
            
            AtivarP1();
            AtivarP2();
            AtivarP3();
            AtivarP4();
            AtivarP5();
            AtivarP6();
            AtivarP8();
            AtivarP9();
        }
        VerificarVelha();

    }//GEN-LAST:event_jButton57ActionPerformed

    private void jButton58ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton58ActionPerformed
        // TODO add your handling code here:
        if (primeiraJogada) {
            jButton58.setEnabled(true);
            primeiraJogada = false;
            DesativarP1();
            DesativarP2();
            DesativarP3();
            DesativarP4();
            DesativarP5();
            DesativarP6();
            DesativarP7();
            DesativarP8();
        }

        if (p5finish == false) {
            if (cont && jButton58.getText().equals("")) {
                jButton58.setText("X");
                jButton58.setBackground(Vermelho);
                cont = false;
                AtivarP8();
                DesativarP1();
                DesativarP2();
                DesativarP3();
                DesativarP4();
                DesativarP5();
                DesativarP6();
                DesativarP7();
                DesativarP9();

                if (jButton57.getText().equals("X") && jButton59.getText().equals("X")) {
                    p5 = "X";
                    XVencedorP5();
                } else if (jButton55.getText().equals("X") && jButton52.getText().equals("X")) {
                    p5 = "X";
                    XVencedorP5();
                }
            } else if (!cont && jButton58.getText().equals("")) {
                jButton58.setText("O");
                jButton58.setBackground(Azul);
                cont = true;
                AtivarP8();
                DesativarP1();
                DesativarP2();
                DesativarP3();
                DesativarP4();
                DesativarP5();
                DesativarP6();
                DesativarP7();
                DesativarP9();

                if (jButton57.getText().equals("O") && jButton59.getText().equals("O")) {
                    p5 = "O";
                    OVencedorP5();
                } else if (jButton55.getText().equals("O") && jButton52.getText().equals("O")) {
                    p5 = "O";
                    OVencedorP5();
                }
            } else if (!jButton51.getText().equals("") && !jButton52.getText().equals("") && !jButton53.getText().equals("") && !jButton54.getText().equals("") && !jButton55.getText().equals("") && !jButton56.getText().equals("") && !jButton57.getText().equals("") && !jButton58.getText().equals("") && !jButton59.getText().equals("")) {
                p5 = "V";
                VelhaP5();
            }
        }
        if (p8finish == true) {
            
            AtivarP1();
            AtivarP2();
            AtivarP3();
            AtivarP4();
            AtivarP5();
            AtivarP6();
            AtivarP7();
            AtivarP9();
        }
        VerificarVelha();

    }//GEN-LAST:event_jButton58ActionPerformed

    private void jButton59ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton59ActionPerformed
        // TODO add your handling code here:
        if (primeiraJogada) {
            jButton59.setEnabled(true);
            primeiraJogada = false;
            DesativarP1();
            DesativarP2();
            DesativarP3();
            DesativarP4();
            DesativarP5();
            DesativarP6();
            DesativarP7();
            DesativarP8();
        }

        if (p5finish == false) {
            if (cont && jButton59.getText().equals("")) {
                jButton59.setText("X");
                jButton59.setBackground(Vermelho);
                cont = false;
                AtivarP9();
                DesativarP1();
                DesativarP2();
                DesativarP3();
                DesativarP4();
                DesativarP5();
                DesativarP6();
                DesativarP7();
                DesativarP8();

                if (jButton57.getText().equals("X") && jButton58.getText().equals("X")) {
                    p5 = "X";
                    XVencedorP5();
                } else if (jButton55.getText().equals("X") && jButton51.getText().equals("X")) {
                    p5 = "X";
                    XVencedorP5();
                } else if (jButton56.getText().equals("X") && jButton53.getText().equals("X")) {
                    p5 = "X";
                    XVencedorP5();
                }
            } else if (!cont && jButton59.getText().equals("")) {
                jButton59.setText("O");
                jButton59.setBackground(Azul);
                cont = true;
                AtivarP9();
                DesativarP1();
                DesativarP2();
                DesativarP3();
                DesativarP4();
                DesativarP5();
                DesativarP6();
                DesativarP7();
                DesativarP8();

                if (jButton57.getText().equals("O") && jButton58.getText().equals("O")) {
                    p5 = "O";
                    OVencedorP5();
                } else if (jButton55.getText().equals("O") && jButton51.getText().equals("O")) {
                    p5 = "O";
                    OVencedorP5();
                } else if (jButton56.getText().equals("O") && jButton53.getText().equals("O")) {
                    p5 = "O";
                    OVencedorP5();
                }
            } else if (!jButton51.getText().equals("") && !jButton52.getText().equals("") && !jButton53.getText().equals("") && !jButton54.getText().equals("") && !jButton55.getText().equals("") && !jButton56.getText().equals("") && !jButton57.getText().equals("") && !jButton58.getText().equals("") && !jButton59.getText().equals("")) {
                p5 = "V";
                VelhaP5();
            }
        }
        if (p9finish == true) {
            
            AtivarP1();
            AtivarP2();
            AtivarP3();
            AtivarP4();
            AtivarP5();
            AtivarP6();
            AtivarP7();
            AtivarP8();
        }
        VerificarVelha();

    }//GEN-LAST:event_jButton59ActionPerformed

    private void jButton65ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton65ActionPerformed
        // TODO add your handling code here:
        if (primeiraJogada) {
            jButton65.setEnabled(true);
            primeiraJogada = false;
            DesativarP1();
            DesativarP2();
            DesativarP3();
            DesativarP4();
            DesativarP6();
            DesativarP7();
            DesativarP8();
            DesativarP9();
        }

        if (p6finish == false) {
            if (cont && jButton65.getText().equals("")) {
                jButton65.setText("X");
                jButton65.setBackground(Vermelho);
                cont = false;
                AtivarP5();
                DesativarP1();
                DesativarP2();
                DesativarP3();
                DesativarP4();
                DesativarP6();
                DesativarP7();
                DesativarP8();
                DesativarP9();

                if (jButton62.getText().equals("X") && jButton68.getText().equals("X")) {
                    p6 = "X";
                    XVencedorP6();
                } else if (jButton63.getText().equals("X") && jButton67.getText().equals("X")) {
                    p6 = "X";
                    XVencedorP6();
                } else if (jButton66.getText().equals("X") && jButton64.getText().equals("X")) {
                    p6 = "X";
                    XVencedorP6();
                } else if (jButton69.getText().equals("X") && jButton61.getText().equals("X")) {
                    p6 = "X";
                    XVencedorP6();
                } else if (!jButton61.getText().equals("") && !jButton62.getText().equals("") && !jButton63.getText().equals("") && !jButton64.getText().equals("") && !jButton65.getText().equals("") && !jButton66.getText().equals("") && !jButton67.getText().equals("") && !jButton68.getText().equals("") && !jButton69.getText().equals("")) {
                p6 = "V";
                VelhaP6();
            }
            } else if (!cont && jButton65.getText().equals("")) {
                jButton65.setText("O");
                jButton65.setBackground(Azul);
                cont = true;
                AtivarP5();
                DesativarP1();
                DesativarP2();
                DesativarP3();
                DesativarP4();
                DesativarP6();
                DesativarP7();
                DesativarP8();
                DesativarP9();

                if (jButton62.getText().equals("O") && jButton68.getText().equals("O")) {
                    p6 = "O";
                    OVencedorP6();
                } else if (jButton63.getText().equals("O") && jButton67.getText().equals("O")) {
                    p6 = "O";
                    OVencedorP6();
                } else if (jButton64.getText().equals("O") && jButton66.getText().equals("O")) {
                    p6 = "O";
                    OVencedorP6();
                } else if (jButton69.getText().equals("O") && jButton61.getText().equals("O")) {
                    p6 = "O";
                    OVencedorP6();
                } else if (!jButton61.getText().equals("") && !jButton62.getText().equals("") && !jButton63.getText().equals("") && !jButton64.getText().equals("") && !jButton65.getText().equals("") && !jButton66.getText().equals("") && !jButton67.getText().equals("") && !jButton68.getText().equals("") && !jButton69.getText().equals("")) {
                p6 = "V";
                VelhaP6();
            }
            
            }
        }
        if (p5finish == true) {
            
            AtivarP1();
            AtivarP2();
            AtivarP3();
            AtivarP4();
            AtivarP6();
            AtivarP7();
            AtivarP8();
            AtivarP9();
        }
        VerificarVelha();

    }//GEN-LAST:event_jButton65ActionPerformed

    private void jButton66ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton66ActionPerformed
        // TODO add your handling code here:
        if (primeiraJogada) {
            jButton66.setEnabled(true);
            primeiraJogada = false;
            DesativarP1();
            DesativarP2();
            DesativarP3();
            DesativarP4();
            DesativarP5();
            DesativarP7();
            DesativarP8();
            DesativarP9();
        }

        if (p6finish == false) {
            if (cont && jButton66.getText().equals("")) {
                jButton66.setText("X");
                jButton66.setBackground(Vermelho);
                cont = false;
                AtivarP6();
                DesativarP1();
                DesativarP2();
                DesativarP3();
                DesativarP4();
                DesativarP5();
                DesativarP7();
                DesativarP8();
                DesativarP9();

                if (jButton63.getText().equals("X") && jButton69.getText().equals("X")) {
                    p6 = "X";
                    XVencedorP6();
                } else if (jButton65.getText().equals("X") && jButton64.getText().equals("X")) {
                    p6 = "X";
                    XVencedorP6();
                } else if (!jButton61.getText().equals("") && !jButton62.getText().equals("") && !jButton63.getText().equals("") && !jButton64.getText().equals("") && !jButton65.getText().equals("") && !jButton66.getText().equals("") && !jButton67.getText().equals("") && !jButton68.getText().equals("") && !jButton69.getText().equals("")) {
                p6 = "V";
                VelhaP6();
            }
            } else if (!cont && jButton66.getText().equals("")) {
                jButton66.setText("O");
                jButton66.setBackground(Azul);
                cont = true;
                AtivarP6();
                DesativarP1();
                DesativarP2();
                DesativarP3();
                DesativarP4();
                DesativarP5();
                DesativarP7();
                DesativarP8();
                DesativarP9();

                if (jButton63.getText().equals("O") && jButton69.getText().equals("O")) {
                    p6 = "O";
                    OVencedorP6();
                } else if (jButton65.getText().equals("O") && jButton64.getText().equals("O")) {
                    p6 = "O";
                    OVencedorP6();
                } else if (!jButton61.getText().equals("") && !jButton62.getText().equals("") && !jButton63.getText().equals("") && !jButton64.getText().equals("") && !jButton65.getText().equals("") && !jButton66.getText().equals("") && !jButton67.getText().equals("") && !jButton68.getText().equals("") && !jButton69.getText().equals("")) {
                p6 = "V";
                VelhaP6();
            }
                     }
        }
        if (p6finish == true) {
            
            AtivarP1();
            AtivarP2();
            AtivarP3();
            AtivarP4();
            AtivarP5();
            AtivarP7();
            AtivarP8();
            AtivarP9();
        }
        VerificarVelha();
    }//GEN-LAST:event_jButton66ActionPerformed

    private void jButton67ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton67ActionPerformed
        // TODO add your handling code here:
        if (primeiraJogada) {
            jButton67.setEnabled(true);
            primeiraJogada = false;
            DesativarP1();
            DesativarP2();
            DesativarP3();
            DesativarP4();
            DesativarP5();
            DesativarP6();
            DesativarP8();
            DesativarP9();
        }

        if (p6finish == false) {
            if (cont && jButton67.getText().equals("")) {
                jButton67.setText("X");
                jButton67.setBackground(Vermelho);
                cont = false;
                AtivarP7();
                DesativarP1();
                DesativarP2();
                DesativarP3();
                DesativarP4();
                DesativarP5();
                DesativarP6();
                DesativarP8();
                DesativarP9();

                if (jButton64.getText().equals("X") && jButton61.getText().equals("X")) {
                    p6 = "X";
                    XVencedorP5();
                } else if (jButton65.getText().equals("X") && jButton63.getText().equals("X")) {
                    p6 = "X";
                    XVencedorP5();
                } else if (jButton68.getText().equals("X") && jButton69.getText().equals("X")) {
                    p6 = "X";
                    XVencedorP6();
                } else if (!jButton61.getText().equals("") && !jButton62.getText().equals("") && !jButton63.getText().equals("") && !jButton64.getText().equals("") && !jButton65.getText().equals("") && !jButton66.getText().equals("") && !jButton67.getText().equals("") && !jButton68.getText().equals("") && !jButton69.getText().equals("")) {
                p6 = "V";
                VelhaP6();
            }
            } else if (!cont && jButton67.getText().equals("")) {
                jButton67.setText("O");
                jButton67.setBackground(Azul);
                cont = true;
                AtivarP7();
                DesativarP1();
                DesativarP2();
                DesativarP3();
                DesativarP4();
                DesativarP5();
                DesativarP6();
                DesativarP8();
                DesativarP9();

                if (jButton64.getText().equals("O") && jButton61.getText().equals("O")) {
                    p6 = "O";
                    OVencedorP6();
                } else if (jButton65.getText().equals("O") && jButton63.getText().equals("O")) {
                    p6 = "O";
                    OVencedorP6();
                } else if (jButton68.getText().equals("O") && jButton69.getText().equals("O")) {
                    p6 = "O";
                    OVencedorP6();
                } else if (!jButton61.getText().equals("") && !jButton62.getText().equals("") && !jButton63.getText().equals("") && !jButton64.getText().equals("") && !jButton65.getText().equals("") && !jButton66.getText().equals("") && !jButton67.getText().equals("") && !jButton68.getText().equals("") && !jButton69.getText().equals("")) {
                p6 = "V";
                VelhaP6();
            }
            
            }
        }
        if (p7finish == true) {
            
            AtivarP1();
            AtivarP2();
            AtivarP3();
            AtivarP4();
            AtivarP5();
            AtivarP6();
            AtivarP8();
            AtivarP9();
        }
        VerificarVelha();

    }//GEN-LAST:event_jButton67ActionPerformed

    private void jButton68ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton68ActionPerformed
        // TODO add your handling code here:
        if (primeiraJogada) {
            jButton68.setEnabled(true);
            primeiraJogada = false;
            DesativarP1();
            DesativarP2();
            DesativarP3();
            DesativarP4();
            DesativarP5();
            DesativarP6();
            DesativarP7();
            DesativarP8();
        }

        if (p6finish == false) {
            if (cont && jButton68.getText().equals("")) {
                jButton68.setText("X");
                jButton68.setBackground(Vermelho);
                cont = false;
                AtivarP8();
                DesativarP1();
                DesativarP2();
                DesativarP3();
                DesativarP4();
                DesativarP5();
                DesativarP6();
                DesativarP7();
                DesativarP9();

                if (jButton67.getText().equals("X") && jButton69.getText().equals("X")) {
                    p6 = "X";
                    XVencedorP6();
                } else if (jButton65.getText().equals("X") && jButton62.getText().equals("X")) {
                    p6 = "X";
                    XVencedorP6();
                } else if (!jButton61.getText().equals("") && !jButton62.getText().equals("") && !jButton63.getText().equals("") && !jButton64.getText().equals("") && !jButton65.getText().equals("") && !jButton66.getText().equals("") && !jButton67.getText().equals("") && !jButton68.getText().equals("") && !jButton69.getText().equals("")) {
                p6 = "V";
                VelhaP6();
            }
            } else if (!cont && jButton68.getText().equals("")) {
                jButton68.setText("O");
                jButton68.setBackground(Azul);
                cont = true;
                AtivarP8();
                DesativarP1();
                DesativarP2();
                DesativarP3();
                DesativarP4();
                DesativarP5();
                DesativarP6();
                DesativarP7();
                DesativarP9();

                if (jButton67.getText().equals("O") && jButton69.getText().equals("O")) {
                    p6 = "O";
                    OVencedorP6();
                } else if (jButton65.getText().equals("O") && jButton62.getText().equals("O")) {
                    p6 = "O";
                    OVencedorP6();
                } else if (!jButton61.getText().equals("") && !jButton62.getText().equals("") && !jButton63.getText().equals("") && !jButton64.getText().equals("") && !jButton65.getText().equals("") && !jButton66.getText().equals("") && !jButton67.getText().equals("") && !jButton68.getText().equals("") && !jButton69.getText().equals("")) {
                p6 = "V";
                VelhaP6();
            }
            
            }
        }
        if (p8finish == true) {
           
            AtivarP1();
            AtivarP2();
            AtivarP3();
            AtivarP4();
            AtivarP5();
            AtivarP6();
            AtivarP7();
            AtivarP9();
        }
        VerificarVelha();

    }//GEN-LAST:event_jButton68ActionPerformed

    private void jButton69ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton69ActionPerformed
        // TODO add your handling code here:
        if (primeiraJogada) {
            jButton69.setEnabled(true);
            primeiraJogada = false;
            DesativarP1();
            DesativarP2();
            DesativarP3();
            DesativarP4();
            DesativarP5();
            DesativarP6();
            DesativarP7();
            DesativarP8();
        }

        if (p6finish == false) {
            if (cont && jButton69.getText().equals("")) {
                jButton69.setText("X");
                jButton69.setBackground(Vermelho);
                cont = false;
                AtivarP9();
                DesativarP1();
                DesativarP2();
                DesativarP3();
                DesativarP4();
                DesativarP5();
                DesativarP6();
                DesativarP7();
                DesativarP8();

                if (jButton67.getText().equals("X") && jButton68.getText().equals("X")) {
                    p6 = "X";
                    XVencedorP6();
                } else if (jButton65.getText().equals("X") && jButton61.getText().equals("X")) {
                    p6 = "X";
                    XVencedorP6();
                } else if (jButton66.getText().equals("X") && jButton63.getText().equals("X")) {
                    p6 = "X";
                    XVencedorP6();
                } else if (!jButton61.getText().equals("") && !jButton62.getText().equals("") && !jButton63.getText().equals("") && !jButton64.getText().equals("") && !jButton65.getText().equals("") && !jButton66.getText().equals("") && !jButton67.getText().equals("") && !jButton68.getText().equals("") && !jButton69.getText().equals("")) {
                p6 = "V";
                VelhaP6();
            }
            } else if (!cont && jButton69.getText().equals("")) {
                jButton69.setText("O");
                jButton69.setBackground(Azul);
                cont = true;
                AtivarP9();
                DesativarP1();
                DesativarP2();
                DesativarP3();
                DesativarP4();
                DesativarP5();
                DesativarP6();
                DesativarP7();
                DesativarP8();

                if (jButton67.getText().equals("O") && jButton68.getText().equals("O")) {
                    p6 = "O";
                    OVencedorP6();
                } else if (jButton65.getText().equals("O") && jButton61.getText().equals("O")) {
                    p6 = "O";
                    OVencedorP6();
                } else if (jButton66.getText().equals("O") && jButton63.getText().equals("O")) {
                    p6 = "O";
                    OVencedorP6();
                } else if (!jButton61.getText().equals("") && !jButton62.getText().equals("") && !jButton63.getText().equals("") && !jButton64.getText().equals("") && !jButton65.getText().equals("") && !jButton66.getText().equals("") && !jButton67.getText().equals("") && !jButton68.getText().equals("") && !jButton69.getText().equals("")) {
                p6 = "V";
                VelhaP6();
            }
            
            }
        }
        if (p9finish == true) {
            
            AtivarP1();
            AtivarP2();
            AtivarP3();
            AtivarP4();
            AtivarP5();
            AtivarP6();
            AtivarP7();
            AtivarP8();
        }
        VerificarVelha();


    }//GEN-LAST:event_jButton69ActionPerformed

    private void jButton75ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton75ActionPerformed
        // TODO add your handling code here:
        if (primeiraJogada) {
            jButton75.setEnabled(true);
            primeiraJogada = false;
            DesativarP1();
            DesativarP2();
            DesativarP3();
            DesativarP4();
            DesativarP6();
            DesativarP7();
            DesativarP8();
            DesativarP9();
        }

        if (p7finish == false) {
            if (cont && jButton75.getText().equals("")) {
                jButton75.setText("X");
                jButton75.setBackground(Vermelho);
                cont = false;
                AtivarP5();
                DesativarP1();
                DesativarP2();
                DesativarP3();
                DesativarP4();
                DesativarP6();
                DesativarP7();
                DesativarP8();
                DesativarP9();

                if (jButton72.getText().equals("X") && jButton78.getText().equals("X")) {
                    p7 = "X";
                    XVencedorP7();
                } else if (jButton73.getText().equals("X") && jButton77.getText().equals("X")) {
                    p7 = "X";
                    XVencedorP7();
                } else if (jButton76.getText().equals("X") && jButton74.getText().equals("X")) {
                    p7 = "X";
                    XVencedorP7();
                } else if (jButton79.getText().equals("X") && jButton71.getText().equals("X")) {
                    p7 = "X";
                    XVencedorP7();
                } else if (!jButton71.getText().equals("") && !jButton72.getText().equals("") && !jButton73.getText().equals("") && !jButton74.getText().equals("") && !jButton75.getText().equals("") && !jButton76.getText().equals("") && !jButton77.getText().equals("") && !jButton78.getText().equals("") && !jButton79.getText().equals("")) {
                p7 = "V";
                VelhaP7();
            }
            } else if (!cont && jButton75.getText().equals("")) {
                jButton75.setText("O");
                jButton75.setBackground(Azul);
                cont = true;
                AtivarP5();
                DesativarP1();
                DesativarP2();
                DesativarP3();
                DesativarP4();
                DesativarP6();
                DesativarP7();
                DesativarP8();
                DesativarP9();

                if (jButton72.getText().equals("O") && jButton78.getText().equals("O")) {
                    p7 = "O";
                    OVencedorP6();
                } else if (jButton73.getText().equals("O") && jButton77.getText().equals("O")) {
                    p7 = "O";
                    OVencedorP7();
                } else if (jButton74.getText().equals("O") && jButton76.getText().equals("O")) {
                    p7 = "O";
                    OVencedorP7();
                } else if (jButton79.getText().equals("O") && jButton71.getText().equals("O")) {
                    p7 = "O";
                    OVencedorP7();
                } else if (!jButton71.getText().equals("") && !jButton72.getText().equals("") && !jButton73.getText().equals("") && !jButton74.getText().equals("") && !jButton75.getText().equals("") && !jButton76.getText().equals("") && !jButton77.getText().equals("") && !jButton78.getText().equals("") && !jButton79.getText().equals("")) {
                p7 = "V";
                VelhaP7();
            }
          
            }
        }
        if (p5finish == true) {
            
            AtivarP1();
            AtivarP2();
            AtivarP3();
            AtivarP4();
            AtivarP6();
            AtivarP7();
            AtivarP8();
            AtivarP9();
        }
        VerificarVelha();

    }//GEN-LAST:event_jButton75ActionPerformed

    private void jButton76ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton76ActionPerformed
        // TODO add your handling code here:
        if (primeiraJogada) {
            jButton76.setEnabled(true);
            primeiraJogada = false;
            DesativarP1();
            DesativarP2();
            DesativarP3();
            DesativarP4();
            DesativarP5();
            DesativarP7();
            DesativarP8();
            DesativarP9();
        }

        if (p7finish == false) {

            if (cont && jButton76.getText().equals("")) {
                jButton76.setText("X");
                jButton76.setBackground(Vermelho);
                cont = false;
                AtivarP6();
                DesativarP1();
                DesativarP2();
                DesativarP3();
                DesativarP4();
                DesativarP5();
                DesativarP7();
                DesativarP8();
                DesativarP9();

                if (jButton73.getText().equals("X") && jButton79.getText().equals("X")) {
                    p7 = "X";
                    XVencedorP7();
                } else if (jButton75.getText().equals("X") && jButton74.getText().equals("X")) {
                    p7 = "X";
                    XVencedorP7();
                } else if (!jButton71.getText().equals("") && !jButton72.getText().equals("") && !jButton73.getText().equals("") && !jButton74.getText().equals("") && !jButton75.getText().equals("") && !jButton76.getText().equals("") && !jButton77.getText().equals("") && !jButton78.getText().equals("") && !jButton79.getText().equals("")) {
                p7 = "V";
                VelhaP7();
            }
            } else if (!cont && jButton76.getText().equals("")) {
                jButton76.setText("O");
                jButton76.setBackground(Azul);
                cont = true;
                AtivarP7();
                DesativarP1();
                DesativarP2();
                DesativarP3();
                DesativarP4();
                DesativarP5();
                DesativarP7();
                DesativarP8();
                DesativarP9();

                if (jButton73.getText().equals("O") && jButton79.getText().equals("O")) {
                    p7 = "O";
                    OVencedorP7();
                } else if (jButton75.getText().equals("O") && jButton74.getText().equals("O")) {
                    p7 = "O";
                    OVencedorP7();
                } else if (!jButton71.getText().equals("") && !jButton72.getText().equals("") && !jButton73.getText().equals("") && !jButton74.getText().equals("") && !jButton75.getText().equals("") && !jButton76.getText().equals("") && !jButton77.getText().equals("") && !jButton78.getText().equals("") && !jButton79.getText().equals("")) {
                p7 = "V";
                VelhaP7();
            }
                        }
        }
        if (p6finish == true) {
            
            AtivarP1();
            AtivarP2();
            AtivarP3();
            AtivarP4();
            AtivarP5();
            AtivarP7();
            AtivarP8();
            AtivarP9();
        }
        VerificarVelha();

    }//GEN-LAST:event_jButton76ActionPerformed

    private void jButton77ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton77ActionPerformed
        // TODO add your handling code here:
        if (primeiraJogada) {
            jButton77.setEnabled(true);
            primeiraJogada = false;
            DesativarP1();
            DesativarP2();
            DesativarP3();
            DesativarP4();
            DesativarP5();
            DesativarP6();
            DesativarP8();
            DesativarP9();
        }

        if (p7finish == false) {
            if (cont && jButton77.getText().equals("")) {
                jButton77.setText("X");
                jButton77.setBackground(Vermelho);
                cont = false;
                AtivarP7();
                DesativarP1();
                DesativarP2();
                DesativarP3();
                DesativarP4();
                DesativarP5();
                DesativarP6();
                DesativarP8();
                DesativarP9();

                if (jButton74.getText().equals("X") && jButton71.getText().equals("X")) {
                    p7 = "X";
                    XVencedorP7();
                } else if (jButton75.getText().equals("X") && jButton73.getText().equals("X")) {
                    p7 = "X";
                    XVencedorP7();
                } else if (jButton78.getText().equals("X") && jButton79.getText().equals("X")) {
                    p7 = "X";
                    XVencedorP7();
                } else if (!jButton71.getText().equals("") && !jButton72.getText().equals("") && !jButton73.getText().equals("") && !jButton74.getText().equals("") && !jButton75.getText().equals("") && !jButton76.getText().equals("") && !jButton77.getText().equals("") && !jButton78.getText().equals("") && !jButton79.getText().equals("")) {
                p7 = "V";
                VelhaP7();
            }
            } else if (!cont && jButton77.getText().equals("")) {
                jButton77.setText("O");
                jButton77.setBackground(Azul);
                cont = true;
                AtivarP7();
                DesativarP1();
                DesativarP2();
                DesativarP3();
                DesativarP4();
                DesativarP5();
                DesativarP6();
                DesativarP8();
                DesativarP9();

                if (jButton74.getText().equals("O") && jButton71.getText().equals("O")) {
                    p7 = "O";
                    OVencedorP7();
                } else if (jButton75.getText().equals("O") && jButton73.getText().equals("O")) {
                    p7 = "O";
                    OVencedorP7();
                } else if (jButton78.getText().equals("O") && jButton79.getText().equals("O")) {
                    p7 = "O";
                    OVencedorP7();
                } else if (!jButton71.getText().equals("") && !jButton72.getText().equals("") && !jButton73.getText().equals("") && !jButton74.getText().equals("") && !jButton75.getText().equals("") && !jButton76.getText().equals("") && !jButton77.getText().equals("") && !jButton78.getText().equals("") && !jButton79.getText().equals("")) {
                p7 = "V";
                VelhaP7();
            }
            } 
        }
        if (p7finish == true) {
            
            AtivarP1();
            AtivarP2();
            AtivarP3();
            AtivarP4();
            AtivarP5();
            AtivarP6();
            AtivarP8();
            AtivarP9();
        }
        VerificarVelha();


    }//GEN-LAST:event_jButton77ActionPerformed

    private void jButton78ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton78ActionPerformed
        // TODO add your handling code here:
        if (primeiraJogada) {
            jButton78.setEnabled(true);
            primeiraJogada = false;
            DesativarP1();
            DesativarP2();
            DesativarP3();
            DesativarP4();
            DesativarP5();
            DesativarP6();
            DesativarP7();
            DesativarP8();
        }
        if (p7finish == false) {
            if (cont && jButton78.getText().equals("")) {
                jButton78.setText("X");
                jButton78.setBackground(Vermelho);
                cont = false;
                AtivarP8();
                DesativarP1();
                DesativarP2();
                DesativarP3();
                DesativarP4();
                DesativarP5();
                DesativarP6();
                DesativarP7();
                DesativarP9();

                if (jButton77.getText().equals("X") && jButton79.getText().equals("X")) {
                    p7 = "X";
                    XVencedorP7();
                } else if (jButton75.getText().equals("X") && jButton72.getText().equals("X")) {
                    p7 = "X";
                    XVencedorP7();
                } else if (!jButton71.getText().equals("") && !jButton72.getText().equals("") && !jButton73.getText().equals("") && !jButton74.getText().equals("") && !jButton75.getText().equals("") && !jButton76.getText().equals("") && !jButton77.getText().equals("") && !jButton78.getText().equals("") && !jButton79.getText().equals("")) {
                p7 = "V";
                VelhaP7();
            }
            } else if (!cont && jButton78.getText().equals("")) {
                jButton78.setText("O");
                jButton78.setBackground(Azul);
                cont = true;
                AtivarP8();
                DesativarP1();
                DesativarP2();
                DesativarP3();
                DesativarP4();
                DesativarP5();
                DesativarP6();
                DesativarP7();
                DesativarP9();

                if (jButton77.getText().equals("O") && jButton79.getText().equals("O")) {
                    p7 = "O";
                    OVencedorP7();
                } else if (jButton75.getText().equals("O") && jButton72.getText().equals("O")) {
                    p7 = "O";
                    OVencedorP7();
                } else if (!jButton71.getText().equals("") && !jButton72.getText().equals("") && !jButton73.getText().equals("") && !jButton74.getText().equals("") && !jButton75.getText().equals("") && !jButton76.getText().equals("") && !jButton77.getText().equals("") && !jButton78.getText().equals("") && !jButton79.getText().equals("")) {
                p7 = "V";
                VelhaP7();
            }
                        }
        }
        if (p8finish == true) {
            
            AtivarP1();
            AtivarP2();
            AtivarP3();
            AtivarP4();
            AtivarP5();
            AtivarP6();
            AtivarP7();
            AtivarP9();
        }
        VerificarVelha();

    }//GEN-LAST:event_jButton78ActionPerformed

    private void jButton79ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton79ActionPerformed
        // TODO add your handling code here:
        if (primeiraJogada) {
            jButton79.setEnabled(true);
            primeiraJogada = false;
            DesativarP1();
            DesativarP2();
            DesativarP3();
            DesativarP4();
            DesativarP5();
            DesativarP6();
            DesativarP7();
            DesativarP8();
        }

        if (p7finish == false) {
            if (cont && jButton79.getText().equals("")) {
                jButton79.setText("X");
                jButton79.setBackground(Vermelho);
                cont = false;
                AtivarP9();
                DesativarP1();
                DesativarP2();
                DesativarP3();
                DesativarP4();
                DesativarP5();
                DesativarP6();
                DesativarP7();
                DesativarP8();

                if (jButton77.getText().equals("X") && jButton78.getText().equals("X")) {
                    p7 = "X";
                    XVencedorP7();
                } else if (jButton75.getText().equals("X") && jButton71.getText().equals("X")) {
                    p7 = "X";
                    XVencedorP7();
                } else if (jButton76.getText().equals("X") && jButton73.getText().equals("X")) {
                    p7 = "X";
                    XVencedorP7();
                } else if (!jButton71.getText().equals("") && !jButton72.getText().equals("") && !jButton73.getText().equals("") && !jButton74.getText().equals("") && !jButton75.getText().equals("") && !jButton76.getText().equals("") && !jButton77.getText().equals("") && !jButton78.getText().equals("") && !jButton79.getText().equals("")) {
                p7 = "V";
                VelhaP7();
            }
            } else if (!cont && jButton79.getText().equals("")) {
                jButton79.setText("O");
                jButton79.setBackground(Azul);
                cont = true;
                AtivarP9();
                DesativarP1();
                DesativarP2();
                DesativarP3();
                DesativarP4();
                DesativarP5();
                DesativarP6();
                DesativarP7();
                DesativarP8();

                if (jButton77.getText().equals("O") && jButton78.getText().equals("O")) {
                    p7 = "O";
                    OVencedorP7();
                } else if (jButton75.getText().equals("O") && jButton71.getText().equals("O")) {
                    p7 = "O";
                    OVencedorP7();
                } else if (jButton76.getText().equals("O") && jButton73.getText().equals("O")) {
                    p7 = "O";
                    OVencedorP7();
                } else if (!jButton71.getText().equals("") && !jButton72.getText().equals("") && !jButton73.getText().equals("") && !jButton74.getText().equals("") && !jButton75.getText().equals("") && !jButton76.getText().equals("") && !jButton77.getText().equals("") && !jButton78.getText().equals("") && !jButton79.getText().equals("")) {
                p7 = "V";
                VelhaP7();
            }
                        }
        }
        if (p9finish == true) {
            
            AtivarP1();
            AtivarP2();
            AtivarP3();
            AtivarP4();
            AtivarP5();
            AtivarP6();
            AtivarP7();
            AtivarP8();
        }
        VerificarVelha();

    }//GEN-LAST:event_jButton79ActionPerformed

    private void jButton85ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton85ActionPerformed
        // TODO add your handling code here:
        if (primeiraJogada) {
            jButton85.setEnabled(true);
            primeiraJogada = false;
            DesativarP1();
            DesativarP2();
            DesativarP3();
            DesativarP4();
            DesativarP6();
            DesativarP7();
            DesativarP8();
            DesativarP9();
        }

        if (p8finish == false) {
            if (cont && jButton85.getText().equals("")) {
                jButton85.setText("X");
                jButton85.setBackground(Vermelho);
                cont = false;
                AtivarP5();
                DesativarP1();
                DesativarP2();
                DesativarP3();
                DesativarP4();
                DesativarP6();
                DesativarP7();
                DesativarP8();
                DesativarP9();

                if (jButton82.getText().equals("X") && jButton88.getText().equals("X")) {
                    p8 = "X";
                    XVencedorP8();
                } else if (jButton83.getText().equals("X") && jButton87.getText().equals("X")) {
                    p8 = "X";
                    XVencedorP8();
                } else if (jButton86.getText().equals("X") && jButton84.getText().equals("X")) {
                    p8 = "X";
                    XVencedorP8();
                } else if (jButton89.getText().equals("X") && jButton81.getText().equals("X")) {
                    p8 = "X";
                    XVencedorP8();
                } else if (!jButton81.getText().equals("") && !jButton82.getText().equals("") && !jButton83.getText().equals("") && !jButton84.getText().equals("") && !jButton85.getText().equals("") && !jButton86.getText().equals("") && !jButton87.getText().equals("") && !jButton88.getText().equals("") && !jButton89.getText().equals("")) {
                p8 = "V";
                VelhaP8();
            }
            } else if (!cont && jButton85.getText().equals("")) {
                jButton85.setText("O");
                jButton85.setBackground(Azul);
                cont = true;
                AtivarP5();
                DesativarP1();
                DesativarP2();
                DesativarP3();
                DesativarP4();
                DesativarP6();
                DesativarP7();
                DesativarP8();
                DesativarP9();

                if (jButton82.getText().equals("O") && jButton88.getText().equals("O")) {
                    p8 = "O";
                    OVencedorP8();
                } else if (jButton83.getText().equals("O") && jButton87.getText().equals("O")) {
                    p8 = "O";
                    OVencedorP8();
                } else if (jButton84.getText().equals("O") && jButton86.getText().equals("O")) {
                    p8 = "O";
                    OVencedorP8();
                } else if (jButton89.getText().equals("O") && jButton81.getText().equals("O")) {
                    p8 = "O";
                    OVencedorP8();
                } else if (!jButton81.getText().equals("") && !jButton82.getText().equals("") && !jButton83.getText().equals("") && !jButton84.getText().equals("") && !jButton85.getText().equals("") && !jButton86.getText().equals("") && !jButton87.getText().equals("") && !jButton88.getText().equals("") && !jButton89.getText().equals("")) {
                p8 = "V";
                VelhaP8();
            }
            
            }
        }
        if (p5finish == true) {
            
            AtivarP1();
            AtivarP2();
            AtivarP3();
            AtivarP4();
            AtivarP6();
            AtivarP7();
            AtivarP8();
            AtivarP9();
        }
        VerificarVelha();

    }//GEN-LAST:event_jButton85ActionPerformed

    private void jButton86ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton86ActionPerformed
        // TODO add your handling code here:
        if (primeiraJogada) {
            jButton86.setEnabled(true);
            primeiraJogada = false;
            DesativarP1();
            DesativarP2();
            DesativarP3();
            DesativarP4();
            DesativarP5();
            DesativarP7();
            DesativarP8();
            DesativarP9();
        }

        if (p8finish == false) {
            if (cont && jButton86.getText().equals("")) {
                jButton86.setText("X");
                jButton86.setBackground(Vermelho);
                cont = false;
                AtivarP6();
                DesativarP1();
                DesativarP2();
                DesativarP3();
                DesativarP4();
                DesativarP5();
                DesativarP7();
                DesativarP8();
                DesativarP9();

                if (jButton83.getText().equals("X") && jButton89.getText().equals("X")) {
                    p8 = "X";
                    XVencedorP8();
                } else if (jButton85.getText().equals("X") && jButton84.getText().equals("X")) {
                    p8 = "X";
                    XVencedorP8();
                } else if (!jButton81.getText().equals("") && !jButton82.getText().equals("") && !jButton83.getText().equals("") && !jButton84.getText().equals("") && !jButton85.getText().equals("") && !jButton86.getText().equals("") && !jButton87.getText().equals("") && !jButton88.getText().equals("") && !jButton89.getText().equals("")) {
                p8 = "V";
                VelhaP8();
            }
            } else if (!cont && jButton86.getText().equals("")) {
                jButton86.setText("O");
                jButton86.setBackground(Azul);
                cont = true;
                AtivarP6();
                DesativarP1();
                DesativarP2();
                DesativarP3();
                DesativarP4();
                DesativarP5();
                DesativarP7();
                DesativarP8();
                DesativarP9();

                if (jButton83.getText().equals("O") && jButton89.getText().equals("O")) {
                    p8 = "O";
                    OVencedorP8();
                } else if (jButton85.getText().equals("O") && jButton84.getText().equals("O")) {
                    p8 = "O";
                    OVencedorP8();
                } else if (!jButton81.getText().equals("") && !jButton82.getText().equals("") && !jButton83.getText().equals("") && !jButton84.getText().equals("") && !jButton85.getText().equals("") && !jButton86.getText().equals("") && !jButton87.getText().equals("") && !jButton88.getText().equals("") && !jButton89.getText().equals("")) {
                p8 = "V";
                VelhaP8();
            }
                       }
        }
        if (p6finish == true) {
            
            AtivarP1();
            AtivarP2();
            AtivarP3();
            AtivarP4();
            AtivarP5();
            AtivarP7();
            AtivarP8();
            AtivarP9();
        }
        VerificarVelha();

    }//GEN-LAST:event_jButton86ActionPerformed

    private void jButton87ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton87ActionPerformed
        // TODO add your handling code here:
        if (primeiraJogada) {
            jButton87.setEnabled(true);
            primeiraJogada = false;
            DesativarP1();
            DesativarP2();
            DesativarP3();
            DesativarP4();
            DesativarP5();
            DesativarP6();
            DesativarP8();
            DesativarP9();
        }

        if (p8finish == false) {
            if (cont && jButton87.getText().equals("")) {
                jButton87.setText("X");
                jButton87.setBackground(Vermelho);
                cont = false;
                AtivarP7();
                DesativarP1();
                DesativarP2();
                DesativarP3();
                DesativarP4();
                DesativarP5();
                DesativarP6();
                DesativarP8();
                DesativarP9();

                if (jButton84.getText().equals("X") && jButton81.getText().equals("X")) {
                    p8 = "X";
                    XVencedorP8();
                } else if (jButton85.getText().equals("X") && jButton83.getText().equals("X")) {
                    p8 = "X";
                    XVencedorP8();
                } else if (jButton88.getText().equals("X") && jButton89.getText().equals("X")) {
                    p8 = "X";
                    XVencedorP8();
                } else if (!jButton81.getText().equals("") && !jButton82.getText().equals("") && !jButton83.getText().equals("") && !jButton84.getText().equals("") && !jButton85.getText().equals("") && !jButton86.getText().equals("") && !jButton87.getText().equals("") && !jButton88.getText().equals("") && !jButton89.getText().equals("")) {
                p8 = "V";
                VelhaP8();
            }
            } else if (!cont && jButton87.getText().equals("")) {
                jButton87.setText("O");
                jButton87.setBackground(Azul);
                cont = true;
                AtivarP7();
                DesativarP1();
                DesativarP2();
                DesativarP3();
                DesativarP4();
                DesativarP5();
                DesativarP6();
                DesativarP8();
                DesativarP9();

                if (jButton84.getText().equals("O") && jButton81.getText().equals("O")) {
                    p8 = "O";
                    OVencedorP8();
                } else if (jButton85.getText().equals("O") && jButton83.getText().equals("O")) {
                    p8 = "O";
                    OVencedorP8();
                } else if (jButton88.getText().equals("O") && jButton89.getText().equals("O")) {
                    p8 = "O";
                    OVencedorP8();
                } else if (!jButton81.getText().equals("") && !jButton82.getText().equals("") && !jButton83.getText().equals("") && !jButton84.getText().equals("") && !jButton85.getText().equals("") && !jButton86.getText().equals("") && !jButton87.getText().equals("") && !jButton88.getText().equals("") && !jButton89.getText().equals("")) {
                p8 = "V";
                VelhaP8();
            }
                       }
        }
        if (p7finish == true) {
            
            AtivarP1();
            AtivarP2();
            AtivarP3();
            AtivarP4();
            AtivarP5();
            AtivarP6();
            AtivarP8();
            AtivarP9();
        }
        VerificarVelha();

    }//GEN-LAST:event_jButton87ActionPerformed

    private void jButton88ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton88ActionPerformed
        // TODO add your handling code here:
        if (primeiraJogada) {
            jButton88.setEnabled(true);
            primeiraJogada = false;
            DesativarP1();
            DesativarP2();
            DesativarP3();
            DesativarP4();
            DesativarP5();
            DesativarP6();
            DesativarP7();
            DesativarP8();
        }

        if (p8finish == false) {
            if (cont && jButton88.getText().equals("")) {
                jButton88.setText("X");
                jButton88.setBackground(Vermelho);
                cont = false;
                AtivarP8();
                DesativarP1();
                DesativarP2();
                DesativarP3();
                DesativarP4();
                DesativarP5();
                DesativarP6();
                DesativarP7();
                DesativarP9();

                if (jButton87.getText().equals("X") && jButton89.getText().equals("X")) {
                    p8 = "X";
                    XVencedorP8();
                } else if (jButton85.getText().equals("X") && jButton82.getText().equals("X")) {
                    p8 = "X";
                    XVencedorP8();
                } else if (!jButton81.getText().equals("") && !jButton82.getText().equals("") && !jButton83.getText().equals("") && !jButton84.getText().equals("") && !jButton85.getText().equals("") && !jButton86.getText().equals("") && !jButton87.getText().equals("") && !jButton88.getText().equals("") && !jButton89.getText().equals("")) {
                p8 = "V";
                VelhaP8();
            }
            } else if (!cont && jButton88.getText().equals("")) {
                jButton88.setText("O");
                jButton88.setBackground(Azul);
                cont = true;
                AtivarP8();
                DesativarP1();
                DesativarP2();
                DesativarP3();
                DesativarP4();
                DesativarP5();
                DesativarP6();
                DesativarP7();
                DesativarP9();

                if (jButton87.getText().equals("O") && jButton89.getText().equals("O")) {
                    p8 = "O";
                    OVencedorP8();
                } else if (jButton85.getText().equals("O") && jButton82.getText().equals("O")) {
                    p8 = "O";
                    OVencedorP8();
                } else if (!jButton81.getText().equals("") && !jButton82.getText().equals("") && !jButton83.getText().equals("") && !jButton84.getText().equals("") && !jButton85.getText().equals("") && !jButton86.getText().equals("") && !jButton87.getText().equals("") && !jButton88.getText().equals("") && !jButton89.getText().equals("")) {
                p8 = "V";
                VelhaP8();
            } 
            
            }
        }
        if (p8finish == true) {
            
            AtivarP1();
            AtivarP2();
            AtivarP3();
            AtivarP4();
            AtivarP5();
            AtivarP6();
            AtivarP7();
            AtivarP9();
        }
        VerificarVelha();


    }//GEN-LAST:event_jButton88ActionPerformed

    private void jButton89ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton89ActionPerformed
        // TODO add your handling code here:
        if (primeiraJogada) {
            jButton89.setEnabled(true);
            primeiraJogada = false;
            DesativarP1();
            DesativarP2();
            DesativarP3();
            DesativarP4();
            DesativarP5();
            DesativarP6();
            DesativarP7();
            DesativarP8();
        }

        if (p8finish == false) {
            if (cont && jButton89.getText().equals("")) {
                jButton89.setText("X");
                jButton89.setBackground(Vermelho);
                cont = false;
                AtivarP9();
                DesativarP1();
                DesativarP2();
                DesativarP3();
                DesativarP4();
                DesativarP5();
                DesativarP6();
                DesativarP7();
                DesativarP8();

                if (jButton87.getText().equals("X") && jButton88.getText().equals("X")) {
                    p8 = "X";
                    XVencedorP8();
                } else if (jButton85.getText().equals("X") && jButton81.getText().equals("X")) {
                    p8 = "X";
                    XVencedorP8();
                } else if (jButton86.getText().equals("X") && jButton83.getText().equals("X")) {
                    p8 = "X";
                    XVencedorP8();
                } else if (!jButton81.getText().equals("") && jButton82.getText().equals("") && !jButton83.getText().equals("") && !jButton84.getText().equals("") && !jButton85.getText().equals("") && !jButton86.getText().equals("") && !jButton87.getText().equals("") && !jButton88.getText().equals("") && !jButton89.getText().equals("")) {
                p8 = "V";
                VelhaP8();
            }
            } else if (!cont && jButton89.getText().equals("")) {
                jButton89.setText("O");
                jButton89.setBackground(Azul);
                cont = true;
                AtivarP9();
                DesativarP1();
                DesativarP2();
                DesativarP3();
                DesativarP4();
                DesativarP5();
                DesativarP6();
                DesativarP7();
                DesativarP8();

                if (jButton87.getText().equals("O") && jButton88.getText().equals("O")) {
                    p8 = "O";
                    OVencedorP8();
                } else if (jButton85.getText().equals("O") && jButton81.getText().equals("O")) {
                    p8 = "O";
                    OVencedorP8();
                } else if (jButton86.getText().equals("O") && jButton83.getText().equals("O")) {
                    p8 = "O";
                    OVencedorP8();
                } else if (!jButton81.getText().equals("") && jButton82.getText().equals("") && !jButton83.getText().equals("") && !jButton84.getText().equals("") && !jButton85.getText().equals("") && !jButton86.getText().equals("") && !jButton87.getText().equals("") && !jButton88.getText().equals("") && !jButton89.getText().equals("")) {
                p8 = "V";
                VelhaP8();
            }
            
            }
        }
        if (p9finish == true) {
            
            AtivarP1();
            AtivarP2();
            AtivarP3();
            AtivarP4();
            AtivarP5();
            AtivarP6();
            AtivarP7();
            AtivarP8();
        }
        VerificarVelha();

    }//GEN-LAST:event_jButton89ActionPerformed

    private void jButton95ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton95ActionPerformed
        // TODO add your handling code here:
        if (primeiraJogada) {
            jButton95.setEnabled(true);
            primeiraJogada = false;
            DesativarP1();
            DesativarP2();
            DesativarP3();
            DesativarP4();
            DesativarP6();
            DesativarP7();
            DesativarP8();
            DesativarP9();
        }

        if (p9finish == false) {
            if (cont && jButton95.getText().equals("")) {
                jButton95.setText("X");
                jButton95.setBackground(Vermelho);
                cont = false;
                AtivarP5();
                DesativarP1();
                DesativarP2();
                DesativarP3();
                DesativarP4();
                DesativarP6();
                DesativarP7();
                DesativarP8();
                DesativarP9();

                if (jButton92.getText().equals("X") && jButton98.getText().equals("X")) {
                    p9 = "X";
                    XVencedorP9();
                } else if (jButton93.getText().equals("X") && jButton97.getText().equals("X")) {
                    p9 = "X";
                    XVencedorP9();
                } else if (jButton96.getText().equals("X") && jButton94.getText().equals("X")) {
                    p9 = "X";
                    XVencedorP9();
                } else if (jButton99.getText().equals("X") && jButton91.getText().equals("X")) {
                    p9 = "X";
                    XVencedorP9();
                } else if (!jButton91.getText().equals("") && !jButton92.getText().equals("") && !jButton93.getText().equals("") && !jButton94.getText().equals("") && !jButton95.getText().equals("") && !jButton96.getText().equals("") && !jButton97.getText().equals("") && !jButton98.getText().equals("") && !jButton99.getText().equals("")) {
                p9 = "V";
                VelhaP9();
            }
            } else if (!cont && jButton95.getText().equals("")) {
                jButton95.setText("O");
                jButton95.setBackground(Azul);
                cont = true;
                AtivarP5();
                DesativarP1();
                DesativarP2();
                DesativarP3();
                DesativarP4();
                DesativarP6();
                DesativarP7();
                DesativarP8();
                DesativarP9();

                if (jButton92.getText().equals("O") && jButton98.getText().equals("O")) {
                    p9 = "O";
                    OVencedorP9();
                } else if (jButton93.getText().equals("O") && jButton97.getText().equals("O")) {
                    p9 = "O";
                    OVencedorP9();
                } else if (jButton94.getText().equals("O") && jButton96.getText().equals("O")) {
                    p9 = "O";
                    OVencedorP9();
                } else if (jButton99.getText().equals("O") && jButton91.getText().equals("O")) {
                    p9 = "O";
                    OVencedorP9();
                } else if (!jButton91.getText().equals("") && !jButton92.getText().equals("") && !jButton93.getText().equals("") && !jButton94.getText().equals("") && !jButton95.getText().equals("") && !jButton96.getText().equals("") && !jButton97.getText().equals("") && !jButton98.getText().equals("") && !jButton99.getText().equals("")) {
                p9 = "V";
                VelhaP9();
            }
            }
        }
        if (p5finish == true) {
            
            AtivarP1();
            AtivarP2();
            AtivarP3();
            AtivarP4();
            AtivarP6();
            AtivarP7();
            AtivarP8();
            AtivarP9();
        }
        VerificarVelha();

    }//GEN-LAST:event_jButton95ActionPerformed

    private void jButton96ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton96ActionPerformed
        // TODO add your handling code here:
        if (primeiraJogada) {
            jButton96.setEnabled(true);
            primeiraJogada = false;
            DesativarP1();
            DesativarP2();
            DesativarP3();
            DesativarP4();
            DesativarP5();
            DesativarP7();
            DesativarP8();
            DesativarP9();
        }

        if (p9finish == false) {
            if (cont && jButton96.getText().equals("")) {
                jButton96.setText("X");
                jButton96.setBackground(Vermelho);
                cont = false;
                AtivarP6();
                DesativarP1();
                DesativarP2();
                DesativarP3();
                DesativarP4();
                DesativarP5();
                DesativarP7();
                DesativarP8();
                DesativarP9();

                if (jButton93.getText().equals("X") && jButton99.getText().equals("X")) {
                    p9 = "X";
                    XVencedorP9();
                } else if (jButton95.getText().equals("X") && jButton94.getText().equals("X")) {
                    p9 = "X";
                    XVencedorP9();
                } else if (!jButton91.getText().equals("") && !jButton92.getText().equals("") && !jButton93.getText().equals("") && !jButton94.getText().equals("") && !jButton95.getText().equals("") && !jButton96.getText().equals("") && !jButton97.getText().equals("") && !jButton98.getText().equals("") && !jButton99.getText().equals("")) {
                p9 = "V";
                VelhaP9();
            }
            } else if (!cont && jButton96.getText().equals("")) {
                jButton96.setText("O");
                jButton96.setBackground(Azul);
                cont = true;
                AtivarP6();
                DesativarP1();
                DesativarP2();
                DesativarP3();
                DesativarP4();
                DesativarP5();
                DesativarP7();
                DesativarP8();
                DesativarP9();

                if (jButton93.getText().equals("O") && jButton99.getText().equals("O")) {
                    p9 = "O";
                    OVencedorP9();
                } else if (jButton95.getText().equals("O") && jButton94.getText().equals("O")) {
                    p9 = "O";
                    OVencedorP9();
                } else if (!jButton91.getText().equals("") && !jButton92.getText().equals("") && !jButton93.getText().equals("") && !jButton94.getText().equals("") && !jButton95.getText().equals("") && !jButton96.getText().equals("") && !jButton97.getText().equals("") && !jButton98.getText().equals("") && !jButton99.getText().equals("")) {
                p9 = "V";
                VelhaP9();
            }
                        }
        }
        if (p6finish == true) {
            
            AtivarP1();
            AtivarP2();
            AtivarP3();
            AtivarP4();
            AtivarP5();
            AtivarP7();
            AtivarP8();
            AtivarP9();
        }
        VerificarVelha();

    }//GEN-LAST:event_jButton96ActionPerformed

    private void jButton97ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton97ActionPerformed
        // TODO add your handling code here:
        if (primeiraJogada) {
            jButton97.setEnabled(true);
            primeiraJogada = false;
            DesativarP1();
            DesativarP2();
            DesativarP3();
            DesativarP4();
            DesativarP5();
            DesativarP6();
            DesativarP8();
            DesativarP9();
        }

        if (p9finish == false) {
            if (cont && jButton97.getText().equals("")) {
                jButton97.setText("X");
                jButton97.setBackground(Vermelho);
                cont = false;
                AtivarP7();
                DesativarP1();
                DesativarP2();
                DesativarP3();
                DesativarP4();
                DesativarP5();
                DesativarP6();
                DesativarP8();
                DesativarP9();

                if (jButton94.getText().equals("X") && jButton91.getText().equals("X")) {
                    p9 = "X";
                    XVencedorP9();
                } else if (jButton95.getText().equals("X") && jButton93.getText().equals("X")) {
                    p9 = "X";
                    XVencedorP9();
                } else if (jButton98.getText().equals("X") && jButton99.getText().equals("X")) {
                    p9 = "X";
                    XVencedorP9();
                } else if (!jButton91.getText().equals("") && !jButton92.getText().equals("") && !jButton93.getText().equals("") && !jButton94.getText().equals("") && !jButton95.getText().equals("") && !jButton96.getText().equals("") && !jButton97.getText().equals("") && !jButton98.getText().equals("") && !jButton99.getText().equals("")) {
                p9 = "V";
                VelhaP9();
            }
            } else if (!cont && jButton97.getText().equals("")) {
                jButton97.setText("O");
                jButton97.setBackground(Azul);
                cont = true;
                AtivarP7();
                DesativarP1();
                DesativarP2();
                DesativarP3();
                DesativarP4();
                DesativarP5();
                DesativarP6();
                DesativarP8();
                DesativarP9();

                if (jButton94.getText().equals("O") && jButton91.getText().equals("O")) {
                    p9 = "O";
                    OVencedorP9();
                } else if (jButton95.getText().equals("O") && jButton93.getText().equals("O")) {
                    p9 = "O";
                    OVencedorP9();
                } else if (jButton98.getText().equals("O") && jButton99.getText().equals("O")) {
                    p9 = "O";
                    OVencedorP9();
                } else if (!jButton91.getText().equals("") && !jButton92.getText().equals("") && !jButton93.getText().equals("") && !jButton94.getText().equals("") && !jButton95.getText().equals("") && !jButton96.getText().equals("") && !jButton97.getText().equals("") && !jButton98.getText().equals("") && !jButton99.getText().equals("")) {
                p9 = "V";
                VelhaP9();
            }
            }
        }
        if (p7finish == true) {
            
            AtivarP1();
            AtivarP2();
            AtivarP3();
            AtivarP4();
            AtivarP5();
            AtivarP6();
            AtivarP8();
            AtivarP9();
        }
        VerificarVelha();


    }//GEN-LAST:event_jButton97ActionPerformed

    private void jButton98ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton98ActionPerformed
        // TODO add your handling code here:
        if (primeiraJogada) {
            jButton98.setEnabled(true);
            primeiraJogada = false;
            DesativarP1();
            DesativarP2();
            DesativarP3();
            DesativarP4();
            DesativarP5();
            DesativarP6();
            DesativarP7();
            DesativarP8();
        }

        if (p9finish == false) {
            if (cont && jButton98.getText().equals("")) {
                jButton98.setText("X");
                jButton98.setBackground(Vermelho);
                cont = false;
                AtivarP8();
                DesativarP1();
                DesativarP2();
                DesativarP3();
                DesativarP4();
                DesativarP5();
                DesativarP6();
                DesativarP7();
                DesativarP9();

                if (jButton97.getText().equals("X") && jButton99.getText().equals("X")) {
                    p9 = "X";
                    XVencedorP9();
                } else if (jButton95.getText().equals("X") && jButton92.getText().equals("X")) {
                    p9 = "X";
                    XVencedorP9();
                } else if (!jButton91.getText().equals("") && !jButton92.getText().equals("") && !jButton93.getText().equals("") && !jButton94.getText().equals("") && !jButton95.getText().equals("") && !jButton96.getText().equals("") && !jButton97.getText().equals("") && !jButton98.getText().equals("") && !jButton99.getText().equals("")) {
                p9 = "V";
                VelhaP9();
            }
            } else if (!cont && jButton98.getText().equals("")) {
                jButton98.setText("O");
                jButton98.setBackground(Azul);
                cont = true;
                AtivarP8();
                DesativarP1();
                DesativarP2();
                DesativarP3();
                DesativarP4();
                DesativarP5();
                DesativarP6();
                DesativarP7();
                DesativarP9();

                if (jButton97.getText().equals("O") && jButton99.getText().equals("O")) {
                    p9 = "O";
                    OVencedorP9();
                } else if (jButton95.getText().equals("O") && jButton92.getText().equals("O")) {
                    p9 = "O";
                    OVencedorP9();
                } else if (!jButton91.getText().equals("") && !jButton92.getText().equals("") && !jButton93.getText().equals("") && !jButton94.getText().equals("") && !jButton95.getText().equals("") && !jButton96.getText().equals("") && !jButton97.getText().equals("") && !jButton98.getText().equals("") && !jButton99.getText().equals("")) {
                p9 = "V";
                VelhaP9();
            }
            
            }
        }
        if (p8finish == true) {
            
            AtivarP1();
            AtivarP2();
            AtivarP3();
            AtivarP4();
            AtivarP5();
            AtivarP6();
            AtivarP7();
            AtivarP9();
        }

        VerificarVelha();


    }//GEN-LAST:event_jButton98ActionPerformed

    private void jButton99ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton99ActionPerformed
        // TODO add your handling code here:
        if (primeiraJogada) {
            jButton99.setEnabled(true);
            primeiraJogada = false;
            DesativarP1();
            DesativarP2();
            DesativarP3();
            DesativarP4();
            DesativarP5();
            DesativarP6();
            DesativarP7();
            DesativarP8();
        }

        if (p9finish == false) {
            if (cont && jButton99.getText().equals("")) {
                jButton99.setText("X");
                jButton99.setBackground(Vermelho);
                cont = false;
                AtivarP9();
                DesativarP1();
                DesativarP2();
                DesativarP3();
                DesativarP4();
                DesativarP5();
                DesativarP6();
                DesativarP7();
                DesativarP8();

                if (jButton97.getText().equals("X") && jButton98.getText().equals("X")) {
                    p9 = "X";
                    XVencedorP9();
                } else if (jButton95.getText().equals("X") && jButton91.getText().equals("X")) {
                    p9 = "X";
                    XVencedorP9();
                } else if (jButton96.getText().equals("X") && jButton93.getText().equals("X")) {
                    p9 = "X";
                    XVencedorP9();
                } else if (!jButton91.getText().equals("") && !jButton92.getText().equals("") && !jButton93.getText().equals("") && !jButton94.getText().equals("") && !jButton95.getText().equals("") && !jButton96.getText().equals("") && !jButton97.getText().equals("") && !jButton98.getText().equals("") && !jButton99.getText().equals("")) {
                p9 = "V";
                VelhaP9();
            }
            } else if (!cont && jButton99.getText().equals("")) {
                jButton99.setText("O");
                jButton99.setBackground(Azul);
                cont = true;
                AtivarP9();
                DesativarP1();
                DesativarP2();
                DesativarP3();
                DesativarP4();
                DesativarP5();
                DesativarP6();
                DesativarP7();
                DesativarP8();

                if (jButton97.getText().equals("O") && jButton98.getText().equals("O")) {
                    p9 = "O";
                    OVencedorP9();
                } else if (jButton95.getText().equals("O") && jButton91.getText().equals("O")) {
                    p9 = "O";
                    OVencedorP9();
                } else if (jButton96.getText().equals("O") && jButton93.getText().equals("O")) {
                    p9 = "O";
                    OVencedorP9();
                } else if (!jButton91.getText().equals("") && !jButton92.getText().equals("") && !jButton93.getText().equals("") && !jButton94.getText().equals("") && !jButton95.getText().equals("") && !jButton96.getText().equals("") && !jButton97.getText().equals("") && !jButton98.getText().equals("") && !jButton99.getText().equals("")) {
                p9 = "V";
                VelhaP9();
            }
                        }
        }
        if (p9finish == true) {
            VelhaP9();
            AtivarP1();
            AtivarP2();
            AtivarP3();
            AtivarP4();
            AtivarP5();
            AtivarP6();
            AtivarP7();
            AtivarP8();
        }
        VerificarVelha();

    }//GEN-LAST:event_jButton99ActionPerformed

    private void jButtonOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonOActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonOActionPerformed

    private void jButtonXActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonXActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_jButtonXActionPerformed

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
            java.util.logging.Logger.getLogger(JogoDaVelha2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JogoDaVelha2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JogoDaVelha2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JogoDaVelha2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JogoDaVelha2().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField PlacarO;
    private javax.swing.JTextField PlacarX;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton14;
    private javax.swing.JButton jButton15;
    private javax.swing.JButton jButton16;
    private javax.swing.JButton jButton17;
    private javax.swing.JButton jButton18;
    private javax.swing.JButton jButton19;
    private javax.swing.JButton jButton21;
    private javax.swing.JButton jButton22;
    private javax.swing.JButton jButton23;
    private javax.swing.JButton jButton24;
    private javax.swing.JButton jButton25;
    private javax.swing.JButton jButton26;
    private javax.swing.JButton jButton27;
    private javax.swing.JButton jButton28;
    private javax.swing.JButton jButton29;
    private javax.swing.JButton jButton31;
    private javax.swing.JButton jButton32;
    private javax.swing.JButton jButton33;
    private javax.swing.JButton jButton34;
    private javax.swing.JButton jButton35;
    private javax.swing.JButton jButton36;
    private javax.swing.JButton jButton37;
    private javax.swing.JButton jButton38;
    private javax.swing.JButton jButton39;
    private javax.swing.JButton jButton41;
    private javax.swing.JButton jButton42;
    private javax.swing.JButton jButton43;
    private javax.swing.JButton jButton44;
    private javax.swing.JButton jButton45;
    private javax.swing.JButton jButton46;
    private javax.swing.JButton jButton47;
    private javax.swing.JButton jButton48;
    private javax.swing.JButton jButton49;
    private javax.swing.JButton jButton51;
    private javax.swing.JButton jButton52;
    private javax.swing.JButton jButton53;
    private javax.swing.JButton jButton54;
    private javax.swing.JButton jButton55;
    private javax.swing.JButton jButton56;
    private javax.swing.JButton jButton57;
    private javax.swing.JButton jButton58;
    private javax.swing.JButton jButton59;
    private javax.swing.JButton jButton61;
    private javax.swing.JButton jButton62;
    private javax.swing.JButton jButton63;
    private javax.swing.JButton jButton64;
    private javax.swing.JButton jButton65;
    private javax.swing.JButton jButton66;
    private javax.swing.JButton jButton67;
    private javax.swing.JButton jButton68;
    private javax.swing.JButton jButton69;
    private javax.swing.JButton jButton71;
    private javax.swing.JButton jButton72;
    private javax.swing.JButton jButton73;
    private javax.swing.JButton jButton74;
    private javax.swing.JButton jButton75;
    private javax.swing.JButton jButton76;
    private javax.swing.JButton jButton77;
    private javax.swing.JButton jButton78;
    private javax.swing.JButton jButton79;
    private javax.swing.JButton jButton81;
    private javax.swing.JButton jButton82;
    private javax.swing.JButton jButton83;
    private javax.swing.JButton jButton84;
    private javax.swing.JButton jButton85;
    private javax.swing.JButton jButton86;
    private javax.swing.JButton jButton87;
    private javax.swing.JButton jButton88;
    private javax.swing.JButton jButton89;
    private javax.swing.JButton jButton91;
    private javax.swing.JButton jButton92;
    private javax.swing.JButton jButton93;
    private javax.swing.JButton jButton94;
    private javax.swing.JButton jButton95;
    private javax.swing.JButton jButton96;
    private javax.swing.JButton jButton97;
    private javax.swing.JButton jButton98;
    private javax.swing.JButton jButton99;
    private javax.swing.JButton jButtonO;
    private javax.swing.JButton jButtonX;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    // End of variables declaration//GEN-END:variables

    private void primeiraJogada(boolean b) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}
