package Classes;
public class Time {
    public static void main(String args[]){
        String t = "";
        String time = "1500";
        if(Integer.parseInt(time)<1200){
            int a;
            for(a=0; a<2;a++)
                t += time.charAt(a);
            t += ":";
            for(a=2; a<4;a++)
                t += time.charAt(a);
            t += " AM";
        }
        else if(Integer.parseInt(time)/1000 == 1 && (Integer.parseInt(time)%1000) / 100 == 2){
            int a;
            for(a=0; a<2;a++)
                t += time.charAt(a);
            t += ":";
            for(a=2; a<4;a++)
                t += time.charAt(a);
            t += " PM";
        }        
        else if(Integer.parseInt(time) <2400){
            int a;
            for(a=0; a<2;a++)
                t += time.charAt(a);
                t = Integer.toString(Integer.parseInt(t) - 12);
            t += ":";
            for(a=2; a<4;a++)
                t += time.charAt(a);
            t += " PM";
        }
        else{
            int day = Integer.parseInt(time)/2400;
            System.out.println(day);
            int rawtime = Integer.parseInt(time)%2400;
            time = "";
            for (int q=0; q< 4-(Integer.toString(rawtime).length()); q++){
                time += "0";
            }
            time += Integer.toString(rawtime);            
        if(Integer.parseInt(time)<1200){
            int a;
            for(a=0; a<2;a++)
                t += time.charAt(a);
            t += ":";
            for(a=2; a<4;a++)
                t += time.charAt(a);
            t += " AM";
        }
        else if(Integer.parseInt(time)/1000 == 1 && (Integer.parseInt(time)%1000) / 100 == 2){
            int a;
            for(a=0; a<2;a++)
                t += time.charAt(a);
            t += ":";
            for(a=2; a<4;a++)
                t += time.charAt(a);
            t += " PM";
        }        
        else if(Integer.parseInt(time) <2400){
            int a;
            for(a=0; a<2;a++)
                t += time.charAt(a);
                t = Integer.toString(Integer.parseInt(t) - 12);
            t += ":";
            for(a=2; a<4;a++)
                t += time.charAt(a);
            t += " PM";
            
        }
        else{
            
        }
            
        }
        System.out.println(t);
    }
    
}
