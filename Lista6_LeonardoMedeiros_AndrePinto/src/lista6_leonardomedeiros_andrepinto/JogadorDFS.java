/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lista6_leonardomedeiros_andrepinto;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

/**
 *
 * @author leonardo
 */
public class JogadorDFS {
    Stack<Integer> pilhax = new Stack<>();
    Stack<Integer> pilhay = new Stack<>();
   
    int myColor;
    int dx[] = {0, 1, 0, -1};
    int dy[] = {1, 0, -1, 0};
    JogadorDFS(int x, int y, int color){
        pilhax.push(x);
        pilhay.push(y);
        myColor=color;
    }
    
    public boolean proximaJogada(int [][] mapa){
        boolean Point=false;
        while(true){
            int j = jogada(mapa);
            if(j==0){
                return false;
            }else if(j==1){
                return true;
            }
        }
        
    }
    
    public int jogada(int [][] mapa){
        
        if(pilhax.empty() || pilhay.empty()){
            return 0;
        }
        int nx = pilhax.pop();
        int ny = pilhay.pop();
        if(mapa[nx][ny] != 0){
            return 2;
        }
        mapa[nx][ny] = myColor;
        //System.out.print(nx);
        //System.out.print(" ");
        //System.out.println(ny);
        for(int i=0; i<4; i++){
            if(nx+dx[i]<0 || nx+dx[i]>=50 || ny+dy[i]<0 || ny+dy[i] >= 50){
                continue;
            }
            else{
                if(mapa[nx+dx[i]][ny+dy[i]] == 0){
                    pilhax.push(nx+dx[i]);
                    pilhay.push(ny+dy[i]);
                }
            }
        }
        return 1;
    }
}
