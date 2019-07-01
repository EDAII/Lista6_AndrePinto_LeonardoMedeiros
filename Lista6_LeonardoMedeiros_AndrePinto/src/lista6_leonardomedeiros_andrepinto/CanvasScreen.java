/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lista6_leonardomedeiros_andrepinto;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;

/**
 *
 * @author leonardo
 */
public class CanvasScreen extends Canvas {
    public static final int T_LARGURA = 15;
    public static final int T_ALTURA = 15;
    public static final int MARGEM = 200;
    
    public int canvasNumeroLinhas = 10;
    public int canvasNumeroColunas = 10;

    public int [][] mapa;
    
    CanvasScreen(){
        setBackground (Color.GRAY);

    }
    
    @Override
    public void paint(Graphics g){       
       //
       
        g.drawRect(585, 585, 15, 15);
        for(int i=0; i<canvasNumeroLinhas; i++){
            for(int j=0; j<canvasNumeroColunas; j++){
            
                
                if(mapa[i][j] == 1){
                    //g.setColor(Color.red);
                  //  g.setColor(Color.black);
                  
                } else if(mapa[i][j] == 2){
                    //g.
                } else {
                   // g.setColor(Color.white);
                }
               // g.drawRect(j*T_LARGURA, i*T_ALTURA, T_LARGURA, T_ALTURA);

            }   
        }
    }
    
    public void constroiMapa(){
        mapa = new int [canvasNumeroLinhas][canvasNumeroColunas];
        setSize(canvasNumeroColunas*T_LARGURA, canvasNumeroLinhas*T_ALTURA);
        for(int i=0; i<canvasNumeroLinhas; i++){
            for(int j=0; j<canvasNumeroColunas; j++){
                if(i==j){
                    mapa[i][j] = 1;
                }
            }
         }
        
        paint(getGraphics());
    }

    
    public int getCanvasNumeroLinhas(){
        return canvasNumeroLinhas;
    }
    
    public int getCanvasNumeroColunas(){
        return canvasNumeroColunas;
    }

}
