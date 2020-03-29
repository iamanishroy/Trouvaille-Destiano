package Classes;
public class try1 {
    public static void main(String args[]){
        String days= "mon,tue,wed";
        int w=0;
        int l=days.length();
                            for(w=0; w < l ; w++){
                                String Weekday="";
                                //System.out.println("..");
                                for(char c=days.charAt(w++) ; c!=',' ; c=days.charAt(w++)){
                                    Weekday += c;                                
                                }
                                if(Weekday.equals("mon"))
                                    System.out.println("Monday ");                                
                                else if(Weekday.equals("tue"))
                                    System.out.println("Tuesday ");                                
                                else if(Weekday.equals("wed"))
                                    System.out.println("Wednesday ");                                
                                else if(Weekday.equals("thurs"))
                                    System.out.println("Thursday ");                                
                                else if(Weekday.equals("fri"))
                                    System.out.println("Friday ");                                
                                else if(Weekday.equals("sat"))
                                    System.out.println("Saturday ");                                
                                else if(Weekday.equals("sun"))
                                    System.out.println("Sunday ");
                                w--;
                            }    }    }
