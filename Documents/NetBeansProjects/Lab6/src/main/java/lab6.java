/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author hari's
 */
public class lab6  {
           
            private String Name;
            private int IDnumber;
            private String Department;
            private String Position;

    public lab6(String nm, int id, String dp, String ps)
           {
               Name = nm;
               IDnumber = id;
               Department = dp;
               Position = ps;
           }
     public lab6(String nm, int id)
           {
               Name = nm;
               IDnumber = id;
               Department = " ";
               Position = " ";  
           }
      public lab6()
           {
               Name = " ";
               IDnumber = 0;
               Department = " ";
               Position = " ";  
           }
            
       public String getName()
           {
               return Name;
           }
          
           public int getIdnumber()
           {
               return IDnumber;
           }
          
           public String getDepartment()
           {
               return Department;
           }
      
       public String getPosition()
       {
           return Position;
       }
           
           

       }      
        
