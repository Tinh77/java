/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demojavascanner.mySql;

import demojavascanner.StudentModel;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author GIANG TINH
 */
public class Model {

    public void insert(StudentModel sm) throws SQLException {

        Connection cnn = DriverManager.getConnection("jdbc:mysql://localhost:3306/demosql", "root", "");

        Statement stt = cnn.createStatement();
        stt.execute("insert into students(id, name, email, dateOfBirth, age, phone)"
                + " values (" + sm.getId() +", '"+ sm.getName() +"', '"+ sm.getEmail()+"', '"+ sm.getDateOfBirth()+"', "+ sm.getAge()+", '"+ sm.getPhone() +"')");
    }

}
           