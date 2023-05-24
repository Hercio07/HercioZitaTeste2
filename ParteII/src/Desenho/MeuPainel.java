/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Desenho;


import java.awt.Graphics;
import javax.swing.JPanel;
import java.awt.*;

public class MeuPainel extends JPanel {

    public void  paintComponent(Graphics g){
        super.paintComponent(g);
        g.setColor(Color.GRAY);
        g.fillRect(50, 50, 100, 300);
        
        int diametro = 80;
        int x = 60;
        int yRed = 60;
        int yYellow = 160;
        int yGreen = 260;
        int yBlack = 360;
        
        
        g.setColor(Color.red);
        g.fillOval(x, yYellow , diametro, diametro);
        
        g.setColor(Color.YELLOW);
        g.fillOval(x,yGreen , diametro, diametro);
        
        g.setColor(Color.GREEN);
        g.fillOval(x,yGreen , diametro, diametro);
        
        g.setColor(Color.BLACK);
         g.fillOval(x,yBlack , diametro, diametro);
        
        
    }
    
}
