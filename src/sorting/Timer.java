package sorting;

import java.util.Date;
import java.util.concurrent.TimeUnit;

/**
 *
 * @author Fernando
 */
public class Timer {
    
    private Date ini;
    private Date end;
    
    public void start(){
        ini = new Date();
    }
    
    public String stop(){
        end = new Date();
        long time = end.getTime()-ini.getTime();
        
        long hours = TimeUnit.MILLISECONDS.toHours(time);
        long minutes = TimeUnit.MILLISECONDS.toMinutes(time);
        long seconds = TimeUnit.MILLISECONDS.toSeconds(time);
        
        long mSecs = time-seconds*1000;
        
        
        String str = "";
        if (hours==0) {
            if(minutes==0){
                if (seconds==0) {
                    str = mSecs+" milliseconds.";
                }else{
                    str = seconds+"."+mSecs+" seconds.";
                }
            }else{
                str = minutes+" minutes and "+seconds+"."+mSecs+" seconds.";
            }
        }else{
            str = hours+" hours, "+minutes+"minutes and "+seconds+"."+mSecs+" seconds.";
        }
        return str;
    }
}
