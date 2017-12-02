package sorting;

import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;

/**
 *
 * @author Fernando
 */
public class Drawer extends java.awt.Canvas{

    public ArrayList data = new ArrayList();
    /**
     * Column width
     */
    public int columnWidth;
    /**
     * Column height multiplier
     */
    public int columnHeight;
    
    public Drawer() {
    }
    
    
    @Override
    public void paint(Graphics g){
        super.paint(g);
        setBackground(Color.black);
        for (int i = 0; i < data.size(); i++) {
            try {
                int value = (int) data.get(i);
                
                g.setColor(Color.gray);
                //g.setColor(new Color((value*columnHeight+columnHeight)/4, (value*columnHeight+columnHeight)/4, 255));
                g.fillRect(i*columnWidth, 0, columnWidth, value*columnHeight+columnHeight);
                
                g.setColor(Color.white);
                g.drawRect(i*columnWidth, 0, columnWidth, value*columnHeight+columnHeight);
            } catch (Exception e) {
            }
        }
    }
    
}
