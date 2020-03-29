package Classes;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

class Find1{
    String from, to;
    String[] Trains= new String[10];
    
    int Tcount=0;
        
        public void search(){
            
           try
           {            
                      Class.forName("java.sql.Driver");

                      Connection cn=(Connection)DriverManager.getConnection("jdbc:mysql://localhost:3307/trouvaille_destiano","root","root");
                      Connection cn1=(Connection)DriverManager.getConnection("jdbc:mysql://localhost:3307/trouvaille_destiano","root","root");
                      Connection cn2=(Connection)DriverManager.getConnection("jdbc:mysql://localhost:3307/trouvaille_destiano","root","root");
                      Connection cn3=(Connection)DriverManager.getConnection("jdbc:mysql://localhost:3307/trouvaille_destiano","root","root");

                      Statement stmt=cn.createStatement();
                      Statement stmt2=cn1.createStatement();
                      Statement stmt1=cn2.createStatement();
                      Statement TrainDet=cn3.createStatement();


                      ResultSet rs= stmt.executeQuery("select * from train where available = 1");
                      int Tcount=0,count=0,st=0,st1=0;
                     //System.out.println("...");

                      ResultSet trDet;
                      while(rs.next()){
                          
                                 count=0;    
                                 String Train=rs.getString("Name");
                                 //System.out.println(Train);
                                 ResultSet rs1 = stmt1.executeQuery("Select station, Slno from "+Train+" where station='"+from+"'");
                                 if(rs1.next()){
                                            //System.out.println(rs1.getString("Slno"));
                                            st=Integer.parseInt(rs1.getString("Slno"));
                                            count++;                            
                                 }
                                 ResultSet rs2 = stmt2.executeQuery("Select station, Slno from "+Train+" where station='"+to+"'");
                                 if(rs2.next()){
                                     //System.out.println("...");
                                            st1=Integer.parseInt(rs2.getString("Slno"));
                                            count++;                            
                                 }
                                 if(count==2 && st<st1){
                                     System.out.println(Train);
                                                                 
                                            Trains[Tcount]="Trains";
                                            Tcount++;   
                                               
                                           }
                                 }
                      }
           
           catch(Exception e){System.out.println(e);}
          for(int a=0; a<Tcount; a++){
              System.out.println(Trains[a]);
          }
        
    }    
}
public class AdvanceTrainSearch {
    public static void main(String args[]){
        Find1 f1=new Find1();
        f1.from = "Delhi";
        f1.to = "Kolkata";
        f1.search();
    }
}

