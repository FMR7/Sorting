package sorting;

import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author Fernando
 */
public class Sorter {

    public Sorter() {
        
    }
    
    public ArrayList sortOne(ArrayList a){
        int nLoop = 0;
        while (true) { 
            boolean end = true;
            for (int i = 0; i < a.size(); i++) {
                
                if (i!=a.size()-1) {
                    int n1 = (int) a.get(i);
                    int n2 = (int) a.get(i+1);
                
                    if (n1>n2) {//Invert numbers
                        a.set(i, n2);
                        a.set(i+1, n1);
                        end = false;
                    }
                }
            }
            if(end){
                break;
            }
            nLoop++;
            for (int i = 0; i < a.size(); i++) {
                //System.out.print(a.get(i)+" ");
                System.out.format("%4d", a.get(i));
            }
            System.out.println("");
        }        
        System.out.println("Loop number: "+nLoop);
        
        return a;
    }
    
    public ArrayList sortBubble(ArrayList a){

        boolean end = true;
        for (int i = 0; i < a.size(); i++) {

            if (i!=a.size()-1) {
                int n1 = (int) a.get(i);
                int n2 = (int) a.get(i+1);

                if (n1>n2) {//Invert numbers
                    a.set(i, n2);
                    a.set(i+1, n1);
                    end = false;
                }
            }
        }
        if (end) {
            a.add(true);
        }
        
        return a;
    }
    
    
    public ArrayList sortCocktailShaker(ArrayList a){

        boolean end = true;
        for (int i = 0; i < a.size(); i++) {

            if (i!=a.size()-1) {
                int n1 = (int) a.get(i);
                int n2 = (int) a.get(i+1);

                if (n1>n2) {//Invert numbers
                    a.set(i, n2);
                    a.set(i+1, n1);
                    end = false;
                }
            }
        }
        for (int i = a.size()-1; i > 0; i--) {

            if (i!=a.size()-1) {
                int n1 = (int) a.get(i);
                int n2 = (int) a.get(i+1);

                if (n1>n2) {//Invert numbers
                    a.set(i, n2);
                    a.set(i+1, n1);
                    end = false;
                }
            }
        }
        if (end) {
            a.add(true);
        }
        
        return a;
    }
    
    
    public ArrayList getRandoms(int max){
        ArrayList a = getNumbers(max);
        Collections.shuffle(a);
        return a;
    }
    
    
    /**
     * Get numbers from 1 to max
     * @param max Size
     * @return ArrayList with the numbers
     */
    private ArrayList getNumbers(int max){
        ArrayList n = new ArrayList();
        for (int i = 0; i < max; i++) {
            n.add(i+1);
        }
        return n;
    }
}
