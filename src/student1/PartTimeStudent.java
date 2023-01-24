/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package student1;

/**
 * This class ++ Insert description
 *
 * @author Amber Do
 */
public class PartTimeStudent extends Student1{
    private int numberOfCourses; 

    public PartTimeStudent(int numberOfCourses, String studentId, String studentName) {
        super(studentId, studentName);
        this.numberOfCourses = numberOfCourses;
    }

    public int getNumberOfCourses() {
        return numberOfCourses;
    }

    public void setNumberOfCourses(int numberOfCourses) {
        this.numberOfCourses = numberOfCourses;
    }
    
    
}
