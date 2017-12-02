package sorting;

import java.awt.Dimension;
import java.awt.Insets;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 * 
 * @author Fernando
 */
public class Window extends JFrame{
    /**
     * Column width by default 10
     */
    public int columnWidth = 10;
    /**
     * Column height multiplier by default 5
     */
    public int columnHeight = 5;
    
    public long delay = 100;
    
    private Drawer1 d = new Drawer1();
    private int n;

    /**
     * @param a Number of random nums, from [1 to a]
     */
    public Window(int a) {
        n = a;
    }
   
    public void start(){
        d.columnWidth = columnWidth;
        d.columnHeight= columnHeight;
        
        int width = n*d.columnWidth+1;
        int height= n*d.columnHeight+d.columnHeight+1;
        
        this.getContentPane().setPreferredSize(new Dimension(width, height));
        this.pack();
        
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        
        ArrayList numbers = new Sorter().getRandoms(n);
        d.data = numbers;
        
        add(d);
        setVisible(true); 
        
        ini(numbers);
    }
    
    private void ini(ArrayList numbers){
        int n = numbers.size();
        Timer timer = new Timer();
        timer.start();
        while (n==numbers.size()) {
            d.data = numbers;
            d.paint(d.getGraphics());
            
            try {
                Thread.sleep(delay);
            } catch (InterruptedException ex) {
                Logger.getLogger(Window.class.getName()).log(Level.SEVERE, null, ex);
            }
            //numbers = new Sorter().sortBubble(numbers);
            numbers = new Sorter().sortCocktailShaker(numbers);
        }
        String time = timer.stop();
        JOptionPane.showMessageDialog(null, "Sorting finished in:\n"+time, "Info", JOptionPane.INFORMATION_MESSAGE);
        //System.out.println(time+"");
    }

}
