/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author hari's
 */
public class student {

    public class Student {

        private String firstName;
        private String lastName;
        private String studentId;

        public Student(String lastName, String firstName, String studentId) {
            this.firstName = firstName;
            this.lastName = lastName;
            this.studentId = studentId;

        }

        public String getFirstName() {
            return firstName;
        }

        public void setFirstName(String firstName) {
            this.firstName = firstName;
        }

        public String getLastName() {
            return lastName;
        }

        public String getStudentId() {
            return studentId;
        }

        public void setStudentId(String studentId) {
            this.studentId = studentId;
        }

        public void setLastName(String lastName) {
            this.lastName = lastName;
        }

    }
}
