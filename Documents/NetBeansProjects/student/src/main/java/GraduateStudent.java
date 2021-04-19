/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * 
 *
 * @author hari's
 */
public class GraduateStudent extends student {

    private String type;
    public GraduateStudent(String type, String studentID, String firstName, String lastName){
       super(studentID, firstName,lastName);
        this.type = type;
    
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

   @Override
    public String toString() {
        return "GraduateStudent{" + "type=" + type + '}' + super.toString();
    } 
    }
