package sorting;

import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;
import javax.swing.JPanel;

/**
 * 
 * @author Fernando
 */
public class Drawer1 extends JPanel{

    public ArrayList data = new ArrayList();
    /**
     * Column width
     */
    public int columnWidth;
    /**
     * Column height multiplier
     */
    public int columnHeight;
    
    public Drawer1() {
    }
    
    
    @Override
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        setBackground(Color.black);
        for (int i = 0; i < data.size(); i++) {
            try {
                int value = (int) data.get(i);
                
                g.setColor(Color.gray);
                //int div = data.size()/256;
                //g.setColor(new Color((value*columnHeight+columnHeight)/4, (value*columnHeight+columnHeight)/4, 125));
                g.fillRect(i*columnWidth, 0, columnWidth, value*columnHeight+columnHeight);
                
                g.setColor(Color.white);
                g.drawRect(i*columnWidth, 0, columnWidth, value*columnHeight+columnHeight);
            } catch (Exception e) {
            }
        }
    }
    
}
