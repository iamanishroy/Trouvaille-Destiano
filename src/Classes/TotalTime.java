
package Classes;
public class TotalTime {
    public static void main (String args[]){
        int TotalTime=2400+(1430-1200);
        int min, hr=TotalTime/100;
        if(TotalTime%100>=60){
            hr+=1;
            min=TotalTime%100-60;
        }
        else{
            min=TotalTime%100;
        }
        System.out.println(hr + "hr "+min+"min");
        
        
    }
    
}
