/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;
import java.util.Scanner;

/**
 *
 * @author User
 */
public class recentdate {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String wantday="Thurs",day="", dt="",date ="18/11/2019";
        //String day="";
        for(int da=1;da<7;da++){
            int d,FinalSum=0;
            dt="";
            for(d=0; date.charAt(d)!='/';d++){
                dt+=date.charAt(d);
            }
            if(Integer.parseInt(dt)>31){
                System.out.println("Invalid Input");
                return;
            }
            FinalSum+=da+Integer.parseInt(dt);
            String datee=FinalSum+"/";
            //System.out.println(datee);
            dt="";
            for( d=d+1; date.charAt(d)!='/';d++){
                dt+=date.charAt(d);
            }
            datee+=dt+"/";
            
            switch(Integer.parseInt(dt)){
                case 1:FinalSum+=1;
                break;
                case 2:FinalSum+=4;
                break;
                case 3:FinalSum+=4;
                break;
                case 4:FinalSum+=0;
                break;
                case 5:FinalSum+=2;
                break;
                case 6:FinalSum+=5;
                break;
                case 7:FinalSum+=0;
                break;
                case 8:FinalSum+=3;
                break;
                case 9:FinalSum+=6;
                break;
                case 10:FinalSum+=1;
                break;
                case 11:FinalSum+=4;
                break;
                case 12:FinalSum+=6;
                break;
                default : System.out.println("Invalid Input!!");
                return;
            }
            //System.out.println(datee);
            dt="";
            for( d=d+1;d<date.length()-2;d++){
                dt+=date.charAt(d);
            }
            datee+=dt+"06";
            switch(Integer.parseInt(dt)%4){
                case 0: FinalSum+=6;
                break;
                case 1: FinalSum+=4;
                break;
                case 2: FinalSum+=2;
                break;
                case 3: FinalSum+=0;
                break;                        
            }
            dt="";
            for( d=date.length()-2;d<date.length();d++){
                dt+=date.charAt(d);
            }
            FinalSum+=Integer.parseInt(dt)+(Integer.parseInt(dt)/4);
            FinalSum=FinalSum%7;
            switch(FinalSum){
                case 0:day="Sat";
                break;
                case 1:day="Sun";
                break;
                case 2:day="Mon";
                break;
                case 3:day="Tue";
                break;
                case 4:day="Wed";
                break;
                case 5:day="Thurs";
                break;
                case 6:day="Fri";
                break;
            }
            //System.out.println(datee);
            if(day.equals(wantday)){
                System.out.println(datee);
                return;
            }
            
        
        }
    
        
        
        
    }
    

}

