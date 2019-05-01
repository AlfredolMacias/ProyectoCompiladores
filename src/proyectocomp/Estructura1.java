package proyectocomp;

import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JComponent;

public class Estructura1 extends JComponent{
    int num1 = 0;
    int num2 = 0;
    public Estructura1(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }
    
    public static void Figura1(Graphics g, int cantidad, String val1){
        int x = 20+cantidad;
        int y = 100;
        int w = 120;
        int h = 80;
        g.drawRect(x,y,w,h);
        g.drawString(val1, x+10, y+20);
    }
    
    public static void Figura1(Graphics g, int cantidad, String val1, String val2){
        int x = 20+cantidad;
        int y = 100;
        int w = 120;
        int h = 80;
        g.drawRect(x,y,w,h);
        g.drawString(val1, x+10, y+20);
        g.drawString(val2, x+10, y+40);
    }
    
    public static void Figura1(Graphics g, int cantidad, String val1, String val2, String val3){
        int x = 20+cantidad;
        int y = 100;
        int w = 120;
        int h = 80;
        g.drawRect(x,y,w,h);
        g.drawString(val1, x+10, y+20);
        g.drawString(val2, x+10, y+40);
        g.drawString(val3, x+10, y+60);
    }

    public static void Figura2(Graphics g, int cantidad, String val1){
        int x1 = 20+cantidad;
        int y1 = 220;
        int w1 = 120;
        int h1 = 80;
        g.drawRect(x1,y1,w1,h1);
        g.drawString(val1, x1+10, y1+20);
    }
    
    public static void Figura2(Graphics g, int cantidad, String val1, String val2){
        int x1 = 20+cantidad;
        int y1 = 220;
        int w1 = 120;
        int h1 = 80;
        g.drawRect(x1,y1,w1,h1);
        g.drawString(val1, x1+10, y1+20);
        g.drawString(val2, x1+10, y1+40);
    }
    
    public static void Figura2(Graphics g, int cantidad, String val1, String val2, String val3){
        int x1 = 20+cantidad;
        int y1 = 220;
        int w1 = 120;
        int h1 = 80;
        g.drawRect(x1,y1,w1,h1);
        g.drawString(val1, x1+10, y1+20);
        g.drawString(val2, x1+10, y1+40);
        g.drawString(val3, x1+10, y1+60);
    }
}

