package sorting;

import java.awt.Color;
import java.util.ArrayList;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JSplitPane;
import jdk.nashorn.internal.codegen.CompilerConstants;

/**
 *
 * @author Fernando
 */
public class Main{

    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        try {
            /*
            JFrame frame = new JFrame();
            JSplitPane split = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT);
            JPanel pLeft = new JPanel();
            JPanel pRight = new JPanel();
            pLeft.setBackground(Color.gray);
            pRight.setBackground(Color.black);
            split.setLeftComponent(pLeft);
            split.setRightComponent(pRight);
            split.setDividerLocation(150);
            split.setDividerSize(1);
            frame.add(split);
            frame.setSize(1200, 600);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setLocationRelativeTo(null);
            frame.setVisible(true);
             */
            
            
//            String nString = JOptionPane.showInputDialog("Numbers to sort?");
//            int n = Integer.parseInt(nString);
//            Window w = new Window(n);
            int n = 100;
            
            Window w = new Window(n);
            w.setTitle(n+" columns");
            w.columnWidth = 10;
            w.columnHeight= 2;
            w.delay = 20;
            w.start();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
