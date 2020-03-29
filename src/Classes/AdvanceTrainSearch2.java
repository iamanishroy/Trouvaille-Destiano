package Classes;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

class Find2 {
    String from, to;
    String Trains= "", commonSt1 = "", commonSt2 = "",Train1 = "", Train2 = "" ;
    
    int Tcount=0;
        
        public void search(){
            
           try
           {            
                      Class.forName("java.sql.Driver");

                      Connection cn1=(Connection)DriverManager.getConnection("jdbc:mysql://localhost:3307/trouvaille_destiano","root","root");
                      Connection cn2=(Connection)DriverManager.getConnection("jdbc:mysql://localhost:3307/trouvaille_destiano","root","root");
                      Connection cn3=(Connection)DriverManager.getConnection("jdbc:mysql://localhost:3307/trouvaille_destiano","root","root");
                      Connection cn4=(Connection)DriverManager.getConnection("jdbc:mysql://localhost:3307/trouvaille_destiano","root","root");
                      Connection cn5=(Connection)DriverManager.getConnection("jdbc:mysql://localhost:3307/trouvaille_destiano","root","root");

                      Statement stmt1=cn1.createStatement();
                      Statement stmt2=cn2.createStatement();
                      Statement stmt3=cn3.createStatement();
                      Statement stmt4=cn4.createStatement();
                      Statement stmt5=cn5.createStatement();

                      int tno=1,ft=0;
                      ResultSet rs1= stmt1.executeQuery("select * from train where available = 1");
                      while(rs1.next()){
                          if(tno%2 != 0){                              
                                 String Train=rs1.getString("Name");
                                 ResultSet rs2 = stmt2.executeQuery("Select station, Slno from "+Train+" where station='"+from+"'");
                                 if(rs2.next()){                                       
                                     ResultSet cSt1 = stmt4.executeQuery("Select * from "+Train+" where Slno>"+rs2.getString("Slno") +"");
                                     while(cSt1.next()){                                         
                                         commonSt1 += cSt1.getString("Station")+",";
                                     }
                                     Train1=Train;
                                     ft++;                                     
                                 }else{
                                 tno++;
                                 }
                          }
                          if(tno%2==0){                             
                                 String Train=rs1.getString("Name");
                                 ResultSet rs3 = stmt3.executeQuery("Select station, Slno from "+Train+" where station='"+to+"'");
                                 if(rs3.next()){ 
                                     ResultSet cSt2 = stmt5.executeQuery("Select * from "+Train+" where Slno < "+rs3.getString("Slno") +"");
                                     while(cSt2.next()){
                                         commonSt2 += cSt2.getString("Station")+",";                                         
                                     }
                                     Train2=Train;
                                     ft++;                                                                         
                                }
                      }
                          if(ft>1){
                              for(int l1=0;l1<commonSt1.length();l1++){
                                  String st1="";
                                  for(l1=l1;commonSt1.charAt(l1)!=',';l1++){
                                      st1 += commonSt1.charAt(l1);
                                  }                                  
                                  for(int l2=0;l2<commonSt2.length();l2++){
                                      String st2="";
                                      for(l2=l2;commonSt2.charAt(l2)!=',';l2++){
                                            st2 += commonSt2.charAt(l2);
                                      }
                                      if((!st1.equals("")) && st1.equals(st2)){
                                          System.out.println(Train1+" > "+from+" -> "+st1);
                                           
                                          System.out.println(Train2+" > "+st2+" -> "+to);  
                                          System.out.println();
                                      }
                                  }                                  
                              }
                          }tno++;
                              }
           }catch(Exception e){System.out.println(e);}
          }        
    }
public class AdvanceTrainSearch2 {
    public static void main(String args[]){
        Find2 f1=new Find2();
        f1.from = "Das";
        f1.to = "Delhi";
        f1.search();
    }
}

