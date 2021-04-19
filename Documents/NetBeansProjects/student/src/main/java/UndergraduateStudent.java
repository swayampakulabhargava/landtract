/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author hari's
 */
public class UndergraduateStudent extends student {
    private int year;
    public UndergraduateStudent(int year, String type, String studentID, String firstName, String lastName){
        super( studentID,firstName,lastName);
        this.year = year;
        
    }
public void setYear(int year) {
        this.year = year;
    }
    public int getYear() {
        return year;
    }

    
    @Override
    public String toString() {
        return "UndergraduateStudent{" + "year=" + year + '}' + super.toString();
    } 
}

