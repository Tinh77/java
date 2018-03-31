/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demojavascanner;

import demojavascanner.mySql.Model;
import java.sql.SQLException;
import java.util.Scanner;

/**
 *
 * @author GIANG TINH
 */
public class DemoJavaScanner {
    public static void main(String[] args) throws SQLException {

        DemoJavaScanner djs = new DemoJavaScanner();
        StudentModel sm = djs.getStudentInformation();
        
        
//        System.out.println(st.toString());    
        
        Model model = new Model();
        model.insert(sm);
    }

    public StudentModel getStudentInformation() {
        Scanner studentScanner = new Scanner(System.in);
        System.out.println("Mời bạn nhâp tên: ");
        String name = studentScanner.nextLine();
        System.out.println("Mời bạn nhâp vào email: ");
        String email = studentScanner.nextLine();
        System.out.println("Mời bạn nhập vào tuổi: ");
        int age = studentScanner.nextInt();
        return new StudentModel(1, name, email, email);
    }

}
