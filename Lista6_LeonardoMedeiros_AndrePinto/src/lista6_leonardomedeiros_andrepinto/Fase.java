/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lista6_leonardomedeiros_andrepinto;

import java.awt.FlowLayout;
import javax.swing.JFrame;

/**
 *
 * @author leonardo
 */
public class Fase extends javax.swing.JFrame  {
    private CanvasScreen canvas = new CanvasScreen();
    /**
     * Creates new form Fase1
     */
    public Fase() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setTitle("Flood filling");
        //initComponents();
        
        canvas.constroiMapa();
        
        setSize(canvas.getCanvasNumeroColunas()*CanvasScreen.T_LARGURA+30 , 500);
        getContentPane().setLayout(new FlowLayout());
        getContentPane().add(canvas);
        
        
        //BotoesLaterais menu = new BotoesLaterais(recursoJogador);
        //getContentPane().add(menu);
        setVisible(true);
    }
}
