/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author hari's
 */
public class EmployeeFile {
    
      public static void main(String[] args)
   {
      
       //Different Employee instances.
       lab6 box = new lab6("Susan Meyers", 47899, "Accounting", "Vice Pres");
       lab6 box1 = new lab6("Mark Jones", 39119, "IT", "Programmer");
       lab6 box2 = new lab6("Joy Rodgers", 81774, "Manufacturing", "Engineer");
      
       System.out.println(" Name       ID Number   Department   Position   ");
       System.out.print(" " + box.getName() + "   " + box.getIdnumber() + "       " + box.getDepartment());
       System.out.println("   " + box.getPosition());
       System.out.print(" " + box1.getName() + "   " + box1.getIdnumber() + "       " + box1.getDepartment());
       System.out.println("           " + box1.getPosition());
       System.out.print(" " + box2.getName() + "   " + box2.getIdnumber() + "       " + box2.getDepartment());
       System.out.println(" " + box2.getPosition());
   }
    
}
