/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demo;

import java.util.ArrayList;

public class TestStudent {

    public static void main(String[] args) {
        Student student1 = new Student();
        student1.setName("Danh");
        student1.setEmail("danhnbd00421@fpt.edu.vn");
        student1.setBirthday("30/06/1997");

        Student student2 = new Student();
        student2.setName("Dung");
        student2.setEmail("dungnbd00421@fpt.edu.vn");
        student2.setBirthday("03/06/1997");

        ArrayList<Student> listStudent = new ArrayList<>();
        listStudent.add(student1);
        listStudent.add(student2);

//        listStudent.forEach((student) -> {
//            System.out.println(student.getName());           
//       });

        Student st=listStudent.get(0);
        System.out.println(st.getName());
        listStudent.remove(0);

    }   
}
