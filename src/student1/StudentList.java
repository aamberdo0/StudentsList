/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package student1;


/* date: 12/1/2023 */

public class StudentList {
    public static void main(String[] args){
        //Student1 s1 = new Student1("s", "Amber");
        Student1[] studentList = new Student1[3];
        studentList[0] = new Student1("s1", "Amber"); 
        studentList[1] = new Student1("s1", "John"); 
        studentList[2] = new Student1("s1", "Chris"); 
        
        for(int i=0; i < studentList.length; i++){
            System.out.println(studentList[i].getStudentName());
        }
    }
}
